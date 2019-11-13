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
package osm5.ns.yang.nfvo.nsr.rev170208;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameter;
import osm5.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup;
import osm5.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.VnfPrimitiveGroup;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * output {
 *   list ns-parameter {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 *   list ns-parameter-group {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   list vnf-primitive-group {
 *     key member-vnf-index-ref;
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type string;
 *     }
 *     list primitive {
 *       key index;
 *       leaf index {
 *         type uint32;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       list parameter {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/output</i>
 * 
 * <p>To create instances of this class use {@link GetNsServicePrimitiveValuesOutputBuilder}.
 * @see GetNsServicePrimitiveValuesOutputBuilder
 *
 */
public interface GetNsServicePrimitiveValuesOutput
    extends
    RpcOutput,
    Augmentable<GetNsServicePrimitiveValuesOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * Automatically generated parameter
     *
     *
     *
     * @return <code>java.util.List</code> <code>nsParameter</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NsParameter> getNsParameter();
    
    /**
     * Automatically generated parameters in parameter group
     *
     *
     *
     * @return <code>java.util.List</code> <code>nsParameterGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NsParameterGroup> getNsParameterGroup();
    
    /**
     * List of service primitives grouped by VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfPrimitiveGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfPrimitiveGroup> getVnfPrimitiveGroup();

}

