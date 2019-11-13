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
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.RpcProjectName;
import osm5.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input {
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:rpc-project-name;
 *   leaf nsd_id_ref {
 *     type leafref {
 *       path /rw-project:project[rw-project:name=current()/../project-name]/project-nsd:nsd-catalog/project-nsd:nsd/project-nsd:id;
 *     }
 *   }
 *   uses ns-instance-config-params-common;
 *   list vnfd-placement-group-maps {
 *     key "placement-group-ref vnfd-id-ref";
 *     leaf vnfd-id-ref {
 *       type yang:uuid;
 *     }
 *     leaf placement-group-ref {
 *       type leafref {
 *         path "/rw-project:project[rw-project:name=current()/../../project-name]/project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:placement-groups/project-vnfd:name";
 *       }
 *     }
 *     uses manotypes:placement-group-input;
 *     list ssh-authorized-key {
 *       key key-pair-ref;
 *       leaf key-pair-ref {
 *         type leafref {
 *           path /rw-project:project[rw-project:name=current()/../../../project-name]/key-pair/name;
 *         }
 *       }
 *     }
 *     list user {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf user-info {
 *         type string;
 *       }
 *       list ssh-authorized-key {
 *         key key-pair-ref;
 *         leaf key-pair-ref {
 *           type leafref {
 *             path /rw-project:project[rw-project:name=current()/../../../../project-name]/key-pair/name;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/input</i>
 * 
 * <p>To create instances of this class use {@link StartNetworkServiceInputBuilder}.
 * @see StartNetworkServiceInputBuilder
 *
 */
public interface StartNetworkServiceInput
    extends
    RpcProjectName,
    NsInstanceConfigParamsCommon,
    RpcInput,
    Augmentable<StartNetworkServiceInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * Name of the Network Service
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Reference to NSD ID ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getNsdIdRef();
    
    /**
     * Mapping from mano-placement groups construct from VNFD to cloudplatform 
     * placement group construct
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdPlacementGroupMaps</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps();

}

