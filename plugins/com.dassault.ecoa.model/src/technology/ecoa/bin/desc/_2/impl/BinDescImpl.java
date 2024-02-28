/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.bin.desc._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.bin.desc._2.BinDesc;
import technology.ecoa.bin.desc._2.BinaryModule;
import technology.ecoa.bin.desc._2.ProcessorTarget;
import technology.ecoa.bin.desc._2.binPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bin Desc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.bin.desc._2.impl.BinDescImpl#getProcessorTarget <em>Processor Target</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.impl.BinDescImpl#getBinaryModule <em>Binary Module</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.impl.BinDescImpl#getComponentImplementation <em>Component Implementation</em>}</li>
 *   <li>{@link technology.ecoa.bin.desc._2.impl.BinDescImpl#getInsertionPolicy <em>Insertion Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinDescImpl extends MinimalEObjectImpl.Container implements BinDesc {
	/**
	 * The cached value of the '{@link #getProcessorTarget() <em>Processor Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorTarget()
	 * @generated
	 * @ordered
	 */
	protected ProcessorTarget processorTarget;

	/**
	 * The cached value of the '{@link #getBinaryModule() <em>Binary Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryModule()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryModule> binaryModule;

	/**
	 * The default value of the '{@link #getComponentImplementation() <em>Component Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentImplementation() <em>Component Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentImplementation()
	 * @generated
	 * @ordered
	 */
	protected String componentImplementation = COMPONENT_IMPLEMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertionPolicy() <em>Insertion Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertionPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERTION_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsertionPolicy() <em>Insertion Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertionPolicy()
	 * @generated
	 * @ordered
	 */
	protected String insertionPolicy = INSERTION_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinDescImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return binPackage.Literals.BIN_DESC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorTarget getProcessorTarget() {
		return processorTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessorTarget(ProcessorTarget newProcessorTarget, NotificationChain msgs) {
		ProcessorTarget oldProcessorTarget = processorTarget;
		processorTarget = newProcessorTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, binPackage.BIN_DESC__PROCESSOR_TARGET, oldProcessorTarget, newProcessorTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorTarget(ProcessorTarget newProcessorTarget) {
		if (newProcessorTarget != processorTarget) {
			NotificationChain msgs = null;
			if (processorTarget != null)
				msgs = ((InternalEObject)processorTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - binPackage.BIN_DESC__PROCESSOR_TARGET, null, msgs);
			if (newProcessorTarget != null)
				msgs = ((InternalEObject)newProcessorTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - binPackage.BIN_DESC__PROCESSOR_TARGET, null, msgs);
			msgs = basicSetProcessorTarget(newProcessorTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, binPackage.BIN_DESC__PROCESSOR_TARGET, newProcessorTarget, newProcessorTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryModule> getBinaryModule() {
		if (binaryModule == null) {
			binaryModule = new EObjectContainmentEList<BinaryModule>(BinaryModule.class, this, binPackage.BIN_DESC__BINARY_MODULE);
		}
		return binaryModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentImplementation() {
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentImplementation(String newComponentImplementation) {
		String oldComponentImplementation = componentImplementation;
		componentImplementation = newComponentImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, binPackage.BIN_DESC__COMPONENT_IMPLEMENTATION, oldComponentImplementation, componentImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsertionPolicy() {
		return insertionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertionPolicy(String newInsertionPolicy) {
		String oldInsertionPolicy = insertionPolicy;
		insertionPolicy = newInsertionPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, binPackage.BIN_DESC__INSERTION_POLICY, oldInsertionPolicy, insertionPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case binPackage.BIN_DESC__PROCESSOR_TARGET:
				return basicSetProcessorTarget(null, msgs);
			case binPackage.BIN_DESC__BINARY_MODULE:
				return ((InternalEList<?>)getBinaryModule()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case binPackage.BIN_DESC__PROCESSOR_TARGET:
				return getProcessorTarget();
			case binPackage.BIN_DESC__BINARY_MODULE:
				return getBinaryModule();
			case binPackage.BIN_DESC__COMPONENT_IMPLEMENTATION:
				return getComponentImplementation();
			case binPackage.BIN_DESC__INSERTION_POLICY:
				return getInsertionPolicy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case binPackage.BIN_DESC__PROCESSOR_TARGET:
				setProcessorTarget((ProcessorTarget)newValue);
				return;
			case binPackage.BIN_DESC__BINARY_MODULE:
				getBinaryModule().clear();
				getBinaryModule().addAll((Collection<? extends BinaryModule>)newValue);
				return;
			case binPackage.BIN_DESC__COMPONENT_IMPLEMENTATION:
				setComponentImplementation((String)newValue);
				return;
			case binPackage.BIN_DESC__INSERTION_POLICY:
				setInsertionPolicy((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case binPackage.BIN_DESC__PROCESSOR_TARGET:
				setProcessorTarget((ProcessorTarget)null);
				return;
			case binPackage.BIN_DESC__BINARY_MODULE:
				getBinaryModule().clear();
				return;
			case binPackage.BIN_DESC__COMPONENT_IMPLEMENTATION:
				setComponentImplementation(COMPONENT_IMPLEMENTATION_EDEFAULT);
				return;
			case binPackage.BIN_DESC__INSERTION_POLICY:
				setInsertionPolicy(INSERTION_POLICY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case binPackage.BIN_DESC__PROCESSOR_TARGET:
				return processorTarget != null;
			case binPackage.BIN_DESC__BINARY_MODULE:
				return binaryModule != null && !binaryModule.isEmpty();
			case binPackage.BIN_DESC__COMPONENT_IMPLEMENTATION:
				return COMPONENT_IMPLEMENTATION_EDEFAULT == null ? componentImplementation != null : !COMPONENT_IMPLEMENTATION_EDEFAULT.equals(componentImplementation);
			case binPackage.BIN_DESC__INSERTION_POLICY:
				return INSERTION_POLICY_EDEFAULT == null ? insertionPolicy != null : !INSERTION_POLICY_EDEFAULT.equals(insertionPolicy);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (componentImplementation: ");
		result.append(componentImplementation);
		result.append(", insertionPolicy: ");
		result.append(insertionPolicy);
		result.append(')');
		return result.toString();
	}

} //BinDescImpl
