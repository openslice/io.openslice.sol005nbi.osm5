package osm5.ns.yang.nfvo.nst.rev180820.netslicefgd;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nst.rev180820.Netslicefgd;

/**
 * List of Rendered Service Paths (RSP).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list rsp {
 *   key id;
 *   uses rsp;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/netslicefgd/rsp</i>
 * 
 * <p>To create instances of this class use {@link RspBuilder}.
 * @see RspBuilder
 * @see RspKey
 *
 */
public interface Rsp
    extends
    ChildOf<Netslicefgd>,
    Augmentable<Rsp>,
    osm5.ns.yang.nfvo.nst.rev180820.Rsp,
    Identifiable<RspKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("rsp");

    @Override
    RspKey key();

}

