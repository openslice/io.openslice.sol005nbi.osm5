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
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping monitoring-param-ui-data {
 *   leaf description {
 *     type string;
 *   }
 *   leaf group-tag {
 *     type string;
 *   }
 *   leaf widget-type {
 *     type manotypes:widget-type;
 *     default COUNTER;
 *   }
 *   leaf units {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param-ui-data</i>
 *
 */
public interface MonitoringParamUiData
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param-ui-data");

    /**
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * A tag to group monitoring parameters
     *
     *
     *
     * @return <code>java.lang.String</code> <code>groupTag</code>, or <code>null</code> if not present
     */
    @Nullable
    String getGroupTag();
    
    /**
     * Defines the UI Display variant of measured counters.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.WidgetType</code> <code>widgetType</code>, or <code>null</code> if not present
     */
    @Nullable
    WidgetType getWidgetType();
    
    /**
     * Measured Counter Units (e.g., Packets, Kbps, Mbps, etc.)
     *
     *
     *
     * @return <code>java.lang.String</code> <code>units</code>, or <code>null</code> if not present
     */
    @Nullable
    String getUnits();

}

