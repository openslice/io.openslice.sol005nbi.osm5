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
package osm5.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;
import osm5.ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list internal-vlr {
 *   key vlr-ref;
 *   leaf vlr-ref {
 *     type leafref {
 *       path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *     }
 *   }
 *   leaf-list internal-connection-point-ref {
 *     type leafref {
 *       path ../../vdur/internal-connection-point/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/internal-vlr</i>
 * 
 * <p>To create instances of this class use {@link InternalVlrBuilder}.
 * @see InternalVlrBuilder
 * @see InternalVlrKey
 *
 */
public interface InternalVlr
    extends
    ChildOf<Vnfr>,
    Augmentable<InternalVlr>,
    Identifiable<InternalVlrKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-vlr");

    /**
     * Reference to a VLR record in the VLR catalog
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vlrRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getVlrRef();
    
    /**
     * @return <code>java.util.List</code> <code>internalConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<String> getInternalConnectionPointRef();
    
    @Override
    InternalVlrKey key();

}

