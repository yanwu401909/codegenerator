package com.up72.framework.generator.util;

public class SystemHelper {
    public static boolean isWindowsOS = System.getProperty("os.name").toLowerCase().indexOf("windows")>= 0;
}
