package osm5.ns.yang.nfvo.nst.rev180820.netslice.subnet;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.NsParams;
import osm5.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nst.rev180820.NetsliceSubnet;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * container instantiation-parameters {
 *   uses instantiation-parameters:ns_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/netslice-subnet/instantiation-parameters</i>
 * 
 * <p>To create instances of this class use {@link InstantiationParametersBuilder}.
 * @see InstantiationParametersBuilder
 *
 */
public interface InstantiationParameters
    extends
    ChildOf<NetsliceSubnet>,
    Augmentable<InstantiationParameters>,
    NsParams
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("instantiation-parameters");


}

