/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.structural;

import junit.framework.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.structural.facade.Facade;

/**
 *
 * @author phila
 */
public class FacadeTest {

    public FacadeTest() {
    }

    @Test
    public void cubeFacadeTest() {
        Facade facade = new Facade();
        Assert.assertEquals(27, facade.cubeI(3));
        Assert.assertEquals(54, facade.cubeITme2(3));
        Assert.assertEquals(1458, facade.xToSixthTimes2(3));
    }

}
