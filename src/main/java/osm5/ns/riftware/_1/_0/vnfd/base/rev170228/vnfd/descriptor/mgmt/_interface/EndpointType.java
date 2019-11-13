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
package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface;

/**
 * Indicates the type of management endpoint.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice endpoint-type {
 *   case ip {
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 *   case vdu-id {
 *     leaf vdu-id {
 *       type leafref {
 *         path ../../../../vdu/id;
 *       }
 *     }
 *   }
 *   case cp {
 *     leaf cp {
 *       type leafref {
 *         path ../../../../connection-point/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type</i>
 *
 */
public interface EndpointType
    extends
    ChoiceIn<MgmtInterface>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("endpoint-type");


}

