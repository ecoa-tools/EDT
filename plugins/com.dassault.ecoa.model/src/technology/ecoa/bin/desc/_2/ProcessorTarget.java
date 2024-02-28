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
 * A representation of the model object '<em><b>Processor Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * "Identification of the processor for which
 *         modules have been compiled"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.bin.desc._2.ProcessorTarget#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.bin.desc._2.binPackage#getProcessorTarget()
 * @model extendedMetaData="name='ProcessorTarget' kind='empty'"
 * @generated
 */
public interface ProcessorTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getProcessorTarget_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.ProcessorTarget#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ProcessorTarget
