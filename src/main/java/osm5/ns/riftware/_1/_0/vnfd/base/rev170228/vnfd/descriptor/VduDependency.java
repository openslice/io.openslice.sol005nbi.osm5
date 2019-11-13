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
package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.VnfdDescriptor;

/**
 * List of VDU dependencies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list vdu-dependency {
 *   key vdu-source-ref;
 *   leaf vdu-source-ref {
 *     type leafref {
 *       path ../../vdu/id;
 *     }
 *   }
 *   leaf vdu-depends-on-ref {
 *     type leafref {
 *       path ../../vdu/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu-dependency</i>
 * 
 * <p>To create instances of this class use {@link VduDependencyBuilder}.
 * @see VduDependencyBuilder
 * @see VduDependencyKey
 *
 */
public interface VduDependency
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<VduDependency>,
    Identifiable<VduDependencyKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-dependency");

    /**
     * @return <code>java.lang.String</code> <code>vduSourceRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVduSourceRef();
    
    /**
     * Reference to the VDU on whichthe source VDU depends.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vduDependsOnRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVduDependsOnRef();
    
    @Override
    VduDependencyKey key();

}

