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
package osm5.ns.yang.ietf.network.rev180226;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.networks.Network;

/**
 * Serves as a top-level container for a list of networks.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * container networks {
 *   list network {
 *     key network-id;
 *     leaf network-id {
 *       type network-id;
 *     }
 *     container network-types {
 *     }
 *     list supporting-network {
 *       key network-ref;
 *       leaf network-ref {
 *         type leafref {
 *           path /nw:networks/nw:network/nw:network-id;
 *           require-instance false;
 *         }
 *       }
 *     }
 *     list node {
 *       key node-id;
 *       leaf node-id {
 *         type node-id;
 *       }
 *       list supporting-node {
 *         key "network-ref node-ref";
 *         leaf network-ref {
 *           type leafref {
 *             path ../../../nw:supporting-network/nw:network-ref;
 *             require-instance false;
 *           }
 *         }
 *         leaf node-ref {
 *           type leafref {
 *             path /nw:networks/nw:network/nw:node/nw:node-id;
 *             require-instance false;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/networks</i>
 * 
 * <p>To create instances of this class use {@link NetworksBuilder}.
 * @see NetworksBuilder
 *
 */
public interface Networks
    extends
    ChildOf<IetfNetworkData>,
    Augmentable<Networks>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("networks");

    /**
     * Describes a network.A network typically contains an inventory of 
     * nodes,topological information (augmented through thenetwork-topology data 
     * model), and layering information.
     *
     *
     *
     * @return <code>java.util.List</code> <code>network</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Network> getNetwork();

}

