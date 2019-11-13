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
package osm5.ns.yang.nfvo.nsi.rev180928.nsi;
import com.google.common.base.MoreObjects;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NsrRefListKey
 implements Identifier<NsrRefList> {
    private static final long serialVersionUID = -2298440075165040596L;
    private final Uuid _nsrRef;


    public NsrRefListKey(Uuid _nsrRef) {
    
    
        this._nsrRef = _nsrRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NsrRefListKey(NsrRefListKey source) {
        this._nsrRef = source._nsrRef;
    }


    public Uuid getNsrRef() {
        return _nsrRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_nsrRef);
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
        NsrRefListKey other = (NsrRefListKey) obj;
        if (!Objects.equals(_nsrRef, other._nsrRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NsrRefListKey.class);
        CodeHelpers.appendValue(helper, "_nsrRef", _nsrRef);
        return helper.toString();
    }
}

