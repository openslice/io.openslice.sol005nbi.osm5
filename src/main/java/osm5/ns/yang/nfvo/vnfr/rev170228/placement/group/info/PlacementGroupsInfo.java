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
package osm5.ns.yang.nfvo.vnfr.rev170228.placement.group.info;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;
import osm5.ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo;

/**
 * Placement groups to which this VDU belongs and itscloud construct
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list placement-groups-info {
 *   key name;
 *   uses manotypes:placement-group-info;
 *   uses manotypes:placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/placement-group-info/placement-groups-info</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsInfoBuilder}.
 * @see PlacementGroupsInfoBuilder
 * @see PlacementGroupsInfoKey
 *
 */
public interface PlacementGroupsInfo
    extends
    ChildOf<PlacementGroupInfo>,
    Augmentable<PlacementGroupsInfo>,
    osm5.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo,
    PlacementGroupInput,
    Identifiable<PlacementGroupsInfoKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups-info");

    @Override
    PlacementGroupsInfoKey key();

}

