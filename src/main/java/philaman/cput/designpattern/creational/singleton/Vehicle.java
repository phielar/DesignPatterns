/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.creational.singleton;

/**
 *
 * @author phila
 */
public class Vehicle {
    private static Vehicle vehicle=null;

    private Vehicle() {
    }
    
    public static Vehicle getInstance(){
        if(vehicle==null)
            vehicle=new Vehicle();
        
        return vehicle;
    }    
   
    public String getMaketype(){
        return "BMW";
    }
}
