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
 * VDU-related metric from the infrastructure
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vdu-monitoring-param {
 *   container vdu-monitoring-param {
 *     leaf vdu-ref {
 *       type leafref {
 *         path ../../../../../vdu/id;
 *       }
 *     }
 *     leaf vdu-monitoring-param-ref {
 *       type leafref {
 *         path "../../../../vdu[id = current()/../vdu-ref]/monitoring-param/id";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vdu-monitoring-param</i>
 *
 */
public interface VduMonitoringParam
    extends
    DataObject,
    Augmentable<VduMonitoringParam>,
    MonitoringType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-monitoring-param");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam</code> <code>vduMonitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable
    osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam getVduMonitoringParam();

}

