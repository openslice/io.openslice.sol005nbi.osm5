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
package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.scaling.group.descriptor;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.ScalingGroupDescriptor;
import osm5.ns.yang.nfvo.mano.types.rev170208.ScalingTrigger;

/**
 * List of scaling config actions
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list scaling-config-action {
 *   key trigger;
 *   leaf trigger {
 *     type manotypes:scaling-trigger;
 *   }
 *   leaf vnf-config-primitive-name-ref {
 *     type leafref {
 *       path ../../../vnf-configuration/config-primitive/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/scaling-group-descriptor/scaling-config-action</i>
 * 
 * <p>To create instances of this class use {@link ScalingConfigActionBuilder}.
 * @see ScalingConfigActionBuilder
 * @see ScalingConfigActionKey
 *
 */
public interface ScalingConfigAction
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<ScalingConfigAction>,
    Identifiable<ScalingConfigActionKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-config-action");

    /**
     * scaling trigger
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ScalingTrigger</code> <code>trigger</code>, or <code>null</code> if not present
     */
    @Nullable
    ScalingTrigger getTrigger();
    
    /**
     * Reference to the VNF config primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfConfigPrimitiveNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfConfigPrimitiveNameRef();
    
    @Override
    ScalingConfigActionKey key();

}

