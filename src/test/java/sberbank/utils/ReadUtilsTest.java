package sberbank.utils;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ReadUtilsTest {
    @Test
    public void filesReader() {
        ReadUtils readUtils = new ReadUtils();
        String act = readUtils.filesReader(42);
        Assert.assertEquals("Hello", act);
    }
    @Test
    public void returnExe() {
        ReadUtils readUtils = new ReadUtils();
        Assert.assertEquals("", readUtils.filesReader(21));
    }

}
