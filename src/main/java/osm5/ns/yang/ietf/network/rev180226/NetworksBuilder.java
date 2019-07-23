package osm5.ns.yang.ietf.network.rev180226;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.ietf.network.rev180226.networks.Network;

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
 * Class that builds {@link NetworksBuilder} instances.
 * 
 * @see NetworksBuilder
 *
 */
public class NetworksBuilder implements Builder<Networks> {

    private List<Network> _network;


    Map<Class<? extends Augmentation<Networks>>, Augmentation<Networks>> augmentation = Collections.emptyMap();

    public NetworksBuilder() {
    }

    public NetworksBuilder(Networks base) {
        this._network = base.getNetwork();
        if (base instanceof NetworksImpl) {
            NetworksImpl impl = (NetworksImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Networks>>, Augmentation<Networks>> aug =((AugmentationHolder<Networks>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public List<Network> getNetwork() {
        return _network;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Networks>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetworksBuilder setNetwork(final List<Network> values) {
        this._network = values;
        return this;
    }
    
    
    public NetworksBuilder addAugmentation(Class<? extends Augmentation<Networks>> augmentationType, Augmentation<Networks> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworksBuilder removeAugmentation(Class<? extends Augmentation<Networks>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Networks build() {
        return new NetworksImpl(this);
    }

    private static final class NetworksImpl implements Networks {
    
        private final List<Network> _network;
    
        private Map<Class<? extends Augmentation<Networks>>, Augmentation<Networks>> augmentation = Collections.emptyMap();
    
        NetworksImpl(NetworksBuilder base) {
            this._network = base.getNetwork();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Networks> getImplementedInterface() {
            return Networks.class;
        }
    
        @Override
        public List<Network> getNetwork() {
            return _network;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Networks>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_network);
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
            if (!Networks.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Networks other = (Networks)obj;
            if (!Objects.equals(_network, other.getNetwork())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworksImpl otherImpl = (NetworksImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Networks>>, Augmentation<Networks>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Networks");
            CodeHelpers.appendValue(helper, "_network", _network);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
