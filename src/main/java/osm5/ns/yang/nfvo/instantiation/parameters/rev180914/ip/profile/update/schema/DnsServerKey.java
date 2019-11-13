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
package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ip.profile.update.schema;
import com.google.common.base.MoreObjects;

import osm5.ns.yang.ietf.inet.types.rev130715.IpAddress;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class DnsServerKey
 implements Identifier<DnsServer> {
    private static final long serialVersionUID = 8079303259017466533L;
    private final IpAddress _address;


    public DnsServerKey(IpAddress _address) {
    
    
        this._address = _address;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DnsServerKey(DnsServerKey source) {
        this._address = source._address;
    }


    public IpAddress getAddress() {
        return _address;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_address);
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
        DnsServerKey other = (DnsServerKey) obj;
        if (!Objects.equals(_address, other._address)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(DnsServerKey.class);
        CodeHelpers.appendValue(helper, "_address", _address);
        return helper.toString();
    }
}

