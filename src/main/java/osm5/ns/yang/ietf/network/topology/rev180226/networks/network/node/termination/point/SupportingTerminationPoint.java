package osm5.ns.yang.ietf.network.topology.rev180226.networks.network.node.termination.point;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.NetworkId;
import osm5.ns.yang.ietf.network.rev180226.NodeId;
import osm5.ns.yang.ietf.network.topology.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.node.TerminationPoint;

/**
 * This list identifies any termination points on which agiven termination point 
 * depends or onto which it maps.Those termination points will themselves be 
 * containedin a supporting node. This dependency information can beinferred from 
 * the dependencies between links. Therefore,this item is not separately 
 * configurable. Hence, nocorresponding constraint needs to be articulated.The 
 * corresponding information is simply provided by theimplementing system.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list supporting-termination-point {
 *   key "network-ref node-ref tp-ref";
 *   leaf network-ref {
 *     type leafref {
 *       path ../../../nw:supporting-node/nw:network-ref;
 *       require-instance false;
 *     }
 *   }
 *   leaf node-ref {
 *     type leafref {
 *       path ../../../nw:supporting-node/nw:node-ref;
 *       require-instance false;
 *     }
 *   }
 *   leaf tp-ref {
 *     type leafref {
 *       path /nw:networks/nw:network[nw:network-id=current()/../network-ref]/nw:node[nw:node-id=current()/../node-ref]/termination-point/tp-id;
 *       require-instance false;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/networks/network/node/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2018-02-26)termination-point/supporting-termination-point</i>
 * 
 * <p>To create instances of this class use {@link SupportingTerminationPointBuilder}.
 * @see SupportingTerminationPointBuilder
 * @see SupportingTerminationPointKey
 *
 */
public interface SupportingTerminationPoint
    extends
    ChildOf<TerminationPoint>,
    Augmentable<SupportingTerminationPoint>,
    Identifiable<SupportingTerminationPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-termination-point");

    /**
     * This leaf identifies in which topology thesupporting termination point is 
     * present.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkRef();
    
    /**
     * This leaf identifies in which node the supportingtermination point is present.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.NodeId</code> <code>nodeRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getNodeRef();
    
    /**
     * Reference to the underlay node (the underlay node mustbe in a different 
     * topology).
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>tpRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getTpRef();
    
    @Override
    SupportingTerminationPointKey key();

}

