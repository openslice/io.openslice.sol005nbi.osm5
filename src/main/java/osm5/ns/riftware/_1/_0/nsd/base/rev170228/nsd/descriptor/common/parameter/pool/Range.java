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
package osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.parameter.pool;
import java.lang.Long;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.ParameterPool;

/**
 * Create a range of values to populate the pool with
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * container range {
 *   leaf start-value {
 *     type uint32;
 *   }
 *   leaf end-value {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/parameter-pool/range</i>
 * 
 * <p>To create instances of this class use {@link RangeBuilder}.
 * @see RangeBuilder
 *
 */
public interface Range
    extends
    ChildOf<ParameterPool>,
    Augmentable<Range>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("range");

    /**
     * Generated pool values start at this value
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>startValue</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getStartValue();
    
    /**
     * Generated pool values stop at this value
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>endValue</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getEndValue();

}

