package de.hub.clickwatch.main.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.hub.clickwatch.main.IClickWatchContextAdapter;
import de.hub.clickwatch.main.IClickWatchModelProvider;
import de.hub.emfxml.XmlModelRepository;

public class ClickWatchModelProvider implements IClickWatchContextAdapter,
		IClickWatchModelProvider {

	private EObject clickWatchObject = null;

	@Override
	public List<Option> getCommandLineOptions() {
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("uri", "model-file", true,
				"path to the .clickwatchmodel-file"));

		options.add(new Option("obj", "use-object", true,
				"the object in the clickwatchmodel that should be used"));
		return options;
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		String objectURIFragment = null;
		URI clickWatchModel = null;
		if (commandLine.hasOption("uri")) {
			clickWatchModel = URI.createPlatformResourceURI(commandLine.getOptionValue("uri"), true);
		}
		if (commandLine.hasOption("obj")) {
			objectURIFragment = commandLine.getOptionValue("obj");
		}
		
		if (clickWatchModel != null) {
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().putAll(XmlModelRepository.defaultLoadSaveOptions());
			Resource modelResource = resourceSet.getResource(clickWatchModel, true);
			
			if (objectURIFragment != null) {
				modelResource.getEObject(objectURIFragment);
			} else {
				clickWatchObject = modelResource.getContents().get(0);
			}
		}
	}
	
	public void initialize(URI clickWatchModel, EObject clickWatchObject)
	{
		this.clickWatchObject = clickWatchObject;
	}

	@Override
	public EObject getInputObject() {

		return clickWatchObject;
	}

	@Override
	public void initialize(IConfigurationElement configurationElement, EObject selection) {
		this.clickWatchObject = selection;
	}

	@Override
	public Class<?> getAdpaterClass() {
		return IClickWatchModelProvider.class;
	}

}