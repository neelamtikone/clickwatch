/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.model.BackboneType;
import de.hub.clickwatch.model.ClickWatchError;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.ModelElementWithStatistics;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.Statistic;
import de.hub.clickwatch.model.StatisticsContainer;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClickWatchModelPackageImpl extends EPackageImpl implements ClickWatchModelPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass nodeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass elementEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass handlerEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass networkEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass statisticsContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eStringToStatisticMapEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass statisticEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clickWatchErrorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelElementWithStatisticsEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum backboneTypeEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType iNodeConnectionEDataType = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType iNodeConnectionProviderEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType iHandlerEventListenerEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType exceptionEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private ClickWatchModelPackageImpl() {
        super(eNS_URI, ClickWatchModelFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ClickWatchModelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static ClickWatchModelPackage init() {
        if (isInited) return (ClickWatchModelPackage)EPackage.Registry.INSTANCE.getEPackage(ClickWatchModelPackage.eNS_URI);

        // Obtain or create and register package
        ClickWatchModelPackageImpl theClickWatchModelPackage = (ClickWatchModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClickWatchModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClickWatchModelPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theClickWatchModelPackage.createPackageContents();

        // Initialize created meta-data
        theClickWatchModelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theClickWatchModelPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ClickWatchModelPackage.eNS_URI, theClickWatchModelPackage);
        return theClickWatchModelPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNode() {
        return nodeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNode_INetAddress() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNode_Port() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getNode_Elements() {
        return (EReference)nodeEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNode_Connection() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_Retrieving() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_Listening() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_Recording() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNode_Backbone() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_Errors() {
        return (EReference)nodeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getElement() {
        return elementEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getElement_Name() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getElement_Handlers() {
        return (EReference)elementEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getElement_Children() {
        return (EReference)elementEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getHandler() {
        return handlerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandler_Name() {
        return (EAttribute)handlerEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandler_CanRead() {
        return (EAttribute)handlerEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandler_CanWrite() {
        return (EAttribute)handlerEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandler_Changed() {
        return (EAttribute)handlerEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandler_Mixed() {
        return (EAttribute)handlerEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandler_Any() {
        return (EAttribute)handlerEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandler_Value() {
        return (EAttribute)handlerEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getHandler_Timestamp() {
        return (EAttribute)handlerEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNetwork() {
        return networkEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNetwork_Name() {
        return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getNetwork_Nodes() {
        return (EReference)networkEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNetwork_ElementFilter() {
        return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNetwork_HandlerFilter() {
        return (EAttribute)networkEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getNetwork_Subnetworks() {
        return (EReference)networkEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNetwork_Timestamp() {
        return (EAttribute)networkEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStatisticsContainer() {
        return statisticsContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStatisticsContainer_Statistics() {
        return (EReference)statisticsContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEStringToStatisticMap() {
        return eStringToStatisticMapEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEStringToStatisticMap_Key() {
        return (EAttribute)eStringToStatisticMapEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEStringToStatisticMap_Value() {
        return (EReference)eStringToStatisticMapEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStatistic() {
        return statisticEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStatistic_Sum() {
        return (EAttribute)statisticEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStatistic_Count() {
        return (EAttribute)statisticEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStatistic_Mean() {
        return (EAttribute)statisticEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStatistic_Smallest() {
        return (EAttribute)statisticEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStatistic_Largest() {
        return (EAttribute)statisticEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStatistic_Latest() {
        return (EAttribute)statisticEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClickWatchError() {
        return clickWatchErrorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClickWatchError_Message() {
        return (EAttribute)clickWatchErrorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClickWatchError_Exception() {
        return (EAttribute)clickWatchErrorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModelElementWithStatistics() {
        return modelElementWithStatisticsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelElementWithStatistics_Statistics() {
        return (EReference)modelElementWithStatisticsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBackboneType() {
        return backboneTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getINodeConnection() {
        return iNodeConnectionEDataType;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getINodeConnectionProvider() {
        return iNodeConnectionProviderEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIHandlerEventListener() {
        return iHandlerEventListenerEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getException() {
        return exceptionEDataType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        nodeEClass = createEClass(NODE);
        createEAttribute(nodeEClass, NODE__INET_ADDRESS);
        createEAttribute(nodeEClass, NODE__PORT);
        createEAttribute(nodeEClass, NODE__BACKBONE);
        createEAttribute(nodeEClass, NODE__CONNECTION);
        createEAttribute(nodeEClass, NODE__RETRIEVING);
        createEAttribute(nodeEClass, NODE__LISTENING);
        createEAttribute(nodeEClass, NODE__RECORDING);
        createEReference(nodeEClass, NODE__ERRORS);
        createEReference(nodeEClass, NODE__ELEMENTS);

        elementEClass = createEClass(ELEMENT);
        createEAttribute(elementEClass, ELEMENT__NAME);
        createEReference(elementEClass, ELEMENT__HANDLERS);
        createEReference(elementEClass, ELEMENT__CHILDREN);

        handlerEClass = createEClass(HANDLER);
        createEAttribute(handlerEClass, HANDLER__NAME);
        createEAttribute(handlerEClass, HANDLER__CAN_READ);
        createEAttribute(handlerEClass, HANDLER__CAN_WRITE);
        createEAttribute(handlerEClass, HANDLER__CHANGED);
        createEAttribute(handlerEClass, HANDLER__MIXED);
        createEAttribute(handlerEClass, HANDLER__ANY);
        createEAttribute(handlerEClass, HANDLER__VALUE);
        createEAttribute(handlerEClass, HANDLER__TIMESTAMP);

        networkEClass = createEClass(NETWORK);
        createEAttribute(networkEClass, NETWORK__NAME);
        createEReference(networkEClass, NETWORK__NODES);
        createEAttribute(networkEClass, NETWORK__ELEMENT_FILTER);
        createEAttribute(networkEClass, NETWORK__HANDLER_FILTER);
        createEReference(networkEClass, NETWORK__SUBNETWORKS);
        createEAttribute(networkEClass, NETWORK__TIMESTAMP);

        modelElementWithStatisticsEClass = createEClass(MODEL_ELEMENT_WITH_STATISTICS);
        createEReference(modelElementWithStatisticsEClass, MODEL_ELEMENT_WITH_STATISTICS__STATISTICS);

        statisticsContainerEClass = createEClass(STATISTICS_CONTAINER);
        createEReference(statisticsContainerEClass, STATISTICS_CONTAINER__STATISTICS);

        eStringToStatisticMapEClass = createEClass(ESTRING_TO_STATISTIC_MAP);
        createEAttribute(eStringToStatisticMapEClass, ESTRING_TO_STATISTIC_MAP__KEY);
        createEReference(eStringToStatisticMapEClass, ESTRING_TO_STATISTIC_MAP__VALUE);

        statisticEClass = createEClass(STATISTIC);
        createEAttribute(statisticEClass, STATISTIC__SUM);
        createEAttribute(statisticEClass, STATISTIC__COUNT);
        createEAttribute(statisticEClass, STATISTIC__MEAN);
        createEAttribute(statisticEClass, STATISTIC__SMALLEST);
        createEAttribute(statisticEClass, STATISTIC__LARGEST);
        createEAttribute(statisticEClass, STATISTIC__LATEST);

        clickWatchErrorEClass = createEClass(CLICK_WATCH_ERROR);
        createEAttribute(clickWatchErrorEClass, CLICK_WATCH_ERROR__MESSAGE);
        createEAttribute(clickWatchErrorEClass, CLICK_WATCH_ERROR__EXCEPTION);

        // Create enums
        backboneTypeEEnum = createEEnum(BACKBONE_TYPE);

        // Create data types
        iNodeConnectionEDataType = createEDataType(INODE_CONNECTION);
        iNodeConnectionProviderEDataType = createEDataType(INODE_CONNECTION_PROVIDER);
        iHandlerEventListenerEDataType = createEDataType(IHANDLER_EVENT_LISTENER);
        exceptionEDataType = createEDataType(EXCEPTION);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        nodeEClass.getESuperTypes().add(this.getModelElementWithStatistics());
        networkEClass.getESuperTypes().add(this.getModelElementWithStatistics());

        // Initialize classes and features; add operations and parameters
        initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNode_INetAddress(), ecorePackage.getEString(), "iNetAddress", "localhost", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_Port(), ecorePackage.getEString(), "port", "7777", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_Backbone(), this.getBackboneType(), "backbone", "unknown", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_Connection(), this.getINodeConnection(), "connection", null, 0, 1, Node.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_Retrieving(), ecorePackage.getEBoolean(), "retrieving", null, 0, 1, Node.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_Listening(), ecorePackage.getEBoolean(), "listening", null, 0, 1, Node.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_Recording(), ecorePackage.getEBoolean(), "recording", null, 0, 1, Node.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_Errors(), this.getClickWatchError(), null, "errors", null, 0, -1, Node.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_Elements(), this.getElement(), null, "elements", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = addEOperation(nodeEClass, this.getHandler(), "getHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(nodeEClass, this.getElement(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(nodeEClass, this.getHandler(), "getAllHandlers", 0, -1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(nodeEClass, null, "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "elementFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "handlerFilter", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(nodeEClass, null, "filter", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElement_Handlers(), this.getHandler(), null, "handlers", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElement_Children(), this.getElement(), null, "children", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        addEOperation(elementEClass, ecorePackage.getEString(), "getQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(elementEClass, this.getHandler(), "getHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(elementEClass, this.getElement(), "getChild", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(elementEClass, this.getHandler(), "getAllHandlers", 0, -1, IS_UNIQUE, IS_ORDERED);

        initEClass(handlerEClass, Handler.class, "Handler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHandler_Name(), ecorePackage.getEString(), "name", null, 0, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHandler_CanRead(), ecorePackage.getEBoolean(), "canRead", null, 0, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHandler_CanWrite(), ecorePackage.getEBoolean(), "canWrite", null, 0, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHandler_Changed(), ecorePackage.getEBoolean(), "changed", "false", 0, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHandler_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHandler_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHandler_Value(), ecorePackage.getEString(), "value", "", 0, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHandler_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        addEOperation(handlerEClass, ecorePackage.getEString(), "getQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNetwork_Name(), ecorePackage.getEString(), "name", "My Network", 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNetwork_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNetwork_ElementFilter(), ecorePackage.getEString(), "ElementFilter", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNetwork_HandlerFilter(), ecorePackage.getEString(), "HandlerFilter", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNetwork_Subnetworks(), this.getNetwork(), null, "subnetworks", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNetwork_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelElementWithStatisticsEClass, ModelElementWithStatistics.class, "ModelElementWithStatistics", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModelElementWithStatistics_Statistics(), this.getStatisticsContainer(), null, "statistics", null, 0, 1, ModelElementWithStatistics.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = addEOperation(modelElementWithStatisticsEClass, this.getStatistic(), "getStatistics", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(statisticsContainerEClass, StatisticsContainer.class, "StatisticsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStatisticsContainer_Statistics(), this.getEStringToStatisticMap(), null, "statistics", null, 0, -1, StatisticsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eStringToStatisticMapEClass, Map.Entry.class, "EStringToStatisticMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEStringToStatisticMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEStringToStatisticMap_Value(), this.getStatistic(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(statisticEClass, Statistic.class, "Statistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStatistic_Sum(), ecorePackage.getEDouble(), "sum", null, 0, 1, Statistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStatistic_Count(), ecorePackage.getEDouble(), "count", null, 0, 1, Statistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStatistic_Mean(), ecorePackage.getEDouble(), "mean", null, 0, 1, Statistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStatistic_Smallest(), ecorePackage.getEDouble(), "smallest", null, 0, 1, Statistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStatistic_Largest(), ecorePackage.getEDouble(), "largest", null, 0, 1, Statistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStatistic_Latest(), ecorePackage.getEDouble(), "latest", null, 0, 1, Statistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = addEOperation(statisticEClass, null, "addValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(clickWatchErrorEClass, ClickWatchError.class, "ClickWatchError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getClickWatchError_Message(), ecorePackage.getEString(), "message", null, 0, 1, ClickWatchError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getClickWatchError_Exception(), this.getException(), "exception", null, 0, 1, ClickWatchError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(backboneTypeEEnum, BackboneType.class, "BackboneType");
        addEEnumLiteral(backboneTypeEEnum, BackboneType.WIRED);
        addEEnumLiteral(backboneTypeEEnum, BackboneType.WIRELESS);
        addEEnumLiteral(backboneTypeEEnum, BackboneType.UNKNOWN);

        // Initialize data types
        initEDataType(iNodeConnectionEDataType, INodeConnection.class, "INodeConnection", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(iNodeConnectionProviderEDataType, INodeConnectionProvider.class, "INodeConnectionProvider", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(iHandlerEventListenerEDataType, IHandlerEventListener.class, "IHandlerEventListener", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

	/**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
        addAnnotation
          (getNode_Elements(), 
           source, 
           new String[] {
             "name", "element",
             "kind", "element"
           });		
        addAnnotation
          (getElement_Handlers(), 
           source, 
           new String[] {
             "name", "handler",
             "kind", "element"
           });		
        addAnnotation
          (handlerEClass, 
           source, 
           new String[] {
             "kind", "mixed"
           });		
        addAnnotation
          (getHandler_Mixed(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":mixed"
           });		
        addAnnotation
          (getHandler_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":1",
             "processing", "lax",
             "wildcards", "##any"
           });		
        addAnnotation
          (getNetwork_Nodes(), 
           source, 
           new String[] {
             "name", "node",
             "kind", "element"
           });		
        addAnnotation
          (getNetwork_Subnetworks(), 
           source, 
           new String[] {
             "name", "subnetwork",
             "kind", "element"
           });
    }

	@Override
	public ClickWatchModelFactory getClickWatchModelFactory() {
		// TODO: Na, ob das so stimmt
		return ClickWatchModelFactory.eINSTANCE;
	}

} //ModelPackageImpl
