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
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.ui.primitive.group.ParameterGroup;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ui-primitive-group {
 *   list parameter-group {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       uses manotypes:primitive-parameter;
 *     }
 *     leaf mandatory {
 *       type boolean;
 *       default true;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ui-primitive-group</i>
 *
 */
public interface UiPrimitiveGroup
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ui-primitive-group");

    /**
     * Grouping of parameters which are logically grouped in UI
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ParameterGroup> getParameterGroup();

}

