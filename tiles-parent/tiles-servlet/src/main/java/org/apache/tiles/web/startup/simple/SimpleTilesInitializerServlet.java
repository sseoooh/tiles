/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.tiles.web.startup.simple;

import org.apache.tiles.startup.DefaultTilesInitializer;
import org.apache.tiles.startup.TilesInitializer;
import org.apache.tiles.web.startup.AbstractTilesInitializerServlet;

/**
 * A Tiles listener that loads Tiles in the default way.
 *
 * @version $Rev$ $Date$
 * @since 2.2.0
 */
public class SimpleTilesInitializerServlet extends AbstractTilesInitializerServlet {

    /** {@inheritDoc} */
    @Override
    protected TilesInitializer createTilesInitializer() {
        return new DefaultTilesInitializer();
    }
}