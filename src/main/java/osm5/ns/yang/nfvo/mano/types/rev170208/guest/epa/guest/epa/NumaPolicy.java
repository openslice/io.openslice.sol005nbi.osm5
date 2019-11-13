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
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice numa-policy {
 *   case numa-unaware {
 *     leaf numa-unaware {
 *       type empty;
 *     }
 *   }
 *   case numa-aware {
 *     container numa-node-policy {
 *       leaf node-cnt {
 *         type uint16;
 *       }
 *       leaf mem-policy {
 *         type enumeration {
 *           enum STRICT;
 *           enum PREFERRED;
 *         }
 *       }
 *       list node {
 *         key id;
 *         leaf id {
 *           type uint64;
 *         }
 *         list vcpu {
 *           key id;
 *           leaf id {
 *             type uint64;
 *           }
 *         }
 *         leaf memory-mb {
 *           type uint64;
 *         }
 *         choice om-numa-type {
 *           case cores {
 *             leaf num-cores {
 *               type uint8;
 *             }
 *           }
 *           case paired-threads {
 *             container paired-threads {
 *               leaf num-paired-threads {
 *                 type uint8;
 *               }
 *               list paired-thread-ids {
 *                 max-elements 16;
 *                 key thread-a;
 *                 leaf thread-a {
 *                   type uint8;
 *                 }
 *                 leaf thread-b {
 *                   type uint8;
 *                 }
 *               }
 *             }
 *           }
 *           case threads {
 *             leaf num-threads {
 *               type uint8;
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy</i>
 *
 */
public interface NumaPolicy
    extends
    ChoiceIn<GuestEpa>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("numa-policy");


}

