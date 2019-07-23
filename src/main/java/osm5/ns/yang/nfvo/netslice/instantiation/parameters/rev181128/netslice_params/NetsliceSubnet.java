package osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.netslice_params;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.NetsliceParams;
import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.NetsliceSubnetParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * list netslice-subnet {
 *   key id;
 *   uses netslice_subnet_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_params/netslice-subnet</i>
 * 
 * <p>To create instances of this class use {@link NetsliceSubnetBuilder}.
 * @see NetsliceSubnetBuilder
 * @see NetsliceSubnetKey
 *
 */
public interface NetsliceSubnet
    extends
    ChildOf<NetsliceParams>,
    Augmentable<NetsliceSubnet>,
    NetsliceSubnetParams,
    Identifiable<NetsliceSubnetKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-subnet");

    @Override
    NetsliceSubnetKey key();

}

