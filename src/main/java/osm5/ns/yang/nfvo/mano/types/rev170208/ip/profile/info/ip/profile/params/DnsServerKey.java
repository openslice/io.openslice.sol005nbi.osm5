package osm5.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params;
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

