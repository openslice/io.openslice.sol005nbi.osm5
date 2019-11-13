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
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input {
 *   leaf name {
 *     type string;
 *   }
 *   uses rpc-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/input</i>
 * 
 * <p>To create instances of this class use {@link GetNsServicePrimitiveValuesInputBuilder}.
 * @see GetNsServicePrimitiveValuesInputBuilder
 *
 */
public interface GetNsServicePrimitiveValuesInput
    extends
    RpcCommon,
    RpcInput,
    Augmentable<GetNsServicePrimitiveValuesInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * Name of the NS service primitive group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();

}

