package osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob;

/**
 * List of NS Primitive parameter groups
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list parameter-group {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:primitive-parameter-value;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/config-agent-job/parameter-group</i>
 * 
 * <p>To create instances of this class use {@link ParameterGroupBuilder}.
 * @see ParameterGroupBuilder
 * @see ParameterGroupKey
 *
 */
public interface ParameterGroup
    extends
    ChildOf<ConfigAgentJob>,
    Augmentable<ParameterGroup>,
    PrimitiveParameterValue,
    Identifiable<ParameterGroupKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter-group");

    /**
     * Name of the parameter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    @Override
    ParameterGroupKey key();

}

