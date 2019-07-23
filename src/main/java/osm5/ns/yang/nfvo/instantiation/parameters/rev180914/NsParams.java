package osm5.ns.yang.nfvo.instantiation.parameters.rev180914;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ns_params.Vld;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ns_params.Vnf;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping ns_params {
 *   leaf vimAccountId {
 *     type string;
 *   }
 *   leaf ssh_keys {
 *     type string;
 *   }
 *   list vnf {
 *     key member-vnf-index;
 *     uses vnf_params;
 *   }
 *   list vld {
 *     key name;
 *     uses vld_params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ns_params</i>
 *
 */
public interface NsParams
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns_params");

    /**
     * @return <code>java.lang.String</code> <code>vimAccountId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVimAccountId();
    
    /**
     * @return <code>java.lang.String</code> <code>sshKeys</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSshKeys();
    
    /**
     * @return <code>java.util.List</code> <code>vnf</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnf> getVnf();
    
    /**
     * @return <code>java.util.List</code> <code>vld</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vld> getVld();

}

