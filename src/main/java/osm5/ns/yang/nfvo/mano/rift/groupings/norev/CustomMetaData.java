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
package osm5.ns.yang.nfvo.mano.rift.groupings.norev;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for instance-specific meta data
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-rift-groupings</b>
 * <pre>
 * grouping custom-meta-data {
 *   list custom-meta-data {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf data-type {
 *       type manotypes:meta-data-type;
 *       default STRING;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *     leaf destination {
 *       type enumeration {
 *         enum CLOUD_INIT;
 *         enum CLOUD_METADATA;
 *       }
 *       default CLOUD_METADATA;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-rift-groupings/custom-meta-data</i>
 *
 */
public interface CustomMetaData
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("custom-meta-data");

    /**
     * List of meta-data to be associated with the instance
     *
     *
     *
     * @return <code>java.util.List</code> <code>customMetaData</code>, or <code>null</code> if not present
     */
    @Nullable
    List<osm5.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData> getCustomMetaData();

}

