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
package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ns_params;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.NsParams;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.VnfParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list vnf {
 *   key member-vnf-index;
 *   uses vnf_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ns_params/vnf</i>
 * 
 * <p>To create instances of this class use {@link VnfBuilder}.
 * @see VnfBuilder
 * @see VnfKey
 *
 */
public interface Vnf
    extends
    ChildOf<NsParams>,
    Augmentable<Vnf>,
    VnfParams,
    Identifiable<VnfKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf");

    @Override
    VnfKey key();

}

