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
package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ip.profile.update.schema;
import java.lang.Boolean;
import java.lang.Short;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.inet.types.rev130715.IpAddress;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.IpProfileUpdateSchema;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * container dhcp-params {
 *   leaf enabled {
 *     type boolean;
 *   }
 *   leaf count {
 *     type uint8;
 *   }
 *   leaf start-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ip-profile-update-schema/dhcp-params</i>
 * 
 * <p>To create instances of this class use {@link DhcpParamsBuilder}.
 * @see DhcpParamsBuilder
 *
 */
public interface DhcpParams
    extends
    ChildOf<IpProfileUpdateSchema>,
    Augmentable<DhcpParams>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("dhcp-params");

    /**
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isEnabled();
    
    /**
     * @return <code>java.lang.Short</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getCount();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>startAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getStartAddress();

}

