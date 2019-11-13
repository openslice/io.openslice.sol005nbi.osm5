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
package osm5.ns.yang.nfvo.vnffgd.rev170208.project;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.vnffgd.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.vnffgd.rev170208.Project1;
import osm5.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnffgd</b>
 * <pre>
 * container vnffgd-catalog {
 *   list vnffgd {
 *     key id;
 *     leaf name {
 *       type string;
 *     }
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf provider {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf version {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnffgd/project/(urn:ietf:params:xml:ns:yang:nfvo:vnffgd?revision=2017-02-08)vnffgd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnffgdCatalogBuilder}.
 * @see VnffgdCatalogBuilder
 *
 */
public interface VnffgdCatalog
    extends
    ChildOf<Project1>,
    Augmentable<VnffgdCatalog>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd-catalog");

    /**
     * @return <code>java.util.List</code> <code>vnffgd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnffgd> getVnffgd();

}

