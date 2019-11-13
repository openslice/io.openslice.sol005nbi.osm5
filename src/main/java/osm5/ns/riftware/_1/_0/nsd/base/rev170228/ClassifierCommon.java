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
package osm5.ns.riftware._1._0.nsd.base.rev170228;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.classifier.common.MatchAttributes;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping classifier-common {
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf rsp-id-ref {
 *     type string;
 *   }
 *   list match-attributes {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf ip-proto {
 *       type uint8;
 *     }
 *     leaf source-ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf destination-ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf source-port {
 *       type inet:port-number;
 *     }
 *     leaf destination-port {
 *       type inet:port-number;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/classifier-common</i>
 *
 */
public interface ClassifierCommon
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("classifier-common");

    /**
     * Identifier for the classifier rule.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * Name of the classifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * A reference to the RSP.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>rspIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getRspIdRef();
    
    /**
     * List of match attributes.
     *
     *
     *
     * @return <code>java.util.List</code> <code>matchAttributes</code>, or <code>null</code> if not present
     */
    @Nullable
    List<MatchAttributes> getMatchAttributes();

}

