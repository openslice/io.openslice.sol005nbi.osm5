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
package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.vdu_params;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.VduParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list volume {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf vim-volume-id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vdu_params/volume</i>
 * 
 * <p>To create instances of this class use {@link VolumeBuilder}.
 * @see VolumeBuilder
 * @see VolumeKey
 *
 */
public interface Volume
    extends
    ChildOf<VduParams>,
    Augmentable<Volume>,
    Identifiable<VolumeKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("volume");

    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>vimVolumeId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVimVolumeId();
    
    @Override
    VolumeKey key();

}

