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
package osm5.ns.yang.nfvo.vnfr.rev170228;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.vnfr.rev170228.associated.virtual.cps.VirtualCps;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * grouping associated-virtual-cps {
 *   list virtual-cps {
 *     key name;
 *     uses vnfd-base:common-connection-point;
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf mac-address {
 *       type string;
 *     }
 *     leaf connection-point-id {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/associated-virtual-cps</i>
 *
 */
public interface AssociatedVirtualCps
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("associated-virtual-cps");

    /**
     * @return <code>java.util.List</code> <code>virtualCps</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VirtualCps> getVirtualCps();

}

