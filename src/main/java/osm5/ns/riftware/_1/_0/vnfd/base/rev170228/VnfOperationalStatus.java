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
package osm5.ns.riftware._1._0.vnfd.base.rev170228;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum VnfOperationalStatus implements Enumeration {
    Init(0, "init"),
    
    Running(1, "running"),
    
    Upgrading(2, "upgrading"),
    
    Terminate(3, "terminate"),
    
    Terminated(4, "terminated"),
    
    Failed(5, "failed")
    ;

    private static final Map<String, VnfOperationalStatus> NAME_MAP;
    private static final Map<Integer, VnfOperationalStatus> VALUE_MAP;

    static {
        final Builder<String, VnfOperationalStatus> nb = ImmutableMap.builder();
        final Builder<Integer, VnfOperationalStatus> vb = ImmutableMap.builder();
        for (VnfOperationalStatus enumItem : VnfOperationalStatus.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private VnfOperationalStatus(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getIntValue() {
        return value;
    }

    /**
     * Return the enumeration member whose {@link #getName()} matches specified value.
     *
     * @param name YANG assigned name
     * @return corresponding VnfOperationalStatus item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<VnfOperationalStatus> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding VnfOperationalStatus item, or null if no such item exists
     */
    public static VnfOperationalStatus forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
