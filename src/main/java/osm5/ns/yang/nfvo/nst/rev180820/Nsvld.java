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
package osm5.ns.yang.nfvo.nst.rev180820;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.VldCommon;
import osm5.ns.yang.nfvo.nst.rev180820.nsvld.NssConnectionPointRef;

/**
 * List of NetSlice Subnet Virtual Link Descriptors.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping nsvld {
 *   uses nsd-base:vld-common;
 *   list nss-connection-point-ref {
 *     key "nss-ref nsd-connection-point-ref";
 *     leaf nss-ref {
 *       type leafref {
 *         path /nst:nst/nst:netslice-subnet/nst:id;
 *       }
 *     }
 *     leaf nsd-connection-point-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/nsvld</i>
 *
 */
public interface Nsvld
    extends
    DataObject,
    VldCommon
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsvld");

    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>nssConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NssConnectionPointRef> getNssConnectionPointRef();

}

