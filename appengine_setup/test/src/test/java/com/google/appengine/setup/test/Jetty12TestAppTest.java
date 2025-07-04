/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.appengine.setup.test;

public class Jetty12TestAppTest extends TestAppBase {

    @Override
    protected String appName() {
        return "jetty12_testapp";
    }

    @Override
    protected String relativePathForUserApplicationJar() {
    return "../testapps/jetty12_testapp/target/"
        + "jetty12_testapp-2.0.38-SNAPSHOT-jar-with-dependencies.jar";
    }
}
