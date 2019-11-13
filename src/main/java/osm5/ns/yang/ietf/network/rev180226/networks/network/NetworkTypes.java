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
package osm5.ns.yang.ietf.network.rev180226.networks.network;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.rev180226.networks.Network;

/**
 * Serves as an augmentation target.The network type is indicated through 
 * correspondingpresence containers augmented into this container.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * container network-types {
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/networks/network/network-types</i>
 * 
 * <p>To create instances of this class use {@link NetworkTypesBuilder}.
 * @see NetworkTypesBuilder
 *
 */
public interface NetworkTypes
    extends
    ChildOf<Network>,
    Augmentable<NetworkTypes>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network-types");


}

