package osm5.ns.yang.ietf.network.rev180226.networks.network;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.rev180226.NetworkId;
import osm5.ns.yang.ietf.network.rev180226.networks.Network;

/**
 * An underlay network, used to represent layered networktopologies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list supporting-network {
 *   key network-ref;
 *   leaf network-ref {
 *     type leafref {
 *       path /nw:networks/nw:network/nw:network-id;
 *       require-instance false;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/networks/network/supporting-network</i>
 * 
 * <p>To create instances of this class use {@link SupportingNetworkBuilder}.
 * @see SupportingNetworkBuilder
 * @see SupportingNetworkKey
 *
 */
public interface SupportingNetwork
    extends
    ChildOf<Network>,
    Augmentable<SupportingNetwork>,
    Identifiable<SupportingNetworkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-network");

    /**
     * References the underlay network.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkRef();
    
    @Override
    SupportingNetworkKey key();

}

