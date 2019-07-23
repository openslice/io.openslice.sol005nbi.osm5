package osm5.ns.riftware._1._0.project.nsd.rev170228.nsd.placement.groups;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.project.nsd.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.project.nsd.rev170228.NsdPlacementGroups;
import osm5.ns.riftware._1._0.project.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfd;
import osm5.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo;

/**
 * List of placement groups at NS level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list placement-groups {
 *   key name;
 *   uses manotypes:placement-group-info;
 *   list member-vnfd {
 *     key member-vnf-index-ref;
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-placement-groups/placement-groups</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsBuilder}.
 * @see PlacementGroupsBuilder
 * @see PlacementGroupsKey
 *
 */
public interface PlacementGroups
    extends
    ChildOf<NsdPlacementGroups>,
    Augmentable<PlacementGroups>,
    PlacementGroupInfo,
    Identifiable<PlacementGroupsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups");

    /**
     * List of VNFDs that are part of this placement group
     *
     *
     *
     * @return <code>java.util.List</code> <code>memberVnfd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<MemberVnfd> getMemberVnfd();
    
    @Override
    PlacementGroupsKey key();

}

