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
package osm5.ns.yang.nfvo.nsd.rev170228.nsd.catalog;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import osm5.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon;
import osm5.ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdCatalog;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdConstituentVnfd;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdMonitoringParam;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdPlacementGroups;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdServicePrimitive;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdVld;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdVnfDependency;
import osm5.ns.yang.nfvo.nsd.rev170228.nsd.catalog.NsdBuilder.NsdImpl;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list nsd {
 *   key id;
 *   uses nsd-base:nsd-descriptor-common;
 *   uses nsd-vld;
 *   uses nsd-constituent-vnfd;
 *   uses nsd-placement-groups;
 *   uses nsd-vnf-dependency;
 *   uses nsd-monitoring-param;
 *   uses nsd-service-primitive;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-catalog/nsd</i>
 * 
 * <p>To create instances of this class use {@link NsdBuilder}.
 * @see NsdBuilder
 * @see NsdKey
 *
 */
@JsonDeserialize(as = NsdImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonIgnoreProperties( { "meta", "forgetThisField", "input-parameter-xpath", "_admin"} )
public interface Nsd
    extends
    ChildOf<NsdCatalog>,
    Augmentable<Nsd>,
    NsdMonitoringParam,
    NsdServicePrimitive,
    NsdVld,
    NsdConstituentVnfd,
    NsdPlacementGroups,
    NsdDescriptorCommon,
    NsdVnfDependency,
    Identifiable<NsdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");

    @Override
    NsdKey key();
    String getAddedId();	
}

