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
package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.MonitoringType;

/**
 * VNF-related metric (from VCA)
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vnf-metric {
 *   container vnf-metric {
 *     leaf vnf-metric-name-ref {
 *       type leafref {
 *         path ../../../../../vnf-configuration/metrics/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vnf-metric</i>
 *
 */
public interface VnfMetric
    extends
    DataObject,
    Augmentable<VnfMetric>,
    MonitoringType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-metric");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vnf.metric.VnfMetric</code> <code>vnfMetric</code>, or <code>null</code> if not present
     */
    @Nullable
    osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vnf.metric.VnfMetric getVnfMetric();

}

