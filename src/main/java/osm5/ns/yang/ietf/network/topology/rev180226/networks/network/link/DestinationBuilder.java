package osm5.ns.yang.ietf.network.topology.rev180226.networks.network.link;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.ietf.network.rev180226.NodeId;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link DestinationBuilder} instances.
 * 
 * @see DestinationBuilder
 *
 */
public class DestinationBuilder implements Builder<Destination> {

    private NodeId _destNode;
    private Object _destTp;


    Map<Class<? extends Augmentation<Destination>>, Augmentation<Destination>> augmentation = Collections.emptyMap();

    public DestinationBuilder() {
    }

    public DestinationBuilder(Destination base) {
        this._destNode = base.getDestNode();
        this._destTp = base.getDestTp();
        if (base instanceof DestinationImpl) {
            DestinationImpl impl = (DestinationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Destination>>, Augmentation<Destination>> aug =((AugmentationHolder<Destination>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public NodeId getDestNode() {
        return _destNode;
    }
    
    public Object getDestTp() {
        return _destTp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Destination>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public DestinationBuilder setDestNode(final NodeId value) {
        this._destNode = value;
        return this;
    }
    
    public DestinationBuilder setDestTp(final Object value) {
        this._destTp = value;
        return this;
    }
    
    public DestinationBuilder addAugmentation(Class<? extends Augmentation<Destination>> augmentationType, Augmentation<Destination> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DestinationBuilder removeAugmentation(Class<? extends Augmentation<Destination>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Destination build() {
        return new DestinationImpl(this);
    }

    private static final class DestinationImpl implements Destination {
    
        private final NodeId _destNode;
        private final Object _destTp;
    
        private Map<Class<? extends Augmentation<Destination>>, Augmentation<Destination>> augmentation = Collections.emptyMap();
    
        DestinationImpl(DestinationBuilder base) {
            this._destNode = base.getDestNode();
            this._destTp = base.getDestTp();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Destination> getImplementedInterface() {
            return Destination.class;
        }
    
        @Override
        public NodeId getDestNode() {
            return _destNode;
        }
        
        @Override
        public Object getDestTp() {
            return _destTp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Destination>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destNode);
            result = prime * result + Objects.hashCode(_destTp);
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
            if (!Destination.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Destination other = (Destination)obj;
            if (!Objects.equals(_destNode, other.getDestNode())) {
                return false;
            }
            if (!Objects.equals(_destTp, other.getDestTp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DestinationImpl otherImpl = (DestinationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Destination>>, Augmentation<Destination>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Destination");
            CodeHelpers.appendValue(helper, "_destNode", _destNode);
            CodeHelpers.appendValue(helper, "_destTp", _destTp);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
