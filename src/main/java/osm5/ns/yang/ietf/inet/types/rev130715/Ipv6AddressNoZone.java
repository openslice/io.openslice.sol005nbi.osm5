/*-
 * ========================LICENSE_START=================================
 * io.openslice.sol005nbi.osm5
 * %%
 * Copyright (C) 2019 openslice.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package osm5.ns.yang.ietf.inet.types.rev130715;
import com.google.common.collect.ImmutableList;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public class Ipv6AddressNoZone extends Ipv6Address
 implements Serializable {
    private static final long serialVersionUID = -8132834319977195251L;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^(?:[0-9a-fA-F:\\.]*)$");
    private static final Pattern patterns = Pattern.compile(PATTERN_CONSTANTS.get(0));
    private static final String regexes = "[0-9a-fA-F:\\.]*";


    @ConstructorProperties("value")
    public Ipv6AddressNoZone(String _value) {
        super(_value);
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
        CodeHelpers.checkPattern(_value, patterns, regexes);
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Ipv6AddressNoZone(Ipv6AddressNoZone source) {
        super(source);
    }
    /**
     * Creates a new instance from Ipv6Address
     *
     * @param source Source object
     */
    public Ipv6AddressNoZone(Ipv6Address source) {
        super(source);
        CodeHelpers.checkPattern(getValue(), patterns, regexes);
    }

    public static Ipv6AddressNoZone getDefaultInstance(String defaultValue) {
        return new Ipv6AddressNoZone(defaultValue);
    }





}

