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
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.VnfdDescriptor;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus;
import osm5.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo;

/**
 * List of placement groups at VNF level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list placement-groups {
 *   key name;
 *   uses manotypes:placement-group-info;
 *   list member-vdus {
 *     key member-vdu-ref;
 *     leaf member-vdu-ref {
 *       type leafref {
 *         path ../../../vdu/id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/placement-groups</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsBuilder}.
 * @see PlacementGroupsBuilder
 * @see PlacementGroupsKey
 *
 */
public interface PlacementGroups
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<PlacementGroups>,
    PlacementGroupInfo,
    Identifiable<PlacementGroupsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups");

    /**
     * List of VDUs that are part of this placement group
     *
     *
     *
     * @return <code>java.util.List</code> <code>memberVdus</code>, or <code>null</code> if not present
     */
    @Nullable
    List<MemberVdus> getMemberVdus();
    
    @Override
    PlacementGroupsKey key();

}

