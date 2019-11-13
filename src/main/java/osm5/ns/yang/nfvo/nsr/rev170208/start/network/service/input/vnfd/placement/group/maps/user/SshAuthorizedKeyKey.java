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
package osm5.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.user;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class SshAuthorizedKeyKey
 implements Identifier<SshAuthorizedKey> {
    private static final long serialVersionUID = -5653155718725020794L;
    private final Object _keyPairRef;


    public SshAuthorizedKeyKey(Object _keyPairRef) {
    
    
        this._keyPairRef = _keyPairRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SshAuthorizedKeyKey(SshAuthorizedKeyKey source) {
        this._keyPairRef = source._keyPairRef;
    }


    public Object getKeyPairRef() {
        return _keyPairRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_keyPairRef);
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
        SshAuthorizedKeyKey other = (SshAuthorizedKeyKey) obj;
        if (!Objects.equals(_keyPairRef, other._keyPairRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(SshAuthorizedKeyKey.class);
        CodeHelpers.appendValue(helper, "_keyPairRef", _keyPairRef);
        return helper.toString();
    }
}

