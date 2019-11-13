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
package osm5.ns.yang.ietf.network.topology.rev180226.networks.network.node.termination.point;
import com.google.common.base.MoreObjects;

import osm5.ns.yang.ietf.network.rev180226.NetworkId;
import osm5.ns.yang.ietf.network.rev180226.NodeId;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class SupportingTerminationPointKey
 implements Identifier<SupportingTerminationPoint> {
    private static final long serialVersionUID = 2704561490877977216L;
    private final NetworkId _networkRef;
    private final NodeId _nodeRef;
    private final Object _tpRef;


    public SupportingTerminationPointKey(NetworkId _networkRef, NodeId _nodeRef, Object _tpRef) {
    
    
        this._networkRef = _networkRef;
        this._nodeRef = _nodeRef;
        this._tpRef = _tpRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingTerminationPointKey(SupportingTerminationPointKey source) {
        this._networkRef = source._networkRef;
        this._nodeRef = source._nodeRef;
        this._tpRef = source._tpRef;
    }


    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public NodeId getNodeRef() {
        return _nodeRef;
    }
    
    public Object getTpRef() {
        return _tpRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkRef);
        result = prime * result + Objects.hashCode(_nodeRef);
        result = prime * result + Objects.hashCode(_tpRef);
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
        SupportingTerminationPointKey other = (SupportingTerminationPointKey) obj;
        if (!Objects.equals(_networkRef, other._networkRef)) {
            return false;
        }
        if (!Objects.equals(_nodeRef, other._nodeRef)) {
            return false;
        }
        if (!Objects.equals(_tpRef, other._tpRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(SupportingTerminationPointKey.class);
        CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
        CodeHelpers.appendValue(helper, "_nodeRef", _nodeRef);
        CodeHelpers.appendValue(helper, "_tpRef", _tpRef);
        return helper.toString();
    }
}

