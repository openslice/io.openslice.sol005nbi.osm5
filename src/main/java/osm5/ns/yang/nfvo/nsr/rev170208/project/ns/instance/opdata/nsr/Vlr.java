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
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;
import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;
import osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vlr {
 *   key vlr-ref;
 *   leaf vlr-ref {
 *     type leafref {
 *       path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *     }
 *   }
 *   list vnfr-connection-point-ref {
 *     key vnfr-id;
 *     leaf vnfr-id {
 *       type leafref {
 *         path ../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id;
 *       }
 *     }
 *     leaf connection-point {
 *       type leafref {
 *         path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id]/vnfr:connection-point/vnfr:name";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/vlr</i>
 * 
 * <p>To create instances of this class use {@link VlrBuilder}.
 * @see VlrBuilder
 * @see VlrKey
 *
 */
public interface Vlr
    extends
    ChildOf<Nsr>,
    Augmentable<Vlr>,
    Identifiable<VlrKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlr");

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
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfrConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfrConnectionPointRef> getVnfrConnectionPointRef();
    
    @Override
    VlrKey key();

}

