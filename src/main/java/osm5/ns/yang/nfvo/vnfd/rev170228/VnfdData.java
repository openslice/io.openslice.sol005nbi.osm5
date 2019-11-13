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
package osm5.ns.yang.nfvo.vnfd.rev170228;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * module vnfd {
 *   namespace urn:ietf:params:xml:ns:yang:nfvo:vnfd;
 *   prefix vnfd;
 *   import vnfd-base {
 *     prefix vnfd-base;
 *   }
 *   revision 2017-02-28 {
 *   }
 *   revision 2015-09-10 {
 *   }
 *   container vnfd-catalog {
 *     leaf schema-version {
 *       type string;
 *       default v3.0;
 *     }
 *     list vnfd {
 *       key id;
 *       uses vnfd-base:vnfd-descriptor;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface VnfdData
    extends
    DataRoot
{




    /**
     * Virtual Network Function Descriptor (VNFD).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev170228.VnfdCatalog</code> <code>vnfdCatalog</code>, or <code>null</code> if not present
     */
    @Nullable
    VnfdCatalog getVnfdCatalog();

}

