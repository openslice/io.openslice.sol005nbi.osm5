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
package osm5.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon;
import osm5.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance;

/**
 * List of ns scaling group instances
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list scaling-group {
 *   key scaling-group-name-ref;
 *   leaf scaling-group-name-ref {
 *     type string;
 *   }
 *   list instance {
 *     key id;
 *     leaf id {
 *       type uint16;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/scaling-group</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupBuilder}.
 * @see ScalingGroupBuilder
 * @see ScalingGroupKey
 *
 */
public interface ScalingGroup
    extends
    ChildOf<NsInstanceConfigParamsCommon>,
    Augmentable<ScalingGroup>,
    Identifiable<ScalingGroupKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group");

    /**
     * name of the scaling groupleafref path ../nsd/scaling-group-descriptor/name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getScalingGroupNameRef();
    
    /**
     * The instance of the scaling group
     *
     *
     *
     * @return <code>java.util.List</code> <code>instance</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Instance> getInstance();
    
    @Override
    ScalingGroupKey key();

}

