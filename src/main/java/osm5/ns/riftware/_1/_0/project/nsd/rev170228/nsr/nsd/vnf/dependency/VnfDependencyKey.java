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
package osm5.ns.riftware._1._0.project.nsd.rev170228.nsr.nsd.vnf.dependency;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfDependencyKey
 implements Identifier<VnfDependency> {
    private static final long serialVersionUID = -7804090137105401358L;
    private final String _vnfSourceRef;


    public VnfDependencyKey(String _vnfSourceRef) {
    
    
        this._vnfSourceRef = _vnfSourceRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfDependencyKey(VnfDependencyKey source) {
        this._vnfSourceRef = source._vnfSourceRef;
    }


    public String getVnfSourceRef() {
        return _vnfSourceRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfSourceRef);
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
        VnfDependencyKey other = (VnfDependencyKey) obj;
        if (!Objects.equals(_vnfSourceRef, other._vnfSourceRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfDependencyKey.class);
        CodeHelpers.appendValue(helper, "_vnfSourceRef", _vnfSourceRef);
        return helper.toString();
    }
}

