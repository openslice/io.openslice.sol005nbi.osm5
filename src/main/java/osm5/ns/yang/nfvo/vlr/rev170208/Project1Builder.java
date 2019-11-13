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
package osm5.ns.yang.nfvo.vlr.rev170208;
import com.google.common.base.MoreObjects;

import osm5.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Project1Builder} instances.
 * 
 * @see Project1Builder
 *
 */
public class Project1Builder implements Builder<Project1> {

    private VlrCatalog _vlrCatalog;



    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._vlrCatalog = base.getVlrCatalog();
    }


    public VlrCatalog getVlrCatalog() {
        return _vlrCatalog;
    }

    
    public Project1Builder setVlrCatalog(final VlrCatalog value) {
        this._vlrCatalog = value;
        return this;
    }
    

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {
    
        private final VlrCatalog _vlrCatalog;
    
    
        Project1Impl(Project1Builder base) {
            this._vlrCatalog = base.getVlrCatalog();
        }
    
        @Override
        public Class<Project1> getImplementedInterface() {
            return Project1.class;
        }
    
        @Override
        public VlrCatalog getVlrCatalog() {
            return _vlrCatalog;
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_vlrCatalog);
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!Project1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Project1 other = (Project1)obj;
            if (!Objects.equals(_vlrCatalog, other.getVlrCatalog())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project1");
            CodeHelpers.appendValue(helper, "_vlrCatalog", _vlrCatalog);
            return helper.toString();
        }
    }
}
