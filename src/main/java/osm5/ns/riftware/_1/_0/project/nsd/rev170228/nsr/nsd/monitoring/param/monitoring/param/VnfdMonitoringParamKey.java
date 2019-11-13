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
package osm5.ns.riftware._1._0.project.nsd.rev170228.nsr.nsd.monitoring.param.monitoring.param;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfdMonitoringParamKey
 implements Identifier<VnfdMonitoringParam> {
    private static final long serialVersionUID = -450412236573364984L;
    private final Object _vnfdMonitoringParamRef;
    private final String _memberVnfIndexRef;


    public VnfdMonitoringParamKey(String _memberVnfIndexRef, Object _vnfdMonitoringParamRef) {
    
    
        this._vnfdMonitoringParamRef = _vnfdMonitoringParamRef;
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdMonitoringParamKey(VnfdMonitoringParamKey source) {
        this._vnfdMonitoringParamRef = source._vnfdMonitoringParamRef;
        this._memberVnfIndexRef = source._memberVnfIndexRef;
    }


    public Object getVnfdMonitoringParamRef() {
        return _vnfdMonitoringParamRef;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfdMonitoringParamRef);
        result = prime * result + Objects.hashCode(_memberVnfIndexRef);
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
        VnfdMonitoringParamKey other = (VnfdMonitoringParamKey) obj;
        if (!Objects.equals(_vnfdMonitoringParamRef, other._vnfdMonitoringParamRef)) {
            return false;
        }
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfdMonitoringParamKey.class);
        CodeHelpers.appendValue(helper, "_vnfdMonitoringParamRef", _vnfdMonitoringParamRef);
        CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
        return helper.toString();
    }
}

