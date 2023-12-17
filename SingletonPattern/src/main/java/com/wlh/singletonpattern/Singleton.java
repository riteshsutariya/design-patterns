/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wlh.singletonpattern;

/**
 *
 * @author ritesh
 */
public class Singleton {

    private static Singleton instace;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }

        this.value = value;
    }

//    if we write method like this it may create more than one object of class, as we're using thread concept
    public static Singleton getInstance(String value) {
        if (instace == null) {
            instace = new Singleton(value);
        }
        return instace;
    }

//    to overcome the situation we need to use synchronized block(where the object is being created)
    public static Singleton getThreadSafeInstace(String value)
    {
        synchronized (Singleton.class) {
            if(instace==null)
            {
                instace=new Singleton(value);
            }
            return instace;
        }
    }
}
