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
package osm5.ns.yang.nfvo.nst.rev180820;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.netslice.subnet.InstantiationParameters;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping netslice-subnet {
 *   leaf id {
 *     type string {
 *       length 1..63;
 *     }
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf is-shared-nss {
 *     type boolean;
 *     default false;
 *   }
 *   leaf nsd-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *     }
 *   }
 *   container instantiation-parameters {
 *     uses instantiation-parameters:ns_params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/netslice-subnet</i>
 *
 */
public interface NetsliceSubnet
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-subnet");

    /**
     * Identifier or name for the netslice-subnet in NST scope.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * Description of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * NSS is shared between NS
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isSharedNss</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isIsSharedNss();
    
    /**
     * Reference to catalog NSD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsdRef();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nst.rev180820.netslice.subnet.InstantiationParameters</code> <code>instantiationParameters</code>, or <code>null</code> if not present
     */
    @Nullable
    InstantiationParameters getInstantiationParameters();

}

