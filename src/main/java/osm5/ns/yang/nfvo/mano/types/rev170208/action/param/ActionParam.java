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
package osm5.ns.yang.nfvo.mano.types.rev170208.action.param;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.inet.types.rev130715.Uri;
import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.HttpMethod;

/**
 * List of action parameters tocontrol VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list action-param {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf group-tag {
 *     type string;
 *   }
 *   leaf url {
 *     type inet:uri;
 *   }
 *   leaf method {
 *     type manotypes:http-method;
 *     default POST;
 *   }
 *   leaf payload {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/action-param/action-param</i>
 * 
 * <p>To create instances of this class use {@link ActionParamBuilder}.
 * @see ActionParamBuilder
 * @see ActionParamKey
 *
 */
public interface ActionParam
    extends
    ChildOf<osm5.ns.yang.nfvo.mano.types.rev170208.ActionParam>,
    Augmentable<ActionParam>,
    Identifiable<ActionParamKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("action-param");

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * A tag to group monitoring parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>groupTag</code>, or <code>null</code> if not present
     */
    @Nullable
    String getGroupTag();
    
    /**
     * This is the URL where to perform the operation
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri</code> <code>url</code>, or <code>null</code> if not present
     */
    @Nullable
    Uri getUrl();
    
    /**
     * This is the method to be performed at the uri.POST by default for action
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HttpMethod</code> <code>method</code>, or <code>null</code> if not present
     */
    @Nullable
    HttpMethod getMethod();
    
    /**
     * This is the operation payload or payload template to be sent inthe data for this
     * operation call
     *
     *
     *
     * @return <code>java.lang.String</code> <code>payload</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPayload();
    
    @Override
    ActionParamKey key();

}

