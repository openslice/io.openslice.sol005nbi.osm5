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

import osm5.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-constituent-vnfd {
 *   list constituent-vnfd {
 *     key member-vnf-index;
 *     leaf member-vnf-index {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id;
 *       }
 *     }
 *     leaf start-by-default {
 *       type boolean;
 *       default true;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-constituent-vnfd</i>
 *
 */
public interface NsdConstituentVnfd
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-constituent-vnfd");

    /**
     * List of VNFDs that are part of thisnetwork service.
     *
     *
     *
     * @return <code>java.util.List</code> <code>constituentVnfd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ConstituentVnfd> getConstituentVnfd();

}

