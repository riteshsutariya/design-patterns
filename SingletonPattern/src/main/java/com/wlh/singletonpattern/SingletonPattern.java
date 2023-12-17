/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.wlh.singletonpattern;

/**
 *
 * @author ritesh
 */
public class SingletonPattern {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
                + "If you see different values, then 2 singletons were created (booo!!)" + "\n\n"
                + "RESULT:" + "\n");
        Thread threadBar = new Thread(new ThreadBar());
        Thread threadFoo = new Thread(new ThreadFoo());
        
        threadBar.start();
        threadFoo.start();
    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getThreadSafeInstace("Foo");
            System.out.println("singleton.value: " + singleton.value);

        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getThreadSafeInstace("Bar");
            System.out.println("singleton.value: " + singleton.value);

        }
    }
}
