/*
 * Copyright (c) 2020 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
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

package io.ballerina.stdlib.kafka.utils;

import io.ballerina.runtime.api.Environment;
import io.ballerina.runtime.api.Module;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

/**
 * This class will hold module related utility functions.
 *
 * @since 2.0.0
 */
public class ModuleUtils {

    /**
     * Kafka standard library package ID.
     */
    private static Module kafkaModule = null;

    private ModuleUtils() {
    }

    public static void setModule(Environment env) {
        kafkaModule = env.getCurrentModule();
    }

    public static Module getModule() {
        return kafkaModule;
    }

    public static void initializeLoggingConfigurations() {
        try (InputStream is = ModuleUtils.class.getClassLoader().getResourceAsStream("kafka_logging.properties")) {
            LogManager.getLogManager().readConfiguration(is);
        } catch (IOException e) { }
    }
}
