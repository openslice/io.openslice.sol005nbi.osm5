package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.vnf_params;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.InternalVldParams;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.VnfParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list internal-vld {
 *   key name;
 *   uses internal_vld_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vnf_params/internal-vld</i>
 * 
 * <p>To create instances of this class use {@link InternalVldBuilder}.
 * @see InternalVldBuilder
 * @see InternalVldKey
 *
 */
public interface InternalVld
    extends
    ChildOf<VnfParams>,
    Augmentable<InternalVld>,
    InternalVldParams,
    Identifiable<InternalVldKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-vld");

    @Override
    InternalVldKey key();

}

