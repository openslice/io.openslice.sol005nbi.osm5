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
package osm5.ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Long;
import java.util.Objects;

public class Timestamp extends Timeticks
 implements Serializable {
    private static final long serialVersionUID = -1618618198504997448L;


    @ConstructorProperties("value")
    public Timestamp(Long _value) {
        super(_value);
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Timestamp(Timestamp source) {
        super(source);
    }
    /**
     * Creates a new instance from Timeticks
     *
     * @param source Source object
     */
    public Timestamp(Timeticks source) {
        super(source);
    }

    public static Timestamp getDefaultInstance(String defaultValue) {
        return new Timestamp(Long.valueOf(defaultValue));
    }





}

