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
package osm5.ns.yang.ietf.network.topology.rev180226;
import com.google.common.base.MoreObjects;

import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.Link;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Network1Builder} instances.
 * 
 * @see Network1Builder
 *
 */
public class Network1Builder implements Builder<Network1> {

    private List<Link> _link;



    public Network1Builder() {
    }

    public Network1Builder(Network1 base) {
        this._link = base.getLink();
    }


    public List<Link> getLink() {
        return _link;
    }

    public Network1Builder setLink(final List<Link> values) {
        this._link = values;
        return this;
    }
    
    

    @Override
    public Network1 build() {
        return new Network1Impl(this);
    }

    private static final class Network1Impl implements Network1 {
    
        private final List<Link> _link;
    
    
        Network1Impl(Network1Builder base) {
            this._link = base.getLink();
        }
    
        @Override
        public Class<Network1> getImplementedInterface() {
            return Network1.class;
        }
    
        @Override
        public List<Link> getLink() {
            return _link;
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_link);
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!Network1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Network1 other = (Network1)obj;
            if (!Objects.equals(_link, other.getLink())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Network1");
            CodeHelpers.appendValue(helper, "_link", _link);
            return helper.toString();
        }
    }
}
