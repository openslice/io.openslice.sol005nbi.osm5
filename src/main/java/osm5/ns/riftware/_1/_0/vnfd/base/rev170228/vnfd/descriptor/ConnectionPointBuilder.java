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
package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.nfvo.mano.types.rev170208.ConnectionPointType;

import java.lang.Boolean;
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
 * Class that builds {@link ConnectionPointBuilder} instances.
 * 
 * @see ConnectionPointBuilder
 *
 */
public class ConnectionPointBuilder implements Builder<ConnectionPoint> {

    private String _id;
    private String _internalVldRef;
    private String _name;
    private String _shortName;
    private ConnectionPointType _type;
    private Boolean _portSecurityEnabled;
    private ConnectionPointKey key;


    Map<Class<? extends Augmentation<ConnectionPoint>>, Augmentation<ConnectionPoint>> augmentation = Collections.emptyMap();

    public ConnectionPointBuilder() {
    }
    public ConnectionPointBuilder(osm5.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint arg) {
        this._name = arg.getName();
        this._id = arg.getId();
        this._shortName = arg.getShortName();
        this._type = arg.getType();
        this._portSecurityEnabled = arg.isPortSecurityEnabled();
    }

    public ConnectionPointBuilder(ConnectionPoint base) {
        this.key = base.key();
        this._name = base.getName();
        this._id = base.getId();
        this._internalVldRef = base.getInternalVldRef();
        this._shortName = base.getShortName();
        this._type = base.getType();
        this._portSecurityEnabled = base.isPortSecurityEnabled();
        if (base instanceof ConnectionPointImpl) {
            ConnectionPointImpl impl = (ConnectionPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ConnectionPoint>>, Augmentation<ConnectionPoint>> aug =((AugmentationHolder<ConnectionPoint>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof osm5.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint) {
            this._name = ((osm5.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint)arg).getName();
            this._id = ((osm5.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint)arg).getId();
            this._shortName = ((osm5.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint)arg).getShortName();
            this._type = ((osm5.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint)arg).getType();
            this._portSecurityEnabled = ((osm5.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint)arg).isPortSecurityEnabled();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint]");
    }

    public ConnectionPointKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getInternalVldRef() {
        return _internalVldRef;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public ConnectionPointType getType() {
        return _type;
    }
    
    public Boolean isPortSecurityEnabled() {
        return _portSecurityEnabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ConnectionPoint>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ConnectionPointBuilder withKey(final ConnectionPointKey key) {
        this.key = key;
        return this;
    }
    
    public ConnectionPointBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public ConnectionPointBuilder setInternalVldRef(final String value) {
        this._internalVldRef = value;
        return this;
    }
    
    public ConnectionPointBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ConnectionPointBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public ConnectionPointBuilder setType(final ConnectionPointType value) {
        this._type = value;
        return this;
    }
    
    public ConnectionPointBuilder setPortSecurityEnabled(final Boolean value) {
        this._portSecurityEnabled = value;
        return this;
    }
    
    public ConnectionPointBuilder addAugmentation(Class<? extends Augmentation<ConnectionPoint>> augmentationType, Augmentation<ConnectionPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConnectionPointBuilder removeAugmentation(Class<? extends Augmentation<ConnectionPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConnectionPoint build() {
        return new ConnectionPointImpl(this);
    }

    public static final class ConnectionPointImpl implements ConnectionPoint {
    
        private final String _id;
        private final String _internalVldRef;
        private final String _name;
        private final String _shortName;
        private final ConnectionPointType _type;
        private final Boolean _portSecurityEnabled;
        private final ConnectionPointKey key;
    
        private Map<Class<? extends Augmentation<ConnectionPoint>>, Augmentation<ConnectionPoint>> augmentation = Collections.emptyMap();
    
        ConnectionPointImpl(ConnectionPointBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ConnectionPointKey(base.getName());
            }
            this._name = key.getName();
            this._id = base.getId();
            this._internalVldRef = base.getInternalVldRef();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this._portSecurityEnabled = base.isPortSecurityEnabled();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ConnectionPoint> getImplementedInterface() {
            return ConnectionPoint.class;
        }
        
        public ConnectionPointImpl(){
        	this( new ConnectionPointBuilder() );
        }
        
        @Override
        public ConnectionPointKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getInternalVldRef() {
            return _internalVldRef;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public ConnectionPointType getType() {
            return _type;
        }
        
        @Override
        public Boolean isPortSecurityEnabled() {
            return _portSecurityEnabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ConnectionPoint>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_internalVldRef);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_portSecurityEnabled);
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
            if (!ConnectionPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ConnectionPoint other = (ConnectionPoint)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_internalVldRef, other.getInternalVldRef())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_portSecurityEnabled, other.isPortSecurityEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConnectionPointImpl otherImpl = (ConnectionPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConnectionPoint>>, Augmentation<ConnectionPoint>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConnectionPoint");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_internalVldRef", _internalVldRef);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_portSecurityEnabled", _portSecurityEnabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
