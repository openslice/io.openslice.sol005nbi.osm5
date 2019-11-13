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
package osm5.ns.yang.nfvo.instantiation.parameters.rev180914;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ns_params.Vld;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ns_params.Vnf;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping ns_params {
 *   leaf vimAccountId {
 *     type string;
 *   }
 *   leaf ssh_keys {
 *     type string;
 *   }
 *   list vnf {
 *     key member-vnf-index;
 *     uses vnf_params;
 *   }
 *   list vld {
 *     key name;
 *     uses vld_params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ns_params</i>
 *
 */
public interface NsParams
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns_params");

    /**
     * @return <code>java.lang.String</code> <code>vimAccountId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVimAccountId();
    
    /**
     * @return <code>java.lang.String</code> <code>sshKeys</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSshKeys();
    
    /**
     * @return <code>java.util.List</code> <code>vnf</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnf> getVnf();
    
    /**
     * @return <code>java.util.List</code> <code>vld</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vld> getVld();

}

