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
package osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.MonitoringParamAggregation;
import osm5.ns.yang.nfvo.mano.types.rev170208.MonitoringParamUiData;
import osm5.ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;
import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;
import osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef;

/**
 * List of NS level params.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list monitoring-param {
 *   key id;
 *   uses manotypes:monitoring-param-value;
 *   uses manotypes:monitoring-param-ui-data;
 *   uses manotypes:monitoring-param-aggregation;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf nsd-mon-param-ref {
 *     type leafref {
 *       path "../../../../project-nsd:nsd-catalog/project-nsd:nsd[project-nsd:id = current()/../../nsd-ref]/project-nsd:monitoring-param/project-nsd:id";
 *     }
 *   }
 *   list vnfr-mon-param-ref {
 *     key "vnfr-id-ref vnfr-mon-param-ref";
 *     leaf vnfr-id-ref {
 *       type yang:uuid;
 *     }
 *     leaf vnfr-mon-param-ref {
 *       type leafref {
 *         path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:monitoring-param/vnfr:id";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<Nsr>,
    Augmentable<MonitoringParam>,
    MonitoringParamUiData,
    MonitoringParamAggregation,
    MonitoringParamValue,
    Identifiable<MonitoringParamKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

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
    
    /**
     * Reference to the NSD monitoring param descriptorthat produced this result
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdMonParamRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getNsdMonParamRef();
    
    /**
     * A list of VNFR monitoring params associated with this monp
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfrMonParamRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfrMonParamRef> getVnfrMonParamRef();
    
    @Override
    MonitoringParamKey key();

}

