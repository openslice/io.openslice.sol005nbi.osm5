package osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;

/**
 * OpenMANO Numa type selection
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice om-numa-type {
 *   case cores {
 *     leaf num-cores {
 *       type uint8;
 *     }
 *   }
 *   case paired-threads {
 *     container paired-threads {
 *       leaf num-paired-threads {
 *         type uint8;
 *       }
 *       list paired-thread-ids {
 *         max-elements 16;
 *         key thread-a;
 *         leaf thread-a {
 *           type uint8;
 *         }
 *         leaf thread-b {
 *           type uint8;
 *         }
 *       }
 *     }
 *   }
 *   case threads {
 *     leaf num-threads {
 *       type uint8;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type</i>
 *
 */
public interface OmNumaType
    extends
    ChoiceIn<Node>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("om-numa-type");


}

