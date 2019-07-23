package osm5.ns.riftware._1._0.project.nsd.rev170228;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.project.nsd.rev170228.nsd.service.primitive.ServicePrimitive;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsd-service-primitive {
 *   list service-primitive {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       uses manotypes:primitive-parameter;
 *     }
 *     uses manotypes:ui-primitive-group;
 *     list vnf-primitive-group {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf vnfd-name {
 *         type leafref {
 *           path "../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:name";
 *         }
 *       }
 *       list primitive {
 *         key index;
 *         leaf index {
 *           type uint32;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *       }
 *     }
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-service-primitive</i>
 *
 */
public interface NsdServicePrimitive
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-service-primitive");

    /**
     * Network service level service primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>servicePrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ServicePrimitive> getServicePrimitive();

}

