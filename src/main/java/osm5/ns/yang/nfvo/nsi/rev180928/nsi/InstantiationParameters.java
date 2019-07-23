package osm5.ns.yang.nfvo.nsi.rev180928.nsi;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.netslice.instantiation.parameters.rev181128.NetsliceParams;
import osm5.ns.yang.nfvo.nsi.rev180928.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsi.rev180928.Nsi$G;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * container instantiation-parameters {
 *   uses netslice-instantiation-parameters:netslice_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi/instantiation-parameters</i>
 * 
 * <p>To create instances of this class use {@link InstantiationParametersBuilder}.
 * @see InstantiationParametersBuilder
 *
 */
public interface InstantiationParameters
    extends
    ChildOf<Nsi$G>,
    Augmentable<InstantiationParameters>,
    NetsliceParams
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("instantiation-parameters");


}

