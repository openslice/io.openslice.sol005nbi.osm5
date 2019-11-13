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
package osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads;
import java.lang.Override;
import java.lang.Short;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads;

/**
 * List of thread pairs to use in case of paired-thread NUMA
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list paired-thread-ids {
 *   max-elements 16;
 *   key thread-a;
 *   leaf thread-a {
 *     type uint8;
 *   }
 *   leaf thread-b {
 *     type uint8;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type/paired-threads/paired-threads/paired-thread-ids</i>
 * 
 * <p>To create instances of this class use {@link PairedThreadIdsBuilder}.
 * @see PairedThreadIdsBuilder
 * @see PairedThreadIdsKey
 *
 */
public interface PairedThreadIds
    extends
    ChildOf<PairedThreads>,
    Augmentable<PairedThreadIds>,
    Identifiable<PairedThreadIdsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("paired-thread-ids");

    /**
     * @return <code>java.lang.Short</code> <code>threadA</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getThreadA();
    
    /**
     * @return <code>java.lang.Short</code> <code>threadB</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getThreadB();
    
    @Override
    PairedThreadIdsKey key();

}

