package sberbank.service;

import org.springframework.stereotype.Service;
import sberbank.entity.Package;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class PackageService {
    static Map<Integer, Package> packageMap = new LinkedHashMap<>();

    static {
        packageMap.put(1, new Package(1, "Getting Started"));
        packageMap.put(2, new Package(2, "Collections"));
        packageMap.put(3, new Package(3, "Interfaces"));
        packageMap.put(4, new Package(4, "Exceptions"));
        packageMap.put(5, new Package(5, "Inheritance"));
        packageMap.put(6, new Package(6, "Generics"));
        packageMap.put(7, new Package(7, "Multithreading"));
        packageMap.put(8, new Package(8, "Custom Networking"));
        packageMap.put(9, new Package(9, "JDBC Introduction"));
    }

    public Collection<Package> list() {
        synchronized (this) {
            return packageMap.values();
        }
    }

    public Package get(Integer id) {
        synchronized (this) {
            return packageMap.get(id);
        }
    }

    public void update(Package p) {
        synchronized (this) {
            packageMap.put(p.getId(), p);
        }
    }
}
