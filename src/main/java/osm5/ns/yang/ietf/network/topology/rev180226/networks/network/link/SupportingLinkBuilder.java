package osm5.ns.yang.ietf.network.topology.rev180226.networks.network.link;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.ietf.network.rev180226.NetworkId;

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
 * Class that builds {@link SupportingLinkBuilder} instances.
 * 
 * @see SupportingLinkBuilder
 *
 */
public class SupportingLinkBuilder implements Builder<SupportingLink> {

    private Object _linkRef;
    private NetworkId _networkRef;
    private SupportingLinkKey key;


    Map<Class<? extends Augmentation<SupportingLink>>, Augmentation<SupportingLink>> augmentation = Collections.emptyMap();

    public SupportingLinkBuilder() {
    }

    public SupportingLinkBuilder(SupportingLink base) {
        this.key = base.key();
        this._linkRef = base.getLinkRef();
        this._networkRef = base.getNetworkRef();
        if (base instanceof SupportingLinkImpl) {
            SupportingLinkImpl impl = (SupportingLinkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SupportingLink>>, Augmentation<SupportingLink>> aug =((AugmentationHolder<SupportingLink>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public SupportingLinkKey key() {
        return key;
    }
    
    public Object getLinkRef() {
        return _linkRef;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SupportingLink>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public SupportingLinkBuilder withKey(final SupportingLinkKey key) {
        this.key = key;
        return this;
    }
    
    public SupportingLinkBuilder setLinkRef(final Object value) {
        this._linkRef = value;
        return this;
    }
    
    public SupportingLinkBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
    public SupportingLinkBuilder addAugmentation(Class<? extends Augmentation<SupportingLink>> augmentationType, Augmentation<SupportingLink> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportingLinkBuilder removeAugmentation(Class<? extends Augmentation<SupportingLink>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupportingLink build() {
        return new SupportingLinkImpl(this);
    }

    private static final class SupportingLinkImpl implements SupportingLink {
    
        private final Object _linkRef;
        private final NetworkId _networkRef;
        private final SupportingLinkKey key;
    
        private Map<Class<? extends Augmentation<SupportingLink>>, Augmentation<SupportingLink>> augmentation = Collections.emptyMap();
    
        SupportingLinkImpl(SupportingLinkBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new SupportingLinkKey(base.getLinkRef(), base.getNetworkRef());
            }
            this._linkRef = key.getLinkRef();
            this._networkRef = key.getNetworkRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<SupportingLink> getImplementedInterface() {
            return SupportingLink.class;
        }
    
        @Override
        public SupportingLinkKey key() {
            return key;
        }
        
        @Override
        public Object getLinkRef() {
            return _linkRef;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SupportingLink>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_linkRef);
            result = prime * result + Objects.hashCode(_networkRef);
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
            if (!SupportingLink.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SupportingLink other = (SupportingLink)obj;
            if (!Objects.equals(_linkRef, other.getLinkRef())) {
                return false;
            }
            if (!Objects.equals(_networkRef, other.getNetworkRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupportingLinkImpl otherImpl = (SupportingLinkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SupportingLink>>, Augmentation<SupportingLink>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SupportingLink");
            CodeHelpers.appendValue(helper, "_linkRef", _linkRef);
            CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
