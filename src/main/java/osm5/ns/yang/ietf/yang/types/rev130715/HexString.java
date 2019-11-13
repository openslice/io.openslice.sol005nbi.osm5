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
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public class HexString
 implements Serializable {
    private static final long serialVersionUID = 9131618089557940291L;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^(?:([0-9a-fA-F]{2}(:[0-9a-fA-F]{2})*)?)$");
    private static final Pattern patterns = Pattern.compile(PATTERN_CONSTANTS.get(0));
    private static final String regexes = "([0-9a-fA-F]{2}(:[0-9a-fA-F]{2})*)?";
    private final String _value;

    private static void check_valueLength(final String value) {
    }

    @ConstructorProperties("value")
    public HexString(String _value) {
        if (_value != null) {
            check_valueLength(_value);
        }
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
        CodeHelpers.checkPattern(_value, patterns, regexes);
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HexString(HexString source) {
        this._value = source._value;
    }

    public static HexString getDefaultInstance(String defaultValue) {
        return new HexString(defaultValue);
    }

    public String getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_value);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HexString other = (HexString) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(HexString.class);
        CodeHelpers.appendValue(helper, "_value", _value);
        return helper.toString();
    }
}

