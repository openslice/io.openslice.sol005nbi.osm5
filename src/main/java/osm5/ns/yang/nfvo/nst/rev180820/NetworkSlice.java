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
package osm5.ns.yang.nfvo.nst.rev180820;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.network.slice.NetsliceConnectionPoint;
import osm5.ns.yang.nfvo.nst.rev180820.network.slice.NetsliceSubnet;
import osm5.ns.yang.nfvo.nst.rev180820.network.slice.NetsliceVld;
import osm5.ns.yang.nfvo.nst.rev180820.network.slice.Netslicefgd;
import osm5.ns.yang.nfvo.nst.rev180820.network.slice.QualityOfService;
import osm5.ns.yang.nfvo.nst.rev180820.network.slice.SNSSAIIdentifier;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping network-slice {
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   container SNSSAI-identifier {
 *     uses snssai;
 *   }
 *   container quality-of-service {
 *     uses five-qi;
 *   }
 *   list netslice-subnet {
 *     key id;
 *     uses netslice-subnet;
 *   }
 *   list netslice-connection-point {
 *     key name;
 *     uses slice-connection-points;
 *   }
 *   list netslice-vld {
 *     key id;
 *     uses nsvld;
 *   }
 *   list netslicefgd {
 *     key id;
 *     uses netslicefgd;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice</i>
 *
 */
public interface NetworkSlice
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network-slice");

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nst.rev180820.network.slice.SNSSAIIdentifier</code> <code>sNSSAIIdentifier</code>, or <code>null</code> if not present
     */
    @Nullable
    SNSSAIIdentifier getSNSSAIIdentifier();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nst.rev180820.network.slice.QualityOfService</code> <code>qualityOfService</code>, or <code>null</code> if not present
     */
    @Nullable
    QualityOfService getQualityOfService();
    
    /**
     * @return <code>java.util.List</code> <code>netsliceSubnet</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NetsliceSubnet> getNetsliceSubnet();
    
    /**
     * @return <code>java.util.List</code> <code>netsliceConnectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NetsliceConnectionPoint> getNetsliceConnectionPoint();
    
    /**
     * @return <code>java.util.List</code> <code>netsliceVld</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NetsliceVld> getNetsliceVld();
    
    /**
     * @return <code>java.util.List</code> <code>netslicefgd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Netslicefgd> getNetslicefgd();

}

