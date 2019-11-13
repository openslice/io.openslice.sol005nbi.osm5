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
package osm5.ns.yang.nfvo.vnfr.rev170228.associated.virtual.cps;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint;
import osm5.ns.yang.ietf.inet.types.rev130715.IpAddress;
import osm5.ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list virtual-cps {
 *   key name;
 *   uses vnfd-base:common-connection-point;
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 *   leaf mac-address {
 *     type string;
 *   }
 *   leaf connection-point-id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/associated-virtual-cps/virtual-cps</i>
 * 
 * <p>To create instances of this class use {@link VirtualCpsBuilder}.
 * @see VirtualCpsBuilder
 * @see VirtualCpsKey
 *
 */
public interface VirtualCps
    extends
    ChildOf<AssociatedVirtualCps>,
    Augmentable<VirtualCps>,
    CommonConnectionPoint,
    Identifiable<VirtualCpsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-cps");

    /**
     * IP address assigned to the virtual connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getIpAddress();
    
    /**
     * MAC address assigned to the virtual connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMacAddress();
    
    /**
     * VIM identifier for connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>connectionPointId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getConnectionPointId();
    
    @Override
    VirtualCpsKey key();

}

