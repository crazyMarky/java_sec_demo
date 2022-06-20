package com.pipeline.sec.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;

public class RMIClient {
    public static void main(String[] args) {
        try {
            System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");
            String uri = "rmi://127.0.0.1:1099/hello";
            Context ctx = new InitialContext();
            ctx.lookup(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
