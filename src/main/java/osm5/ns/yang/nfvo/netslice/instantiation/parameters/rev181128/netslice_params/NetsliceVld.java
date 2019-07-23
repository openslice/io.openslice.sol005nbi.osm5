package osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.netslice_params;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.NetsliceParams;
import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.NetsliceVldParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * list netslice-vld {
 *   key name;
 *   uses netslice_vld_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_params/netslice-vld</i>
 * 
 * <p>To create instances of this class use {@link NetsliceVldBuilder}.
 * @see NetsliceVldBuilder
 * @see NetsliceVldKey
 *
 */
public interface NetsliceVld
    extends
    ChildOf<NetsliceParams>,
    Augmentable<NetsliceVld>,
    NetsliceVldParams,
    Identifiable<NetsliceVldKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-vld");

    @Override
    NetsliceVldKey key();

}

