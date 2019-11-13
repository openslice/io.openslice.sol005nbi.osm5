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
package osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.nfvo.mano.types.rev170208.ScalingTrigger;

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
 * Class that builds {@link ScalingConfigActionBuilder} instances.
 * 
 * @see ScalingConfigActionBuilder
 *
 */
public class ScalingConfigActionBuilder implements Builder<ScalingConfigAction> {

    private String _nsServicePrimitiveNameRef;
    private ScalingTrigger _trigger;
    private ScalingConfigActionKey key;


    Map<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> augmentation = Collections.emptyMap();

    public ScalingConfigActionBuilder() {
    }

    public ScalingConfigActionBuilder(ScalingConfigAction base) {
        this.key = base.key();
        this._trigger = base.getTrigger();
        this._nsServicePrimitiveNameRef = base.getNsServicePrimitiveNameRef();
        if (base instanceof ScalingConfigActionImpl) {
            ScalingConfigActionImpl impl = (ScalingConfigActionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> aug =((AugmentationHolder<ScalingConfigAction>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public ScalingConfigActionKey key() {
        return key;
    }
    
    public String getNsServicePrimitiveNameRef() {
        return _nsServicePrimitiveNameRef;
    }
    
    public ScalingTrigger getTrigger() {
        return _trigger;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ScalingConfigAction>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ScalingConfigActionBuilder withKey(final ScalingConfigActionKey key) {
        this.key = key;
        return this;
    }
    
    public ScalingConfigActionBuilder setNsServicePrimitiveNameRef(final String value) {
        this._nsServicePrimitiveNameRef = value;
        return this;
    }
    
    public ScalingConfigActionBuilder setTrigger(final ScalingTrigger value) {
        this._trigger = value;
        return this;
    }
    
    public ScalingConfigActionBuilder addAugmentation(Class<? extends Augmentation<ScalingConfigAction>> augmentationType, Augmentation<ScalingConfigAction> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingConfigActionBuilder removeAugmentation(Class<? extends Augmentation<ScalingConfigAction>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingConfigAction build() {
        return new ScalingConfigActionImpl(this);
    }

    private static final class ScalingConfigActionImpl implements ScalingConfigAction {
    
        private final String _nsServicePrimitiveNameRef;
        private final ScalingTrigger _trigger;
        private final ScalingConfigActionKey key;
    
        private Map<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> augmentation = Collections.emptyMap();
    
        ScalingConfigActionImpl(ScalingConfigActionBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ScalingConfigActionKey(base.getTrigger());
            }
            this._trigger = key.getTrigger();
            this._nsServicePrimitiveNameRef = base.getNsServicePrimitiveNameRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ScalingConfigAction> getImplementedInterface() {
            return ScalingConfigAction.class;
        }
    
        @Override
        public ScalingConfigActionKey key() {
            return key;
        }
        
        @Override
        public String getNsServicePrimitiveNameRef() {
            return _nsServicePrimitiveNameRef;
        }
        
        @Override
        public ScalingTrigger getTrigger() {
            return _trigger;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ScalingConfigAction>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsServicePrimitiveNameRef);
            result = prime * result + Objects.hashCode(_trigger);
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
            if (!ScalingConfigAction.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ScalingConfigAction other = (ScalingConfigAction)obj;
            if (!Objects.equals(_nsServicePrimitiveNameRef, other.getNsServicePrimitiveNameRef())) {
                return false;
            }
            if (!Objects.equals(_trigger, other.getTrigger())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingConfigActionImpl otherImpl = (ScalingConfigActionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingConfigAction");
            CodeHelpers.appendValue(helper, "_nsServicePrimitiveNameRef", _nsServicePrimitiveNameRef);
            CodeHelpers.appendValue(helper, "_trigger", _trigger);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
