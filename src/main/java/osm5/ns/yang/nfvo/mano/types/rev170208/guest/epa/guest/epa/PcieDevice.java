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
package osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa;

/**
 * List of pcie passthrough devices.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list pcie-device {
 *   key device-id;
 *   leaf device-id {
 *     type string;
 *   }
 *   leaf count {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/pcie-device</i>
 * 
 * <p>To create instances of this class use {@link PcieDeviceBuilder}.
 * @see PcieDeviceBuilder
 * @see PcieDeviceKey
 *
 */
public interface PcieDevice
    extends
    ChildOf<GuestEpa>,
    Augmentable<PcieDevice>,
    Identifiable<PcieDeviceKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("pcie-device");

    /**
     * Device identifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>deviceId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDeviceId();
    
    /**
     * Number of devices to attach to the VM.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getCount();
    
    @Override
    PcieDeviceKey key();

}

