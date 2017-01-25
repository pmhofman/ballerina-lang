/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.wso2.ballerina.docgen.docs.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.ballerina.docgen.docs.BallerinaDocDataHolder;
import org.wso2.ballerina.docgen.docs.model.BallerinaDoc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BallerinaDocGenTestUtils {
    private static final Logger log = LoggerFactory.getLogger(BallerinaDocGenTestUtils.class);

    public static void printDocMap(Map<String, BallerinaDoc> docsMap) {
        for (Entry<String, BallerinaDoc> entry : docsMap.entrySet()) {
            log.info(entry.getValue().toString());
        }
    }
    
    public static void cleanUp() {
        BallerinaDocDataHolder.getInstance().setBallerinaDocsMap(new HashMap<String, BallerinaDoc>());
    }

}
