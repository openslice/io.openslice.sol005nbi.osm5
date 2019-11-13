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
package osm5.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output;
import java.lang.Override;
import java.math.BigInteger;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;
import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput;
import osm5.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list.VnfOutPrimitive;

/**
 * List of VNFs whose primitives were set.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-out-list {
 *   key member_vnf_index_ref;
 *   leaf member_vnf_index_ref {
 *     type uint64;
 *   }
 *   leaf vnfr-id-ref {
 *     type yang:uuid;
 *   }
 *   list vnf-out-primitive {
 *     key index;
 *     leaf index {
 *       type uint32;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *     leaf execution-id {
 *       type string;
 *     }
 *     leaf execution-status {
 *       type string;
 *     }
 *     leaf execution-error-details {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/output/vnf-out-list</i>
 * 
 * <p>To create instances of this class use {@link VnfOutListBuilder}.
 * @see VnfOutListBuilder
 * @see VnfOutListKey
 *
 */
public interface VnfOutList
    extends
    ChildOf<ExecNsServicePrimitiveOutput>,
    Augmentable<VnfOutList>,
    Identifiable<VnfOutListKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-out-list");

    /**
     * Member VNF index
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfr. This is aleafref to path
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vnfrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getVnfrIdRef();
    
    /**
     * List of service primitives supported by theconfiguration agent for this VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfOutPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfOutPrimitive> getVnfOutPrimitive();
    
    @Override
    VnfOutListKey key();

}

