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

import osm5.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * grouping placement-group-info {
 *   list placement-groups-info {
 *     key name;
 *     uses manotypes:placement-group-info;
 *     uses manotypes:placement-group-input;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/placement-group-info</i>
 *
 */
public interface PlacementGroupInfo
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-group-info");

    /**
     * Placement groups to which this VDU belongs and itscloud construct
     *
     *
     *
     * @return <code>java.util.List</code> <code>placementGroupsInfo</code>, or <code>null</code> if not present
     */
    @Nullable
    List<PlacementGroupsInfo> getPlacementGroupsInfo();

}

