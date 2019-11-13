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
package osm5.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput;

/**
 * Automatically generated parameter
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list ns-parameter {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/output/ns-parameter</i>
 * 
 * <p>To create instances of this class use {@link NsParameterBuilder}.
 * @see NsParameterBuilder
 * @see NsParameterKey
 *
 */
public interface NsParameter
    extends
    ChildOf<GetNsServicePrimitiveValuesOutput>,
    Augmentable<NsParameter>,
    Identifiable<NsParameterKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-parameter");

    /**
     * Parameter name which should be pulled from a parameter pool
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Automatically generated value
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable
    String getValue();
    
    @Override
    NsParameterKey key();

}

