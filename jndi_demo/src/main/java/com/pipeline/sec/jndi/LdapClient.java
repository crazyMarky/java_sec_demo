package com.pipeline.sec.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;

public class LdapClient {
    public static void main(String[] args) {
        try {
            String uri = "ldap://127.0.0.1:1099/listen";
            Context ctx = new InitialContext();
            ctx.lookup(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
