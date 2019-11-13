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
package osm5.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;

/**
 * Use custom script for configuring the VNF or VDU.This script is executed in the 
 * context ofOrchestrator (The same system and environmentas the Launchpad).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case script {
 *   container script {
 *     leaf script-type {
 *       type enumeration {
 *         enum rift;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method/script</i>
 *
 */
public interface Script
    extends
    DataObject,
    Augmentable<Script>,
    ConfigMethod
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("script");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script</code> <code>script</code>, or <code>null</code> if not present
     */
    @Nullable
    osm5.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script getScript();

}

