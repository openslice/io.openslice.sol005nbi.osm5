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
package osm5.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;
import osm5.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;
import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams;

/**
 * Mapping from mano-placement groups construct from VNFD to cloud platform 
 * placement group construct
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnfd-placement-group-maps {
 *   key "placement-group-ref vnfd-id-ref";
 *   leaf vnfd-id-ref {
 *     type yang:uuid;
 *   }
 *   leaf placement-group-ref {
 *     type leafref {
 *       path "../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:placement-groups/project-vnfd:name";
 *     }
 *   }
 *   uses manotypes:placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params/vnfd-placement-group-maps</i>
 * 
 * <p>To create instances of this class use {@link VnfdPlacementGroupMapsBuilder}.
 * @see VnfdPlacementGroupMapsBuilder
 * @see VnfdPlacementGroupMapsKey
 *
 */
public interface VnfdPlacementGroupMaps
    extends
    ChildOf<NsInstanceConfigParams>,
    Augmentable<VnfdPlacementGroupMaps>,
    PlacementGroupInput,
    Identifiable<VnfdPlacementGroupMapsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-placement-group-maps");

    /**
     * A reference to a vnfd. This is aleafref to 
     * path:../../../../project-nsd:constituent-vnfd+ [id = current()/../id-ref]+ 
     * /project-nsd:vnfd-id-refNOTE: An issue with confd is preventing theuse of xpath.
     * Seems to be an issue with leafrefto leafref, whose target is in a different 
     * module.Once that is resolved this will switched to useleafref
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getVnfdIdRef();
    
    /**
     * A reference to VNFD placement group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>placementGroupRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getPlacementGroupRef();
    
    @Override
    VnfdPlacementGroupMapsKey key();

}

