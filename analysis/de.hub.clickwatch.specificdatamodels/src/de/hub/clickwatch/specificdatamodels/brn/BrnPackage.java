/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn;

import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.hub.clickwatch.specificdatamodels.brn.BrnFactory
 * @model kind="package"
 * @generated
 */
public interface BrnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "brn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificdatamodels.brn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbrn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BrnPackage eINSTANCE = de.hub.clickwatch.specificdatamodels.brn.impl.BrnPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.impl.HandlerSubClassImpl <em>Handler Sub Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.impl.HandlerSubClassImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.impl.BrnPackageImpl#getHandlerSubClass()
	 * @generated
	 */
	int HANDLER_SUB_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_SUB_CLASS__MIXED = ClickWatchDataModelPackage.VALUE__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_SUB_CLASS__ANY = ClickWatchDataModelPackage.VALUE__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_SUB_CLASS__VALUE = ClickWatchDataModelPackage.VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_SUB_CLASS__TIMESTAMP = ClickWatchDataModelPackage.VALUE__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Handler Sub Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_SUB_CLASS_FEATURE_COUNT = ClickWatchDataModelPackage.VALUE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.HandlerSubClass <em>Handler Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler Sub Class</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.HandlerSubClass
	 * @generated
	 */
	EClass getHandlerSubClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BrnFactory getBrnFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.impl.HandlerSubClassImpl <em>Handler Sub Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.impl.HandlerSubClassImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.impl.BrnPackageImpl#getHandlerSubClass()
		 * @generated
		 */
		EClass HANDLER_SUB_CLASS = eINSTANCE.getHandlerSubClass();

	}

} //BrnPackage