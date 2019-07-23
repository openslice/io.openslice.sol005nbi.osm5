package osm5.ns.yang.ietf.network.topology.rev180226;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.String;
import java.util.Objects;

import osm5.ns.yang.ietf.inet.types.rev130715.Uri;

public class TpId extends Uri
 implements Serializable {
    private static final long serialVersionUID = -9043341782189787883L;


    @ConstructorProperties("value")
    public TpId(String _value) {
        super(_value);
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TpId(TpId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public TpId(Uri source) {
        super(source);
    }

    public static TpId getDefaultInstance(String defaultValue) {
        return new TpId(defaultValue);
    }





}

