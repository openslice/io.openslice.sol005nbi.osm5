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
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.vnfd.rev170228.vnfd.catalog.Vnfd;

/**
 * Virtual Network Function Descriptor (VNFD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * container vnfd-catalog {
 *   leaf schema-version {
 *     type string;
 *     default v3.0;
 *   }
 *   list vnfd {
 *     key id;
 *     uses vnfd-base:vnfd-descriptor;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd/vnfd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnfdCatalogBuilder}.
 * @see VnfdCatalogBuilder
 *
 */
public interface VnfdCatalog
    extends
    ChildOf<VnfdData>,
    Augmentable<VnfdCatalog>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-catalog");

    /**
     * Schema version for the VNFD. If unspecified, it assumes v3.0
     *
     *
     *
     * @return <code>java.lang.String</code> <code>schemaVersion</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSchemaVersion();
    
    /**
     * @return <code>java.util.List</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnfd> getVnfd();

}

