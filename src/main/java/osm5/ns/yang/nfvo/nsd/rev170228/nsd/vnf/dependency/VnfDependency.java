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
package osm5.ns.yang.nfvo.nsd.rev170228.nsd.vnf.dependency;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdVnfDependency;

/**
 * List of VNF dependencies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnf-dependency {
 *   key vnf-source-ref;
 *   leaf vnf-source-ref {
 *     type leafref {
 *       path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id;
 *     }
 *   }
 *   leaf vnf-depends-on-ref {
 *     type leafref {
 *       path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-vnf-dependency/vnf-dependency</i>
 * 
 * <p>To create instances of this class use {@link VnfDependencyBuilder}.
 * @see VnfDependencyBuilder
 * @see VnfDependencyKey
 *
 */
public interface VnfDependency
    extends
    ChildOf<NsdVnfDependency>,
    Augmentable<VnfDependency>,
    Identifiable<VnfDependencyKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-dependency");

    /**
     * @return <code>java.lang.String</code> <code>vnfSourceRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfSourceRef();
    
    /**
     * Reference to VNF that sorce VNF depends.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfDependsOnRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfDependsOnRef();
    
    @Override
    VnfDependencyKey key();

}

