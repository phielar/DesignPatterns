/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.creational;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import philaman.cput.designpattern.creational.factory.Golf;
import philaman.cput.designpattern.creational.factory.GolfFactory;

/**
 *
 * @author phila
 */
public class factoryTest {

    public factoryTest() {
    }

    @Test
    public void factoryGolfTest() {
        GolfFactory golfFactory = GolfFactory.getGolfFactoryInstance();
        Golf g1 = golfFactory.getGolf("GTI");
        Assert.assertEquals(g1.getSpeed(), "320km/h");

        Golf g2 = golfFactory.getGolf("G4");
        Assert.assertEquals(g2.getSpeed(), "280km/h");

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
