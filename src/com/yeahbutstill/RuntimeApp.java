package com.yeahbutstill;

public class RuntimeApp {
    public static void main(String[] args) {
        // Created runtime
        Runtime runtime = Runtime.getRuntime();

        // Memory JVM
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
        System.gc();
    }
}
