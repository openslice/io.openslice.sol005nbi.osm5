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
package osm5.ns.riftware._1._0.project.nsd.rev170228;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.project.nsd.rev170228.nsd.monitoring.param.MonitoringParam;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsd-monitoring-param {
 *   list monitoring-param {
 *     key id;
 *     uses nsd-base:monitoring-param-common;
 *     list vnfd-monitoring-param {
 *       key "member-vnf-index-ref vnfd-monitoring-param-ref";
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf vnfd-monitoring-param-ref {
 *         type leafref {
 *           path "../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:monitoring-param/project-vnfd:id";
 *         }
 *       }
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-monitoring-param</i>
 *
 */
public interface NsdMonitoringParam
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-monitoring-param");

    /**
     * @return <code>java.util.List</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable
    List<MonitoringParam> getMonitoringParam();

}

