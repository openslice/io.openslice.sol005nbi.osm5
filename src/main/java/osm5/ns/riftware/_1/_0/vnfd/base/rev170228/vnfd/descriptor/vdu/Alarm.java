package osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.Vdu;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list alarm {
 *   key alarm-id;
 *   uses manotypes:alarm;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/alarm</i>
 * 
 * <p>To create instances of this class use {@link AlarmBuilder}.
 * @see AlarmBuilder
 * @see AlarmKey
 *
 */
public interface Alarm
    extends
    ChildOf<Vdu>,
    Augmentable<Alarm>,
    osm5.ns.yang.nfvo.mano.types.rev170208.Alarm,
    Identifiable<AlarmKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("alarm");

    @Override
    AlarmKey key();

}

