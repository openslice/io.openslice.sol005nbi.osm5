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
package osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria;
import osm5.ns.yang.nfvo.mano.types.rev170208.ScalingCriteriaOperation;
import osm5.ns.yang.nfvo.mano.types.rev170208.ScalingPolicyType;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-policy {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf scaling-type {
 *     type manotypes:scaling-policy-type;
 *   }
 *   leaf enabled {
 *     type boolean;
 *     default true;
 *   }
 *   leaf scale-in-operation-type {
 *     type manotypes:scaling-criteria-operation;
 *     default AND;
 *   }
 *   leaf scale-out-operation-type {
 *     type manotypes:scaling-criteria-operation;
 *     default OR;
 *   }
 *   leaf threshold-time {
 *     type uint32;
 *   }
 *   leaf cooldown-time {
 *     type uint32;
 *   }
 *   list scaling-criteria {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf scale-in-threshold {
 *       type uint64;
 *     }
 *     leaf scale-in-relational-operation {
 *       type manotypes:relational-operation-type;
 *       default LE;
 *     }
 *     leaf scale-out-threshold {
 *       type uint64;
 *     }
 *     leaf scale-out-relational-operation {
 *       type manotypes:relational-operation-type;
 *       default GE;
 *     }
 *     leaf ns-monitoring-param-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/scaling-policy</i>
 * 
 * <p>To create instances of this class use {@link ScalingPolicyBuilder}.
 * @see ScalingPolicyBuilder
 * @see ScalingPolicyKey
 *
 */
public interface ScalingPolicy
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<ScalingPolicy>,
    Identifiable<ScalingPolicyKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-policy");

    /**
     * Name of the scaling policy
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Type of scaling
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ScalingPolicyType</code> <code>scalingType</code>, or <code>null</code> if not present
     */
    @Nullable
    ScalingPolicyType getScalingType();
    
    /**
     * Specifies if the scaling policy can be applied
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isEnabled();
    
    /**
     * Operation to be applied to check between scaling criterias tocheck if the scale 
     * in threshold condition has been met.Defaults to AND
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ScalingCriteriaOperation</code> <code>scaleInOperationType</code>, or <code>null</code> if not present
     */
    @Nullable
    ScalingCriteriaOperation getScaleInOperationType();
    
    /**
     * Operation to be applied to check between scaling criterias tocheck if the scale 
     * out threshold condition has been met.Defauls to OR
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ScalingCriteriaOperation</code> <code>scaleOutOperationType</code>, or <code>null</code> if not present
     */
    @Nullable
    ScalingCriteriaOperation getScaleOutOperationType();
    
    /**
     * The duration for which the criteria must hold true
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdTime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getThresholdTime();
    
    /**
     * The duration after a scaling-in/scaling-out action has beentriggered, for which 
     * there will be no further optional
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cooldownTime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getCooldownTime();
    
    /**
     * list of conditions to be met for generating scaling requests
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingCriteria</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ScalingCriteria> getScalingCriteria();
    
    @Override
    ScalingPolicyKey key();

}

