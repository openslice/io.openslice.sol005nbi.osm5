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
package osm5.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.MonitoringParam;

/**
 * A list of VNFD monitoring params
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnfd-monitoring-param {
 *   key "member-vnf-index-ref vnfd-monitoring-param-ref";
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 *   leaf vnfd-monitoring-param-ref {
 *     type leafref {
 *       path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:monitoring-param/vnfd:id";
 *     }
 *   }
 *   leaf member-vnf-index-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-monitoring-param/monitoring-param/vnfd-monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link VnfdMonitoringParamBuilder}.
 * @see VnfdMonitoringParamBuilder
 * @see VnfdMonitoringParamKey
 *
 */
public interface VnfdMonitoringParam
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VnfdMonitoringParam>,
    Identifiable<VnfdMonitoringParamKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-monitoring-param");

    /**
     * A reference to a VNFD. This is a leafref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdIdRef();
    
    /**
     * A reference to the VNFD monitoring param
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdMonitoringParamRef();
    
    /**
     * Mandatory reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndexRef();
    
    @Override
    VnfdMonitoringParamKey key();

}

