/*
 * Copyright 2019 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sample.app;

import io.jmix.core.config.Config;
import io.jmix.core.config.Property;
import io.jmix.core.config.Source;
import io.jmix.core.config.SourceType;
import io.jmix.core.config.defaults.Default;

@Source(type = SourceType.APP)
public interface TestConfig extends Config {

    @Property("app.foo")
    @Default("defFoo")
    String getFoo();
}
