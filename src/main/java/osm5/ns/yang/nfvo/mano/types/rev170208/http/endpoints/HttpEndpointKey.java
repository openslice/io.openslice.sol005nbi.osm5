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
package osm5.ns.yang.nfvo.mano.types.rev170208.http.endpoints;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class HttpEndpointKey
 implements Identifier<HttpEndpoint> {
    private static final long serialVersionUID = -5430746006117903610L;
    private final String _path;


    public HttpEndpointKey(String _path) {
    
    
        this._path = _path;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HttpEndpointKey(HttpEndpointKey source) {
        this._path = source._path;
    }


    public String getPath() {
        return _path;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_path);
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
        HttpEndpointKey other = (HttpEndpointKey) obj;
        if (!Objects.equals(_path, other._path)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(HttpEndpointKey.class);
        CodeHelpers.appendValue(helper, "_path", _path);
        return helper.toString();
    }
}

