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
package osm5.ns.yang.nfvo.mano.types.rev170208;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum NfviMetricType implements Enumeration {
    CpuUtilization(0, "cpu_utilization"),
    
    AverageMemoryUtilization(1, "average_memory_utilization"),
    
    DiskReadOps(2, "disk_read_ops"),
    
    DiskWriteOps(3, "disk_write_ops"),
    
    DiskReadBytes(4, "disk_read_bytes"),
    
    DiskWriteBytes(5, "disk_write_bytes"),
    
    PacketsSent(6, "packets_sent"),
    
    PacketsReceived(7, "packets_received"),
    
    PacketsDropped(8, "packets_dropped")
    ;

    private static final Map<String, NfviMetricType> NAME_MAP;
    private static final Map<Integer, NfviMetricType> VALUE_MAP;

    static {
        final Builder<String, NfviMetricType> nb = ImmutableMap.builder();
        final Builder<Integer, NfviMetricType> vb = ImmutableMap.builder();
        for (NfviMetricType enumItem : NfviMetricType.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private NfviMetricType(int value, String name) {
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
     * @return corresponding NfviMetricType item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<NfviMetricType> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding NfviMetricType item, or null if no such item exists
     */
    public static NfviMetricType forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
