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
package osm5.ns.yang.nfvo.mano.types.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping host-epa {
 *   container host-epa {
 *     leaf cpu-model {
 *       type enumeration {
 *         enum PREFER_WESTMERE;
 *         enum REQUIRE_WESTMERE;
 *         enum PREFER_SANDYBRIDGE;
 *         enum REQUIRE_SANDYBRIDGE;
 *         enum PREFER_IVYBRIDGE;
 *         enum REQUIRE_IVYBRIDGE;
 *         enum PREFER_HASWELL;
 *         enum REQUIRE_HASWELL;
 *         enum PREFER_BROADWELL;
 *         enum REQUIRE_BROADWELL;
 *         enum PREFER_NEHALEM;
 *         enum REQUIRE_NEHALEM;
 *         enum PREFER_PENRYN;
 *         enum REQUIRE_PENRYN;
 *         enum PREFER_CONROE;
 *         enum REQUIRE_CONROE;
 *         enum PREFER_CORE2DUO;
 *         enum REQUIRE_CORE2DUO;
 *       }
 *     }
 *     leaf cpu-arch {
 *       type enumeration {
 *         enum PREFER_X86;
 *         enum REQUIRE_X86;
 *         enum PREFER_X86_64;
 *         enum REQUIRE_X86_64;
 *         enum PREFER_I686;
 *         enum REQUIRE_I686;
 *         enum PREFER_IA64;
 *         enum REQUIRE_IA64;
 *         enum PREFER_ARMV7;
 *         enum REQUIRE_ARMV7;
 *         enum PREFER_ARMV8;
 *         enum REQUIRE_ARMV8;
 *       }
 *     }
 *     leaf cpu-vendor {
 *       type enumeration {
 *         enum PREFER_INTEL;
 *         enum REQUIRE_INTEL;
 *         enum PREFER_AMD;
 *         enum REQUIRE_AMD;
 *       }
 *     }
 *     leaf cpu-socket-count {
 *       type uint64;
 *     }
 *     leaf cpu-core-count {
 *       type uint64;
 *     }
 *     leaf cpu-core-thread-count {
 *       type uint64;
 *     }
 *     list cpu-feature {
 *       key feature;
 *       leaf feature {
 *         type cpu-feature-type;
 *       }
 *     }
 *     leaf om-cpu-model-string {
 *       type string;
 *     }
 *     list om-cpu-feature {
 *       key feature;
 *       leaf feature {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-epa</i>
 *
 */
public interface HostEpa
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("host-epa");

    /**
     * Specifies the host level EPA attributes.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa</code> <code>hostEpa</code>, or <code>null</code> if not present
     */
    @Nullable
    osm5.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa getHostEpa();

}

