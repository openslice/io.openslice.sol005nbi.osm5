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
package osm5.ns.yang.nfvo.mano.types.rev170208.host.aggregate;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class HostAggregateKey
 implements Identifier<HostAggregate> {
    private static final long serialVersionUID = -2962347543593449709L;
    private final String _metadataKey;


    public HostAggregateKey(String _metadataKey) {
    
    
        this._metadataKey = _metadataKey;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HostAggregateKey(HostAggregateKey source) {
        this._metadataKey = source._metadataKey;
    }


    public String getMetadataKey() {
        return _metadataKey;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_metadataKey);
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
        HostAggregateKey other = (HostAggregateKey) obj;
        if (!Objects.equals(_metadataKey, other._metadataKey)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(HostAggregateKey.class);
        CodeHelpers.appendValue(helper, "_metadataKey", _metadataKey);
        return helper.toString();
    }
}

