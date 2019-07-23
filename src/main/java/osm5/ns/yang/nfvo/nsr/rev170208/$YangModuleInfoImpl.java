package osm5.ns.yang.nfvo.nsr.rev170208;

import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.ImmutableSet;

public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {
    private static final QName NAME = QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr", "2017-02-08", "nsr").intern();
    private static final YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final Set<YangModuleInfo> importedModules;

    public static YangModuleInfo getInstance() {
        return INSTANCE;
    }

    public static QName qnameOf(final java.lang.String localName) {
        return QName.create(NAME, localName).intern();
    }

    private $YangModuleInfoImpl() {
        Set<YangModuleInfo> set = new HashSet<>();
        set.add(osm5.ns.yang.ietf.inet.types.rev130715.$YangModuleInfoImpl.getInstance());
        set.add(osm5.ns.riftware._1._0.rw.project.rev150910.$YangModuleInfoImpl.getInstance());
        set.add(osm5.ns.yang.nfvo.vlr.rev170208.$YangModuleInfoImpl.getInstance());
        set.add(osm5.ns.riftware._1._0.project.nsd.rev170228.$YangModuleInfoImpl.getInstance());
        set.add(osm5.ns.riftware._1._0.project.vnfd.rev170228.$YangModuleInfoImpl.getInstance());
        set.add(osm5.ns.yang.ietf.yang.types.rev130715.$YangModuleInfoImpl.getInstance());
        set.add(osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl.getInstance());
        set.add(osm5.ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl.getInstance());
        set.add(osm5.ns.riftware._1._0.nsd.base.rev170228.$YangModuleInfoImpl.getInstance());
        importedModules = ImmutableSet.copyOf(set);
    }
    
    @java.lang.Override
    public QName getName() {
        return NAME;
    }
    
    @java.lang.Override
    protected java.lang.String resourceName() {
        return "/META-INF/yang/nsr@2017-02-08.yang";
    }
    
    @java.lang.Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    
}
