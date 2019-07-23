package osm5.ns.yang.ietf.network.rev180226;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Contains the information necessary to reference a network --for example, an 
 * underlay network.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * grouping network-ref {
 *   leaf network-ref {
 *     type leafref {
 *       path /nw:networks/nw:network/nw:network-id;
 *       require-instance false;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network-ref</i>
 *
 */
public interface NetworkRef
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network-ref");

    /**
     * Used to reference a network -- for example, an underlaynetwork.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkRef();

}

