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
import com.google.common.base.MoreObjects;

import osm5.ns.yang.nfvo.mano.types.rev170208.CpuFeatureType;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class CpuFeatureKey
 implements Identifier<CpuFeature> {
    private static final long serialVersionUID = -7227280100134741618L;
    private final CpuFeatureType _feature;


    public CpuFeatureKey(CpuFeatureType _feature) {
    
    
        this._feature = _feature;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CpuFeatureKey(CpuFeatureKey source) {
        this._feature = source._feature;
    }


    public CpuFeatureType getFeature() {
        return _feature;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_feature);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CpuFeatureKey other = (CpuFeatureKey) obj;
        if (!Objects.equals(_feature, other._feature)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(CpuFeatureKey.class);
        CodeHelpers.appendValue(helper, "_feature", _feature);
        return helper.toString();
    }
}

