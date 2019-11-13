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
package osm5.ns.yang.nfvo.mano.types.rev170208.ip.profile.list;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo;
import osm5.ns.yang.nfvo.mano.types.rev170208.IpProfileList;

/**
 * List of IP Profiles. IP Profile describes the IP characteristics for the 
 * Virtual-Link
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list ip-profiles {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   uses ip-profile-info;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-list/ip-profiles</i>
 * 
 * <p>To create instances of this class use {@link IpProfilesBuilder}.
 * @see IpProfilesBuilder
 * @see IpProfilesKey
 *
 */
public interface IpProfiles
    extends
    ChildOf<IpProfileList>,
    Augmentable<IpProfiles>,
    IpProfileInfo,
    Identifiable<IpProfilesKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profiles");

    /**
     * Name of the IP-Profile
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Description for IP profile
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    @Override
    IpProfilesKey key();

}

