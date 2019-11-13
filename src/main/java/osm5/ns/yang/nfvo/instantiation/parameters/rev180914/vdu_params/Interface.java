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
package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.vdu_params;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu.InterfaceBuilder.InterfaceImpl;
import osm5.ns.yang.ietf.inet.types.rev130715.IpAddress;
import osm5.ns.yang.ietf.yang.types.rev130715.MacAddress;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.VduParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list interface {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 *   leaf mac-address {
 *     type ietf-yang:mac-address;
 *   }
 *   leaf floating-ip-required {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vdu_params/interface</i>
 * 
 * <p>To create instances of this class use {@link InterfaceBuilder}.
 * @see InterfaceBuilder
 * @see InterfaceKey
 *
 */
@JsonDeserialize(as = InterfaceImpl.class)
//@JsonIgnoreProperties( {"external-connection-point-ref"} )
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Interface
    extends
    ChildOf<VduParams>,
    Augmentable<Interface>,
    Identifiable<InterfaceKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("interface");

    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getIpAddress();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    MacAddress getMacAddress();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>floatingIpRequired</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isFloatingIpRequired();
    
    @Override
    InterfaceKey key();

}

