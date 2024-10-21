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

import javax.servlet.DispatcherType;
import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.WebFilter} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.servlet.annotation.WebFilter")
public @interface WebFilter {
    /**
     * @see jakarta.servlet.annotation.WebFilter#description()
     */
    String description() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#displayName()
     */
    String displayName() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#initParams()
     */
    WebInitParam[] initParams() default {};

    /**
     * @see jakarta.servlet.annotation.WebFilter#filterName()
     */
    String filterName() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#smallIcon()
     */
    String smallIcon() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#largeIcon()
     */
    String largeIcon() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#servletNames()
     */
    String[] servletNames() default {};

    /**
     * @see jakarta.servlet.annotation.WebFilter#value()
     */
    String[] value() default {};

    /**
     * @see jakarta.servlet.annotation.WebFilter#urlPatterns()
     */
    String[] urlPatterns() default {};

    /**
     * @see jakarta.servlet.annotation.WebFilter#dispatcherTypes()
     */
    DispatcherType[] dispatcherTypes() default DispatcherType.REQUEST;

    /**
     * @see jakarta.servlet.annotation.WebFilter#asyncSupported()
     */
    boolean asyncSupported() default false;
}
