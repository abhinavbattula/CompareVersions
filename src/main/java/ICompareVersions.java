package main.java;

/**
 * Sample interface that shows how a service can be implemented with a separate interface.
 * this interface cn be used as programmatic contract.
 * **/
public interface ICompareVersions {
   int compareVersion(String version1, String version2);
}
