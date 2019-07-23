package osm5.ns.yang.nfvo.nsr.rev170208;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import osm5.ns.riftware._1._0.rw.project.rev150910.Project;
import osm5.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata;

public interface Project3
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata</code> <code>nsInstanceOpdata</code>, or <code>null</code> if not present
     */
    @Nullable
    NsInstanceOpdata getNsInstanceOpdata();

}

