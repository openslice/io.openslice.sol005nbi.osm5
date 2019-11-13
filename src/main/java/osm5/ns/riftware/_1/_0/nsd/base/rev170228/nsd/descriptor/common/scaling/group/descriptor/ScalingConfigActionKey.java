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
package osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import com.google.common.base.MoreObjects;

import osm5.ns.yang.nfvo.mano.types.rev170208.ScalingTrigger;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ScalingConfigActionKey
 implements Identifier<ScalingConfigAction> {
    private static final long serialVersionUID = -656924485068871764L;
    private final ScalingTrigger _trigger;


    public ScalingConfigActionKey(ScalingTrigger _trigger) {
    
    
        this._trigger = _trigger;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ScalingConfigActionKey(ScalingConfigActionKey source) {
        this._trigger = source._trigger;
    }


    public ScalingTrigger getTrigger() {
        return _trigger;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_trigger);
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
        ScalingConfigActionKey other = (ScalingConfigActionKey) obj;
        if (!Objects.equals(_trigger, other._trigger)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ScalingConfigActionKey.class);
        CodeHelpers.appendValue(helper, "_trigger", _trigger);
        return helper.toString();
    }
}

