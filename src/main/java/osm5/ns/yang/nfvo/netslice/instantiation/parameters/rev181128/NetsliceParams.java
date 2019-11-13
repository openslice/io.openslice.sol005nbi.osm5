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
package osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceSubnet;
import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceVld;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * grouping netslice_params {
 *   leaf vimAccountId {
 *     type string;
 *   }
 *   leaf ssh_keys {
 *     type string;
 *   }
 *   list netslice-subnet {
 *     key id;
 *     uses netslice_subnet_params;
 *   }
 *   list netslice-vld {
 *     key name;
 *     uses netslice_vld_params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_params</i>
 *
 */
public interface NetsliceParams
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice_params");

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
     * @return <code>java.util.List</code> <code>netsliceSubnet</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NetsliceSubnet> getNetsliceSubnet();
    
    /**
     * @return <code>java.util.List</code> <code>netsliceVld</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NetsliceVld> getNetsliceVld();

}

