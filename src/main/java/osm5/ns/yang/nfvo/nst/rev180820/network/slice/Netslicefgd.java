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
 * list netslicefgd {
 *   key id;
 *   uses netslicefgd;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/netslicefgd</i>
 * 
 * <p>To create instances of this class use {@link NetslicefgdBuilder}.
 * @see NetslicefgdBuilder
 * @see NetslicefgdKey
 *
 */
public interface Netslicefgd
    extends
    ChildOf<NetworkSlice>,
    Augmentable<Netslicefgd>,
    osm5.ns.yang.nfvo.nst.rev180820.Netslicefgd,
    Identifiable<NetslicefgdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslicefgd");

    @Override
    NetslicefgdKey key();

}

