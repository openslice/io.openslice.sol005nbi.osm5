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
package osm5.ns.yang.ietf.network.topology.rev180226.networks.network;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.topology.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.topology.rev180226.LinkId;
import osm5.ns.yang.ietf.network.topology.rev180226.Network1;
import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.link.Destination;
import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.link.Source;
import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.link.SupportingLink;

/**
 * A network link connects a local (source) node anda remote (destination) node 
 * a set of the respectivenode's termination points. It is possible to have 
 * severallinks between the same source and destination nodes.Likewise, a link 
 * could potentially be re-homed betweentermination points. Therefore, in order to 
 * ensure that wewould always know to distinguish between links, every linkis 
 * identified by a dedicated link identifier. Note that alink models a 
 * point-to-point link, not a multipoint link.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list link {
 *   key link-id;
 *   leaf link-id {
 *     type link-id;
 *   }
 *   container source {
 *     leaf source-node {
 *       type leafref {
 *         path ../../../nw:node/nw:node-id;
 *         require-instance false;
 *       }
 *     }
 *     leaf source-tp {
 *       type leafref {
 *         path ../../../nw:node[nw:node-id=current()/../source-node]/termination-point/tp-id;
 *         require-instance false;
 *       }
 *     }
 *   }
 *   container destination {
 *     leaf dest-node {
 *       type leafref {
 *         path ../../../nw:node/nw:node-id;
 *         require-instance false;
 *       }
 *     }
 *     leaf dest-tp {
 *       type leafref {
 *         path ../../../nw:node[nw:node-id=current()/../dest-node]/termination-point/tp-id;
 *         require-instance false;
 *       }
 *     }
 *   }
 *   list supporting-link {
 *     key "network-ref link-ref";
 *     leaf network-ref {
 *       type leafref {
 *         path ../../../nw:supporting-network/nw:network-ref;
 *         require-instance false;
 *       }
 *     }
 *     leaf link-ref {
 *       type leafref {
 *         path /nw:networks/nw:network[nw:network-id=current()/../network-ref]/link/link-id;
 *         require-instance false;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/networks/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2018-02-26)link</i>
 * 
 * <p>To create instances of this class use {@link LinkBuilder}.
 * @see LinkBuilder
 * @see LinkKey
 *
 */
public interface Link
    extends
    ChildOf<Network1>,
    Augmentable<Link>,
    Identifiable<LinkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("link");

    /**
     * The identifier of a link in the topology.A link is specific to a topology to 
     * which it belongs.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev180226.LinkId</code> <code>linkId</code>, or <code>null</code> if not present
     */
    @Nullable
    LinkId getLinkId();
    
    /**
     * This container holds the logical source of a particularlink.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev180226.networks.network.link.Source</code> <code>source</code>, or <code>null</code> if not present
     */
    @Nullable
    Source getSource();
    
    /**
     * This container holds the logical destination of aparticular link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev180226.networks.network.link.Destination</code> <code>destination</code>, or <code>null</code> if not present
     */
    @Nullable
    Destination getDestination();
    
    /**
     * Identifies the link or links on which this link depends.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingLink</code>, or <code>null</code> if not present
     */
    @Nullable
    List<SupportingLink> getSupportingLink();
    
    @Override
    LinkKey key();

}

