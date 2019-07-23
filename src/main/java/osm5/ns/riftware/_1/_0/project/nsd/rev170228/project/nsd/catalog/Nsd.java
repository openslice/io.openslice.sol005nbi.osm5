package osm5.ns.riftware._1._0.project.nsd.rev170228.project.nsd.catalog;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import osm5.ns.riftware._1._0.project.nsd.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.project.nsd.rev170228.NsdDescriptor;
import osm5.ns.riftware._1._0.project.nsd.rev170228.project.NsdCatalog;
import osm5.ns.riftware._1._0.project.nsd.rev170228.project.nsd.catalog.NsdBuilder.NsdImpl;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list nsd {
 *   key id;
 *   uses nsd-descriptor;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/project/(http://riftio.com/ns/riftware-1.0/project-nsd?revision=2017-02-28)nsd-catalog/nsd</i>
 * 
 * <p>To create instances of this class use {@link NsdBuilder}.
 * @see NsdBuilder
 * @see NsdKey
 *
 */
@JsonDeserialize(as = NsdImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonIgnoreProperties( { "meta", "forgetThisField", "input-parameter-xpath", "_admin"} )
public interface Nsd
    extends
    ChildOf<NsdCatalog>,
    Augmentable<Nsd>,
    NsdDescriptor,
    Identifiable<NsdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");

    @Override
    NsdKey key();
    String getAddedId();	
}

