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

import osm5.ns.yang.ietf.network.rev180226.NetworkRef;

/**
 * This grouping can be used to reference a link in a specificnetwork. Although it 
 * is not used in this module, it isdefined here for the convenience of augmenting 
 * modules.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * grouping link-ref {
 *   leaf link-ref {
 *     type leafref {
 *       path /nw:networks/nw:network[nw:network-id=current()/../network-ref]/nt:link/nt:link-id;
 *       require-instance false;
 *     }
 *   }
 *   uses nw:network-ref;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/link-ref</i>
 *
 */
public interface LinkRef
    extends
    DataObject,
    NetworkRef
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("link-ref");

    /**
     * A type for an absolute reference to a link instance.(This type should not be 
     * used for relative references.In such a case, a relative path should be used 
     * instead.)
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>linkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getLinkRef();

}

