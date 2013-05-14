/**
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Obeo - initial API and implementation
 */
package org.eclipselabs.emf.loophole.internal.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.emf.loophole.internal.model.*;

import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholeFactory;
import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicLoopholeFactoryImpl extends EFactoryImpl implements LoopholeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoopholeFactory init() {
		try {
			LoopholeFactory theLoopholeFactory = (LoopholeFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipselabs.emf.loophole:1.0.0"); //$NON-NLS-1$ 
			if (theLoopholeFactory != null) {
				return theLoopholeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicLoopholeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicLoopholeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LoopholePackage.GEN_GAP_MODEL: return createGenGapModel();
			case LoopholePackage.GEN_GAP_PACKAGE: return createGenGapPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenGapModel createGenGapModel() {
		GenGapModelCustomImpl genGapModel = new GenGapModelCustomImpl();
		return genGapModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenGapPackage createGenGapPackage() {
		GenGapPackageCustomImpl genGapPackage = new GenGapPackageCustomImpl();
		return genGapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopholePackage getLoopholePackage() {
		return (LoopholePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LoopholePackage getPackage() {
		return LoopholePackage.eINSTANCE;
	}

} //BasicLoopholeFactoryImpl
