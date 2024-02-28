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
 * A representation of the model object '<em><b>Bin Desc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links between module implementations and binary
 *         objects
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.bin.desc._2.BinDesc#getProcessorTarget <em>Processor Target</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinDesc#getBinaryModule <em>Binary Module</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinDesc#getComponentImplementation <em>Component Implementation</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.BinDesc#getInsertionPolicy <em>Insertion Policy</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.bin.desc._2.binPackage#getBinDesc()
 * @model extendedMetaData="name='BinDesc' kind='elementOnly'"
 * @generated
 */
public interface BinDesc extends EObject {
	/**
	 * Returns the value of the '<em><b>Processor Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Target</em>' containment reference.
	 * @see #setProcessorTarget(ProcessorTarget)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinDesc_ProcessorTarget()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='processorTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessorTarget getProcessorTarget();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinDesc#getProcessorTarget <em>Processor Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Target</em>' containment reference.
	 * @see #getProcessorTarget()
	 * @generated
	 */
	void setProcessorTarget(ProcessorTarget value);

	/**
	 * Returns the value of the '<em><b>Binary Module</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.bin.desc._2.BinaryModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Module</em>' containment reference list.
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinDesc_BinaryModule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='binaryModule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BinaryModule> getBinaryModule();

	/**
	 * Returns the value of the '<em><b>Component Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Implementation</em>' attribute.
	 * @see #setComponentImplementation(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinDesc_ComponentImplementation()
	 * @model dataType="technology.ecoa.bin.desc._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='componentImplementation'"
	 * @generated
	 */
	String getComponentImplementation();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinDesc#getComponentImplementation <em>Component Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Implementation</em>' attribute.
	 * @see #getComponentImplementation()
	 * @generated
	 */
	void setComponentImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Insertion Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to an external table containing
	 *           insertion policy data of the binary ECOA component
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insertion Policy</em>' attribute.
	 * @see #setInsertionPolicy(String)
	 * @see technology.ecoa.bin.desc._2.binPackage#getBinDesc_InsertionPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='insertionPolicy'"
	 * @generated
	 */
	String getInsertionPolicy();

	/**
	 * Sets the value of the '{@link technology.ecoa.bin.desc._2.BinDesc#getInsertionPolicy <em>Insertion Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertion Policy</em>' attribute.
	 * @see #getInsertionPolicy()
	 * @generated
	 */
	void setInsertionPolicy(String value);

} // BinDesc
