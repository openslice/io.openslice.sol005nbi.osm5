package osm5.ns.yang.nfvo.nsr.rev170208.project;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.Project1;

/**
 * Used to configure the list of public keys to be injected as partof ns 
 * instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list key-pair {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf key {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)key-pair</i>
 * 
 * <p>To create instances of this class use {@link KeyPairBuilder}.
 * @see KeyPairBuilder
 * @see KeyPairKey
 *
 */
public interface KeyPair
    extends
    ChildOf<Project1>,
    Augmentable<KeyPair>,
    Identifiable<KeyPairKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("key-pair");

    /**
     * Name of this key pair
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Key associated with this key pair
     *
     *
     *
     * @return <code>java.lang.String</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable
    String getKey();
    
    @Override
    KeyPairKey key();

}

