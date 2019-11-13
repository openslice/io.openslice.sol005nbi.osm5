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
package osm5.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import osm5.ns.yang.nfvo.mano.types.rev170208.VcaRelationships;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container juju {
 *   leaf charm {
 *     type string;
 *   }
 *   leaf proxy {
 *     type boolean;
 *     default true;
 *   }
 *   uses manotypes:vca-relationships;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method/juju/juju</i>
 * 
 * <p>To create instances of this class use {@link JujuBuilder}.
 * @see JujuBuilder
 *
 */
public interface Juju
    extends
    ChildOf<VcaConfiguration>,
    Augmentable<Juju>,
    VcaRelationships
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("juju");

    /**
     * Juju charm to use with the VNF or VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>charm</code>, or <code>null</code> if not present
     */
    @Nullable
    String getCharm();
    
    /**
     * Is this a proxy charm?
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>proxy</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isProxy();

}

