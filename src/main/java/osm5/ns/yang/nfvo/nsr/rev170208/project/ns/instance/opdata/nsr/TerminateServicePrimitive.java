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
package osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.EventServicePrimitive;
import osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;

/**
 * Set of service primitives toexecute during termination of NSD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list terminate-service-primitive {
 *   key seq;
 *   uses event-service-primitive;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/terminate-service-primitive</i>
 * 
 * <p>To create instances of this class use {@link TerminateServicePrimitiveBuilder}.
 * @see TerminateServicePrimitiveBuilder
 * @see TerminateServicePrimitiveKey
 *
 */
public interface TerminateServicePrimitive
    extends
    ChildOf<Nsr>,
    Augmentable<TerminateServicePrimitive>,
    EventServicePrimitive,
    Identifiable<TerminateServicePrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("terminate-service-primitive");

    @Override
    TerminateServicePrimitiveKey key();

}

