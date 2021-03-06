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
package osm5.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

/**
 * List of xpaths to parameters inside the NSDthe can be customized during the 
 * instantiation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list input-parameter-xpath {
 *   key xpath;
 *   leaf xpath {
 *     type string;
 *   }
 *   leaf label {
 *     type string;
 *   }
 *   leaf default-value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter-xpath/input-parameter-xpath</i>
 * 
 * <p>To create instances of this class use {@link InputParameterXpathBuilder}.
 * @see InputParameterXpathBuilder
 * @see InputParameterXpathKey
 *
 */
public interface InputParameterXpath
    extends
    ChildOf<osm5.ns.yang.nfvo.mano.types.rev170208.InputParameterXpath>,
    Augmentable<InputParameterXpath>,
    Identifiable<InputParameterXpathKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter-xpath");

    /**
     * An xpath that specifies the element in a descriptor.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>xpath</code>, or <code>null</code> if not present
     */
    @Nullable
    String getXpath();
    
    /**
     * A descriptive string
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    @Nullable
    String getLabel();
    
    /**
     * Default Value for the Input Parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultValue</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDefaultValue();
    
    @Override
    InputParameterXpathKey key();

}

