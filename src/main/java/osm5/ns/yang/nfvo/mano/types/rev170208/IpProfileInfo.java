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
package osm5.ns.yang.nfvo.mano.types.rev170208;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.IpProfileParams;

/**
 * Grouping for IP-Profile
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ip-profile-info {
 *   container ip-profile-params {
 *     leaf ip-version {
 *       type inet:ip-version;
 *       default ipv4;
 *     }
 *     leaf subnet-address {
 *       type inet:ip-prefix;
 *     }
 *     leaf gateway-address {
 *       type inet:ip-address;
 *     }
 *     leaf security-group {
 *       type string;
 *     }
 *     list dns-server {
 *       key address;
 *       leaf address {
 *         type inet:ip-address;
 *       }
 *     }
 *     container dhcp-params {
 *       leaf enabled {
 *         type boolean;
 *         default true;
 *       }
 *       leaf start-address {
 *         type inet:ip-address;
 *       }
 *       leaf count {
 *         type uint32;
 *       }
 *     }
 *     leaf subnet-prefix-pool {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-info</i>
 *
 */
public interface IpProfileInfo
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile-info");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.IpProfileParams</code> <code>ipProfileParams</code>, or <code>null</code> if not present
     */
    @Nullable
    IpProfileParams getIpProfileParams();

}

