package philaman.cput.designpattern.tests.creational;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import philaman.cput.designpattern.creational.singleton.Vehicle;

/**
 *
 * @author phila
 */
public class SingletonTest {
    
    public SingletonTest() {
    }

    @Test
    public void singletonVehicleTest() {
        Vehicle v1 = Vehicle.getInstance();        
        
        Vehicle v2 = Vehicle.getInstance();
        
        Assert.assertEquals(v1.getMaketype(), "BMW");
        Assert.assertSame(v1, v2);
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
