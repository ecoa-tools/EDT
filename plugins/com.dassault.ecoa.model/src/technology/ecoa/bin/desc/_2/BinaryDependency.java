/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.bin.desc._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * binary dependency that needs to be linked
 *         with
 *         the initial object
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryDependency#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinaryDependency#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryDependency()
 * @model extendedMetaData="name='BinaryDependency' kind='empty'"
 * @generated
 */
public interface BinaryDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checksum of the binary dependency
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Checksum</em>' attribute.
	 * @see #setChecksum(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryDependency_Checksum()
	 * @model dataType="technology.ecoa.bin.desc._2.HexOrDecValue" required="true"
	 *        extendedMetaData="kind='attribute' name='checksum'"
	 * @generated
	 */
	String getChecksum();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinaryDependency#getChecksum <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' attribute.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filename of the binary implementing the
	 *           referenced dependency
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinaryDependency_Object()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='object'"
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinaryDependency#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

} // BinaryDependency
