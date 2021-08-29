package main.java;

public class CompareVersionsImpl implements ICompareVersions{

    /**
     * <p>
     * This method takes two version numbers version1 and version2.
     * @param version1
     * @param version2
     * @return result based on the comparison
     * **/
    @Override
    public int compareVersion(String version1, String version2) {
        String[] numsArray1 = version1.split("\\.");
        String[] numsArray2 = version2.split("\\.");
        int n1 = numsArray1.length, n2 = numsArray2.length;

        // compare versions
        int i1, i2;
        for (int i = 0; i < Math.max(n1, n2); ++i) {
            i1 = i < n1 ? Integer.parseInt(numsArray1[i]) : 0;
            i2 = i < n2 ? Integer.parseInt(numsArray2[i]) : 0;
            if (i1 != i2) {
                return i1 > i2 ? 1 : -1;
            }
        }
        // the versions are equal
        return 0;
    }
}
