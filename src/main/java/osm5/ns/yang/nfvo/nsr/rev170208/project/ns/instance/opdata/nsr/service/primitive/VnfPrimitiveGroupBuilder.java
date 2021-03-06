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
package osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.service.primitive;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.service.primitive.vnf.primitive.group.Primitive;

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
 * Class that builds {@link VnfPrimitiveGroupBuilder} instances.
 * 
 * @see VnfPrimitiveGroupBuilder
 *
 */
public class VnfPrimitiveGroupBuilder implements Builder<VnfPrimitiveGroup> {

    private String _memberVnfIndexRef;
    private List<Primitive> _primitive;
    private String _vnfdIdRef;
    private String _vnfdName;
    private VnfPrimitiveGroupKey key;


    Map<Class<? extends Augmentation<VnfPrimitiveGroup>>, Augmentation<VnfPrimitiveGroup>> augmentation = Collections.emptyMap();

    public VnfPrimitiveGroupBuilder() {
    }

    public VnfPrimitiveGroupBuilder(VnfPrimitiveGroup base) {
        this.key = base.key();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._primitive = base.getPrimitive();
        this._vnfdIdRef = base.getVnfdIdRef();
        this._vnfdName = base.getVnfdName();
        if (base instanceof VnfPrimitiveGroupImpl) {
            VnfPrimitiveGroupImpl impl = (VnfPrimitiveGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfPrimitiveGroup>>, Augmentation<VnfPrimitiveGroup>> aug =((AugmentationHolder<VnfPrimitiveGroup>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public VnfPrimitiveGroupKey key() {
        return key;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public List<Primitive> getPrimitive() {
        return _primitive;
    }
    
    public String getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public String getVnfdName() {
        return _vnfdName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfPrimitiveGroup>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfPrimitiveGroupBuilder withKey(final VnfPrimitiveGroupKey key) {
        this.key = key;
        return this;
    }
    
    public VnfPrimitiveGroupBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    public VnfPrimitiveGroupBuilder setPrimitive(final List<Primitive> values) {
        this._primitive = values;
        return this;
    }
    
    
    public VnfPrimitiveGroupBuilder setVnfdIdRef(final String value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public VnfPrimitiveGroupBuilder setVnfdName(final String value) {
        this._vnfdName = value;
        return this;
    }
    
    public VnfPrimitiveGroupBuilder addAugmentation(Class<? extends Augmentation<VnfPrimitiveGroup>> augmentationType, Augmentation<VnfPrimitiveGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfPrimitiveGroupBuilder removeAugmentation(Class<? extends Augmentation<VnfPrimitiveGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfPrimitiveGroup build() {
        return new VnfPrimitiveGroupImpl(this);
    }

    private static final class VnfPrimitiveGroupImpl implements VnfPrimitiveGroup {
    
        private final String _memberVnfIndexRef;
        private final List<Primitive> _primitive;
        private final String _vnfdIdRef;
        private final String _vnfdName;
        private final VnfPrimitiveGroupKey key;
    
        private Map<Class<? extends Augmentation<VnfPrimitiveGroup>>, Augmentation<VnfPrimitiveGroup>> augmentation = Collections.emptyMap();
    
        VnfPrimitiveGroupImpl(VnfPrimitiveGroupBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfPrimitiveGroupKey(base.getMemberVnfIndexRef());
            }
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            this._primitive = base.getPrimitive();
            this._vnfdIdRef = base.getVnfdIdRef();
            this._vnfdName = base.getVnfdName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VnfPrimitiveGroup> getImplementedInterface() {
            return VnfPrimitiveGroup.class;
        }
    
        @Override
        public VnfPrimitiveGroupKey key() {
            return key;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public List<Primitive> getPrimitive() {
            return _primitive;
        }
        
        @Override
        public String getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public String getVnfdName() {
            return _vnfdName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfPrimitiveGroup>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_primitive);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
            result = prime * result + Objects.hashCode(_vnfdName);
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
            if (!VnfPrimitiveGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfPrimitiveGroup other = (VnfPrimitiveGroup)obj;
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_primitive, other.getPrimitive())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdName, other.getVnfdName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfPrimitiveGroupImpl otherImpl = (VnfPrimitiveGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfPrimitiveGroup>>, Augmentation<VnfPrimitiveGroup>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfPrimitiveGroup");
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_primitive", _primitive);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "_vnfdName", _vnfdName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
