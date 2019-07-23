package osm5.ns.yang.nfvo.nst.rev180820.netslicefgd;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nst.rev180820.Netslicefgd;

/**
 * List of classifier rules.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list classifier {
 *   key id;
 *   uses classifier;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/netslicefgd/classifier</i>
 * 
 * <p>To create instances of this class use {@link ClassifierBuilder}.
 * @see ClassifierBuilder
 * @see ClassifierKey
 *
 */
public interface Classifier
    extends
    ChildOf<Netslicefgd>,
    Augmentable<Classifier>,
    osm5.ns.yang.nfvo.nst.rev180820.Classifier,
    Identifiable<ClassifierKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("classifier");

    @Override
    ClassifierKey key();

}

