/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.structural.brigde;

/**
 *
 * @author phila
 */
public abstract class Vehicle {
    Engine engine;
    int weightInKilos;
    
    public abstract void drive();
    
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    
    public String reportOnSpeed(int horsepower){
        int ratio = weightInKilos / horsepower;
        if(ratio < 3)
            return "The vehicle is going at a fast speed.";
        else if((ratio >=3) && (ratio <8))
            return "The vehicle is going at average speed.";
        else 
            return "The vehicle is going at a slow speed.";
    }
}
