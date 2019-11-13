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
package osm5.ns.yang.nfvo.mano.types.rev170208.volume.info;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.VolumeInfo;

/**
 * Defines the source of the volume. Possible options are1. Ephemeral -- Empty 
 * disk2. Image -- Refer to image to be used for volume3. Volume -- Reference of 
 * pre-existing volume to be used
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice volume-source {
 *   case ephemeral {
 *     leaf ephemeral {
 *       type empty;
 *     }
 *   }
 *   case image {
 *     uses image-properties;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source</i>
 *
 */
public interface VolumeSource
    extends
    ChoiceIn<VolumeInfo>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("volume-source");


}

