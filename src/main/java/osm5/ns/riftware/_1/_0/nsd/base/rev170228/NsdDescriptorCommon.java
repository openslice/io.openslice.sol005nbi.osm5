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
package osm5.ns.riftware._1._0.nsd.base.rev170228;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.ConnectionPoint;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.KeyPair;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.ParameterPool;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.TerminateServicePrimitive;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.User;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.Vnffgd;
import osm5.ns.yang.nfvo.mano.types.rev170208.InputParameterXpath;
import osm5.ns.yang.nfvo.mano.types.rev170208.IpProfileList;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping nsd-descriptor-common {
 *   leaf id {
 *     type string {
 *       length 1..63;
 *     }
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf vendor {
 *     type string;
 *   }
 *   leaf logo {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   list connection-point {
 *     key name;
 *     uses nsd-connection-point-common;
 *     leaf type {
 *       type manotypes:connection-point-type;
 *     }
 *     choice connection {
 *       case vld-ref {
 *         leaf vld-id-ref {
 *           type string;
 *         }
 *       }
 *       case vnfd-connection-point-ref {
 *         leaf member-vnf-index-ref {
 *           type string;
 *         }
 *         leaf vnfd-id-ref {
 *           type leafref {
 *             path "../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *           }
 *         }
 *         leaf vnfd-connection-point-ref {
 *           type leafref {
 *             path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *           }
 *         }
 *       }
 *     }
 *   }
 *   list scaling-group-descriptor {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list scaling-policy {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf scaling-type {
 *         type manotypes:scaling-policy-type;
 *       }
 *       leaf enabled {
 *         type boolean;
 *         default true;
 *       }
 *       leaf scale-in-operation-type {
 *         type manotypes:scaling-criteria-operation;
 *         default AND;
 *       }
 *       leaf scale-out-operation-type {
 *         type manotypes:scaling-criteria-operation;
 *         default OR;
 *       }
 *       leaf threshold-time {
 *         type uint32;
 *       }
 *       leaf cooldown-time {
 *         type uint32;
 *       }
 *       list scaling-criteria {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf scale-in-threshold {
 *           type uint64;
 *         }
 *         leaf scale-in-relational-operation {
 *           type manotypes:relational-operation-type;
 *           default LE;
 *         }
 *         leaf scale-out-threshold {
 *           type uint64;
 *         }
 *         leaf scale-out-relational-operation {
 *           type manotypes:relational-operation-type;
 *           default GE;
 *         }
 *         leaf ns-monitoring-param-ref {
 *           type string;
 *         }
 *       }
 *     }
 *     list vnfd-member {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf count {
 *         type uint32;
 *         default 1;
 *       }
 *     }
 *     leaf min-instance-count {
 *       type uint32;
 *       default 0;
 *     }
 *     leaf max-instance-count {
 *       type uint32;
 *       default 10;
 *     }
 *     list scaling-config-action {
 *       key trigger;
 *       leaf trigger {
 *         type manotypes:scaling-trigger;
 *       }
 *       leaf ns-service-primitive-name-ref {
 *         type string;
 *       }
 *     }
 *   }
 *   list vnffgd {
 *     key id;
 *     uses fgd-common;
 *     list rsp {
 *       key id;
 *       uses rsp-common;
 *       list vnfd-connection-point-ref {
 *         key member-vnf-index-ref;
 *         leaf member-vnf-index-ref {
 *           type string;
 *         }
 *         leaf order {
 *           type uint8;
 *         }
 *         leaf vnfd-id-ref {
 *           type leafref {
 *             path "../../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *           }
 *         }
 *         leaf vnfd-ingress-connection-point-ref {
 *           type string;
 *         }
 *         leaf vnfd-egress-connection-point-ref {
 *           type string;
 *         }
 *       }
 *     }
 *     list classifier {
 *       key id;
 *       uses classifier-common;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf vnfd-connection-point-ref {
 *         type string;
 *       }
 *     }
 *   }
 *   uses manotypes:ip-profile-list;
 *   list initial-service-primitive {
 *     key seq;
 *     uses manotypes:event-config;
 *   }
 *   list terminate-service-primitive {
 *     key seq;
 *     uses manotypes:event-config;
 *   }
 *   uses manotypes:input-parameter-xpath;
 *   list parameter-pool {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     container range {
 *       leaf start-value {
 *         type uint32;
 *       }
 *       leaf end-value {
 *         type uint32;
 *       }
 *     }
 *   }
 *   list key-pair {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf key {
 *       type string;
 *     }
 *   }
 *   list user {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf user-info {
 *       type string;
 *     }
 *     list key-pair {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf key {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common</i>
 *
 */
public interface NsdDescriptorCommon
    extends
    DataObject,
    IpProfileList,
    InputParameterXpath
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-descriptor-common");

    /**
     * Identifier for the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * NSD name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getShortName();
    
    /**
     * Vendor of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVendor();
    
    /**
     * File path for the vendor specific logo. For example icons/mylogo.png.The logo 
     * should be part of the network service
     *
     *
     *
     * @return <code>java.lang.String</code> <code>logo</code>, or <code>null</code> if not present
     */
    @Nullable
    String getLogo();
    
    /**
     * Description of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * Version of the NSD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVersion();
    
    /**
     * List for external connection points.Each NS has one or more external 
     * connectionpoints. As the name implies that externalconnection points are used 
     * for connectingthe NS to other NS or to external networks.Each NS exposes these 
     * connection points tothe orchestrator. The orchestrator canconstruct network 
     * service chains byconnecting the connection points betweendifferent NS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ConnectionPoint> getConnectionPoint();
    
    /**
     * scaling group descriptor within this network service.The scaling group defines a
     * group of VNFs,and the ratio of VNFs in the network servicethat is used as target
     * for scaling action
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingGroupDescriptor</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ScalingGroupDescriptor> getScalingGroupDescriptor();
    
    /**
     * List of VNF Forwarding Graph Descriptors (VNFFGD).
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnffgd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnffgd> getVnffgd();
    
    /**
     * Initial set of service primitives for NSD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>initialServicePrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InitialServicePrimitive> getInitialServicePrimitive();
    
    /**
     * Set of service primitives duringtermination for NSD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>terminateServicePrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<TerminateServicePrimitive> getTerminateServicePrimitive();
    
    /**
     * Pool of parameter values which must bepulled from during configuration
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterPool</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ParameterPool> getParameterPool();
    
    /**
     * Used to configure the list of public keys to be injected as partof ns 
     * instantiation
     *
     *
     *
     * @return <code>java.util.List</code> <code>keyPair</code>, or <code>null</code> if not present
     */
    @Nullable
    List<KeyPair> getKeyPair();
    
    /**
     * List of users to be added through cloud-config
     *
     *
     *
     * @return <code>java.util.List</code> <code>user</code>, or <code>null</code> if not present
     */
    @Nullable
    List<User> getUser();

}

