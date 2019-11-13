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
package osm5.ns.yang.ietf.network.topology.rev180226.networks.network.node;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.topology.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.topology.rev180226.Node1;
import osm5.ns.yang.ietf.network.topology.rev180226.TpId;
import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.node.termination.point.SupportingTerminationPoint;

/**
 * A termination point can terminate a link.Depending on the type of topology, a 
 * termination pointcould, for example, refer to a port or an interface.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list termination-point {
 *   key tp-id;
 *   leaf tp-id {
 *     type tp-id;
 *   }
 *   list supporting-termination-point {
 *     key "network-ref node-ref tp-ref";
 *     leaf network-ref {
 *       type leafref {
 *         path ../../../nw:supporting-node/nw:network-ref;
 *         require-instance false;
 *       }
 *     }
 *     leaf node-ref {
 *       type leafref {
 *         path ../../../nw:supporting-node/nw:node-ref;
 *         require-instance false;
 *       }
 *     }
 *     leaf tp-ref {
 *       type leafref {
 *         path /nw:networks/nw:network[nw:network-id=current()/../network-ref]/nw:node[nw:node-id=current()/../node-ref]/termination-point/tp-id;
 *         require-instance false;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/networks/network/node/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2018-02-26)termination-point</i>
 * 
 * <p>To create instances of this class use {@link TerminationPointBuilder}.
 * @see TerminationPointBuilder
 * @see TerminationPointKey
 *
 */
public interface TerminationPoint
    extends
    ChildOf<Node1>,
    Augmentable<TerminationPoint>,
    Identifiable<TerminationPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("termination-point");

    /**
     * Termination point identifier.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev180226.TpId</code> <code>tpId</code>, or <code>null</code> if not present
     */
    @Nullable
    TpId getTpId();
    
    /**
     * This list identifies any termination points on which agiven termination point 
     * depends or onto which it maps.Those termination points will themselves be 
     * containedin a supporting node. This dependency information can beinferred from 
     * the dependencies between links. Therefore,this item is not separately 
     * configurable. Hence, nocorresponding constraint needs to be articulated.The 
     * corresponding information is simply provided by theimplementing system.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingTerminationPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<SupportingTerminationPoint> getSupportingTerminationPoint();
    
    @Override
    TerminationPointKey key();

}

