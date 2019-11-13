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
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.VnfdDescriptor;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.ConnectionPointBuilder.ConnectionPointImpl;


/**
 * List for external connection points. Each VNF has oneor more external 
 * points that connect the VNFto other VNFs or to external networks. Each VNF 
 * exposesconnection points to the orchestrator, which can constructnetwork 
 * services by connecting the connection pointsbetween different VNFs. The NFVO 
 * will use VLDs and VNFFGsat the network service level to construct network 
 * services.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list connection-point {
 *   key name;
 *   uses common-connection-point;
 *   leaf internal-vld-ref {
 *     type leafref {
 *       path ../../internal-vld/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
@JsonDeserialize(as = ConnectionPointImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface ConnectionPoint
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<ConnectionPoint>,
    CommonConnectionPoint,
    Identifiable<ConnectionPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point");

    /**
     * Reference to an internal VLD of the VNF. This field isoptional. It allows 
     * exposing an internal VLD through aconnection point. When building a NS, this VNF
     * CP might beconnected to a NS VLD, then both VLDs (the i-VLD of the VNF and 
     * theVLD of the NS) will become the same network and the IP profile willbe the one
     * configured at NS level.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>internalVldRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getInternalVldRef();
    
    @Override
    ConnectionPointKey key();

}

