package osm5.ns.yang.nfvo.vnfr.rev170228;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import osm5.ns.riftware._1._0.rw.project.rev150910.Project;
import osm5.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog</code> <code>vnfrCatalog</code>, or <code>null</code> if not present
     */
    @Nullable
    VnfrCatalog getVnfrCatalog();

}

