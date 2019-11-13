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
package osm5.ns.riftware._1._0.project.nsd.rev170228.nsd.constituent.vnfd;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ConstituentVnfdKey
 implements Identifier<ConstituentVnfd> {
    private static final long serialVersionUID = 5403978362043531679L;
    private final String _memberVnfIndex;


    public ConstituentVnfdKey(String _memberVnfIndex) {
    
    
        this._memberVnfIndex = _memberVnfIndex;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConstituentVnfdKey(ConstituentVnfdKey source) {
        this._memberVnfIndex = source._memberVnfIndex;
    }


    public String getMemberVnfIndex() {
        return _memberVnfIndex;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_memberVnfIndex);
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
        ConstituentVnfdKey other = (ConstituentVnfdKey) obj;
        if (!Objects.equals(_memberVnfIndex, other._memberVnfIndex)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ConstituentVnfdKey.class);
        CodeHelpers.appendValue(helper, "_memberVnfIndex", _memberVnfIndex);
        return helper.toString();
    }
}

