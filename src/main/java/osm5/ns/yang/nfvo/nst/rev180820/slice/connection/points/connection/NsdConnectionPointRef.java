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
package osm5.ns.yang.nfvo.nst.rev180820.slice.connection.points.connection;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nst.rev180820.slice.connection.points.Connection;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * case nsd-connection-point-ref {
 *   leaf nsd-id-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *     }
 *   }
 *   leaf nsd-connection-point-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/slice-connection-points/connection/nsd-connection-point-ref</i>
 *
 */
public interface NsdConnectionPointRef
    extends
    DataObject,
    Augmentable<NsdConnectionPointRef>,
    Connection
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-connection-point-ref");

    /**
     * A reference to a nsd.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdIdRef();
    
    /**
     * @return <code>java.lang.String</code> <code>nsdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdConnectionPointRef();

}

