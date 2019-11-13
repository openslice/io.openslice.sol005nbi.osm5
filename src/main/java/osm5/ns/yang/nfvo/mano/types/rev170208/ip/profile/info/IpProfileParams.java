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
package osm5.ns.yang.nfvo.mano.types.rev170208.ip.profile.info;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.inet.types.rev130715.IpAddress;
import osm5.ns.yang.ietf.inet.types.rev130715.IpPrefix;
import osm5.ns.yang.ietf.inet.types.rev130715.IpVersion;
import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo;
import osm5.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams;
import osm5.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container ip-profile-params {
 *   leaf ip-version {
 *     type inet:ip-version;
 *     default ipv4;
 *   }
 *   leaf subnet-address {
 *     type inet:ip-prefix;
 *   }
 *   leaf gateway-address {
 *     type inet:ip-address;
 *   }
 *   leaf security-group {
 *     type string;
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
 *       default true;
 *     }
 *     leaf start-address {
 *       type inet:ip-address;
 *     }
 *     leaf count {
 *       type uint32;
 *     }
 *   }
 *   leaf subnet-prefix-pool {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-info/ip-profile-params</i>
 * 
 * <p>To create instances of this class use {@link IpProfileParamsBuilder}.
 * @see IpProfileParamsBuilder
 *
 */
public interface IpProfileParams
    extends
    ChildOf<IpProfileInfo>,
    Augmentable<IpProfileParams>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile-params");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion</code> <code>ipVersion</code>, or <code>null</code> if not present
     */
    @Nullable
    IpVersion getIpVersion();
    
    /**
     * Subnet IP prefix associated with IP Profile
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix</code> <code>subnetAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpPrefix getSubnetAddress();
    
    /**
     * IP Address of the default gateway associated with IP Profile
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>gatewayAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getGatewayAddress();
    
    /**
     * Name of the security group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>securityGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSecurityGroup();
    
    /**
     * @return <code>java.util.List</code> <code>dnsServer</code>, or <code>null</code> if not present
     */
    @Nullable
    List<DnsServer> getDnsServer();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams</code> <code>dhcpParams</code>, or <code>null</code> if not present
     */
    @Nullable
    DhcpParams getDhcpParams();
    
    /**
     * VIM Specific reference to pre-created subnet prefix
     *
     *
     *
     * @return <code>java.lang.String</code> <code>subnetPrefixPool</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSubnetPrefixPool();

}

