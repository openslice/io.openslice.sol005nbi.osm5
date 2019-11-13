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
package osm5.ns.yang.nfvo.nsi.rev180928;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * module nsi {
 *   yang-version 1;
 *   namespace urn:ietf:params:xml:ns:yang:nfvo:nsi;
 *   prefix nsi;
 *   import nst {
 *     prefix nst;
 *   }
 *   import nsr {
 *     prefix nsr;
 *   }
 *   import rw-project {
 *     prefix rw-project;
 *   }
 *   import netslice-instantiation-parameters {
 *     prefix netslice-instantiation-parameters;
 *   }
 *   import ietf-yang-types {
 *     prefix yang;
 *   }
 *   revision 2018-09-28 {
 *   }
 *   grouping nsi {
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf short-name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf nst-ref {
 *       type leafref {
 *         path /nst:nst/nst:id;
 *       }
 *     }
 *     container instantiation-parameters {
 *       uses netslice-instantiation-parameters:netslice_params;
 *     }
 *     container network-slice-template {
 *       uses nst:network-slice;
 *     }
 *     list nsr-ref-list {
 *       config false;
 *       key nsr-ref;
 *       leaf nsr-ref {
 *         config false;
 *         type leafref {
 *           path /rw-project:project/nsr:ns-instance-opdata/nsr:nsr/nsr:ns-instance-config-ref;
 *         }
 *       }
 *     }
 *     list vlr-list {
 *       config false;
 *       key id;
 *       leaf id {
 *         config false;
 *         type yang:uuid;
 *       }
 *     }
 *   }
 *   list nsi {
 *     key id;
 *     unique name;
 *     uses nsi;
 *   }
 * }
 * </pre>
 *
 */
public interface NsiData
    extends
    DataRoot
{




    /**
     * @return <code>java.util.List</code> <code>nsi</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Nsi> getNsi();

}

