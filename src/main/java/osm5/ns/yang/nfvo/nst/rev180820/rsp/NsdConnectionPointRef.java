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
package osm5.ns.yang.nfvo.nst.rev180820.rsp;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nst.rev180820.Rsp;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list nsd-connection-point-ref {
 *   key nsd-ref;
 *   leaf nsd-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *     }
 *   }
 *   leaf order {
 *     type uint8;
 *   }
 *   leaf nsd-connection-point-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/rsp/nsd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link NsdConnectionPointRefBuilder}.
 * @see NsdConnectionPointRefBuilder
 * @see NsdConnectionPointRefKey
 *
 */
public interface NsdConnectionPointRef
    extends
    ChildOf<Rsp>,
    Augmentable<NsdConnectionPointRef>,
    Identifiable<NsdConnectionPointRefKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-connection-point-ref");

    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdRef();
    
    /**
     * A number that denotes the order of a NSD in a chain
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>order</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getOrder();
    
    /**
     * @return <code>java.lang.String</code> <code>nsdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdConnectionPointRef();
    
    @Override
    NsdConnectionPointRefKey key();

}

