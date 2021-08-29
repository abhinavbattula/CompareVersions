package test.java;

import main.java.CompareVersions;
import org.junit.Assert;
import org.junit.Test;

public class CompareVersionsTest {

    @Test
    public void testCompareVersions() throws Exception {
        String v1 = "1.2";
        String v2 = "1.2.9.9.9.9";
        int result = CompareVersions.compareVersion(v1, v2);
        Assert.assertEquals(result, -1);

        v1 = "1.20.9.9.9.9";
        v2 = "1.3";
        result = CompareVersions.compareVersion(v1, v2);
        Assert.assertEquals(result, 1);

        v1 = "1.3.1";
        v2 = "1.3.1";
        result = CompareVersions.compareVersion(v1, v2);
        Assert.assertEquals(result, 0);
    }

    @Test(expected = NumberFormatException.class)
    public void testCompareVersionsInvalidInput() throws Exception {
        String v1 = ".1.2";
        String v2 = ".1.2.9.9.9.9";
        CompareVersions.compareVersion(v1, v2);
    }
}