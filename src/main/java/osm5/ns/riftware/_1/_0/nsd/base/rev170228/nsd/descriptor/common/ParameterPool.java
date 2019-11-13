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
package osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range;

/**
 * Pool of parameter values which must bepulled from during configuration
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list parameter-pool {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   container range {
 *     leaf start-value {
 *       type uint32;
 *     }
 *     leaf end-value {
 *       type uint32;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/parameter-pool</i>
 * 
 * <p>To create instances of this class use {@link ParameterPoolBuilder}.
 * @see ParameterPoolBuilder
 * @see ParameterPoolKey
 *
 */
public interface ParameterPool
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<ParameterPool>,
    Identifiable<ParameterPoolKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter-pool");

    /**
     * Name of the configuration value pool
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Create a range of values to populate the pool with
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range</code> <code>range</code>, or <code>null</code> if not present
     */
    @Nullable
    Range getRange();
    
    @Override
    ParameterPoolKey key();

}

