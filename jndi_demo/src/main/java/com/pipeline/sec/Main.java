package com.pipeline.sec;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        try {
//            Process exec = runtime.exec(new String[]{"open", "/System/Applications/Calculator.app"});
//            exec.waitFor();
            new java.lang.ProcessBuilder(new String[]{"open" ,"/System/Applications/Calculator.app"}).start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}