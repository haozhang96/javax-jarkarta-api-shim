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

package jakarta.servlet;

import javax.shim.Shim;

/**
 * @deprecated Use {@link jakarta.servlet.DispatcherType} instead.
 */
@Deprecated(since = "jakarta.servlet.DispatcherType")
public interface DispatcherType extends Shim {
    javax.servlet.DispatcherType FORWARD = javax.servlet.DispatcherType.FORWARD;
    javax.servlet.DispatcherType INCLUDE = javax.servlet.DispatcherType.INCLUDE;
    javax.servlet.DispatcherType REQUEST = javax.servlet.DispatcherType.REQUEST;
    javax.servlet.DispatcherType ASYNC = javax.servlet.DispatcherType.ASYNC;
    javax.servlet.DispatcherType ERROR = javax.servlet.DispatcherType.ERROR;

    static javax.servlet.DispatcherType valueOf(String name) {
        return javax.servlet.DispatcherType.valueOf(name);
    }
}