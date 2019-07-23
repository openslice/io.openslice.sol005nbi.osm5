package osm5.ns.yang.nfvo.nst.rev180820.network.slice;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nst.rev180820.NetworkSlice;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list netslice-subnet {
 *   key id;
 *   uses netslice-subnet;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/netslice-subnet</i>
 * 
 * <p>To create instances of this class use {@link NetsliceSubnetBuilder}.
 * @see NetsliceSubnetBuilder
 * @see NetsliceSubnetKey
 *
 */
public interface NetsliceSubnet
    extends
    ChildOf<NetworkSlice>,
    Augmentable<NetsliceSubnet>,
    osm5.ns.yang.nfvo.nst.rev180820.NetsliceSubnet,
    Identifiable<NetsliceSubnetKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-subnet");

    @Override
    NetsliceSubnetKey key();

}

