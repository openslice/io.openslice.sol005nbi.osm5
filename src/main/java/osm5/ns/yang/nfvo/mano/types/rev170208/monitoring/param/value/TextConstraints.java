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
package osm5.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value;
import java.lang.Short;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container text-constraints {
 *   leaf min-length {
 *     type uint8;
 *   }
 *   leaf max-length {
 *     type uint8;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param-value/text-constraints</i>
 * 
 * <p>To create instances of this class use {@link TextConstraintsBuilder}.
 * @see TextConstraintsBuilder
 *
 */
public interface TextConstraints
    extends
    ChildOf<MonitoringParamValue>,
    Augmentable<TextConstraints>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("text-constraints");

    /**
     * Minimum string length for the parameter
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>minLength</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getMinLength();
    
    /**
     * Maximum string length for the parameter
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxLength</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getMaxLength();

}

