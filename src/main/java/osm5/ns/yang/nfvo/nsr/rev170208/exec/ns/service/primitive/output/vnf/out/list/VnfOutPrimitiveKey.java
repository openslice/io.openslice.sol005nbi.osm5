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
package osm5.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list;
import com.google.common.base.MoreObjects;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfOutPrimitiveKey
 implements Identifier<VnfOutPrimitive> {
    private static final long serialVersionUID = -792184332871734472L;
    private final Long _index;


    public VnfOutPrimitiveKey(Long _index) {
    
    
        this._index = _index;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfOutPrimitiveKey(VnfOutPrimitiveKey source) {
        this._index = source._index;
    }


    public Long getIndex() {
        return _index;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_index);
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
        VnfOutPrimitiveKey other = (VnfOutPrimitiveKey) obj;
        if (!Objects.equals(_index, other._index)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfOutPrimitiveKey.class);
        CodeHelpers.appendValue(helper, "_index", _index);
        return helper.toString();
    }
}

