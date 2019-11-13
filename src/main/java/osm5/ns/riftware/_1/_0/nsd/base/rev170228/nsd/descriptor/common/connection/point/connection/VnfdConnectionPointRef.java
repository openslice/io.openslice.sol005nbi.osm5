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
package osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.connection.point.connection;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import osm5.ns.riftware._1._0.nsd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.connection.point.Connection;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * case vnfd-connection-point-ref {
 *   leaf member-vnf-index-ref {
 *     type string;
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 *   leaf vnfd-connection-point-ref {
 *     type leafref {
 *       path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/connection-point/connection/vnfd-connection-point-ref</i>
 *
 */
public interface VnfdConnectionPointRef
    extends
    DataObject,
    Augmentable<VnfdConnectionPointRef>,
    Connection
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-connection-point-ref");

    /**
     * Reference to member-vnf within constituent-vnfd
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfd. This is a leafref to path: ../../nsd:constituent-vnfd + 
     * [nsd:id = current()/../nsd:id-ref] + /nsd:vnfd-id-ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdIdRef();
    
    /**
     * A reference to a connection point name in a vnfd. This is a leafref to path: 
     * /vnfd:vnfd-catalog/vnfd:vnfd + [vnfd:id = current()/../nsd:vnfd-id-ref] + 
     * /vnfd:connection-point/vnfd:name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdConnectionPointRef();

}

