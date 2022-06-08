package com.pipeline.sec.jndi;

import java.rmi.Remote;

public class EvilObj implements TestRef, Remote {
//    public EvilObj() throws Exception {
//        Runtime rt = Runtime.getRuntime();
//        String[] commands = {"/bin/sh", "-c", "open /System/Applications/Calculator.app"};
//        rt.exec(commands);
//    }

    @Override
    public String say(String s) {
        return s+666;
    }
}
