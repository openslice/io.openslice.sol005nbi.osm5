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
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.MonitoringParamAggregation;
import osm5.ns.yang.nfvo.mano.types.rev170208.MonitoringParamUiData;
import osm5.ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;

/**
 * List of monitoring parameters from VNF's that should be propogated up into NSR
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping monitoring-param-common {
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:monitoring-param-value;
 *   uses manotypes:monitoring-param-ui-data;
 *   uses manotypes:monitoring-param-aggregation;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/monitoring-param-common</i>
 *
 */
public interface MonitoringParamCommon
    extends
    DataObject,
    MonitoringParamUiData,
    MonitoringParamAggregation,
    MonitoringParamValue
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param-common");

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();

}

