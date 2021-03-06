/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.hub.clickwatch.model.ClickWatchModelPackage;

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
 * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Localchannelinfo' handler_name='seismo/localchannelinfo'"
 * @generated
 */
public interface Seismo_localchannelinfoPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "seismo_localchannelinfo";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/seismo/localchannelinfo";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "seismo_localchannelinfo";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Seismo_localchannelinfoPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl.init();

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.CImpl <em>C</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.CImpl
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl#getC()
     * @generated
     */
    int C = 0;

    /**
     * The feature id for the '<em><b>EContainer c</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int C__ECONTAINER_C = 0;

    /**
     * The feature id for the '<em><b>V</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int C__V = 1;

    /**
     * The number of structural features of the '<em>C</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int C_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.LocalchannelinfoImpl <em>Localchannelinfo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.LocalchannelinfoImpl
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl#getLocalchannelinfo()
     * @generated
     */
    int LOCALCHANNELINFO = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO__NAME = ClickWatchModelPackage.HANDLER__NAME;

    /**
     * The feature id for the '<em><b>Can Read</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

    /**
     * The feature id for the '<em><b>Can Write</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

    /**
     * The feature id for the '<em><b>Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO__ANY = ClickWatchModelPackage.HANDLER__ANY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

    /**
     * The feature id for the '<em><b>C</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO__C = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Localchannelinfo</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALCHANNELINFO_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.VImpl <em>V</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.VImpl
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl#getV()
     * @generated
     */
    int V = 2;

    /**
     * The feature id for the '<em><b>EContainer v</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int V__ECONTAINER_V = 0;

    /**
     * The feature id for the '<em><b>T</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int V__T = 1;

    /**
     * The feature id for the '<em><b>S</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int V__S = 2;

    /**
     * The feature id for the '<em><b>C0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int V__C0 = 3;

    /**
     * The feature id for the '<em><b>C1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int V__C1 = 4;

    /**
     * The feature id for the '<em><b>C2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int V__C2 = 5;

    /**
     * The number of structural features of the '<em>V</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int V_FEATURE_COUNT = 6;


    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C <em>C</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>C</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C
     * @generated
     */
    EClass getC();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C#getEContainer_c <em>EContainer c</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer c</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C#getEContainer_c()
     * @see #getC()
     * @generated
     */
    EReference getC_EContainer_c();

    /**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C#getV <em>V</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>V</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C#getV()
     * @see #getC()
     * @generated
     */
    EReference getC_V();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo <em>Localchannelinfo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Localchannelinfo</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo
     * @generated
     */
    EClass getLocalchannelinfo();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo#getC <em>C</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>C</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo#getC()
     * @see #getLocalchannelinfo()
     * @generated
     */
    EReference getLocalchannelinfo_C();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V <em>V</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>V</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V
     * @generated
     */
    EClass getV();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getEContainer_v <em>EContainer v</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer v</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getEContainer_v()
     * @see #getV()
     * @generated
     */
    EReference getV_EContainer_v();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getT <em>T</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>T</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getT()
     * @see #getV()
     * @generated
     */
    EAttribute getV_T();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getS <em>S</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>S</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getS()
     * @see #getV()
     * @generated
     */
    EAttribute getV_S();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getC0 <em>C0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>C0</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getC0()
     * @see #getV()
     * @generated
     */
    EAttribute getV_C0();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getC1 <em>C1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>C1</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getC1()
     * @see #getV()
     * @generated
     */
    EAttribute getV_C1();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getC2 <em>C2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>C2</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getC2()
     * @see #getV()
     * @generated
     */
    EAttribute getV_C2();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    Seismo_localchannelinfoFactory getSeismo_localchannelinfoFactory();

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
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.CImpl <em>C</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.CImpl
         * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl#getC()
         * @generated
         */
        EClass C = eINSTANCE.getC();

        /**
         * The meta object literal for the '<em><b>EContainer c</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference C__ECONTAINER_C = eINSTANCE.getC_EContainer_c();

        /**
         * The meta object literal for the '<em><b>V</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference C__V = eINSTANCE.getC_V();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.LocalchannelinfoImpl <em>Localchannelinfo</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.LocalchannelinfoImpl
         * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl#getLocalchannelinfo()
         * @generated
         */
        EClass LOCALCHANNELINFO = eINSTANCE.getLocalchannelinfo();

        /**
         * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCALCHANNELINFO__C = eINSTANCE.getLocalchannelinfo_C();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.VImpl <em>V</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.VImpl
         * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl#getV()
         * @generated
         */
        EClass V = eINSTANCE.getV();

        /**
         * The meta object literal for the '<em><b>EContainer v</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference V__ECONTAINER_V = eINSTANCE.getV_EContainer_v();

        /**
         * The meta object literal for the '<em><b>T</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute V__T = eINSTANCE.getV_T();

        /**
         * The meta object literal for the '<em><b>S</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute V__S = eINSTANCE.getV_S();

        /**
         * The meta object literal for the '<em><b>C0</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute V__C0 = eINSTANCE.getV_C0();

        /**
         * The meta object literal for the '<em><b>C1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute V__C1 = eINSTANCE.getV_C1();

        /**
         * The meta object literal for the '<em><b>C2</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute V__C2 = eINSTANCE.getV_C2();

    }

} //Seismo_localchannelinfoPackage
