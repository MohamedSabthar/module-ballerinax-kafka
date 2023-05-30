// Copyright (c) 2022 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
//
// WSO2 Inc. licenses this file to you under the Apache License,
// Version 2.0 (the "License"); you may not use this file except
// in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

# Represents the TypeChecker which is used by the runtime to check whether a type is a subtype of `kafka:AnydataConsumerRecord`
isolated class TypeChecker {

    # Gets invoked during object initialization.
    #
    isolated function init() {}

    # Checks whether a given type is a subtype of `kafka:AnydataConsumerRecord`.
    # 
    # + typeDesc - The type needed to be checked as a subtype of `kafka:AnydataConsumerRecord`
    # + return - True if the type is a subtype of `kafka:AnydataConsumerRecord`, else false
    isolated function isAnydataConsumerRecord(typedesc<anydata> typeDesc) returns boolean {
        if typeDesc is typedesc<AnydataConsumerRecord> {
            return true;
        }
        return false;
    }
}
