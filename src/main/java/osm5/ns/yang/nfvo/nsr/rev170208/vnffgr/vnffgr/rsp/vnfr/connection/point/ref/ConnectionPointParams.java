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
package osm5.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.inet.types.rev130715.IpAddress;
import osm5.ns.yang.ietf.inet.types.rev130715.PortNumber;
import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container connection-point-params {
 *   leaf mgmt-address {
 *     type inet:ip-address;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf port-id {
 *     type string;
 *   }
 *   leaf vm-id {
 *     type string;
 *   }
 *   leaf address {
 *     type inet:ip-address;
 *   }
 *   leaf port {
 *     type inet:port-number;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/rsp/vnfr-connection-point-ref/connection-point-params</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointParamsBuilder}.
 * @see ConnectionPointParamsBuilder
 *
 */
public interface ConnectionPointParams
    extends
    ChildOf<VnfrConnectionPointRef>,
    Augmentable<ConnectionPointParams>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point-params");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>mgmtAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getMgmtAddress();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>portId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPortId();
    
    /**
     * @return <code>java.lang.String</code> <code>vmId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVmId();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>address</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getAddress();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    @Nullable
    PortNumber getPort();

}

