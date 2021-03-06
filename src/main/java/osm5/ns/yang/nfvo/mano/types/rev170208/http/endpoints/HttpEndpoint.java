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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.inet.types.rev130715.PortNumber;
import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.HttpEndpoints;
import osm5.ns.yang.nfvo.mano.types.rev170208.HttpMethod;
import osm5.ns.yang.nfvo.mano.types.rev170208.http.endpoints.http.endpoint.Headers;

/**
 * List of http endpoints to be used by monitoring params
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list http-endpoint {
 *   key path;
 *   leaf path {
 *     type string;
 *   }
 *   leaf https {
 *     type boolean;
 *     default false;
 *   }
 *   leaf port {
 *     type inet:port-number;
 *   }
 *   leaf username {
 *     type string;
 *   }
 *   leaf password {
 *     type string;
 *   }
 *   leaf polling-interval-secs {
 *     type uint8;
 *     default 2;
 *   }
 *   leaf method {
 *     type manotypes:http-method;
 *     default GET;
 *   }
 *   list headers {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/http-endpoints/http-endpoint</i>
 * 
 * <p>To create instances of this class use {@link HttpEndpointBuilder}.
 * @see HttpEndpointBuilder
 * @see HttpEndpointKey
 *
 */
public interface HttpEndpoint
    extends
    ChildOf<HttpEndpoints>,
    Augmentable<HttpEndpoint>,
    Identifiable<HttpEndpointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("http-endpoint");

    /**
     * The HTTP path on the management server
     *
     *
     *
     * @return <code>java.lang.String</code> <code>path</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPath();
    
    /**
     * Pick HTTPS instead of HTTP , Default is false
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>https</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isHttps();
    
    /**
     * The HTTP port to connect to
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    @Nullable
    PortNumber getPort();
    
    /**
     * The HTTP basic auth username
     *
     *
     *
     * @return <code>java.lang.String</code> <code>username</code>, or <code>null</code> if not present
     */
    @Nullable
    String getUsername();
    
    /**
     * The HTTP basic auth password
     *
     *
     *
     * @return <code>java.lang.String</code> <code>password</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPassword();
    
    /**
     * The HTTP polling interval in seconds
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pollingIntervalSecs</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getPollingIntervalSecs();
    
    /**
     * Method that the URI should perform.Deafult action is GET.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HttpMethod</code> <code>method</code>, or <code>null</code> if not present
     */
    @Nullable
    HttpMethod getMethod();
    
    /**
     * Custom HTTP headers to put on HTTP request
     *
     *
     *
     * @return <code>java.util.List</code> <code>headers</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Headers> getHeaders();
    
    @Override
    HttpEndpointKey key();

}

