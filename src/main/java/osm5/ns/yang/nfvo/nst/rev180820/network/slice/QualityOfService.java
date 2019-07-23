package osm5.ns.yang.nfvo.nst.rev180820.network.slice;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nst.rev180820.FiveQi;
import osm5.ns.yang.nfvo.nst.rev180820.NetworkSlice;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * container quality-of-service {
 *   uses five-qi;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/quality-of-service</i>
 * 
 * <p>To create instances of this class use {@link QualityOfServiceBuilder}.
 * @see QualityOfServiceBuilder
 *
 */
public interface QualityOfService
    extends
    ChildOf<NetworkSlice>,
    Augmentable<QualityOfService>,
    FiveQi
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("quality-of-service");


}

