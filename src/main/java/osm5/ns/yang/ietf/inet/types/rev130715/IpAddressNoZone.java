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
package osm5.ns.yang.ietf.inet.types.rev130715;
import com.google.common.base.MoreObjects;
import java.io.Serializable;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public class IpAddressNoZone
 implements Serializable {
    private static final long serialVersionUID = 4932204310424522945L;
    private final Ipv4AddressNoZone _ipv4AddressNoZone;
    private final Ipv6AddressNoZone _ipv6AddressNoZone;


    public IpAddressNoZone(Ipv4AddressNoZone _ipv4AddressNoZone) {
        super();
        this._ipv4AddressNoZone = _ipv4AddressNoZone;
        this._ipv6AddressNoZone = null;
    }
    
    public IpAddressNoZone(Ipv6AddressNoZone _ipv6AddressNoZone) {
        super();
        this._ipv6AddressNoZone = _ipv6AddressNoZone;
        this._ipv4AddressNoZone = null;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IpAddressNoZone(IpAddressNoZone source) {
        this._ipv4AddressNoZone = source._ipv4AddressNoZone;
        this._ipv6AddressNoZone = source._ipv6AddressNoZone;
    }
    
    /**
     * Return a String representing the value of this union.
     *
     * @return String representation of this union's value.
     */
    public String stringValue() {
        if (_ipv4AddressNoZone != null) {
            return _ipv4AddressNoZone.getValue().toString();
        }
        if (_ipv6AddressNoZone != null) {
            return _ipv6AddressNoZone.getValue().toString();
        }
    
        throw new IllegalStateException("No value assinged");
    }


    public Ipv4AddressNoZone getIpv4AddressNoZone() {
        return _ipv4AddressNoZone;
    }
    
    public Ipv6AddressNoZone getIpv6AddressNoZone() {
        return _ipv6AddressNoZone;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_ipv4AddressNoZone);
        result = prime * result + Objects.hashCode(_ipv6AddressNoZone);
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
        IpAddressNoZone other = (IpAddressNoZone) obj;
        if (!Objects.equals(_ipv4AddressNoZone, other._ipv4AddressNoZone)) {
            return false;
        }
        if (!Objects.equals(_ipv6AddressNoZone, other._ipv6AddressNoZone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(IpAddressNoZone.class);
        CodeHelpers.appendValue(helper, "_ipv4AddressNoZone", _ipv4AddressNoZone);
        CodeHelpers.appendValue(helper, "_ipv6AddressNoZone", _ipv6AddressNoZone);
        return helper.toString();
    }
}

