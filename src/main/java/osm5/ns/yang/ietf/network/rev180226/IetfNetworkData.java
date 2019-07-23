package osm5.ns.yang.ietf.network.rev180226;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * This module defines a common base data model for a collectionof nodes in a 
 * network. Node definitions are further usedin network topologies and 
 * inventories.Copyright (c) 2018 IETF Trust and the persons identified asauthors 
 * of the code. All rights reserved.Redistribution and use in source and binary 
 * forms, with orwithout modification, is permitted pursuant to, and subjectto the 
 * license terms contained in, the Simplified BSD Licenseset forth in Section 4.c 
 * of the IETF Trust's Legal ProvisionsRelating to IETF 
 * Documents(https://trustee.ietf.org/license-info).This version of this YANG 
 * module is part of RFC 8345;see the RFC itself for full legal notices.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * module ietf-network {
 *   yang-version 1.1;
 *   namespace urn:ietf:params:xml:ns:yang:ietf-network;
 *   prefix nw;
 *   import ietf-inet-types {
 *     prefix inet;
 *   }
 *   revision 2018-02-26 {
 *   }
 *   typedef node-id {
 *     type inet:uri;
 *   }
 *   typedef network-id {
 *     type inet:uri;
 *   }
 *   grouping network-ref {
 *     leaf network-ref {
 *       type leafref {
 *         path /nw:networks/nw:network/nw:network-id;
 *         require-instance false;
 *       }
 *     }
 *   }
 *   grouping node-ref {
 *     leaf node-ref {
 *       type leafref {
 *         path /nw:networks/nw:network[nw:network-id=current()/../network-ref]/nw:node/nw:node-id;
 *         require-instance false;
 *       }
 *     }
 *     uses network-ref;
 *   }
 *   container networks {
 *     list network {
 *       key network-id;
 *       leaf network-id {
 *         type network-id;
 *       }
 *       container network-types {
 *       }
 *       list supporting-network {
 *         key network-ref;
 *         leaf network-ref {
 *           type leafref {
 *             path /nw:networks/nw:network/nw:network-id;
 *             require-instance false;
 *           }
 *         }
 *       }
 *       list node {
 *         key node-id;
 *         leaf node-id {
 *           type node-id;
 *         }
 *         list supporting-node {
 *           key "network-ref node-ref";
 *           leaf network-ref {
 *             type leafref {
 *               path ../../../nw:supporting-network/nw:network-ref;
 *               require-instance false;
 *             }
 *           }
 *           leaf node-ref {
 *             type leafref {
 *               path /nw:networks/nw:network/nw:node/nw:node-id;
 *               require-instance false;
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface IetfNetworkData
    extends
    DataRoot
{




    /**
     * Serves as a top-level container for a list of networks.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev180226.Networks</code> <code>networks</code>, or <code>null</code> if not present
     */
    @Nullable
    Networks getNetworks();

}

