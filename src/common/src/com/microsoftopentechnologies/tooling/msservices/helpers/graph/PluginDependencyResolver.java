/**
 * Copyright 2014 Microsoft Open Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.microsoftopentechnologies.tooling.msservices.helpers.graph;

import com.microsoft.services.odata.impl.desktop.JvmDependencyResolver;
import com.microsoftopentechnologies.tooling.msservices.components.DefaultLoader;

public class PluginDependencyResolver extends JvmDependencyResolver {
    public PluginDependencyResolver(String token) {
        super(token);
    }

    @Override
    public String getPlatformUserAgent(String productName) {
        String version = DefaultLoader.getPluginComponent().getSettings().getPluginVersion();
        return String.format(
                "%s/%s (lang=%s; os=%s; version=%s)",
                DefaultLoader.getPluginComponent().getPluginId(),
                version,
                "Java",
                System.getProperty("os.name"),
                version);
    }
}
