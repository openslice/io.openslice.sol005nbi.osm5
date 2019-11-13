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
 * Initial set of service primitives for NSD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list initial-service-primitive {
 *   key seq;
 *   uses event-service-primitive;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/initial-service-primitive</i>
 * 
 * <p>To create instances of this class use {@link InitialServicePrimitiveBuilder}.
 * @see InitialServicePrimitiveBuilder
 * @see InitialServicePrimitiveKey
 *
 */
public interface InitialServicePrimitive
    extends
    ChildOf<Nsr>,
    Augmentable<InitialServicePrimitive>,
    EventServicePrimitive,
    Identifiable<InitialServicePrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("initial-service-primitive");

    @Override
    InitialServicePrimitiveKey key();

}

