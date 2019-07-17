package sberbank.entity;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PackageTest {

    @Test
    public void getId() {
        Package p = new Package(1, "Hello");
        int act = p.getId();
        Assert.assertEquals(1, act);
    }
}