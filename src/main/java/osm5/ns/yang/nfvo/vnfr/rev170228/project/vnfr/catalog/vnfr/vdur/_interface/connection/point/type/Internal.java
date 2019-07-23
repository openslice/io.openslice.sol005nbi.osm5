package osm5.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.ConnectionPointType;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * case internal {
 *   leaf internal-connection-point-ref {
 *     type leafref {
 *       path ../../../../internal-connection-point/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/interface/connection-point-type/internal</i>
 *
 */
public interface Internal
    extends
    DataObject,
    Augmentable<Internal>,
    ConnectionPointType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal");

    /**
     * Leaf Ref to the particular internal connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>internalConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getInternalConnectionPointRef();

}

