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
package osm5.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.Parameter;
import osm5.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.ParameterGroup;
import osm5.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.VnfPrimitiveGroup;

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
 * Class that builds {@link ServicePrimitiveBuilder} instances.
 * 
 * @see ServicePrimitiveBuilder
 *
 */
public class ServicePrimitiveBuilder implements Builder<ServicePrimitive> {

    private String _name;
    private List<Parameter> _parameter;
    private List<ParameterGroup> _parameterGroup;
    private String _userDefinedScript;
    private List<VnfPrimitiveGroup> _vnfPrimitiveGroup;
    private ServicePrimitiveKey key;


    Map<Class<? extends Augmentation<ServicePrimitive>>, Augmentation<ServicePrimitive>> augmentation = Collections.emptyMap();

    public ServicePrimitiveBuilder() {
    }

    public ServicePrimitiveBuilder(ServicePrimitive base) {
        this.key = base.key();
        this._name = base.getName();
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._userDefinedScript = base.getUserDefinedScript();
        this._vnfPrimitiveGroup = base.getVnfPrimitiveGroup();
        if (base instanceof ServicePrimitiveImpl) {
            ServicePrimitiveImpl impl = (ServicePrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ServicePrimitive>>, Augmentation<ServicePrimitive>> aug =((AugmentationHolder<ServicePrimitive>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public ServicePrimitiveKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public List<ParameterGroup> getParameterGroup() {
        return _parameterGroup;
    }
    
    public String getUserDefinedScript() {
        return _userDefinedScript;
    }
    
    public List<VnfPrimitiveGroup> getVnfPrimitiveGroup() {
        return _vnfPrimitiveGroup;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ServicePrimitive>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ServicePrimitiveBuilder withKey(final ServicePrimitiveKey key) {
        this.key = key;
        return this;
    }
    
    public ServicePrimitiveBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public ServicePrimitiveBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    public ServicePrimitiveBuilder setParameterGroup(final List<ParameterGroup> values) {
        this._parameterGroup = values;
        return this;
    }
    
    
    public ServicePrimitiveBuilder setUserDefinedScript(final String value) {
        this._userDefinedScript = value;
        return this;
    }
    public ServicePrimitiveBuilder setVnfPrimitiveGroup(final List<VnfPrimitiveGroup> values) {
        this._vnfPrimitiveGroup = values;
        return this;
    }
    
    
    public ServicePrimitiveBuilder addAugmentation(Class<? extends Augmentation<ServicePrimitive>> augmentationType, Augmentation<ServicePrimitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ServicePrimitiveBuilder removeAugmentation(Class<? extends Augmentation<ServicePrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ServicePrimitive build() {
        return new ServicePrimitiveImpl(this);
    }

    private static final class ServicePrimitiveImpl implements ServicePrimitive {
    
        private final String _name;
        private final List<Parameter> _parameter;
        private final List<ParameterGroup> _parameterGroup;
        private final String _userDefinedScript;
        private final List<VnfPrimitiveGroup> _vnfPrimitiveGroup;
        private final ServicePrimitiveKey key;
    
        private Map<Class<? extends Augmentation<ServicePrimitive>>, Augmentation<ServicePrimitive>> augmentation = Collections.emptyMap();
    
        ServicePrimitiveImpl(ServicePrimitiveBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ServicePrimitiveKey(base.getName());
            }
            this._name = key.getName();
            this._parameter = base.getParameter();
            this._parameterGroup = base.getParameterGroup();
            this._userDefinedScript = base.getUserDefinedScript();
            this._vnfPrimitiveGroup = base.getVnfPrimitiveGroup();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ServicePrimitive> getImplementedInterface() {
            return ServicePrimitive.class;
        }
    
        @Override
        public ServicePrimitiveKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public List<ParameterGroup> getParameterGroup() {
            return _parameterGroup;
        }
        
        @Override
        public String getUserDefinedScript() {
            return _userDefinedScript;
        }
        
        @Override
        public List<VnfPrimitiveGroup> getVnfPrimitiveGroup() {
            return _vnfPrimitiveGroup;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ServicePrimitive>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_userDefinedScript);
            result = prime * result + Objects.hashCode(_vnfPrimitiveGroup);
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
            if (!ServicePrimitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ServicePrimitive other = (ServicePrimitive)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_parameterGroup, other.getParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (!Objects.equals(_vnfPrimitiveGroup, other.getVnfPrimitiveGroup())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ServicePrimitiveImpl otherImpl = (ServicePrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ServicePrimitive>>, Augmentation<ServicePrimitive>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ServicePrimitive");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_parameterGroup", _parameterGroup);
            CodeHelpers.appendValue(helper, "_userDefinedScript", _userDefinedScript);
            CodeHelpers.appendValue(helper, "_vnfPrimitiveGroup", _vnfPrimitiveGroup);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
