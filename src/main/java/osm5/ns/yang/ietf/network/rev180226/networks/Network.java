package osm5.ns.yang.ietf.network.rev180226.networks;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.rev180226.NetworkId;
import osm5.ns.yang.ietf.network.rev180226.Networks;
import osm5.ns.yang.ietf.network.rev180226.networks.network.NetworkTypes;
import osm5.ns.yang.ietf.network.rev180226.networks.network.Node;
import osm5.ns.yang.ietf.network.rev180226.networks.network.SupportingNetwork;

/**
 * Describes a network.A network typically contains an inventory of 
 * nodes,topological information (augmented through thenetwork-topology data 
 * model), and layering information.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list network {
 *   key network-id;
 *   leaf network-id {
 *     type network-id;
 *   }
 *   container network-types {
 *   }
 *   list supporting-network {
 *     key network-ref;
 *     leaf network-ref {
 *       type leafref {
 *         path /nw:networks/nw:network/nw:network-id;
 *         require-instance false;
 *       }
 *     }
 *   }
 *   list node {
 *     key node-id;
 *     leaf node-id {
 *       type node-id;
 *     }
 *     list supporting-node {
 *       key "network-ref node-ref";
 *       leaf network-ref {
 *         type leafref {
 *           path ../../../nw:supporting-network/nw:network-ref;
 *           require-instance false;
 *         }
 *       }
 *       leaf node-ref {
 *         type leafref {
 *           path /nw:networks/nw:network/nw:node/nw:node-id;
 *           require-instance false;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/networks/network</i>
 * 
 * <p>To create instances of this class use {@link NetworkBuilder}.
 * @see NetworkBuilder
 * @see NetworkKey
 *
 */
public interface Network
    extends
    ChildOf<Networks>,
    Augmentable<Network>,
    Identifiable<NetworkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network");

    /**
     * Identifies a network.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NetworkId</code> <code>networkId</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkId();
    
    /**
     * Serves as an augmentation target.The network type is indicated through 
     * correspondingpresence containers augmented into this container.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.networks.network.NetworkTypes</code> <code>networkTypes</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkTypes getNetworkTypes();
    
    /**
     * An underlay network, used to represent layered networktopologies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingNetwork</code>, or <code>null</code> if not present
     */
    @Nullable
    List<SupportingNetwork> getSupportingNetwork();
    
    /**
     * The inventory of nodes of this network.
     *
     *
     *
     * @return <code>java.util.List</code> <code>node</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Node> getNode();
    
    @Override
    NetworkKey key();

}

