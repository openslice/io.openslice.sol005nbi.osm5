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
package osm5.ns.riftware._1._0.project.nsd.rev170228.nsd.constituent.vnfd;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import osm5.ns.riftware._1._0.project.nsd.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.project.nsd.rev170228.NsdConstituentVnfd;
import osm5.ns.riftware._1._0.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfdBuilder.ConstituentVnfdImpl;


/**
 * List of VNFDs that are part of thisnetwork service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list constituent-vnfd {
 *   key member-vnf-index;
 *   leaf member-vnf-index {
 *     type string;
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "/rw-project:project[rw-project:name = current()/../../../../rw-project:name]/project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id";
 *     }
 *   }
 *   leaf start-by-default {
 *     type boolean;
 *     default true;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-constituent-vnfd/constituent-vnfd</i>
 * 
 * <p>To create instances of this class use {@link ConstituentVnfdBuilder}.
 * @see ConstituentVnfdBuilder
 * @see ConstituentVnfdKey
 *
 */
@JsonDeserialize(as = ConstituentVnfdImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface ConstituentVnfd
    extends
    ChildOf<NsdConstituentVnfd>,
    Augmentable<ConstituentVnfd>,
    Identifiable<ConstituentVnfdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-vnfd");

    /**
     * Identifier/index for the VNFD. This separate idis required to ensure that 
     * multiple VNFs can bepart of single NS
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndex</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndex();
    
    /**
     * Identifier for the VNFD.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdIdRef();
    
    /**
     * VNFD is started as part of the NS instantiation
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>startByDefault</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isStartByDefault();
    
    @Override
    ConstituentVnfdKey key();

}

