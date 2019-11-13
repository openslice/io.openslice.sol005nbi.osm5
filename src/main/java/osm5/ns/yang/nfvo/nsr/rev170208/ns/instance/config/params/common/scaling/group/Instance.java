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
package osm5.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group;
import java.lang.Integer;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;

/**
 * The instance of the scaling group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list instance {
 *   key id;
 *   leaf id {
 *     type uint16;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/scaling-group/instance</i>
 * 
 * <p>To create instances of this class use {@link InstanceBuilder}.
 * @see InstanceBuilder
 * @see InstanceKey
 *
 */
public interface Instance
    extends
    ChildOf<ScalingGroup>,
    Augmentable<Instance>,
    Identifiable<InstanceKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("instance");

    /**
     * Scaling group instance uuid
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getId();
    
    @Override
    InstanceKey key();

}

