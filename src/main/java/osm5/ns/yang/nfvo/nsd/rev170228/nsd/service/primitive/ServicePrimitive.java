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
package osm5.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.UiPrimitiveGroup;
import osm5.ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdServicePrimitive;
import osm5.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.service.primitive.Parameter;
import osm5.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.service.primitive.VnfPrimitiveGroup;

/**
 * Network service level service primitives.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list service-primitive {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list parameter {
 *     key name;
 *     uses manotypes:primitive-parameter;
 *   }
 *   uses manotypes:ui-primitive-group;
 *   list vnf-primitive-group {
 *     key member-vnf-index-ref;
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *       }
 *     }
 *     leaf vnfd-name {
 *       type leafref {
 *         path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:name";
 *       }
 *     }
 *     list primitive {
 *       key index;
 *       leaf index {
 *         type uint32;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *     }
 *   }
 *   leaf user-defined-script {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-service-primitive/service-primitive</i>
 * 
 * <p>To create instances of this class use {@link ServicePrimitiveBuilder}.
 * @see ServicePrimitiveBuilder
 * @see ServicePrimitiveKey
 *
 */
public interface ServicePrimitive
    extends
    ChildOf<NsdServicePrimitive>,
    Augmentable<ServicePrimitive>,
    UiPrimitiveGroup,
    Identifiable<ServicePrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("service-primitive");

    /**
     * Name of the service primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * List of parameters for the service primitive.
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Parameter> getParameter();
    
    /**
     * List of service primitives grouped by VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfPrimitiveGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfPrimitiveGroup> getVnfPrimitiveGroup();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    @Nullable
    String getUserDefinedScript();
    
    @Override
    ServicePrimitiveKey key();

}

