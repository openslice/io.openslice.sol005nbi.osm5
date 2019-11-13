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
package osm5.ns.yang.ietf.network.rev180226.networks.network.node;
import com.google.common.base.MoreObjects;

import osm5.ns.yang.ietf.network.rev180226.NetworkId;
import osm5.ns.yang.ietf.network.rev180226.NodeId;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class SupportingNodeKey
 implements Identifier<SupportingNode> {
    private static final long serialVersionUID = 512422044746278657L;
    private final NetworkId _networkRef;
    private final NodeId _nodeRef;


    public SupportingNodeKey(NetworkId _networkRef, NodeId _nodeRef) {
    
    
        this._networkRef = _networkRef;
        this._nodeRef = _nodeRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingNodeKey(SupportingNodeKey source) {
        this._networkRef = source._networkRef;
        this._nodeRef = source._nodeRef;
    }


    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public NodeId getNodeRef() {
        return _nodeRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkRef);
        result = prime * result + Objects.hashCode(_nodeRef);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SupportingNodeKey other = (SupportingNodeKey) obj;
        if (!Objects.equals(_networkRef, other._networkRef)) {
            return false;
        }
        if (!Objects.equals(_nodeRef, other._nodeRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(SupportingNodeKey.class);
        CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
        CodeHelpers.appendValue(helper, "_nodeRef", _nodeRef);
        return helper.toString();
    }
}

