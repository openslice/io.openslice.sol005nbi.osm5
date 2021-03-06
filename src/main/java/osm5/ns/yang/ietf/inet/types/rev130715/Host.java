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

public class Host
 implements Serializable {
    private static final long serialVersionUID = -2403943164556299989L;
    private final IpAddress _ipAddress;
    private final DomainName _domainName;


    public Host(IpAddress _ipAddress) {
        super();
        this._ipAddress = _ipAddress;
        this._domainName = null;
    }
    
    public Host(DomainName _domainName) {
        super();
        this._domainName = _domainName;
        this._ipAddress = null;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Host(Host source) {
        this._ipAddress = source._ipAddress;
        this._domainName = source._domainName;
    }
    
    /**
     * Return a String representing the value of this union.
     *
     * @return String representation of this union's value.
     */
    public String stringValue() {
        if (_ipAddress != null) {
            return _ipAddress.stringValue();
                        }
        if (_domainName != null) {
            return _domainName.getValue().toString();
        }
    
        throw new IllegalStateException("No value assinged");
    }


    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public DomainName getDomainName() {
        return _domainName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_ipAddress);
        result = prime * result + Objects.hashCode(_domainName);
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
        Host other = (Host) obj;
        if (!Objects.equals(_ipAddress, other._ipAddress)) {
            return false;
        }
        if (!Objects.equals(_domainName, other._domainName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(Host.class);
        CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
        CodeHelpers.appendValue(helper, "_domainName", _domainName);
        return helper.toString();
    }
}

