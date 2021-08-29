package test.java;

import main.java.CompareVersionsImpl;
import main.java.ICompareVersions;
import org.junit.Assert;
import org.junit.Test;

public class CompareVersionsTest {

    @Test
    public void testCompareVersions() throws Exception {
        String v1 = "1.2";
        String v2 = "1.2.9.9.9.9";
        ICompareVersions compareVersions = new CompareVersionsImpl();
        int result = compareVersions.compareVersion(v1, v2);
        Assert.assertEquals(result, -1);

        v1 = "1.20.9.9.9.9";
        v2 = "1.3";
        result = compareVersions.compareVersion(v1, v2);
        Assert.assertEquals(result, 1);

        v1 = "1.3.1";
        v2 = "1.3.1";
        result = compareVersions.compareVersion(v1, v2);
        Assert.assertEquals(result, 0);
    }

    @Test(expected = NumberFormatException.class)
    public void testCompareVersionsInvalidInput() throws Exception {
        String v1 = ".1.2";
        String v2 = ".1.2.9.9.9.9";
        ICompareVersions compareVersions = new CompareVersionsImpl();
        int result = compareVersions.compareVersion(v1, v2);
    }
}