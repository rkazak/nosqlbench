/*
 *
 *    Copyright 2016 jshook
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 * /
 */

package io.nosqlbench.engine.api.activityconfig.rawyaml;

import java.util.Map;

/**
 * A StmtsDef contains a list of rawStmts, as well as all of the optional
 * block parameters that can be assigned to {@link RawStmtFields}, which includes
 * a name, config values, data bindings, and filtering tags.
 */
public class RawStmtsBlock extends StatementsOwner {

    public RawStmtsBlock() {}

    public void setFieldsByReflection(Map<String, Object> propsmap) {
//        Object stmtValues = propsmap.remove("statements");
//        if (stmtValues!=null) {
//            if (stmtValues instanceof List) {
//                setByObject(stmtValues);
//            } else {
//                throw new RuntimeException("Invalid type for statements property: " + stmtValues.getClass().getCanonicalName());
//            }
//        }
        super.setFieldsByReflection(propsmap);
    }

}
