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
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.NetworkId;
import osm5.ns.yang.ietf.network.topology.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.Link;

/**
 * Identifies the link or links on which this link depends.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list supporting-link {
 *   key "network-ref link-ref";
 *   leaf network-ref {
 *     type leafref {
 *       path ../../../nw:supporting-network/nw:network-ref;
 *       require-instance false;
 *     }
 *   }
 *   leaf link-ref {
 *     type leafref {
 *       path /nw:networks/nw:network[nw:network-id=current()/../network-ref]/link/link-id;
 *       require-instance false;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/networks/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2018-02-26)link/supporting-link</i>
 * 
 * <p>To create instances of this class use {@link SupportingLinkBuilder}.
 * @see SupportingLinkBuilder
 * @see SupportingLinkKey
 *
 */
public interface SupportingLink
    extends
    ChildOf<Link>,
    Augmentable<SupportingLink>,
    Identifiable<SupportingLinkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-link");

    /**
     * This leaf identifies in which underlay topologythe supporting link is present.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkRef();
    
    /**
     * This leaf identifies a link that is a partof this link's underlay. Reference 
     * loops in whicha link identifies itself as its underlay, eitherdirectly or 
     * transitively, are not allowed.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>linkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getLinkRef();
    
    @Override
    SupportingLinkKey key();

}

