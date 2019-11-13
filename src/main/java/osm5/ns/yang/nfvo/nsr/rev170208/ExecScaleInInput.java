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
package osm5.ns.yang.nfvo.nsr.rev170208;
import java.lang.Object;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input {
 *   uses rpc-common;
 *   leaf scaling-group-name-ref {
 *     type leafref {
 *       path /rw-project:project[rw-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:nsd/nsr:scaling-group-descriptor/nsr:name;
 *     }
 *   }
 *   leaf instance-id {
 *     type leafref {
 *       path /rw-project:project[rw-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:scaling-group[nsr:scaling-group-name-ref=current()/../nsr:scaling-group-name-ref]/nsr:instance/nsr:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-scale-in/input</i>
 * 
 * <p>To create instances of this class use {@link ExecScaleInInputBuilder}.
 * @see ExecScaleInInputBuilder
 *
 */
public interface ExecScaleInInput
    extends
    RpcCommon,
    RpcInput,
    Augmentable<ExecScaleInInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * name of the scaling group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getScalingGroupNameRef();
    
    /**
     * id of the scaling group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>instanceId</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getInstanceId();

}

