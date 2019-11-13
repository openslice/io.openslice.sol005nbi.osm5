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
package osm5.ns.yang.ietf.network.rev180226.networks.network;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import osm5.ns.yang.ietf.network.rev180226.NodeId;
import osm5.ns.yang.ietf.network.rev180226.networks.network.node.SupportingNode;

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
 * Class that builds {@link NodeBuilder} instances.
 * 
 * @see NodeBuilder
 *
 */
public class NodeBuilder implements Builder<Node> {

    private NodeId _nodeId;
    private List<SupportingNode> _supportingNode;
    private NodeKey key;


    Map<Class<? extends Augmentation<Node>>, Augmentation<Node>> augmentation = Collections.emptyMap();

    public NodeBuilder() {
    }

    public NodeBuilder(Node base) {
        this.key = base.key();
        this._nodeId = base.getNodeId();
        this._supportingNode = base.getSupportingNode();
        if (base instanceof NodeImpl) {
            NodeImpl impl = (NodeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Node>>, Augmentation<Node>> aug =((AugmentationHolder<Node>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public NodeKey key() {
        return key;
    }
    
    public NodeId getNodeId() {
        return _nodeId;
    }
    
    public List<SupportingNode> getSupportingNode() {
        return _supportingNode;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Node>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NodeBuilder withKey(final NodeKey key) {
        this.key = key;
        return this;
    }
    
    public NodeBuilder setNodeId(final NodeId value) {
        this._nodeId = value;
        return this;
    }
    public NodeBuilder setSupportingNode(final List<SupportingNode> values) {
        this._supportingNode = values;
        return this;
    }
    
    
    public NodeBuilder addAugmentation(Class<? extends Augmentation<Node>> augmentationType, Augmentation<Node> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NodeBuilder removeAugmentation(Class<? extends Augmentation<Node>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Node build() {
        return new NodeImpl(this);
    }

    private static final class NodeImpl implements Node {
    
        private final NodeId _nodeId;
        private final List<SupportingNode> _supportingNode;
        private final NodeKey key;
    
        private Map<Class<? extends Augmentation<Node>>, Augmentation<Node>> augmentation = Collections.emptyMap();
    
        NodeImpl(NodeBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NodeKey(base.getNodeId());
            }
            this._nodeId = key.getNodeId();
            this._supportingNode = base.getSupportingNode();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Node> getImplementedInterface() {
            return Node.class;
        }
    
        @Override
        public NodeKey key() {
            return key;
        }
        
        @Override
        public NodeId getNodeId() {
            return _nodeId;
        }
        
        @Override
        public List<SupportingNode> getSupportingNode() {
            return _supportingNode;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Node>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nodeId);
            result = prime * result + Objects.hashCode(_supportingNode);
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
            if (!Node.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Node other = (Node)obj;
            if (!Objects.equals(_nodeId, other.getNodeId())) {
                return false;
            }
            if (!Objects.equals(_supportingNode, other.getSupportingNode())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NodeImpl otherImpl = (NodeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Node>>, Augmentation<Node>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Node");
            CodeHelpers.appendValue(helper, "_nodeId", _nodeId);
            CodeHelpers.appendValue(helper, "_supportingNode", _supportingNode);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
