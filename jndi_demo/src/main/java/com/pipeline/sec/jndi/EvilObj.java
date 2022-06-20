package com.pipeline.sec.jndi;

import java.io.IOException;
import java.rmi.Remote;

public class EvilObj implements TestRef, Remote {
//    public EvilObj()  {
//        Runtime rt = Runtime.getRuntime();
//        String[] commands = {"/bin/sh", "-c", "open /System/Applications/Calculator.app"};
//        try {
//            rt.exec(commands);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public String say(String s) {
        return s+666;
    }
}
