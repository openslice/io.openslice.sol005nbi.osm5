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
package osm5.ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping control-param {
 *   list control-param {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf group-tag {
 *       type string;
 *     }
 *     leaf min-value {
 *       type uint64;
 *     }
 *     leaf max-value {
 *       type uint64;
 *     }
 *     leaf current-value {
 *       type uint64;
 *     }
 *     leaf step-value {
 *       type uint64;
 *     }
 *     leaf units {
 *       type string;
 *     }
 *     leaf widget-type {
 *       type manotypes:widget-type;
 *     }
 *     leaf url {
 *       type inet:uri;
 *     }
 *     leaf method {
 *       type manotypes:http-method;
 *       default POST;
 *     }
 *     leaf payload {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/control-param</i>
 *
 */
public interface ControlParam
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("control-param");

    /**
     * List of control parameters to manage andupdate the running configuration of the 
     * VNF
     *
     *
     *
     * @return <code>java.util.List</code> <code>controlParam</code>, or <code>null</code> if not present
     */
    @Nullable
    List<osm5.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam> getControlParam();

}

