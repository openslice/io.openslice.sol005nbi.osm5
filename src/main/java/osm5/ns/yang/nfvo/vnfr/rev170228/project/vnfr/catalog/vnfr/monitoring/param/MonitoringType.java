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
package osm5.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam;

/**
 * Defines the type of monitoring param to be used: * vdu-monitorin-param: 
 * VDU-related metric (from NFVI) * vnf-metric: VNF-related metric (from VCA) * 
 * vdu-metric: VDU-related metric (from VCA)
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * choice monitoring-type {
 *   case vdu-monitoring-param {
 *     container vdu-monitoring-param {
 *       leaf vdu-ref {
 *         type leafref {
 *           path ../../../../../vdur/id;
 *         }
 *       }
 *       leaf vdu-monitoring-param-ref {
 *         type leafref {
 *           path "../../../../../vdur[id = current()/../vdu-ref]/monitoring-param/id";
 *         }
 *       }
 *     }
 *   }
 *   case vnf-metric {
 *     container vnf-metric {
 *       leaf vnf-metric-name-ref {
 *         type leafref {
 *           path ../../../../../vnf-configuration/metrics/name;
 *         }
 *       }
 *     }
 *   }
 *   case vdu-metric {
 *     container vdu-metric {
 *       leaf vdu-ref {
 *         type leafref {
 *           path ../../../../../vdur/id;
 *         }
 *       }
 *       leaf vdu-metric-name-ref {
 *         type leafref {
 *           path "../../../vdur[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param/monitoring-type</i>
 *
 */
public interface MonitoringType
    extends
    ChoiceIn<MonitoringParam>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-type");


}

