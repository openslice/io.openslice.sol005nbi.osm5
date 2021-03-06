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

import osm5.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts;
import osm5.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.InternalPorts;
import osm5.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Memory;
import osm5.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network;
import osm5.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Storage;
import osm5.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping nfvi-metrics {
 *   container vcpu {
 *     leaf label {
 *       type string;
 *       default VCPU;
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *     leaf utilization {
 *       type decimal64 {
 *         fraction-digits 2;
 *         range "0 .. 100";
 *       }
 *     }
 *   }
 *   container memory {
 *     leaf label {
 *       type string;
 *       default MEMORY;
 *     }
 *     leaf used {
 *       type uint64;
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *     leaf utilization {
 *       type decimal64 {
 *         fraction-digits 2;
 *         range "0 .. 100";
 *       }
 *     }
 *   }
 *   container storage {
 *     leaf label {
 *       type string;
 *       default STORAGE;
 *     }
 *     leaf used {
 *       type uint64;
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *     leaf utilization {
 *       type decimal64 {
 *         fraction-digits 2;
 *         range "0 .. 100";
 *       }
 *     }
 *   }
 *   container external-ports {
 *     leaf label {
 *       type string;
 *       default "EXTERNAL PORTS";
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *   }
 *   container internal-ports {
 *     leaf label {
 *       type string;
 *       default "INTERNAL PORTS";
 *     }
 *     leaf total {
 *       type uint64;
 *     }
 *   }
 *   container network {
 *     leaf label {
 *       type string;
 *       default "NETWORK TRAFFIC";
 *     }
 *     container incoming {
 *       leaf label {
 *         type string;
 *         default "INCOMING NETWORK TRAFFIC";
 *       }
 *       leaf bytes {
 *         type uint64;
 *       }
 *       leaf packets {
 *         type uint64;
 *       }
 *       leaf byte-rate {
 *         type decimal64 {
 *           fraction-digits 2;
 *         }
 *       }
 *       leaf packet-rate {
 *         type decimal64 {
 *           fraction-digits 2;
 *         }
 *       }
 *     }
 *     container outgoing {
 *       leaf label {
 *         type string;
 *         default "OUTGOING NETWORK TRAFFIC";
 *       }
 *       leaf bytes {
 *         type uint64;
 *       }
 *       leaf packets {
 *         type uint64;
 *       }
 *       leaf byte-rate {
 *         type decimal64 {
 *           fraction-digits 2;
 *         }
 *       }
 *       leaf packet-rate {
 *         type decimal64 {
 *           fraction-digits 2;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics</i>
 *
 */
public interface NfviMetrics
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nfvi-metrics");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu</code> <code>vcpu</code>, or <code>null</code> if not present
     */
    @Nullable
    Vcpu getVcpu();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Memory</code> <code>memory</code>, or <code>null</code> if not present
     */
    @Nullable
    Memory getMemory();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Storage</code> <code>storage</code>, or <code>null</code> if not present
     */
    @Nullable
    Storage getStorage();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts</code> <code>externalPorts</code>, or <code>null</code> if not present
     */
    @Nullable
    ExternalPorts getExternalPorts();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.InternalPorts</code> <code>internalPorts</code>, or <code>null</code> if not present
     */
    @Nullable
    InternalPorts getInternalPorts();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network</code> <code>network</code>, or <code>null</code> if not present
     */
    @Nullable
    Network getNetwork();

}

