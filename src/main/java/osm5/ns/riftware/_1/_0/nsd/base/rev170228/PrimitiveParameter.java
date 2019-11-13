/*-
 * ========================LICENSE_START=================================
 * io.openslice.sol005nbi.osm5
 * %%
 * Copyright (C) 2019 openslice.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package osm5.ns.riftware._1._0.nsd.base.rev170228;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.ParameterDataType;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping primitive-parameter {
 *   leaf name {
 *     type string;
 *   }
 *   leaf data-type {
 *     type manotypes:parameter-data-type;
 *   }
 *   leaf mandatory {
 *     type boolean;
 *     default false;
 *   }
 *   leaf default-value {
 *     type string;
 *   }
 *   leaf parameter-pool {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/primitive-parameter</i>
 *
 */
public interface PrimitiveParameter
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("primitive-parameter");

    /**
     * Name of the parameter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Data type associated with the name.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ParameterDataType</code> <code>dataType</code>, or <code>null</code> if not present
     */
    @Nullable
    ParameterDataType getDataType();
    
    /**
     * Is this field mandatory
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mandatory</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isMandatory();
    
    /**
     * The default value for this field
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultValue</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDefaultValue();
    
    /**
     * NSD parameter pool name to use for this parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>parameterPool</code>, or <code>null</code> if not present
     */
    @Nullable
    String getParameterPool();

}

