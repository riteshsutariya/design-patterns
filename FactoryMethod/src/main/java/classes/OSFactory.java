/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.OS;

/**
 *
 * @author ritesh
 */
public class OSFactory {
    public OS getOSInstance(String hint)
    {
        if(hint.equals("cheap"))
        {
            return new Android();
        }else if(hint.equals("power"))
        {
            return new Linux();
        }else if(hint.equals("secure"))
        {
            return new IOS();
        }else if(hint.equals("black"))
        {
            return new BlackberryOS();
        }
        else{
            return new Windows();
        }
    }
}
