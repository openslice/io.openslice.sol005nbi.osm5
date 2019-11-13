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
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * NSD connection point base
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping nsd-connection-point-common {
 *   leaf name {
 *     type string;
 *   }
 *   leaf floating-ip-required {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-connection-point-common</i>
 *
 */
public interface NsdConnectionPointCommon
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-connection-point-common");

    /**
     * Name of the connection point.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Boolean parameter to indicate whether the CP must be exposed.A public IP address
     * will be allocated to this CP if exposed is true.The default is false meaning a 
     * floating IP address is not required.It must be explicitly asked for a floating 
     * IP address to be allocated.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>floatingIpRequired</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isFloatingIpRequired();

}

