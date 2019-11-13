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
package osm5.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.rift.groupings.norev.$YangModuleInfoImpl;

/**
 * SSH key pair generated for this NS
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-rift-groupings</b>
 * <pre>
 * container ssh-key-generated {
 *   leaf public-key {
 *     type string;
 *   }
 *   leaf private-key-file {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-rift-groupings/ssh-key-generated/ssh-key-generated</i>
 * 
 * <p>To create instances of this class use {@link SshKeyGeneratedBuilder}.
 * @see SshKeyGeneratedBuilder
 *
 */
public interface SshKeyGenerated
    extends
    ChildOf<osm5.ns.yang.nfvo.mano.rift.groupings.norev.SshKeyGenerated>,
    Augmentable<SshKeyGenerated>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ssh-key-generated");

    /**
     * Public key generated
     *
     *
     *
     * @return <code>java.lang.String</code> <code>publicKey</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPublicKey();
    
    /**
     * Path to the private key file
     *
     *
     *
     * @return <code>java.lang.String</code> <code>privateKeyFile</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPrivateKeyFile();

}

