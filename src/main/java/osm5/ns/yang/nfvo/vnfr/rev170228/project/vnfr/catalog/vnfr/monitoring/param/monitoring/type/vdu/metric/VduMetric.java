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
package osm5.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric;
import java.lang.Object;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;
import osm5.ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container vdu-metric {
 *   leaf vdu-ref {
 *     type leafref {
 *       path ../../../../../vdur/id;
 *     }
 *   }
 *   leaf vdu-metric-name-ref {
 *     type leafref {
 *       path "../../../vdur[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param/monitoring-type/vdu-metric/vdu-metric</i>
 * 
 * <p>To create instances of this class use {@link VduMetricBuilder}.
 * @see VduMetricBuilder
 *
 */
public interface VduMetric
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VduMetric>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-metric");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vduRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getVduRef();
    
    /**
     * @return <code>java.lang.Object</code> <code>vduMetricNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVduMetricNameRef();

}

