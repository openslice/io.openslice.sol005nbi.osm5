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
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import osm5.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.ParameterGroup;
import osm5.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input {
 *   leaf name {
 *     type string;
 *   }
 *   uses rpc-common;
 *   leaf triggered-by {
 *     type trigger-type;
 *     default ns-primitive;
 *   }
 *   uses manotypes:primitive-parameter-value;
 *   list parameter-group {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *   }
 *   list vnf-list {
 *     key member_vnf_index_ref;
 *     leaf member_vnf_index_ref {
 *       type uint64;
 *     }
 *     leaf vnfr-id-ref {
 *       type yang:uuid;
 *     }
 *     list vnf-primitive {
 *       key index;
 *       leaf index {
 *         type uint32;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *     }
 *   }
 *   leaf user-defined-script {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/input</i>
 * 
 * <p>To create instances of this class use {@link ExecNsServicePrimitiveInputBuilder}.
 * @see ExecNsServicePrimitiveInputBuilder
 *
 */
public interface ExecNsServicePrimitiveInput
    extends
    PrimitiveParameterValue,
    RpcCommon,
    RpcInput,
    Augmentable<ExecNsServicePrimitiveInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * Name of the primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * The primitive is triggered from NS or VNF level
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.TriggerType</code> <code>triggeredBy</code>, or <code>null</code> if not present
     */
    @Nullable
    TriggerType getTriggeredBy();
    
    /**
     * List of NS Primitive parameter groups
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ParameterGroup> getParameterGroup();
    
    /**
     * List of VNFs whose primitives are being set.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfList</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfList> getVnfList();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    @Nullable
    String getUserDefinedScript();

}

