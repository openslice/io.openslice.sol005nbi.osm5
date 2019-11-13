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

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.RpcProjectName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping rpc-common {
 *   uses manotypes:rpc-project-name;
 *   leaf nsr_id_ref {
 *     type leafref {
 *       path /rw-project:project[rw-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr/nsr:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/rpc-common</i>
 *
 */
public interface RpcCommon
    extends
    DataObject,
    RpcProjectName
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("rpc-common");

    /**
     * Reference to NSR ID ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getNsrIdRef();

}

