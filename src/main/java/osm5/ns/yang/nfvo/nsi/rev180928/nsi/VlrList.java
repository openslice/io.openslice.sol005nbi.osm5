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
package osm5.ns.yang.nfvo.nsi.rev180928.nsi;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;
import osm5.ns.yang.nfvo.nsi.rev180928.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsi.rev180928.Nsi$G;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * list vlr-list {
 *   config false;
 *   key id;
 *   leaf id {
 *     config false;
 *     type yang:uuid;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi/vlr-list</i>
 * 
 * <p>To create instances of this class use {@link VlrListBuilder}.
 * @see VlrListBuilder
 * @see VlrListKey
 *
 */
public interface VlrList
    extends
    ChildOf<Nsi$G>,
    Augmentable<VlrList>,
    Identifiable<VlrListKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlr-list");

    /**
     * ID of instantiated VLR
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getId();
    
    @Override
    VlrListKey key();

}

