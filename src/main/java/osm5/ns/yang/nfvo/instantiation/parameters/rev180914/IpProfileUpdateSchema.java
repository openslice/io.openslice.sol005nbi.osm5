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
package osm5.ns.yang.nfvo.instantiation.parameters.rev180914;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.inet.types.rev130715.IpPrefix;
import osm5.ns.yang.ietf.inet.types.rev130715.IpVersion;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ip.profile.update.schema.DhcpParams;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ip.profile.update.schema.DnsServer;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping ip-profile-update-schema {
 *   leaf ip-version {
 *     type inet:ip-version;
 *   }
 *   leaf subnet-address {
 *     type inet:ip-prefix;
 *   }
 *   leaf gateway-address {
 *     type inet:ip-prefix;
 *   }
 *   list dns-server {
 *     key address;
 *     leaf address {
 *       type inet:ip-address;
 *     }
 *   }
 *   container dhcp-params {
 *     leaf enabled {
 *       type boolean;
 *     }
 *     leaf count {
 *       type uint8;
 *     }
 *     leaf start-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ip-profile-update-schema</i>
 *
 */
public interface IpProfileUpdateSchema
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile-update-schema");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion</code> <code>ipVersion</code>, or <code>null</code> if not present
     */
    @Nullable
    IpVersion getIpVersion();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix</code> <code>subnetAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpPrefix getSubnetAddress();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix</code> <code>gatewayAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpPrefix getGatewayAddress();
    
    /**
     * @return <code>java.util.List</code> <code>dnsServer</code>, or <code>null</code> if not present
     */
    @Nullable
    List<DnsServer> getDnsServer();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.instantiation.parameters.rev180914.ip.profile.update.schema.DhcpParams</code> <code>dhcpParams</code>, or <code>null</code> if not present
     */
    @Nullable
    DhcpParams getDhcpParams();

}

