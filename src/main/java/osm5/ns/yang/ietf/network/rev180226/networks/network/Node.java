package osm5.ns.yang.ietf.network.rev180226.networks.network;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.rev180226.NodeId;
import osm5.ns.yang.ietf.network.rev180226.networks.Network;
import osm5.ns.yang.ietf.network.rev180226.networks.network.node.SupportingNode;

/**
 * The inventory of nodes of this network.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list node {
 *   key node-id;
 *   leaf node-id {
 *     type node-id;
 *   }
 *   list supporting-node {
 *     key "network-ref node-ref";
 *     leaf network-ref {
 *       type leafref {
 *         path ../../../nw:supporting-network/nw:network-ref;
 *         require-instance false;
 *       }
 *     }
 *     leaf node-ref {
 *       type leafref {
 *         path /nw:networks/nw:network/nw:node/nw:node-id;
 *         require-instance false;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/networks/network/node</i>
 * 
 * <p>To create instances of this class use {@link NodeBuilder}.
 * @see NodeBuilder
 * @see NodeKey
 *
 */
public interface Node
    extends
    ChildOf<Network>,
    Augmentable<Node>,
    Identifiable<NodeKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("node");

    /**
     * Uniquely identifies a node within the containingnetwork.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NodeId</code> <code>nodeId</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getNodeId();
    
    /**
     * Represents another node that is in an underlay networkand that supports this 
     * node. Used to represent layeringstructure.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingNode</code>, or <code>null</code> if not present
     */
    @Nullable
    List<SupportingNode> getSupportingNode();
    
    @Override
    NodeKey key();

}

