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
package osm5.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;
import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon;

/**
 * Mapping from mano-placement groups construct from NSD to cloudplatform 
 * group construct
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list nsd-placement-group-maps {
 *   key placement-group-ref;
 *   leaf placement-group-ref {
 *     type string;
 *   }
 *   uses manotypes:placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/nsd-placement-group-maps</i>
 * 
 * <p>To create instances of this class use {@link NsdPlacementGroupMapsBuilder}.
 * @see NsdPlacementGroupMapsBuilder
 * @see NsdPlacementGroupMapsKey
 *
 */
public interface NsdPlacementGroupMaps
    extends
    ChildOf<NsInstanceConfigParamsCommon>,
    Augmentable<NsdPlacementGroupMaps>,
    PlacementGroupInput,
    Identifiable<NsdPlacementGroupMapsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-placement-group-maps");

    /**
     * Reference for NSD placement group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>placementGroupRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPlacementGroupRef();
    
    @Override
    NsdPlacementGroupMapsKey key();

}

