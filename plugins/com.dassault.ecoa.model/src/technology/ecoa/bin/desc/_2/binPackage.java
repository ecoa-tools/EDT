/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.bin.desc._2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see technology.ecoa.bin.desc._2.binFactory
 * @model kind="package"
 * @generated
 */
public interface binPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecoa.technology/bin-desc-2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	binPackage eINSTANCE = technology.ecoa.bin.desc._2.impl.binPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.bin.desc._2.impl.BinaryDependencyImpl <em>Binary Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.impl.BinaryDependencyImpl
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getBinaryDependency()
	 * @generated
	 */
	int BINARY_DEPENDENCY = 0;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY__CHECKSUM = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Binary Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binary Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.bin.desc._2.impl.BinaryModuleImpl <em>Binary Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.impl.BinaryModuleImpl
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getBinaryModule()
	 * @generated
	 */
	int BINARY_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Binary Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__BINARY_DEPENDENCY = 0;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__CHECKSUM = 1;

	/**
	 * The feature id for the '<em><b>Heap Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__HEAP_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__STACK_SIZE = 5;

	/**
	 * The feature id for the '<em><b>User Context Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__USER_CONTEXT_SIZE = 6;

	/**
	 * The feature id for the '<em><b>Warm Start Context Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE__WARM_START_CONTEXT_SIZE = 7;

	/**
	 * The number of structural features of the '<em>Binary Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Binary Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.bin.desc._2.impl.BinDescImpl <em>Bin Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.impl.BinDescImpl
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getBinDesc()
	 * @generated
	 */
	int BIN_DESC = 2;

	/**
	 * The feature id for the '<em><b>Processor Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DESC__PROCESSOR_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Binary Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DESC__BINARY_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Component Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DESC__COMPONENT_IMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Insertion Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DESC__INSERTION_POLICY = 3;

	/**
	 * The number of structural features of the '<em>Bin Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DESC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bin Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_DESC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.bin.desc._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.impl.DocumentRootImpl
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Bin Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BIN_DESC = 3;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.bin.desc._2.impl.ProcessorTargetImpl <em>Processor Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.impl.ProcessorTargetImpl
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getProcessorTarget()
	 * @generated
	 */
	int PROCESSOR_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TARGET__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Processor Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TARGET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Processor Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.bin.desc._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.impl.UseTypeImpl
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE__LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.bin.desc._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.ProgrammingLanguage
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 6;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 7;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 8;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 9;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.ProgrammingLanguage
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 10;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 11;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 12;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 13;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 15;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 16;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.bin.desc._2.BinaryDependency <em>Binary Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Dependency</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryDependency
	 * @generated
	 */
	EClass getBinaryDependency();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinaryDependency#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryDependency#getChecksum()
	 * @see #getBinaryDependency()
	 * @generated
	 */
	EAttribute getBinaryDependency_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinaryDependency#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryDependency#getObject()
	 * @see #getBinaryDependency()
	 * @generated
	 */
	EAttribute getBinaryDependency_Object();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.bin.desc._2.BinaryModule <em>Binary Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Module</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryModule
	 * @generated
	 */
	EClass getBinaryModule();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.bin.desc._2.BinaryModule#getBinaryDependency <em>Binary Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary Dependency</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryModule#getBinaryDependency()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EReference getBinaryModule_BinaryDependency();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinaryModule#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryModule#getChecksum()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinaryModule#getHeapSize <em>Heap Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heap Size</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryModule#getHeapSize()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_HeapSize();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinaryModule#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryModule#getObject()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_Object();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinaryModule#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryModule#getReference()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_Reference();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinaryModule#getStackSize <em>Stack Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Size</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryModule#getStackSize()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_StackSize();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinaryModule#getUserContextSize <em>User Context Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Context Size</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryModule#getUserContextSize()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_UserContextSize();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinaryModule#getWarmStartContextSize <em>Warm Start Context Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warm Start Context Size</em>'.
	 * @see technology.ecoa.bin.desc._2.BinaryModule#getWarmStartContextSize()
	 * @see #getBinaryModule()
	 * @generated
	 */
	EAttribute getBinaryModule_WarmStartContextSize();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.bin.desc._2.BinDesc <em>Bin Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Desc</em>'.
	 * @see technology.ecoa.bin.desc._2.BinDesc
	 * @generated
	 */
	EClass getBinDesc();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.bin.desc._2.BinDesc#getProcessorTarget <em>Processor Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor Target</em>'.
	 * @see technology.ecoa.bin.desc._2.BinDesc#getProcessorTarget()
	 * @see #getBinDesc()
	 * @generated
	 */
	EReference getBinDesc_ProcessorTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.bin.desc._2.BinDesc#getBinaryModule <em>Binary Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary Module</em>'.
	 * @see technology.ecoa.bin.desc._2.BinDesc#getBinaryModule()
	 * @see #getBinDesc()
	 * @generated
	 */
	EReference getBinDesc_BinaryModule();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinDesc#getComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Implementation</em>'.
	 * @see technology.ecoa.bin.desc._2.BinDesc#getComponentImplementation()
	 * @see #getBinDesc()
	 * @generated
	 */
	EAttribute getBinDesc_ComponentImplementation();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.BinDesc#getInsertionPolicy <em>Insertion Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertion Policy</em>'.
	 * @see technology.ecoa.bin.desc._2.BinDesc#getInsertionPolicy()
	 * @see #getBinDesc()
	 * @generated
	 */
	EAttribute getBinDesc_InsertionPolicy();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.bin.desc._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.bin.desc._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.bin.desc._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.bin.desc._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.bin.desc._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.bin.desc._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.bin.desc._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.bin.desc._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.bin.desc._2.DocumentRoot#getBinDesc <em>Bin Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bin Desc</em>'.
	 * @see technology.ecoa.bin.desc._2.DocumentRoot#getBinDesc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BinDesc();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.bin.desc._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.bin.desc._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.bin.desc._2.ProcessorTarget <em>Processor Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Target</em>'.
	 * @see technology.ecoa.bin.desc._2.ProcessorTarget
	 * @generated
	 */
	EClass getProcessorTarget();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.ProcessorTarget#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see technology.ecoa.bin.desc._2.ProcessorTarget#getType()
	 * @see #getProcessorTarget()
	 * @generated
	 */
	EAttribute getProcessorTarget_Type();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.bin.desc._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.bin.desc._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.bin.desc._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.bin.desc._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.bin.desc._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.bin.desc._2.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hex Or Dec Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  This type shall be used as the base type for
     *         any XML schema attribute or element that contains a hex-encoded
     *         binary value or a decimal-coded binary value.
     *         This hex-encoded binary value contains the mandatory string 0x
     *         followed by a finite-length sequence of characters 0–9 and a–f.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Hex Or Dec Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HexOrDecValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]+|[1-9][0-9]*|0'"
	 * @generated
	 */
	EDataType getHexOrDecValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Library Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LibraryName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_\\.]*'"
	 * @generated
	 */
	EDataType getLibraryName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NameId' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getNameId();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.bin.desc._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.bin.desc._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.bin.desc._2.ProgrammingLanguage"
	 *        extendedMetaData="name='ProgrammingLanguage:Object' baseType='ProgrammingLanguage'"
	 * @generated
	 */
	EDataType getProgrammingLanguageObject();

	/**
	 * Returns the meta object for data type '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A number of logical steps
     *         This allows to size
     *         durations in an abstract way.
     *         See stepDuration in the logical
     *         system
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Steps</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='Steps' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getSteps();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Steps Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Steps Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Steps:Object' baseType='Steps'"
	 * @generated
	 */
	EDataType getStepsObject();

	/**
	 * Returns the meta object for data type '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit is in seconds
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Time Duration</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='TimeDuration' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getTimeDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Time Duration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Duration Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='TimeDuration:Object' baseType='TimeDuration'"
	 * @generated
	 */
	EDataType getTimeDurationObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeName' baseType='NameId'"
	 * @generated
	 */
	EDataType getTypeName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type QName</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeQName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getTypeQName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	binFactory getbinFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link technology.ecoa.bin.desc._2.impl.BinaryDependencyImpl <em>Binary Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.impl.BinaryDependencyImpl
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getBinaryDependency()
		 * @generated
		 */
		EClass BINARY_DEPENDENCY = eINSTANCE.getBinaryDependency();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEPENDENCY__CHECKSUM = eINSTANCE.getBinaryDependency_Checksum();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEPENDENCY__OBJECT = eINSTANCE.getBinaryDependency_Object();

		/**
		 * The meta object literal for the '{@link technology.ecoa.bin.desc._2.impl.BinaryModuleImpl <em>Binary Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.impl.BinaryModuleImpl
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getBinaryModule()
		 * @generated
		 */
		EClass BINARY_MODULE = eINSTANCE.getBinaryModule();

		/**
		 * The meta object literal for the '<em><b>Binary Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MODULE__BINARY_DEPENDENCY = eINSTANCE.getBinaryModule_BinaryDependency();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MODULE__CHECKSUM = eINSTANCE.getBinaryModule_Checksum();

		/**
		 * The meta object literal for the '<em><b>Heap Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MODULE__HEAP_SIZE = eINSTANCE.getBinaryModule_HeapSize();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MODULE__OBJECT = eINSTANCE.getBinaryModule_Object();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MODULE__REFERENCE = eINSTANCE.getBinaryModule_Reference();

		/**
		 * The meta object literal for the '<em><b>Stack Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MODULE__STACK_SIZE = eINSTANCE.getBinaryModule_StackSize();

		/**
		 * The meta object literal for the '<em><b>User Context Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MODULE__USER_CONTEXT_SIZE = eINSTANCE.getBinaryModule_UserContextSize();

		/**
		 * The meta object literal for the '<em><b>Warm Start Context Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MODULE__WARM_START_CONTEXT_SIZE = eINSTANCE.getBinaryModule_WarmStartContextSize();

		/**
		 * The meta object literal for the '{@link technology.ecoa.bin.desc._2.impl.BinDescImpl <em>Bin Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.impl.BinDescImpl
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getBinDesc()
		 * @generated
		 */
		EClass BIN_DESC = eINSTANCE.getBinDesc();

		/**
		 * The meta object literal for the '<em><b>Processor Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_DESC__PROCESSOR_TARGET = eINSTANCE.getBinDesc_ProcessorTarget();

		/**
		 * The meta object literal for the '<em><b>Binary Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_DESC__BINARY_MODULE = eINSTANCE.getBinDesc_BinaryModule();

		/**
		 * The meta object literal for the '<em><b>Component Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIN_DESC__COMPONENT_IMPLEMENTATION = eINSTANCE.getBinDesc_ComponentImplementation();

		/**
		 * The meta object literal for the '<em><b>Insertion Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIN_DESC__INSERTION_POLICY = eINSTANCE.getBinDesc_InsertionPolicy();

		/**
		 * The meta object literal for the '{@link technology.ecoa.bin.desc._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.impl.DocumentRootImpl
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Bin Desc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BIN_DESC = eINSTANCE.getDocumentRoot_BinDesc();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '{@link technology.ecoa.bin.desc._2.impl.ProcessorTargetImpl <em>Processor Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.impl.ProcessorTargetImpl
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getProcessorTarget()
		 * @generated
		 */
		EClass PROCESSOR_TARGET = eINSTANCE.getProcessorTarget();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_TARGET__TYPE = eINSTANCE.getProcessorTarget_Type();

		/**
		 * The meta object literal for the '{@link technology.ecoa.bin.desc._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.impl.UseTypeImpl
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getUseType()
		 * @generated
		 */
		EClass USE_TYPE = eINSTANCE.getUseType();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_TYPE__LIBRARY = eINSTANCE.getUseType_Library();

		/**
		 * The meta object literal for the '{@link technology.ecoa.bin.desc._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.ProgrammingLanguage
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.ProgrammingLanguage
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.bin.desc._2.impl.binPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

	}

} //binPackage
