/*
 * Copyright (c) 2017, 2020 Oracle and/or its affiliates and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.servlet.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.HttpMethodConstraint} instead.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.servlet.annotation.HttpMethodConstraint")
public @interface HttpMethodConstraint {
    /**
     * @see jakarta.servlet.annotation.HttpMethodConstraint#value()
     */
    String value();

    /**
     * @see jakarta.servlet.annotation.HttpMethodConstraint#value()
     */
    ServletSecurity.EmptyRoleSemantic emptyRoleSemantic() default ServletSecurity.EmptyRoleSemantic.PERMIT;

    /**
     * @see jakarta.servlet.annotation.HttpMethodConstraint#transportGuarantee()
     */
    ServletSecurity.TransportGuarantee transportGuarantee() default ServletSecurity.TransportGuarantee.NONE;

    /**
     * @see jakarta.servlet.annotation.HttpMethodConstraint#rolesAllowed()
     */
    String[] rolesAllowed() default {};
}
