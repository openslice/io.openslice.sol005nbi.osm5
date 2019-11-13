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
package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.placement.groups;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups;

/**
 * List of VDUs that are part of this placement group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list member-vdus {
 *   key member-vdu-ref;
 *   leaf member-vdu-ref {
 *     type leafref {
 *       path ../../../vdu/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/placement-groups/member-vdus</i>
 * 
 * <p>To create instances of this class use {@link MemberVdusBuilder}.
 * @see MemberVdusBuilder
 * @see MemberVdusKey
 *
 */
public interface MemberVdus
    extends
    ChildOf<PlacementGroups>,
    Augmentable<MemberVdus>,
    Identifiable<MemberVdusKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("member-vdus");

    /**
     * @return <code>java.lang.String</code> <code>memberVduRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVduRef();
    
    @Override
    MemberVdusKey key();

}

