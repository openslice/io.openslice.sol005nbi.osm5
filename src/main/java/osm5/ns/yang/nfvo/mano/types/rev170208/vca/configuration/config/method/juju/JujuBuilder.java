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
package osm5.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships;

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
 * Class that builds {@link JujuBuilder} instances.
 * 
 * @see JujuBuilder
 *
 */
public class JujuBuilder implements Builder<Juju> {

    private String _charm;
    private VcaRelationships _vcaRelationships;
    private Boolean _proxy;


    Map<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> augmentation = Collections.emptyMap();

    public JujuBuilder() {
    }
    public JujuBuilder(osm5.ns.yang.nfvo.mano.types.rev170208.VcaRelationships arg) {
        this._vcaRelationships = arg.getVcaRelationships();
    }

    public JujuBuilder(Juju base) {
        this._charm = base.getCharm();
        this._vcaRelationships = base.getVcaRelationships();
        this._proxy = base.isProxy();
        if (base instanceof JujuImpl) {
            JujuImpl impl = (JujuImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> aug =((AugmentationHolder<Juju>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaRelationships</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof osm5.ns.yang.nfvo.mano.types.rev170208.VcaRelationships) {
            this._vcaRelationships = ((osm5.ns.yang.nfvo.mano.types.rev170208.VcaRelationships)arg).getVcaRelationships();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaRelationships]");
    }

    public String getCharm() {
        return _charm;
    }
    
    public VcaRelationships getVcaRelationships() {
        return _vcaRelationships;
    }
    
    public Boolean isProxy() {
        return _proxy;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Juju>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public JujuBuilder setCharm(final String value) {
        this._charm = value;
        return this;
    }
    
    public JujuBuilder setVcaRelationships(final VcaRelationships value) {
        this._vcaRelationships = value;
        return this;
    }
    
    public JujuBuilder setProxy(final Boolean value) {
        this._proxy = value;
        return this;
    }
    
    public JujuBuilder addAugmentation(Class<? extends Augmentation<Juju>> augmentationType, Augmentation<Juju> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public JujuBuilder removeAugmentation(Class<? extends Augmentation<Juju>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Juju build() {
        return new JujuImpl(this);
    }

    private static final class JujuImpl implements Juju {
    
        private final String _charm;
        private final VcaRelationships _vcaRelationships;
        private final Boolean _proxy;
    
        private Map<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> augmentation = Collections.emptyMap();
    
        JujuImpl(JujuBuilder base) {
            this._charm = base.getCharm();
            this._vcaRelationships = base.getVcaRelationships();
            this._proxy = base.isProxy();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Juju> getImplementedInterface() {
            return Juju.class;
        }
    
        @Override
        public String getCharm() {
            return _charm;
        }
        
        @Override
        public VcaRelationships getVcaRelationships() {
            return _vcaRelationships;
        }
        
        @Override
        public Boolean isProxy() {
            return _proxy;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Juju>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_charm);
            result = prime * result + Objects.hashCode(_vcaRelationships);
            result = prime * result + Objects.hashCode(_proxy);
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
            if (!Juju.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Juju other = (Juju)obj;
            if (!Objects.equals(_charm, other.getCharm())) {
                return false;
            }
            if (!Objects.equals(_vcaRelationships, other.getVcaRelationships())) {
                return false;
            }
            if (!Objects.equals(_proxy, other.isProxy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                JujuImpl otherImpl = (JujuImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Juju");
            CodeHelpers.appendValue(helper, "_charm", _charm);
            CodeHelpers.appendValue(helper, "_vcaRelationships", _vcaRelationships);
            CodeHelpers.appendValue(helper, "_proxy", _proxy);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
