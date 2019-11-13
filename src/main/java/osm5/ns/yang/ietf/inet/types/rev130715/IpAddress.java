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

public class IpAddress
 implements Serializable {
    private static final long serialVersionUID = 2631789094917437570L;
    private final Ipv4Address _ipv4Address;
    private final Ipv6Address _ipv6Address;


    public IpAddress(Ipv4Address _ipv4Address) {
        super();
        this._ipv4Address = _ipv4Address;
        this._ipv6Address = null;
    }
    
    public IpAddress(Ipv6Address _ipv6Address) {
        super();
        this._ipv6Address = _ipv6Address;
        this._ipv4Address = null;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IpAddress(IpAddress source) {
        this._ipv4Address = source._ipv4Address;
        this._ipv6Address = source._ipv6Address;
    }
    
    /**
     * Return a String representing the value of this union.
     *
     * @return String representation of this union's value.
     */
    public String stringValue() {
        if (_ipv4Address != null) {
            return _ipv4Address.getValue().toString();
        }
        if (_ipv6Address != null) {
            return _ipv6Address.getValue().toString();
        }
    
        throw new IllegalStateException("No value assinged");
    }


    public Ipv4Address getIpv4Address() {
        return _ipv4Address;
    }
    
    public Ipv6Address getIpv6Address() {
        return _ipv6Address;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_ipv4Address);
        result = prime * result + Objects.hashCode(_ipv6Address);
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
        IpAddress other = (IpAddress) obj;
        if (!Objects.equals(_ipv4Address, other._ipv4Address)) {
            return false;
        }
        if (!Objects.equals(_ipv6Address, other._ipv6Address)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(IpAddress.class);
        CodeHelpers.appendValue(helper, "_ipv4Address", _ipv4Address);
        CodeHelpers.appendValue(helper, "_ipv6Address", _ipv6Address);
        return helper.toString();
    }
}

