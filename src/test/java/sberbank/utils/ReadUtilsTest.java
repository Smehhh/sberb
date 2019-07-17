package sberbank.utils;

import org.junit.Assert;
import org.junit.Test;

public class ReadUtilsTest {

    @Test
    public void filesReader() {
        ReadUtils readUtils = new ReadUtils();
        String act = readUtils.filesReader(42);
        Assert.assertEquals("Hello", act);
    }
}