/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.keyboardplaying;

import java.io.File;

/**
 * Utility for test classes.
 *
 * @author Cyrille Chopelet (https://keyboardplaying.org)
 */
public abstract class AbstractFilesTest {

    /**
     * Shortcut method to get a file path based on {@link Class#getResource(String)}.
     *
     * @param name
     *            name of the desired file or directory
     * @return the path to the file or directory
     */
    public String getPath(String name) {
        return getClass().getResource(name).getPath();
    }

    /**
     * Shortcut method to get a file or directory based on {@link Class#getResource(String)}.
     *
     * @param name
     *            name of the desired file or directory
     * @return the file or directory
     */
    public File getFile(String name) {
        return new File(getPath(name));
    }
}