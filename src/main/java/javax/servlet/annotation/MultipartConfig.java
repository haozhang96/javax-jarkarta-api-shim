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

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.MultipartConfig} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.servlet.annotation.MultipartConfig")
public @interface MultipartConfig {
    /**
     * @see jakarta.servlet.annotation.MultipartConfig#location()
     */
    String location() default "";

    /**
     * @see jakarta.servlet.annotation.MultipartConfig#maxFileSize()
     */
    long maxFileSize() default -1L;

    /**
     * @see jakarta.servlet.annotation.MultipartConfig#maxRequestSize()
     */
    long maxRequestSize() default -1L;

    /**
     * @see jakarta.servlet.annotation.MultipartConfig#fileSizeThreshold()
     */
    int fileSizeThreshold() default 0;
}
