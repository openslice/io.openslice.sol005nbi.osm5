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
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping placement-group-input {
 *   leaf cloud-type {
 *     type manotypes:cloud-account-type;
 *   }
 *   choice cloud-provider {
 *     case openstack {
 *       container availability-zone {
 *         leaf name {
 *           type string;
 *         }
 *       }
 *       container server-group {
 *         leaf name {
 *           type string;
 *         }
 *       }
 *       uses host-aggregate;
 *     }
 *     case aws {
 *       leaf aws-construct {
 *         type empty;
 *       }
 *     }
 *     case openmano {
 *       leaf openmano-construct {
 *         type empty;
 *       }
 *     }
 *     case vsphere {
 *       leaf vsphere-construct {
 *         type empty;
 *       }
 *     }
 *     case mock {
 *       leaf mock-construct {
 *         type empty;
 *       }
 *     }
 *     case cloudsim {
 *       leaf cloudsim-construct {
 *         type empty;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input</i>
 *
 */
public interface PlacementGroupInput
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-group-input");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CloudAccountType</code> <code>cloudType</code>, or <code>null</code> if not present
     */
    @Nullable
    CloudAccountType getCloudType();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider</code> <code>cloudProvider</code>, or <code>null</code> if not present
     */
    @Nullable
    CloudProvider getCloudProvider();

}

