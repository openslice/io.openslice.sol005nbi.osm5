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
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import osm5.ns.yang.ietf.network.rev180226.networks.Network;
import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.Link;

public interface Network1
    extends
    DataObject,
    Augmentation<Network>
{




    /**
     * A network link connects a local (source) node anda remote (destination) node via
     * a set of the respectivenode's termination points. It is possible to have 
     * severallinks between the same source and destination nodes.Likewise, a link 
     * could potentially be re-homed betweentermination points. Therefore, in order to 
     * ensure that wewould always know to distinguish between links, every linkis 
     * identified by a dedicated link identifier. Note that alink models a 
     * point-to-point link, not a multipoint link.
     *
     *
     *
     * @return <code>java.util.List</code> <code>link</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Link> getLink();

}

