/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.structural;

import junit.framework.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.structural.brigde.BigBus;
import philaman.cput.designpattern.structural.brigde.BigEngine;
import philaman.cput.designpattern.structural.brigde.SmallCar;
import philaman.cput.designpattern.structural.brigde.SmallEngine;
import philaman.cput.designpattern.structural.brigde.Vehicle;

/**
 *
 * @author phila
 */
public class BrigdeTest {

    public BrigdeTest() {
    }

    @Test
    public void patternTest() {
        Vehicle vehicle = new BigBus(new SmallEngine());
        vehicle.drive();
        Assert.assertEquals("The vehicle is going at a slow speed.", vehicle.reportOnSpeed(100));

        vehicle.setEngine(new BigEngine());
        vehicle.drive();
        Assert.assertEquals("The vehicle is going at a slow speed.", vehicle.reportOnSpeed(350));

        Vehicle vehicle1 = new SmallCar(new BigEngine());
        vehicle1.drive();
        Assert.assertEquals("The vehicle is going at a fast speed.", vehicle1.reportOnSpeed(350));
        vehicle.setEngine(new SmallEngine());
        vehicle1.drive();
        Assert.assertEquals("The vehicle is going at average speed.", vehicle1.reportOnSpeed(100));
    }
}
