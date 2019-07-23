package osm5.ns.yang.ietf.network.topology.rev180226;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import osm5.ns.yang.ietf.network.rev180226.networks.network.Node;
import osm5.ns.yang.ietf.network.topology.rev180226.networks.network.node.TerminationPoint;

public interface Node1
    extends
    DataObject,
    Augmentation<Node>
{




    /**
     * A termination point can terminate a link.Depending on the type of topology, a 
     * termination pointcould, for example, refer to a port or an interface.
     *
     *
     *
     * @return <code>java.util.List</code> <code>terminationPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<TerminationPoint> getTerminationPoint();

}

