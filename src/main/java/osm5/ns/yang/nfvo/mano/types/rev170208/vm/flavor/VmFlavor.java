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
package osm5.ns.yang.nfvo.mano.types.rev170208.vm.flavor;
import java.lang.Integer;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavorBuilder.VmFlavorImpl;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container vm-flavor {
 *   leaf vcpu-count {
 *     type uint16;
 *   }
 *   leaf memory-mb {
 *     type uint64;
 *   }
 *   leaf storage-gb {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vm-flavor/vm-flavor</i>
 * 
 * <p>To create instances of this class use {@link VmFlavorBuilder}.
 * @see VmFlavorBuilder
 *
 */
@JsonDeserialize(as =VmFlavorImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface VmFlavor
    extends
    ChildOf<osm5.ns.yang.nfvo.mano.types.rev170208.VmFlavor>,
    Augmentable<VmFlavor>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vm-flavor");

    /**
     * Number of VCPUs for the VM.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>vcpuCount</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getVcpuCount();
    
    /**
     * Amount of memory in MB.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memoryMb</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getMemoryMb();
    
    /**
     * Amount of disk space in GB.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>storageGb</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getStorageGb();

}

