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
package osm5.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.HostAggregate;
import osm5.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;
import osm5.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack.AvailabilityZone;
import osm5.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack.ServerGroup;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case openstack {
 *   container availability-zone {
 *     leaf name {
 *       type string;
 *     }
 *   }
 *   container server-group {
 *     leaf name {
 *       type string;
 *     }
 *   }
 *   uses host-aggregate;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/openstack</i>
 *
 */
public interface Openstack
    extends
    DataObject,
    Augmentable<Openstack>,
    HostAggregate,
    CloudProvider
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("openstack");

    /**
     * Name of the Availability Zone
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack.AvailabilityZone</code> <code>availabilityZone</code>, or <code>null</code> if not present
     */
    @Nullable
    AvailabilityZone getAvailabilityZone();
    
    /**
     * Name of the Affinity/Anti-Affinity Server Group
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack.ServerGroup</code> <code>serverGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    ServerGroup getServerGroup();

}

