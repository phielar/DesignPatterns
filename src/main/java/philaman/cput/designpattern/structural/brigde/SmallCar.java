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
public class SmallCar extends Vehicle{

    public SmallCar(Engine e) {
        this.weightInKilos=600;
        this.engine=e;
    }

    @Override
    public void drive() {
        int horsepower=engine.go();
        reportOnSpeed(horsepower);
    }
    
}
