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
package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
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
 * Class that builds {@link ExternalBuilder} instances.
 * 
 * @see ExternalBuilder
 *
 */
public class ExternalBuilder implements Builder<External> {

    private String _externalConnectionPointRef;


    Map<Class<? extends Augmentation<External>>, Augmentation<External>> augmentation = Collections.emptyMap();

    public ExternalBuilder() {
    }

    public ExternalBuilder(External base) {
        this._externalConnectionPointRef = base.getExternalConnectionPointRef();
        if (base instanceof ExternalImpl) {
            ExternalImpl impl = (ExternalImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<External>>, Augmentation<External>> aug =((AugmentationHolder<External>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getExternalConnectionPointRef() {
        return _externalConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<External>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ExternalBuilder setExternalConnectionPointRef(final String value) {
        this._externalConnectionPointRef = value;
        return this;
    }
    
    public ExternalBuilder addAugmentation(Class<? extends Augmentation<External>> augmentationType, Augmentation<External> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExternalBuilder removeAugmentation(Class<? extends Augmentation<External>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public External build() {
        return new ExternalImpl(this);
    }

    private static final class ExternalImpl implements External {
    
        private final String _externalConnectionPointRef;
    
        private Map<Class<? extends Augmentation<External>>, Augmentation<External>> augmentation = Collections.emptyMap();
    
        ExternalImpl(ExternalBuilder base) {
            this._externalConnectionPointRef = base.getExternalConnectionPointRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<External> getImplementedInterface() {
            return External.class;
        }
    
        @Override
        public String getExternalConnectionPointRef() {
            return _externalConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<External>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_externalConnectionPointRef);
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
            if (!External.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            External other = (External)obj;
            if (!Objects.equals(_externalConnectionPointRef, other.getExternalConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExternalImpl otherImpl = (ExternalImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<External>>, Augmentation<External>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("External");
            CodeHelpers.appendValue(helper, "_externalConnectionPointRef", _externalConnectionPointRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
