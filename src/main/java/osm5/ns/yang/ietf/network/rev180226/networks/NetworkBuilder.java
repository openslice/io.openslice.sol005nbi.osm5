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
package osm5.ns.yang.ietf.network.rev180226.networks;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.ietf.network.rev180226.NetworkId;
import osm5.ns.yang.ietf.network.rev180226.networks.network.NetworkTypes;
import osm5.ns.yang.ietf.network.rev180226.networks.network.Node;
import osm5.ns.yang.ietf.network.rev180226.networks.network.SupportingNetwork;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetworkBuilder} instances.
 * 
 * @see NetworkBuilder
 *
 */
public class NetworkBuilder implements Builder<Network> {

    private NetworkId _networkId;
    private NetworkTypes _networkTypes;
    private List<Node> _node;
    private List<SupportingNetwork> _supportingNetwork;
    private NetworkKey key;


    Map<Class<? extends Augmentation<Network>>, Augmentation<Network>> augmentation = Collections.emptyMap();

    public NetworkBuilder() {
    }

    public NetworkBuilder(Network base) {
        this.key = base.key();
        this._networkId = base.getNetworkId();
        this._networkTypes = base.getNetworkTypes();
        this._node = base.getNode();
        this._supportingNetwork = base.getSupportingNetwork();
        if (base instanceof NetworkImpl) {
            NetworkImpl impl = (NetworkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Network>>, Augmentation<Network>> aug =((AugmentationHolder<Network>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public NetworkKey key() {
        return key;
    }
    
    public NetworkId getNetworkId() {
        return _networkId;
    }
    
    public NetworkTypes getNetworkTypes() {
        return _networkTypes;
    }
    
    public List<Node> getNode() {
        return _node;
    }
    
    public List<SupportingNetwork> getSupportingNetwork() {
        return _supportingNetwork;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Network>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetworkBuilder withKey(final NetworkKey key) {
        this.key = key;
        return this;
    }
    
    public NetworkBuilder setNetworkId(final NetworkId value) {
        this._networkId = value;
        return this;
    }
    
    public NetworkBuilder setNetworkTypes(final NetworkTypes value) {
        this._networkTypes = value;
        return this;
    }
    public NetworkBuilder setNode(final List<Node> values) {
        this._node = values;
        return this;
    }
    
    public NetworkBuilder setSupportingNetwork(final List<SupportingNetwork> values) {
        this._supportingNetwork = values;
        return this;
    }
    
    
    public NetworkBuilder addAugmentation(Class<? extends Augmentation<Network>> augmentationType, Augmentation<Network> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkBuilder removeAugmentation(Class<? extends Augmentation<Network>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Network build() {
        return new NetworkImpl(this);
    }

    private static final class NetworkImpl implements Network {
    
        private final NetworkId _networkId;
        private final NetworkTypes _networkTypes;
        private final List<Node> _node;
        private final List<SupportingNetwork> _supportingNetwork;
        private final NetworkKey key;
    
        private Map<Class<? extends Augmentation<Network>>, Augmentation<Network>> augmentation = Collections.emptyMap();
    
        NetworkImpl(NetworkBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetworkKey(base.getNetworkId());
            }
            this._networkId = key.getNetworkId();
            this._networkTypes = base.getNetworkTypes();
            this._node = base.getNode();
            this._supportingNetwork = base.getSupportingNetwork();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Network> getImplementedInterface() {
            return Network.class;
        }
    
        @Override
        public NetworkKey key() {
            return key;
        }
        
        @Override
        public NetworkId getNetworkId() {
            return _networkId;
        }
        
        @Override
        public NetworkTypes getNetworkTypes() {
            return _networkTypes;
        }
        
        @Override
        public List<Node> getNode() {
            return _node;
        }
        
        @Override
        public List<SupportingNetwork> getSupportingNetwork() {
            return _supportingNetwork;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Network>> E augmentation(Class<E> augmentationType) {
            return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
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
            result = prime * result + Objects.hashCode(_networkId);
            result = prime * result + Objects.hashCode(_networkTypes);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_supportingNetwork);
            result = prime * result + Objects.hashCode(augmentation);
        
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
            if (!Network.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Network other = (Network)obj;
            if (!Objects.equals(_networkId, other.getNetworkId())) {
                return false;
            }
            if (!Objects.equals(_networkTypes, other.getNetworkTypes())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_supportingNetwork, other.getSupportingNetwork())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkImpl otherImpl = (NetworkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Network>>, Augmentation<Network>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Network");
            CodeHelpers.appendValue(helper, "_networkId", _networkId);
            CodeHelpers.appendValue(helper, "_networkTypes", _networkTypes);
            CodeHelpers.appendValue(helper, "_node", _node);
            CodeHelpers.appendValue(helper, "_supportingNetwork", _supportingNetwork);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
