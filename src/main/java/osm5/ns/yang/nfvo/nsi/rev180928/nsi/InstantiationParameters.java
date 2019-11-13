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
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.NetsliceParams;
import osm5.ns.yang.nfvo.nsi.rev180928.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsi.rev180928.Nsi$G;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * container instantiation-parameters {
 *   uses netslice-instantiation-parameters:netslice_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi/instantiation-parameters</i>
 * 
 * <p>To create instances of this class use {@link InstantiationParametersBuilder}.
 * @see InstantiationParametersBuilder
 *
 */
public interface InstantiationParameters
    extends
    ChildOf<Nsi$G>,
    Augmentable<InstantiationParameters>,
    NetsliceParams
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("instantiation-parameters");


}

