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
package osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.netslice_vld_params;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.inet.types.rev130715.IpAddress;
import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.NetsliceVldParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * list nss-connection-point-ref {
 *   key "nss-ref nsd-connection-point-ref";
 *   leaf nss-ref {
 *     type leafref {
 *       path /nst:nst/nst:netslice-subnet/nst:id;
 *     }
 *   }
 *   leaf nsd-connection-point-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *     }
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_vld_params/nss-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link NssConnectionPointRefBuilder}.
 * @see NssConnectionPointRefBuilder
 * @see NssConnectionPointRefKey
 *
 */
public interface NssConnectionPointRef
    extends
    ChildOf<NetsliceVldParams>,
    Augmentable<NssConnectionPointRef>,
    Identifiable<NssConnectionPointRefKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nss-connection-point-ref");

    /**
     * Reference to slice subnet
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nssRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNssRef();
    
    /**
     * @return <code>java.lang.String</code> <code>nsdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdConnectionPointRef();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getIpAddress();
    
    @Override
    NssConnectionPointRefKey key();

}

