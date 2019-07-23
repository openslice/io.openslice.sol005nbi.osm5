package osm5.ns.yang.nfvo.nst.rev180820.network.slice;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nst.rev180820.NetworkSlice;
import osm5.ns.yang.nfvo.nst.rev180820.Snssai;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * container SNSSAI-identifier {
 *   uses snssai;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/SNSSAI-identifier</i>
 * 
 * <p>To create instances of this class use {@link SNSSAIIdentifierBuilder}.
 * @see SNSSAIIdentifierBuilder
 *
 */
public interface SNSSAIIdentifier
    extends
    ChildOf<NetworkSlice>,
    Augmentable<SNSSAIIdentifier>,
    Snssai
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("SNSSAI-identifier");


}

