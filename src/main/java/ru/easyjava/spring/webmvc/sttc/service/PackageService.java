package ru.easyjava.spring.webmvc.sttc.service;

import org.springframework.stereotype.Service;
import ru.easyjava.spring.webmvc.sttc.entity.Package;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class PackageService {
    static Map<Integer, Package> warehouse = new LinkedHashMap<>();

    static {
        warehouse.put(1, new Package(1, "Getting Started"));
        warehouse.put(2, new Package(2, "Collections"));
        warehouse.put(3, new Package(3, "Interfaces"));
        warehouse.put(4, new Package(4, "Exceptions"));
        warehouse.put(5, new Package(5, "Inheritance"));
        warehouse.put(6, new Package(6, "Generics"));
        warehouse.put(7, new Package(7, "Multithreading"));
        warehouse.put(8, new Package(8, "Custom Networking"));
        warehouse.put(9, new Package(9, "JDBC Introduction"));
    }

    public Collection<Package> list() {
        synchronized (this) {
            return warehouse.values();
        }
    }

    public Package get(Integer id) {
        synchronized (this) {
            return warehouse.get(id);
        }
    }

    public void update(Package p) {
        synchronized (this) {
            warehouse.put(p.getId(), p);
        }
    }
 }
