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
package osm5.ns.yang.nfvo.nsr.rev170208;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.yang.types.rev130715.Uuid;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * output {
 *   leaf nsr-id {
 *     type yang:uuid;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/output</i>
 * 
 * <p>To create instances of this class use {@link StartNetworkServiceOutputBuilder}.
 * @see StartNetworkServiceOutputBuilder
 *
 */
public interface StartNetworkServiceOutput
    extends
    RpcOutput,
    Augmentable<StartNetworkServiceOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * Automatically generated parameter
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsrId</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getNsrId();

}

