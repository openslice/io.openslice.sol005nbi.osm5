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
 * grouping vswitch-epa {
 *   container vswitch-epa {
 *     leaf ovs-acceleration {
 *       type enumeration {
 *         enum MANDATORY;
 *         enum PREFERRED;
 *         enum DISABLED;
 *       }
 *     }
 *     leaf ovs-offload {
 *       type enumeration {
 *         enum MANDATORY;
 *         enum PREFERRED;
 *         enum DISABLED;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vswitch-epa</i>
 *
 */
public interface VswitchEpa
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vswitch-epa");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa</code> <code>vswitchEpa</code>, or <code>null</code> if not present
     */
    @Nullable
    osm5.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa getVswitchEpa();

}

