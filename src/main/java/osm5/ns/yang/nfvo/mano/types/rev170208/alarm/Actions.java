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
package osm5.ns.yang.nfvo.mano.types.rev170208.alarm;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.Alarm;
import osm5.ns.yang.nfvo.mano.types.rev170208.alarm.actions.InsufficientData;
import osm5.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Ok;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container actions {
 *   list ok {
 *     key url;
 *     leaf url {
 *       type string;
 *     }
 *   }
 *   list insufficient-data {
 *     key url;
 *     leaf url {
 *       type string;
 *     }
 *   }
 *   list alarm {
 *     key url;
 *     leaf url {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/alarm/actions</i>
 * 
 * <p>To create instances of this class use {@link ActionsBuilder}.
 * @see ActionsBuilder
 *
 */
public interface Actions
    extends
    ChildOf<Alarm>,
    Augmentable<Actions>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("actions");

    /**
     * @return <code>java.util.List</code> <code>ok</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Ok> getOk();
    
    /**
     * @return <code>java.util.List</code> <code>insufficientData</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InsufficientData> getInsufficientData();
    
    /**
     * @return <code>java.util.List</code> <code>alarm</code>, or <code>null</code> if not present
     */
    @Nullable
    List<osm5.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm> getAlarm();

}

