/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel.impl;

import de.hub.clickwatch.analysis.traceable.Traceable;
import de.hub.clickwatch.analysis.traceable.TraceablePackage;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.datamodel.BackboneType;
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;
import de.hub.clickwatch.datamodel.ClickWatchError;
import de.hub.clickwatch.datamodel.ClickWatchModelPackage;
import de.hub.clickwatch.datamodel.Element;
import de.hub.clickwatch.datamodel.Handler;
import de.hub.clickwatch.datamodel.Network;
import de.hub.clickwatch.datamodel.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#getTracesFrom <em>Traces From</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#getTracesTo <em>Traces To</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#getINetAddress <em>INet Address</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#getBackbone <em>Backbone</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#isRetrieving <em>Retrieving</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#isListening <em>Listening</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#isRecording <em>Recording</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NodeImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends ModelElementWithStatisticsImpl implements Node {
    /**
	 * The cached value of the '{@link #getTracesFrom() <em>Traces From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> tracesFrom;
	/**
	 * The cached value of the '{@link #getTracesTo() <em>Traces To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> tracesTo;
				/**
	 * The default value of the '{@link #getINetAddress() <em>INet Address</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getINetAddress()
	 * @generated
	 * @ordered
	 */
    protected static final String INET_ADDRESS_EDEFAULT = "localhost";
    /**
	 * The cached value of the '{@link #getINetAddress() <em>INet Address</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getINetAddress()
	 * @generated
	 * @ordered
	 */
    protected String iNetAddress = INET_ADDRESS_EDEFAULT;
    /**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
    protected static final String PORT_EDEFAULT = "7777";
    /**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
    protected String port = PORT_EDEFAULT;
    /**
	 * The default value of the '{@link #getBackbone() <em>Backbone</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBackbone()
	 * @generated
	 * @ordered
	 */
    protected static final BackboneType BACKBONE_EDEFAULT = BackboneType.UNKNOWN;
    /**
	 * The cached value of the '{@link #getBackbone() <em>Backbone</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBackbone()
	 * @generated
	 * @ordered
	 */
    protected BackboneType backbone = BACKBONE_EDEFAULT;
   
    /**
	 * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
    protected static final INodeConnection CONNECTION_EDEFAULT = null;
    /**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
    protected INodeConnection connection = CONNECTION_EDEFAULT;
    
    /**
	 * The default value of the '{@link #isRetrieving() <em>Retrieving</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isRetrieving()
	 * @generated
	 * @ordered
	 */
    protected static final boolean RETRIEVING_EDEFAULT = false;
    /**
	 * The cached value of the '{@link #isRetrieving() <em>Retrieving</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isRetrieving()
	 * @generated
	 * @ordered
	 */
    protected boolean retrieving = RETRIEVING_EDEFAULT;
    /**
	 * The default value of the '{@link #isListening() <em>Listening</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isListening()
	 * @generated
	 * @ordered
	 */
    protected static final boolean LISTENING_EDEFAULT = false;
    /**
	 * The cached value of the '{@link #isListening() <em>Listening</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isListening()
	 * @generated
	 * @ordered
	 */
    protected boolean listening = LISTENING_EDEFAULT;
    /**
	 * The default value of the '{@link #isRecording() <em>Recording</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isRecording()
	 * @generated
	 * @ordered
	 */
    protected static final boolean RECORDING_EDEFAULT = false;
    /**
	 * The cached value of the '{@link #isRecording() <em>Recording</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isRecording()
	 * @generated
	 * @ordered
	 */
    protected boolean recording = RECORDING_EDEFAULT;
    /**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
    protected EList<ClickWatchError> errors;
    /**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
    protected EList<Element> elements;

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected NodeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ClickWatchDataModelPackage.Literals.NODE;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTracesFrom() {
		if (tracesFrom == null) {
			tracesFrom = new EObjectResolvingEList<Traceable>(Traceable.class, this, ClickWatchDataModelPackage.NODE__TRACES_FROM);
		}
		return tracesFrom;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTracesTo() {
		if (tracesTo == null) {
			tracesTo = new EObjectResolvingEList<Traceable>(Traceable.class, this, ClickWatchDataModelPackage.NODE__TRACES_TO);
		}
		return tracesTo;
	}

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String getINetAddress() {
		return iNetAddress;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void setINetAddress(String newINetAddress) {
		String oldINetAddress = iNetAddress;
		iNetAddress = newINetAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NODE__INET_ADDRESS, oldINetAddress, iNetAddress));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String getPort() {
		return port;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NODE__PORT, oldPort, port));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, ClickWatchDataModelPackage.NODE__ELEMENTS);
		}
		return elements;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public INodeConnection getConnection() {
		return connection;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConnection(INodeConnection newConnection) {
		INodeConnection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NODE__CONNECTION, oldConnection, connection));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isRetrieving() {
		return retrieving;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRetrieving(boolean newRetrieving) {
		boolean oldRetrieving = retrieving;
		retrieving = newRetrieving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NODE__RETRIEVING, oldRetrieving, retrieving));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isListening() {
		return listening;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setListening(boolean newListening) {
		boolean oldListening = listening;
		listening = newListening;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NODE__LISTENING, oldListening, listening));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isRecording() {
		return recording;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRecording(boolean newRecording) {
		boolean oldRecording = recording;
		recording = newRecording;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NODE__RECORDING, oldRecording, recording));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public BackboneType getBackbone() {
		return backbone;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void setBackbone(BackboneType newBackbone) {
		BackboneType oldBackbone = backbone;
		backbone = newBackbone == null ? BACKBONE_EDEFAULT : newBackbone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NODE__BACKBONE, oldBackbone, backbone));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ClickWatchError> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<ClickWatchError>(ClickWatchError.class, this, ClickWatchDataModelPackage.NODE__ERRORS);
		}
		return errors;
	}

    /**
     * <!-- begin-user-doc -->
     * 
     * Filters all contained elements and their handlers based on the given
     * filters.
     * 
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public void filter(String elemFilters, String handFilter) {
        // filter internal node copy
        if ((elemFilters == null || elemFilters.trim().equals("")) && (handFilter == null || handFilter.trim().equals(""))) {
            return;
        } else {
            if (elemFilters == null) {
                elemFilters = "";
            }
            if (handFilter == null) {
                handFilter = "";
            }

            String[] elemFilter = elemFilters.split("/");
            Iterator<Element> elem_it = getElements().iterator();

            EList<Handler> result = new BasicEList<Handler>();
            // recursive checker
            filterMatched(elem_it, elemFilter, 0, handFilter, result);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    // recursive filter
    private void filterMatched(Iterator<Element> elem_it, String[] elemFilter, int idx, String handFilter,
            Collection<Handler> result) {
        while (elem_it.hasNext()) {
            Element elem = elem_it.next();
            if ((elemFilter.length > idx) && !java.util.regex.Pattern.compile(elemFilter[idx]).matcher(elem.getName()).find()) {
                elem_it.remove();
                continue; // does not match, no need to check the children nodes
            }
            Iterator<Handler> hand_it = elem.getHandlers().iterator();

            while (hand_it.hasNext()) {
                Handler hand = hand_it.next();
                if (!java.util.regex.Pattern.compile(handFilter).matcher(hand.getName()).find()) {
                    // does not match; remove it
                    hand_it.remove();
                }
            }

            // recursive call
            if (elem.getChildren().size() > 0) {
                filterMatched(elem.getChildren().iterator(), elemFilter, idx + 1, handFilter, result);
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * 
     * Searches for a handler contained in this node.
     * 
     * @param qualifiedName
     *            is the qualified name of the handler that is searched for.
     * @return a contained handler with the given qualified name. The search is
     *         extended for all contained elements and their children.
     * 
     *         <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Handler getHandler(String qualifiedName) {
        Handler result = null;
        if (result == null) {
            String[] qualifiedNameItems = qualifiedName.split("/");
            EObject current = this;
            loop: for (int i = 0; i < qualifiedName.length() && current != null; i++) {
                if (qualifiedNameItems.length - i == 1) {
                    Preconditions.checkState(current instanceof Element);
                    result = ((Element) current).getHandler(qualifiedNameItems[i]);
                    break loop;
                } else if (i == 0) {
                    Preconditions.checkState(current instanceof Node);
                    current = ((Node) current).getElement(qualifiedNameItems[i]);
                } else {
                    Preconditions.checkState(current instanceof Element);
                    current = ((Element) current).getChild(qualifiedNameItems[i]);
                }
            }
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * 
     * @param the
     *            name of an element.
     * @return a directly contained element with the given name or null if the
     *         element was not found.
     * 
     *         <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Element getElement(String name) {
        for (Element child : getElements()) {
            if (child.getName().equals(name)) {
                return child;
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * 
     * @return all directly and indirectly contained handlers.
     * 
     *         <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public EList<Handler> getAllHandlers() {
        EList<Handler> result = new BasicEList<Handler>();
        for (Element element : getElements()) {
            result.addAll(element.getAllHandlers());
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * 
     * Filters all directly and indirectly contained elements and handlers with
     * the filters specified in the contained network. Does nothing if the node
     * is not contained in a network.
     * 
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public void filter() {
        EObject container = eContainer();
        if (container != null && container instanceof Network) {
            Network network = (Network) container;
            filter(network.getElementFilter(), network.getHandlerFilter());
        }
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClickWatchDataModelPackage.NODE__ERRORS:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
			case ClickWatchDataModelPackage.NODE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClickWatchDataModelPackage.NODE__TRACES_FROM:
				return getTracesFrom();
			case ClickWatchDataModelPackage.NODE__TRACES_TO:
				return getTracesTo();
			case ClickWatchDataModelPackage.NODE__INET_ADDRESS:
				return getINetAddress();
			case ClickWatchDataModelPackage.NODE__PORT:
				return getPort();
			case ClickWatchDataModelPackage.NODE__BACKBONE:
				return getBackbone();
			case ClickWatchDataModelPackage.NODE__CONNECTION:
				return getConnection();
			case ClickWatchDataModelPackage.NODE__RETRIEVING:
				return isRetrieving();
			case ClickWatchDataModelPackage.NODE__LISTENING:
				return isListening();
			case ClickWatchDataModelPackage.NODE__RECORDING:
				return isRecording();
			case ClickWatchDataModelPackage.NODE__ERRORS:
				return getErrors();
			case ClickWatchDataModelPackage.NODE__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClickWatchDataModelPackage.NODE__TRACES_FROM:
				getTracesFrom().clear();
				getTracesFrom().addAll((Collection<? extends Traceable>)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__TRACES_TO:
				getTracesTo().clear();
				getTracesTo().addAll((Collection<? extends Traceable>)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__INET_ADDRESS:
				setINetAddress((String)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__PORT:
				setPort((String)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__BACKBONE:
				setBackbone((BackboneType)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__CONNECTION:
				setConnection((INodeConnection)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__RETRIEVING:
				setRetrieving((Boolean)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__LISTENING:
				setListening((Boolean)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__RECORDING:
				setRecording((Boolean)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends ClickWatchError>)newValue);
				return;
			case ClickWatchDataModelPackage.NODE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case ClickWatchDataModelPackage.NODE__TRACES_FROM:
				getTracesFrom().clear();
				return;
			case ClickWatchDataModelPackage.NODE__TRACES_TO:
				getTracesTo().clear();
				return;
			case ClickWatchDataModelPackage.NODE__INET_ADDRESS:
				setINetAddress(INET_ADDRESS_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NODE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NODE__BACKBONE:
				setBackbone(BACKBONE_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NODE__CONNECTION:
				setConnection(CONNECTION_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NODE__RETRIEVING:
				setRetrieving(RETRIEVING_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NODE__LISTENING:
				setListening(LISTENING_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NODE__RECORDING:
				setRecording(RECORDING_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NODE__ERRORS:
				getErrors().clear();
				return;
			case ClickWatchDataModelPackage.NODE__ELEMENTS:
				getElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClickWatchDataModelPackage.NODE__TRACES_FROM:
				return tracesFrom != null && !tracesFrom.isEmpty();
			case ClickWatchDataModelPackage.NODE__TRACES_TO:
				return tracesTo != null && !tracesTo.isEmpty();
			case ClickWatchDataModelPackage.NODE__INET_ADDRESS:
				return INET_ADDRESS_EDEFAULT == null ? iNetAddress != null : !INET_ADDRESS_EDEFAULT.equals(iNetAddress);
			case ClickWatchDataModelPackage.NODE__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ClickWatchDataModelPackage.NODE__BACKBONE:
				return backbone != BACKBONE_EDEFAULT;
			case ClickWatchDataModelPackage.NODE__CONNECTION:
				return CONNECTION_EDEFAULT == null ? connection != null : !CONNECTION_EDEFAULT.equals(connection);
			case ClickWatchDataModelPackage.NODE__RETRIEVING:
				return retrieving != RETRIEVING_EDEFAULT;
			case ClickWatchDataModelPackage.NODE__LISTENING:
				return listening != LISTENING_EDEFAULT;
			case ClickWatchDataModelPackage.NODE__RECORDING:
				return recording != RECORDING_EDEFAULT;
			case ClickWatchDataModelPackage.NODE__ERRORS:
				return errors != null && !errors.isEmpty();
			case ClickWatchDataModelPackage.NODE__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Traceable.class) {
			switch (derivedFeatureID) {
				case ClickWatchDataModelPackage.NODE__TRACES_FROM: return TraceablePackage.TRACEABLE__TRACES_FROM;
				case ClickWatchDataModelPackage.NODE__TRACES_TO: return TraceablePackage.TRACEABLE__TRACES_TO;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Traceable.class) {
			switch (baseFeatureID) {
				case TraceablePackage.TRACEABLE__TRACES_FROM: return ClickWatchDataModelPackage.NODE__TRACES_FROM;
				case TraceablePackage.TRACEABLE__TRACES_TO: return ClickWatchDataModelPackage.NODE__TRACES_TO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iNetAddress: ");
		result.append(iNetAddress);
		result.append(", port: ");
		result.append(port);
		result.append(", backbone: ");
		result.append(backbone);
		result.append(", connection: ");
		result.append(connection);
		result.append(", retrieving: ");
		result.append(retrieving);
		result.append(", listening: ");
		result.append(listening);
		result.append(", recording: ");
		result.append(recording);
		result.append(')');
		return result.toString();
	}

} // NodeImpl
