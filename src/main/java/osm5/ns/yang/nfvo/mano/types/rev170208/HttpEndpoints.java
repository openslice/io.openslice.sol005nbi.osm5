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
package osm5.ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.http.endpoints.HttpEndpoint;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping http-endpoints {
 *   list http-endpoint {
 *     key path;
 *     leaf path {
 *       type string;
 *     }
 *     leaf https {
 *       type boolean;
 *       default false;
 *     }
 *     leaf port {
 *       type inet:port-number;
 *     }
 *     leaf username {
 *       type string;
 *     }
 *     leaf password {
 *       type string;
 *     }
 *     leaf polling-interval-secs {
 *       type uint8;
 *       default 2;
 *     }
 *     leaf method {
 *       type manotypes:http-method;
 *       default GET;
 *     }
 *     list headers {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/http-endpoints</i>
 *
 */
public interface HttpEndpoints
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("http-endpoints");

    /**
     * List of http endpoints to be used by monitoring params
     *
     *
     *
     * @return <code>java.util.List</code> <code>httpEndpoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<HttpEndpoint> getHttpEndpoint();

}

