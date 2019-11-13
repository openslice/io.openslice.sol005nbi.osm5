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
package osm5.ns.yang.ietf.network.topology.rev180226;
import java.lang.Object;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.NodeRef;

/**
 * This grouping can be used to reference a termination pointin a specific node. 
 * Although it is not used in this module,it is defined here for the convenience 
 * augmentingmodules.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * grouping tp-ref {
 *   leaf tp-ref {
 *     type leafref {
 *       path /nw:networks/nw:network[nw:network-id=current()/../network-ref]/nw:node[nw:node-id=current()/../node-ref]/nt:termination-point/nt:tp-id;
 *       require-instance false;
 *     }
 *   }
 *   uses nw:node-ref;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/tp-ref</i>
 *
 */
public interface TpRef
    extends
    DataObject,
    NodeRef
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("tp-ref");

    /**
     * A type for an absolute reference to a termination point.(This type should not be
     * used for relative references.In such a case, a relative path should be used 
     * instead.)
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>tpRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getTpRef();

}

