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
package osm5.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships;

/**
 * List of relations between VCA componets.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list relation {
 *   key "requires provides";
 *   leaf requires {
 *     type string;
 *   }
 *   leaf provides {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-relationships/vca-relationships/relation</i>
 * 
 * <p>To create instances of this class use {@link RelationBuilder}.
 * @see RelationBuilder
 * @see RelationKey
 *
 */
public interface Relation
    extends
    ChildOf<VcaRelationships>,
    Augmentable<Relation>,
    Identifiable<RelationKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("relation");

    /**
     * Name of the required relation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>requires</code>, or <code>null</code> if not present
     */
    @Nullable
    String getRequires();
    
    /**
     * Name of the provided relation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>provides</code>, or <code>null</code> if not present
     */
    @Nullable
    String getProvides();
    
    @Override
    RelationKey key();

}

