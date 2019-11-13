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
package osm5.ns.riftware._1._0.vnfd.base.rev170228;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.ConnectionPointType;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * grouping common-connection-point {
 *   leaf name {
 *     type string;
 *   }
 *   leaf id {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf type {
 *     type manotypes:connection-point-type;
 *   }
 *   leaf port-security-enabled {
 *     type boolean;
 *     default true;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/common-connection-point</i>
 *
 */
public interface CommonConnectionPoint
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("common-connection-point");

    /**
     * Name of the connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Identifier for the internal connection points
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getShortName();
    
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
     * Enables the port security for the port.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>portSecurityEnabled</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isPortSecurityEnabled();

}

