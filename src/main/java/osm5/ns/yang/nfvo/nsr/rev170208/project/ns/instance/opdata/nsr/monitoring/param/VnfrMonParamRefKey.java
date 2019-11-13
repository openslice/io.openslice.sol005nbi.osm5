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
package osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param;
import com.google.common.base.MoreObjects;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfrMonParamRefKey
 implements Identifier<VnfrMonParamRef> {
    private static final long serialVersionUID = 2109708910737392483L;
    private final Uuid _vnfrIdRef;
    private final Object _vnfrMonParamRef;


    public VnfrMonParamRefKey(Uuid _vnfrIdRef, Object _vnfrMonParamRef) {
    
    
        this._vnfrIdRef = _vnfrIdRef;
        this._vnfrMonParamRef = _vnfrMonParamRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfrMonParamRefKey(VnfrMonParamRefKey source) {
        this._vnfrIdRef = source._vnfrIdRef;
        this._vnfrMonParamRef = source._vnfrMonParamRef;
    }


    public Uuid getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    public Object getVnfrMonParamRef() {
        return _vnfrMonParamRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfrIdRef);
        result = prime * result + Objects.hashCode(_vnfrMonParamRef);
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
        VnfrMonParamRefKey other = (VnfrMonParamRefKey) obj;
        if (!Objects.equals(_vnfrIdRef, other._vnfrIdRef)) {
            return false;
        }
        if (!Objects.equals(_vnfrMonParamRef, other._vnfrMonParamRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfrMonParamRefKey.class);
        CodeHelpers.appendValue(helper, "_vnfrIdRef", _vnfrIdRef);
        CodeHelpers.appendValue(helper, "_vnfrMonParamRef", _vnfrMonParamRef);
        return helper.toString();
    }
}

