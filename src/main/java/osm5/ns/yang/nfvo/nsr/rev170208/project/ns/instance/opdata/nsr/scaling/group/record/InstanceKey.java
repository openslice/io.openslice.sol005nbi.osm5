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
package osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record;
import com.google.common.base.MoreObjects;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class InstanceKey
 implements Identifier<Instance> {
    private static final long serialVersionUID = -3732073864253176254L;
    private final Integer _instanceId;


    public InstanceKey(Integer _instanceId) {
    
    
        this._instanceId = _instanceId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InstanceKey(InstanceKey source) {
        this._instanceId = source._instanceId;
    }


    public Integer getInstanceId() {
        return _instanceId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_instanceId);
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
        InstanceKey other = (InstanceKey) obj;
        if (!Objects.equals(_instanceId, other._instanceId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InstanceKey.class);
        CodeHelpers.appendValue(helper, "_instanceId", _instanceId);
        return helper.toString();
    }
}

