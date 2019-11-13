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
package osm5.ns.yang.nfvo.nsd.rev170228;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsd.rev170228.nsd.vld.Vld;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-vld {
 *   list vld {
 *     key id;
 *     uses nsd-base:nsd-vld-common;
 *     list vnfd-connection-point-ref {
 *       key "member-vnf-index-ref vnfd-connection-point-ref";
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-connection-point-ref {
 *         type leafref {
 *           path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *         }
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf ip-address {
 *         type inet:ip-address;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-vld</i>
 *
 */
public interface NsdVld
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-vld");

    /**
     * @return <code>java.util.List</code> <code>vld</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vld> getVld();

}

