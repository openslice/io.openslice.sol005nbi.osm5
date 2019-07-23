package osm5.ns.yang.nfvo.nsd.rev170228.nsd.catalog;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import osm5.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon;
import osm5.ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdCatalog;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdConstituentVnfd;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdMonitoringParam;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdPlacementGroups;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdServicePrimitive;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdVld;
import osm5.ns.yang.nfvo.nsd.rev170228.NsdVnfDependency;
import osm5.ns.yang.nfvo.nsd.rev170228.nsd.catalog.NsdBuilder.NsdImpl;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list nsd {
 *   key id;
 *   uses nsd-base:nsd-descriptor-common;
 *   uses nsd-vld;
 *   uses nsd-constituent-vnfd;
 *   uses nsd-placement-groups;
 *   uses nsd-vnf-dependency;
 *   uses nsd-monitoring-param;
 *   uses nsd-service-primitive;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-catalog/nsd</i>
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
    NsdMonitoringParam,
    NsdServicePrimitive,
    NsdVld,
    NsdConstituentVnfd,
    NsdPlacementGroups,
    NsdDescriptorCommon,
    NsdVnfDependency,
    Identifiable<NsdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");

    @Override
    NsdKey key();
    String getAddedId();	
}

