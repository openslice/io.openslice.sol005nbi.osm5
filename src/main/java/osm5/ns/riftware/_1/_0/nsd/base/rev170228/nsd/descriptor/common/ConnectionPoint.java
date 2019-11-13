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
package osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.nsd.base.rev170228.NsdConnectionPointCommon;
import osm5.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.connection.point.Connection;
import osm5.ns.yang.nfvo.mano.types.rev170208.ConnectionPointType;

/**
 * List for external connection points.Each NS has one or more external 
 * connectionpoints. As the name implies that externalconnection points are used 
 * for connectingthe NS to other NS or to external networks.Each NS exposes these 
 * connection points tothe orchestrator. The orchestrator canconstruct network 
 * service chains byconnecting the connection points betweendifferent NS.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list connection-point {
 *   key name;
 *   uses nsd-connection-point-common;
 *   leaf type {
 *     type manotypes:connection-point-type;
 *   }
 *   choice connection {
 *     case vld-ref {
 *       leaf vld-id-ref {
 *         type string;
 *       }
 *     }
 *     case vnfd-connection-point-ref {
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf vnfd-connection-point-ref {
 *         type leafref {
 *           path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
public interface ConnectionPoint
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<ConnectionPoint>,
    NsdConnectionPointCommon,
    Identifiable<ConnectionPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point");

    /**
     * Type of the connection point.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConnectionPointType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable
    ConnectionPointType getType();
    
    /**
     * Logical connection of the CP to a VLD or to a VNF CP
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.connection.point.Connection</code> <code>connection</code>, or <code>null</code> if not present
     */
    @Nullable
    Connection getConnection();
    
    @Override
    ConnectionPointKey key();

}

