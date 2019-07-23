package osm5.ns.yang.nfvo.nst.rev180820;
import java.lang.Override;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list nst {
 *   key id;
 *   uses network-slice;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/nst</i>
 * 
 * <p>To create instances of this class use {@link NstBuilder}.
 * @see NstBuilder
 * @see NstKey
 *
 */
public interface Nst
    extends
    ChildOf<NstData>,
    Augmentable<Nst>,
    NetworkSlice,
    Identifiable<NstKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nst");

    @Override
    NstKey key();

}

