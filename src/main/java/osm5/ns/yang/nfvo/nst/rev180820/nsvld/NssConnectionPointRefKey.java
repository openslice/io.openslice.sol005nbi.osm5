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
package osm5.ns.yang.nfvo.nst.rev180820.nsvld;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NssConnectionPointRefKey
 implements Identifier<NssConnectionPointRef> {
    private static final long serialVersionUID = -7820425590482073208L;
    private final String _nssRef;
    private final String _nsdConnectionPointRef;


    public NssConnectionPointRefKey(String _nsdConnectionPointRef, String _nssRef) {
    
    
        this._nssRef = _nssRef;
        this._nsdConnectionPointRef = _nsdConnectionPointRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NssConnectionPointRefKey(NssConnectionPointRefKey source) {
        this._nssRef = source._nssRef;
        this._nsdConnectionPointRef = source._nsdConnectionPointRef;
    }


    public String getNssRef() {
        return _nssRef;
    }
    
    public String getNsdConnectionPointRef() {
        return _nsdConnectionPointRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_nssRef);
        result = prime * result + Objects.hashCode(_nsdConnectionPointRef);
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
        NssConnectionPointRefKey other = (NssConnectionPointRefKey) obj;
        if (!Objects.equals(_nssRef, other._nssRef)) {
            return false;
        }
        if (!Objects.equals(_nsdConnectionPointRef, other._nsdConnectionPointRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NssConnectionPointRefKey.class);
        CodeHelpers.appendValue(helper, "_nssRef", _nssRef);
        CodeHelpers.appendValue(helper, "_nsdConnectionPointRef", _nsdConnectionPointRef);
        return helper.toString();
    }
}

