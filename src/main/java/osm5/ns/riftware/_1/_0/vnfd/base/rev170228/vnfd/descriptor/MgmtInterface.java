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
package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.VnfdDescriptor;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.MgmtInterfaceBuilder.MgmtInterfaceImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType;
import osm5.ns.yang.ietf.inet.types.rev130715.PortNumber;

/**
 * Interface over which the VNF is managed.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container mgmt-interface {
 *   choice endpoint-type {
 *     case ip {
 *       leaf ip-address {
 *         type inet:ip-address;
 *       }
 *     }
 *     case vdu-id {
 *       leaf vdu-id {
 *         type leafref {
 *           path ../../../../vdu/id;
 *         }
 *       }
 *     }
 *     case cp {
 *       leaf cp {
 *         type leafref {
 *           path ../../../../connection-point/name;
 *         }
 *       }
 *     }
 *   }
 *   leaf port {
 *     type inet:port-number;
 *   }
 *   container dashboard-params {
 *     leaf path {
 *       type string;
 *     }
 *     leaf https {
 *       type boolean;
 *     }
 *     leaf port {
 *       type inet:port-number;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface</i>
 * 
 * <p>To create instances of this class use {@link MgmtInterfaceBuilder}.
 * @see MgmtInterfaceBuilder
 *
 */
@JsonDeserialize(as = MgmtInterfaceImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface MgmtInterface
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<MgmtInterface>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("mgmt-interface");

    /**
     * Indicates the type of management endpoint.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType</code> <code>endpointType</code>, or <code>null</code> if not present
     */
    @Nullable
    EndpointType getEndpointType();
    
    /**
     * Port for the management interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    @Nullable
    PortNumber getPort();
    
    /**
     * Parameters for the VNF dashboard
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams</code> <code>dashboardParams</code>, or <code>null</code> if not present
     */
    @Nullable
    DashboardParams getDashboardParams();

}

