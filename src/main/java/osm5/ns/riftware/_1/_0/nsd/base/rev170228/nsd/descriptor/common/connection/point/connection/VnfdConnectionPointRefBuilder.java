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
package osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.connection.point.connection;
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
 * Class that builds {@link VnfdConnectionPointRefBuilder} instances.
 * 
 * @see VnfdConnectionPointRefBuilder
 *
 */
public class VnfdConnectionPointRefBuilder implements Builder<VnfdConnectionPointRef> {

    private String _memberVnfIndexRef;
    private Object _vnfdConnectionPointRef;
    private Object _vnfdIdRef;


    Map<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> augmentation = Collections.emptyMap();

    public VnfdConnectionPointRefBuilder() {
    }

    public VnfdConnectionPointRefBuilder(VnfdConnectionPointRef base) {
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        this._vnfdIdRef = base.getVnfdIdRef();
        if (base instanceof VnfdConnectionPointRefImpl) {
            VnfdConnectionPointRefImpl impl = (VnfdConnectionPointRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> aug =((AugmentationHolder<VnfdConnectionPointRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public Object getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    public Object getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfdConnectionPointRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VnfdConnectionPointRefBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder setVnfdConnectionPointRef(final Object value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder setVnfdIdRef(final Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder addAugmentation(Class<? extends Augmentation<VnfdConnectionPointRef>> augmentationType, Augmentation<VnfdConnectionPointRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdConnectionPointRefBuilder removeAugmentation(Class<? extends Augmentation<VnfdConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdConnectionPointRef build() {
        return new VnfdConnectionPointRefImpl(this);
    }

    private static final class VnfdConnectionPointRefImpl implements VnfdConnectionPointRef {
    
        private final String _memberVnfIndexRef;
        private final Object _vnfdConnectionPointRef;
        private final Object _vnfdIdRef;
    
        private Map<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> augmentation = Collections.emptyMap();
    
        VnfdConnectionPointRefImpl(VnfdConnectionPointRefBuilder base) {
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            this._vnfdIdRef = base.getVnfdIdRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VnfdConnectionPointRef> getImplementedInterface() {
            return VnfdConnectionPointRef.class;
        }
    
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public Object getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @Override
        public Object getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfdConnectionPointRef>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
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
            if (!VnfdConnectionPointRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfdConnectionPointRef other = (VnfdConnectionPointRef)obj;
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdConnectionPointRefImpl otherImpl = (VnfdConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfdConnectionPointRef");
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_vnfdConnectionPointRef", _vnfdConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
