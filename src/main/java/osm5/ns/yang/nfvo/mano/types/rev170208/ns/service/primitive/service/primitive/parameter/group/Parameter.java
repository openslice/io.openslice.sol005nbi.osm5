package osm5.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.parameter.group;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter;
import osm5.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.ParameterGroup;

/**
 * List of parameters for the service primitive.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list parameter {
 *   key name;
 *   uses manotypes:primitive-parameter;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ns-service-primitive/service-primitive/parameter-group/parameter</i>
 * 
 * <p>To create instances of this class use {@link ParameterBuilder}.
 * @see ParameterBuilder
 * @see ParameterKey
 *
 */
public interface Parameter
    extends
    ChildOf<ParameterGroup>,
    Augmentable<Parameter>,
    PrimitiveParameter,
    Identifiable<ParameterKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter");

    @Override
    ParameterKey key();

}

