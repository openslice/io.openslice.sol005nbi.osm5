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
package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import osm5.ns.yang.nfvo.mano.types.rev170208.ImageProperties;

/**
 * List of alternative images per VIM type.Different images can be used for 
 * specific types of VIMs insteadof the default image. This allows deployments in 
 * sites where theimage identifier in the VIM is given by the VIM provider 
 * andcannot be modified.If an alternative image is specified for a VIM type, it 
 * will prevailover the default image
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list alternative-images {
 *   key vim-type;
 *   leaf vim-type {
 *     type string;
 *   }
 *   uses manotypes:image-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/alternative-images</i>
 * 
 * <p>To create instances of this class use {@link AlternativeImagesBuilder}.
 * @see AlternativeImagesBuilder
 * @see AlternativeImagesKey
 *
 */
public interface AlternativeImages
    extends
    ChildOf<Vdu>,
    Augmentable<AlternativeImages>,
    ImageProperties,
    Identifiable<AlternativeImagesKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("alternative-images");

    /**
     * VIM type: openvim, openstack, vmware, aws, etc.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimType</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVimType();
    
    @Override
    AlternativeImagesKey key();

}

