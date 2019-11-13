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
package osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads;
import java.lang.Short;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;
import osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads.PairedThreadIds;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container paired-threads {
 *   leaf num-paired-threads {
 *     type uint8;
 *   }
 *   list paired-thread-ids {
 *     max-elements 16;
 *     key thread-a;
 *     leaf thread-a {
 *       type uint8;
 *     }
 *     leaf thread-b {
 *       type uint8;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type/paired-threads/paired-threads</i>
 * 
 * <p>To create instances of this class use {@link PairedThreadsBuilder}.
 * @see PairedThreadsBuilder
 *
 */
public interface PairedThreads
    extends
    ChildOf<Node>,
    Augmentable<PairedThreads>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("paired-threads");

    /**
     * @return <code>java.lang.Short</code> <code>numPairedThreads</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getNumPairedThreads();
    
    /**
     * List of thread pairs to use in case of paired-thread NUMA
     *
     *
     *
     * @return <code>java.util.List</code> <code>pairedThreadIds</code>, or <code>null</code> if not present
     */
    @Nullable
    List<PairedThreadIds> getPairedThreadIds();

}

