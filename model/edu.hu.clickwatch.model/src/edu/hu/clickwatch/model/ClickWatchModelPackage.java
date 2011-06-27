/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ClickWatchModelFactory
 * @model kind="package"
 * @generated
 */
public interface ClickWatchModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.hu.clickwatch.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.hu.clickwatch.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClickWatchModelPackage eINSTANCE = edu.hu.clickwatch.model.impl.ClickWatchModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.NodeImpl
	 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>INet Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INET_ADRESS = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PORT = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONNECTED = 3;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Backbone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BACKBONE = 5;

	/**
	 * The feature id for the '<em><b>Retrieving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RETRIEVING = 6;

	/**
	 * The feature id for the '<em><b>Has Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_RECORD = 7;

	/**
	 * The feature id for the '<em><b>Recording</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RECORDING = 8;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link model.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ElementImpl
	 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__HANDLERS = 1;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__WATCH = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHILDREN = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link model.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.HandlerImpl
	 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__CAN_READ = 1;

	/**
	 * The feature id for the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__CAN_WRITE = 2;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__CHANGED = 3;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__WATCH = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__MIXED = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__ANY = 6;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link model.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.NetworkImpl
	 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NODES = 1;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ALL = 2;

	/**
	 * The feature id for the '<em><b>Element Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ELEMENT_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Handler Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__HANDLER_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Update Intervall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__UPDATE_INTERVALL = 5;

	/**
	 * The feature id for the '<em><b>Subnetworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUBNETWORKS = 6;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link model.impl.MultiNodeImpl <em>Multi Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MultiNodeImpl
	 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getMultiNode()
	 * @generated
	 */
	int MULTI_NODE = 4;

	/**
	 * The feature id for the '<em><b>INet Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__INET_ADRESS = NODE__INET_ADRESS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__PORT = NODE__PORT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__ELEMENTS = NODE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__CONNECTED = NODE__CONNECTED;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__CONNECTION = NODE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Backbone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__BACKBONE = NODE__BACKBONE;

	/**
	 * The feature id for the '<em><b>Retrieving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__RETRIEVING = NODE__RETRIEVING;

	/**
	 * The feature id for the '<em><b>Has Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__HAS_RECORD = NODE__HAS_RECORD;

	/**
	 * The feature id for the '<em><b>Recording</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__RECORDING = NODE__RECORDING;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE__NODES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.BackboneType <em>Backbone Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BackboneType
	 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getBackboneType()
	 * @generated
	 */
	int BACKBONE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link model.Node#getINetAdress <em>INet Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>INet Adress</em>'.
	 * @see model.Node#getINetAdress()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_INetAdress();

	/**
	 * Returns the meta object for the attribute '{@link model.Node#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see model.Node#getPort()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Node#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see model.Node#getElements()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Elements();

	/**
	 * Returns the meta object for the attribute '{@link model.Node#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see model.Node#isConnected()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Connected();

	/**
	 * Returns the meta object for the attribute '{@link model.Node#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see model.Node#getConnection()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Connection();

	/**
	 * Returns the meta object for the attribute '{@link model.Node#getBackbone <em>Backbone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backbone</em>'.
	 * @see model.Node#getBackbone()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Backbone();

	/**
	 * Returns the meta object for the attribute '{@link model.Node#isRetrieving <em>Retrieving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retrieving</em>'.
	 * @see model.Node#isRetrieving()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Retrieving();

	/**
	 * Returns the meta object for the attribute '{@link model.Node#isHasRecord <em>Has Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Record</em>'.
	 * @see model.Node#isHasRecord()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_HasRecord();

	/**
	 * Returns the meta object for the attribute '{@link model.Node#isRecording <em>Recording</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording</em>'.
	 * @see model.Node#isRecording()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Recording();

	/**
	 * Returns the meta object for class '{@link model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link model.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Element#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see model.Element#getHandlers()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Handlers();

	/**
	 * Returns the meta object for the attribute '{@link model.Element#isWatch <em>Watch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watch</em>'.
	 * @see model.Element#isWatch()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Watch();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Element#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see model.Element#getChildren()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Children();

	/**
	 * Returns the meta object for class '{@link model.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see model.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for the attribute '{@link model.Handler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Handler#getName()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.Handler#isCanRead <em>Can Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Read</em>'.
	 * @see model.Handler#isCanRead()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_CanRead();

	/**
	 * Returns the meta object for the attribute '{@link model.Handler#isCanWrite <em>Can Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Write</em>'.
	 * @see model.Handler#isCanWrite()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_CanWrite();

	/**
	 * Returns the meta object for the attribute '{@link model.Handler#isChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see model.Handler#isChanged()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Changed();

	/**
	 * Returns the meta object for the attribute '{@link model.Handler#isWatch <em>Watch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watch</em>'.
	 * @see model.Handler#isWatch()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Watch();

	/**
	 * Returns the meta object for the attribute list '{@link model.Handler#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see model.Handler#getMixed()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link model.Handler#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see model.Handler#getAny()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Any();

	/**
	 * Returns the meta object for class '{@link model.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see model.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link model.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Network#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see model.Network#getNodes()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link model.Network#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see model.Network#getAll()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_All();

	/**
	 * Returns the meta object for the attribute '{@link model.Network#getElementFilter <em>Element Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Filter</em>'.
	 * @see model.Network#getElementFilter()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_ElementFilter();

	/**
	 * Returns the meta object for the attribute '{@link model.Network#getHandlerFilter <em>Handler Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Filter</em>'.
	 * @see model.Network#getHandlerFilter()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_HandlerFilter();

	/**
	 * Returns the meta object for the attribute '{@link model.Network#getUpdateIntervall <em>Update Intervall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Intervall</em>'.
	 * @see model.Network#getUpdateIntervall()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_UpdateIntervall();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Network#getSubnetworks <em>Subnetworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnetworks</em>'.
	 * @see model.Network#getSubnetworks()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Subnetworks();

	/**
	 * Returns the meta object for class '{@link model.MultiNode <em>Multi Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Node</em>'.
	 * @see model.MultiNode
	 * @generated
	 */
	EClass getMultiNode();

	/**
	 * Returns the meta object for the reference list '{@link model.MultiNode#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see model.MultiNode#getNodes()
	 * @see #getMultiNode()
	 * @generated
	 */
	EReference getMultiNode_Nodes();

	/**
	 * Returns the meta object for enum '{@link model.BackboneType <em>Backbone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Backbone Type</em>'.
	 * @see model.BackboneType
	 * @generated
	 */
	EEnum getBackboneType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClickWatchModelFactory getClickWatchModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.NodeImpl
		 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>INet Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__INET_ADRESS = eINSTANCE.getNode_INetAdress();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PORT = eINSTANCE.getNode_Port();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ELEMENTS = eINSTANCE.getNode_Elements();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CONNECTED = eINSTANCE.getNode_Connected();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CONNECTION = eINSTANCE.getNode_Connection();

		/**
		 * The meta object literal for the '<em><b>Backbone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__BACKBONE = eINSTANCE.getNode_Backbone();

		/**
		 * The meta object literal for the '<em><b>Retrieving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__RETRIEVING = eINSTANCE.getNode_Retrieving();

		/**
		 * The meta object literal for the '<em><b>Has Record</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__HAS_RECORD = eINSTANCE.getNode_HasRecord();

		/**
		 * The meta object literal for the '<em><b>Recording</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__RECORDING = eINSTANCE.getNode_Recording();

		/**
		 * The meta object literal for the '{@link model.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ElementImpl
		 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__HANDLERS = eINSTANCE.getElement_Handlers();

		/**
		 * The meta object literal for the '<em><b>Watch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__WATCH = eINSTANCE.getElement_Watch();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHILDREN = eINSTANCE.getElement_Children();

		/**
		 * The meta object literal for the '{@link model.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.HandlerImpl
		 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__NAME = eINSTANCE.getHandler_Name();

		/**
		 * The meta object literal for the '<em><b>Can Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__CAN_READ = eINSTANCE.getHandler_CanRead();

		/**
		 * The meta object literal for the '<em><b>Can Write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__CAN_WRITE = eINSTANCE.getHandler_CanWrite();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__CHANGED = eINSTANCE.getHandler_Changed();

		/**
		 * The meta object literal for the '<em><b>Watch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__WATCH = eINSTANCE.getHandler_Watch();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__MIXED = eINSTANCE.getHandler_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__ANY = eINSTANCE.getHandler_Any();

		/**
		 * The meta object literal for the '{@link model.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.NetworkImpl
		 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__NODES = eINSTANCE.getNetwork_Nodes();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__ALL = eINSTANCE.getNetwork_All();

		/**
		 * The meta object literal for the '<em><b>Element Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__ELEMENT_FILTER = eINSTANCE.getNetwork_ElementFilter();

		/**
		 * The meta object literal for the '<em><b>Handler Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__HANDLER_FILTER = eINSTANCE.getNetwork_HandlerFilter();

		/**
		 * The meta object literal for the '<em><b>Update Intervall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__UPDATE_INTERVALL = eINSTANCE.getNetwork_UpdateIntervall();

		/**
		 * The meta object literal for the '<em><b>Subnetworks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__SUBNETWORKS = eINSTANCE.getNetwork_Subnetworks();

		/**
		 * The meta object literal for the '{@link model.impl.MultiNodeImpl <em>Multi Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MultiNodeImpl
		 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getMultiNode()
		 * @generated
		 */
		EClass MULTI_NODE = eINSTANCE.getMultiNode();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_NODE__NODES = eINSTANCE.getMultiNode_Nodes();

		/**
		 * The meta object literal for the '{@link model.BackboneType <em>Backbone Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BackboneType
		 * @see model.ClickWatchModelPackageImpl.ModelPackageImpl#getBackboneType()
		 * @generated
		 */
		EEnum BACKBONE_TYPE = eINSTANCE.getBackboneType();

	}

} //ModelPackage