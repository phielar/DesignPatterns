/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.structural.brigde;

import philaman.cput.designpattern.structural.brigde.Vehicle;
/**
 *
 * @author phila
 */
public class BigBus extends Vehicle{

    public BigBus(Engine engine) {
        this.weightInKilos= 3000;
        this.engine=engine;
    }

    @Override
    public void drive() {
        int horsepower=engine.go();
        reportOnSpeed(horsepower);
    }
}
