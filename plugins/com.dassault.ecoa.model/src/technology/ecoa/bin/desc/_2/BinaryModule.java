/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.bin.desc._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technical description of the binary module
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryModule#getBinaryDependency <em>Binary Dependency</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryModule#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryModule#getHeapSize <em>Heap Size</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryModule#getObject <em>Object</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryModule#getReference <em>Reference</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryModule#getStackSize <em>Stack Size</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryModule#getUserContextSize <em>User Context Size</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryModule#getWarmStartContextSize <em>Warm Start Context Size</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryModule()
 * @model extendedMetaData="name='BinaryModule' kind='elementOnly'"
 * @generated
 */
public interface BinaryModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Binary Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.bin.desc._2.BinaryDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Dependency</em>' containment reference list.
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryModule_BinaryDependency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='binaryDependency' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BinaryDependency> getBinaryDependency();

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checksum of the binary
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Checksum</em>' attribute.
	 * @see #setChecksum(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryModule_Checksum()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 *        extendedMetaData="kind='attribute' name='checksum'"
	 * @generated
	 */
	String getChecksum();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinaryModule#getChecksum <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' attribute.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(String value);

	/**
	 * Returns the value of the '<em><b>Heap Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * maximum size in bytes of the heap (memory
	 *           dynamically allocated by the module binary itself: malloc or
	 *           object instances)
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heap Size</em>' attribute.
	 * @see #setHeapSize(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryModule_HeapSize()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 *        extendedMetaData="kind='attribute' name='heapSize'"
	 * @generated
	 */
	String getHeapSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinaryModule#getHeapSize <em>Heap Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heap Size</em>' attribute.
	 * @see #getHeapSize()
	 * @generated
	 */
	void setHeapSize(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filename of the binary implementing the
	 *           referenced module. The filename may contain path information
	 *           relative to the bin-desc location e.g. "binaries/module.o"
	 *           relates a file 'module.o' located in a subdirectory 'binaries'
	 *           of the directory containing the bin-desc file. Separators are
	 *           '/'
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryModule_Object()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='object'"
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinaryModule#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the module implementation
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryModule_Reference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='reference'"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinaryModule#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * maximum size in bytes of the stack used by
	 *           any module entry point (including all sub-function calls)
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stack Size</em>' attribute.
	 * @see #setStackSize(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryModule_StackSize()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 *        extendedMetaData="kind='attribute' name='stackSize'"
	 * @generated
	 */
	String getStackSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinaryModule#getStackSize <em>Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Size</em>' attribute.
	 * @see #getStackSize()
	 * @generated
	 */
	void setStackSize(String value);

	/**
	 * Returns the value of the '<em><b>User Context Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size in bytes of the module user context
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Context Size</em>' attribute.
	 * @see #setUserContextSize(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryModule_UserContextSize()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 *        extendedMetaData="kind='attribute' name='userContextSize'"
	 * @generated
	 */
	String getUserContextSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinaryModule#getUserContextSize <em>User Context Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Context Size</em>' attribute.
	 * @see #getUserContextSize()
	 * @generated
	 */
	void setUserContextSize(String value);

	/**
	 * Returns the value of the '<em><b>Warm Start Context Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size in bytes of the module warm start
	 *           context
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warm Start Context Size</em>' attribute.
	 * @see #setWarmStartContextSize(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryModule_WarmStartContextSize()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 *        extendedMetaData="kind='attribute' name='warmStartContextSize'"
	 * @generated
	 */
	String getWarmStartContextSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinaryModule#getWarmStartContextSize <em>Warm Start Context Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warm Start Context Size</em>' attribute.
	 * @see #getWarmStartContextSize()
	 * @generated
	 */
	void setWarmStartContextSize(String value);

} // BinaryModule
