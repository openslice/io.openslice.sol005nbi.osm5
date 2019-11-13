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
package osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata;
import com.google.common.base.MoreObjects;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NsrKey
 implements Identifier<Nsr> {
    private static final long serialVersionUID = 4045798445756688237L;
    private final Uuid _nsInstanceConfigRef;


    public NsrKey(Uuid _nsInstanceConfigRef) {
    
    
        this._nsInstanceConfigRef = _nsInstanceConfigRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NsrKey(NsrKey source) {
        this._nsInstanceConfigRef = source._nsInstanceConfigRef;
    }


    public Uuid getNsInstanceConfigRef() {
        return _nsInstanceConfigRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_nsInstanceConfigRef);
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
        NsrKey other = (NsrKey) obj;
        if (!Objects.equals(_nsInstanceConfigRef, other._nsInstanceConfigRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NsrKey.class);
        CodeHelpers.appendValue(helper, "_nsInstanceConfigRef", _nsInstanceConfigRef);
        return helper.toString();
    }
}

