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
package osm5.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics;
import java.lang.String;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.NfviMetrics;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container memory {
 *   leaf label {
 *     type string;
 *     default MEMORY;
 *   }
 *   leaf used {
 *     type uint64;
 *   }
 *   leaf total {
 *     type uint64;
 *   }
 *   leaf utilization {
 *     type decimal64 {
 *       fraction-digits 2;
 *       range "0 .. 100";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/memory</i>
 * 
 * <p>To create instances of this class use {@link MemoryBuilder}.
 * @see MemoryBuilder
 *
 */
public interface Memory
    extends
    ChildOf<NfviMetrics>,
    Augmentable<Memory>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("memory");

    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    @Nullable
    String getLabel();
    
    /**
     * The amount of memory (bytes) currently in use.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>used</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getUsed();
    
    /**
     * The amount of memory (bytes) available.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>total</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getTotal();
    
    /**
     * The memory utilization (percentage).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>utilization</code>, or <code>null</code> if not present
     */
    @Nullable
    BigDecimal getUtilization();

}

