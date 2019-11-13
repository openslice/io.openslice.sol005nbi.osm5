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
package osm5.ns.yang.nfvo.nst.rev180820;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.FgdCommon;
import osm5.ns.yang.nfvo.nst.rev180820.netslicefgd.Classifier;
import osm5.ns.yang.nfvo.nst.rev180820.netslicefgd.Rsp;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping netslicefgd {
 *   uses nsd-base:fgd-common;
 *   list rsp {
 *     key id;
 *     uses rsp;
 *   }
 *   list classifier {
 *     key id;
 *     uses classifier;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/netslicefgd</i>
 *
 */
public interface Netslicefgd
    extends
    DataObject,
    FgdCommon
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslicefgd");

    /**
     * List of Rendered Service Paths (RSP).
     *
     *
     *
     * @return <code>java.util.List</code> <code>rsp</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Rsp> getRsp();
    
    /**
     * List of classifier rules.
     *
     *
     *
     * @return <code>java.util.List</code> <code>classifier</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Classifier> getClassifier();

}

