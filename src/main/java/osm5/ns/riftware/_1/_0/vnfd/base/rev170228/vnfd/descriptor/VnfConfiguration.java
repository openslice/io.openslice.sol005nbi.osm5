package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.VnfdDescriptor;
import osm5.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container vnf-configuration {
 *   uses manotypes:vca-configuration;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vnf-configuration</i>
 * 
 * <p>To create instances of this class use {@link VnfConfigurationBuilder}.
 * @see VnfConfigurationBuilder
 *
 */
public interface VnfConfiguration
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<VnfConfiguration>,
    VcaConfiguration
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-configuration");


}

