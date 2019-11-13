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
package osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.nsr;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon;
import osm5.ns.riftware._1._0.project.nsd.rev170228.NsrNsdConstituentVnfd;
import osm5.ns.riftware._1._0.project.nsd.rev170228.NsrNsdMonitoringParam;
import osm5.ns.riftware._1._0.project.nsd.rev170228.NsrNsdPlacementGroups;
import osm5.ns.riftware._1._0.project.nsd.rev170228.NsrNsdServicePrimitive;
import osm5.ns.riftware._1._0.project.nsd.rev170228.NsrNsdVld;
import osm5.ns.riftware._1._0.project.nsd.rev170228.NsrNsdVnfDependency;
import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr;

/**
 * NS descriptor used to instantiate this NS
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container nsd {
 *   uses nsd-base:nsd-descriptor-common;
 *   uses project-nsd:nsr-nsd-vld;
 *   uses project-nsd:nsr-nsd-constituent-vnfd;
 *   uses project-nsd:nsr-nsd-placement-groups;
 *   uses project-nsd:nsr-nsd-vnf-dependency;
 *   uses project-nsd:nsr-nsd-monitoring-param;
 *   uses project-nsd:nsr-nsd-service-primitive;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-config/nsr/nsd</i>
 * 
 * <p>To create instances of this class use {@link NsdBuilder}.
 * @see NsdBuilder
 *
 */
public interface Nsd
    extends
    ChildOf<Nsr>,
    Augmentable<Nsd>,
    NsrNsdPlacementGroups,
    NsrNsdVld,
    NsrNsdVnfDependency,
    NsrNsdServicePrimitive,
    NsrNsdConstituentVnfd,
    NsdDescriptorCommon,
    NsrNsdMonitoringParam
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");


}

