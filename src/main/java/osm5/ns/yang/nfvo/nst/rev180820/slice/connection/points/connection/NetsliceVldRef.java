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
 * case netslice-vld-ref {
 *   leaf netslice-vld-id-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/slice-connection-points/connection/netslice-vld-ref</i>
 *
 */
public interface NetsliceVldRef
    extends
    DataObject,
    Augmentable<NetsliceVldRef>,
    Connection
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-vld-ref");

    /**
     * ID reference to a NSVLD in the NS
     *
     *
     *
     * @return <code>java.lang.String</code> <code>netsliceVldIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNetsliceVldIdRef();

}

