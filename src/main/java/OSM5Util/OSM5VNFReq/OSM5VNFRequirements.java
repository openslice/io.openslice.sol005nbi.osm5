package OSM5Util.OSM5VNFReq;

import java.util.Formatter;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import osm5.ns.yang.nfvo.vnfd.rev170228.vnfd.catalog.Vnfd;


public class OSM5VNFRequirements {
    public Vnfd descriptor;

    public boolean unknownFields = false;
    public int memoryMB = 0;
    public int storageGB = 0;
    public int vcpuCount = 0;
    public int vmCount = 0;
    
    public OSM5VNFRequirements()
    {}
    
    public OSM5VNFRequirements(Vnfd descriptor) {
        this.descriptor = descriptor;

        this.memoryMB = 0;
        this.storageGB = 0;
        this.vcpuCount = 0;
        this.vmCount = 0;

        for(Vdu vdu : descriptor.getVdu() ) {   
        	if (  vdu.getVmFlavor() != null ) {
                this.memoryMB +=  vdu.getCount().intValue()  * vdu.getVmFlavor().getMemoryMb().intValue();
                this.storageGB += vdu.getCount().intValue() * vdu.getVmFlavor().getStorageGb().intValue();
                this.vcpuCount += vdu.getCount().intValue() * 1;//vdu.getVmFlavor().getVcpuCount().intValue();
                this.vmCount += vdu.getCount().intValue();
        	}
        }
    }

    public String toHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter fmt = new Formatter(stringBuilder);
        fmt.format("<h3>%s</h3><br>", descriptor.getName());
        fmt.format("<b>%s: </b>%s<br>", "Vendor", descriptor.getVendor() );
        fmt.format("<b>%s: </b>%s<br>", "Version", descriptor.getVersion() );
        fmt.format("<b>%s: </b>%s<br>", "Description", descriptor.getDescription());
        fmt.format("<b>%s: </b>%d<br>", "VM Count", vmCount);
        fmt.format("<b>%s: </b>%d<br>", "vCPU Count", vcpuCount);
        fmt.format("<b>%s: </b>%d MB<br>", "Memory", memoryMB);
        fmt.format("<b>%s: </b>%d GB<br>", "Storage", storageGB);

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "VNFRequirements{" +
                "vnfName=" + descriptor.getName() +
                ", memoryMB=" + memoryMB +
                ", storageGB=" + storageGB +
                ", vcpuCount=" + vcpuCount +
                ", vmCount=" + vmCount +
                '}';
    }
}
