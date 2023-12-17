/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.wlh.factorymethod;

import classes.Android;
import classes.Linux;
import classes.OSFactory;
import interfaces.OS;

/**
 *
 * @author ritesh
 */
public class FactoryMethod {

    public static void main(String[] args) {
        OSFactory factory=new OSFactory();
        OS os=factory.getOSInstance("secure");
        os.spec();
        os=factory.getOSInstance("cheap");
        os.spec();
        os=factory.getOSInstance("blahblahblah");
        os.spec();
        os=factory.getOSInstance("black");
        os.spec();
    }
}
