package edu.hu.clickwatch.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.sse.ui.internal.StructuredTextViewer;
import org.eclipse.wst.xml.core.internal.provisional.contenttype.ContentTypeIdForXML;
import org.eclipse.wst.xsl.ui.internal.StructuredTextViewerConfigurationXSL;

import edu.hu.clickwatch.XmlUtil;
import edu.hu.clickwatch.model.presentation.ClickWatchModelEditor;

public class XSLView extends ViewPart {
	
	private ISourceViewer viewer = null;
	private Action evaluate = null;

	@Override
	public void createPartControl(Composite parent) {
		SourceViewerConfiguration sourceViewerConfiguration = new StructuredTextViewerConfigurationXSL();

		viewer = new StructuredTextViewer(parent, null, null, false, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		viewer.getTextWidget().setFont(JFaceResources.getFont("org.eclipse.wst.sse.ui.textfont")); //$NON-NLS-1$
		IStructuredModel scratchModel = StructuredModelManager.getModelManager().createUnManagedStructuredModelFor(
						ContentTypeIdForXML.ContentTypeID_XML);
		IDocument document = scratchModel.getStructuredDocument();
		document.set(createBlankSheet());
		viewer.configure(sourceViewerConfiguration);
		viewer.setDocument(document);
		
		makeActions();
		contributeToActionBars();		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	private String createBlankSheet() {
		StringBuffer result = new StringBuffer();
		result.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		result.append("<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n");
		result.append("    <xsl:template match=\"/\">\n");
		result.append("        <!-- TODO: Auto-generated template -->\n");
		result.append("    </xsl:template>\n");
		result.append("</xsl:stylesheet>\n");
		return result.toString();
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(evaluate);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(evaluate);
	}
	
	private void makeActions() {
		evaluate = new Action() {
			public void run() {
				evaluate();
			}
		};
		evaluate.setText("Evaluate");
		evaluate.setToolTipText("Evaluate XSL on current Network model");
	}

	private void evaluate() {
		IEditorPart activeEditor = getViewSite().getPage().getActiveEditor();
		if (!(activeEditor instanceof ClickWatchModelEditor)) {
			return;
		}
		
		ClickWatchModelEditor modelEditor = (ClickWatchModelEditor)activeEditor;
		Object editorInput = modelEditor.getViewer().getInput();
		EObject input = null;
		if (editorInput instanceof EObject) {
			input = (EObject)editorInput;
		} else if (editorInput instanceof Resource) {
			Resource resource = (Resource)editorInput;
			if (resource.getContents().isEmpty()) {
				return;
			}
			input = resource.getContents().get(0);
		} else if (editorInput instanceof ResourceSet) {
			ResourceSet rs = (ResourceSet)editorInput;
			if (rs.getResources().isEmpty()) {
				return;
			}
			Resource resource = rs.getResources().get(0);
			if (resource.getContents().isEmpty()) {
				return;
			}
			input = resource.getContents().get(0);
		}
		
		if (input == null) {
			return;
		}
		
		String inputAsString = XmlUtil.serializeXml(input);
		
		String evalResult = null;
		try {
			evalResult = performEvaluation(inputAsString, viewer.getDocument().get());
		} catch (Throwable e) {
			// TODO error
			System.out.println("error1");
			return;
		}
		
		EObject result = XmlUtil.deserializeXml(evalResult);
		
		if (result == null) {
			// TODO error
			System.out.println("error2");
			return;
		} else {
			for(IViewReference viewRef: getViewSite().getPage().getViewReferences()) {
				IViewPart view = viewRef.getView(false);
				if (view instanceof ResultView) {
					((ResultView)view).setInput(result);
				}
			}
		}
	}
	
	private String performEvaluation(String inputXml, String xsl) {
		System.out.println("#perfom eval for:\n");
		System.out.println(inputXml);
		System.out.println("\n#with sheet:\n");
		System.out.println(xsl);
		return "<foo><bar>TEXT</bar></foo>";
	}
}
