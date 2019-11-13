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
package osm5.ns.yang.ietf.network.topology.rev180226.networks.network.link;
import java.lang.Object;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.NodeId;
import osm5.ns.yang.ietf.network.topology.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.Link;

/**
 * This container holds the logical source of a particularlink.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * container source {
 *   leaf source-node {
 *     type leafref {
 *       path ../../../nw:node/nw:node-id;
 *       require-instance false;
 *     }
 *   }
 *   leaf source-tp {
 *     type leafref {
 *       path ../../../nw:node[nw:node-id=current()/../source-node]/termination-point/tp-id;
 *       require-instance false;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/networks/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2018-02-26)link/source</i>
 * 
 * <p>To create instances of this class use {@link SourceBuilder}.
 * @see SourceBuilder
 *
 */
public interface Source
    extends
    ChildOf<Link>,
    Augmentable<Source>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("source");

    /**
     * Source node identifier. Must be in the same topology.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NodeId</code> <code>sourceNode</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getSourceNode();
    
    /**
     * This termination point is located within the source nodeand terminates the link.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>sourceTp</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getSourceTp();

}

