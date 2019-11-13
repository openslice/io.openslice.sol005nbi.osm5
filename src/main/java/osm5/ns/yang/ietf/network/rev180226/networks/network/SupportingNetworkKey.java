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
import com.google.common.base.MoreObjects;

import osm5.ns.yang.ietf.network.rev180226.NetworkId;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class SupportingNetworkKey
 implements Identifier<SupportingNetwork> {
    private static final long serialVersionUID = -2437793732800485995L;
    private final NetworkId _networkRef;


    public SupportingNetworkKey(NetworkId _networkRef) {
    
    
        this._networkRef = _networkRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingNetworkKey(SupportingNetworkKey source) {
        this._networkRef = source._networkRef;
    }


    public NetworkId getNetworkRef() {
        return _networkRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkRef);
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
        SupportingNetworkKey other = (SupportingNetworkKey) obj;
        if (!Objects.equals(_networkRef, other._networkRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(SupportingNetworkKey.class);
        CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
        return helper.toString();
    }
}

