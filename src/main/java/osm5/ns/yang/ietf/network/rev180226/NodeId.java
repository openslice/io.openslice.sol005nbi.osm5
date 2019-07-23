package osm5.ns.yang.ietf.network.rev180226;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.String;
import java.util.Objects;

import osm5.ns.yang.ietf.inet.types.rev130715.Uri;

public class NodeId extends Uri
 implements Serializable {
    private static final long serialVersionUID = 1905618053033346106L;


    @ConstructorProperties("value")
    public NodeId(String _value) {
        super(_value);
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeId(NodeId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public NodeId(Uri source) {
        super(source);
    }

    public static NodeId getDefaultInstance(String defaultValue) {
        return new NodeId(defaultValue);
    }





}

