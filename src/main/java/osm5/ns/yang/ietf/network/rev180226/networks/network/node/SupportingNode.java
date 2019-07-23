package osm5.ns.yang.ietf.network.rev180226.networks.network.node;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.rev180226.NetworkId;
import osm5.ns.yang.ietf.network.rev180226.NodeId;
import osm5.ns.yang.ietf.network.rev180226.networks.network.Node;

/**
 * Represents another node that is in an underlay networkand that supports this 
 * node. Used to represent layeringstructure.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list supporting-node {
 *   key "network-ref node-ref";
 *   leaf network-ref {
 *     type leafref {
 *       path ../../../nw:supporting-network/nw:network-ref;
 *       require-instance false;
 *     }
 *   }
 *   leaf node-ref {
 *     type leafref {
 *       path /nw:networks/nw:network/nw:node/nw:node-id;
 *       require-instance false;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/networks/network/node/supporting-node</i>
 * 
 * <p>To create instances of this class use {@link SupportingNodeBuilder}.
 * @see SupportingNodeBuilder
 * @see SupportingNodeKey
 *
 */
public interface SupportingNode
    extends
    ChildOf<Node>,
    Augmentable<SupportingNode>,
    Identifiable<SupportingNodeKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-node");

    /**
     * References the underlay network of which theunderlay node is a part.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkRef();
    
    /**
     * References the underlay node itself.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NodeId</code> <code>nodeRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getNodeRef();
    
    @Override
    SupportingNodeKey key();

}

