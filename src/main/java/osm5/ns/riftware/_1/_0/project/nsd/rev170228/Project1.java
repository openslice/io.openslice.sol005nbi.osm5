package osm5.ns.riftware._1._0.project.nsd.rev170228;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import osm5.ns.riftware._1._0.project.nsd.rev170228.project.NsdCatalog;
import osm5.ns.riftware._1._0.rw.project.rev150910.Project;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.project.NsdCatalog</code> <code>nsdCatalog</code>, or <code>null</code> if not present
     */
    @Nullable
    NsdCatalog getNsdCatalog();

}

