package osm5.ns.yang.ietf.network.rev180226.networks.network;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.ietf.network.rev180226.$YangModuleInfoImpl;
import osm5.ns.yang.ietf.network.rev180226.networks.Network;

/**
 * Serves as an augmentation target.The network type is indicated through 
 * correspondingpresence containers augmented into this container.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * container network-types {
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/networks/network/network-types</i>
 * 
 * <p>To create instances of this class use {@link NetworkTypesBuilder}.
 * @see NetworkTypesBuilder
 *
 */
public interface NetworkTypes
    extends
    ChildOf<Network>,
    Augmentable<NetworkTypes>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network-types");


}

