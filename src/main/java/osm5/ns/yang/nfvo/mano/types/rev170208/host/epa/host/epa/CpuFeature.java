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
package osm5.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.CpuFeatureType;
import osm5.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa;

/**
 * List of CPU features.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list cpu-feature {
 *   key feature;
 *   leaf feature {
 *     type cpu-feature-type;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-epa/host-epa/cpu-feature</i>
 * 
 * <p>To create instances of this class use {@link CpuFeatureBuilder}.
 * @see CpuFeatureBuilder
 * @see CpuFeatureKey
 *
 */
public interface CpuFeature
    extends
    ChildOf<HostEpa>,
    Augmentable<CpuFeature>,
    Identifiable<CpuFeatureKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("cpu-feature");

    /**
     * CPU feature.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CpuFeatureType</code> <code>feature</code>, or <code>null</code> if not present
     */
    @Nullable
    CpuFeatureType getFeature();
    
    @Override
    CpuFeatureKey key();

}

