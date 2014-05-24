/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.structural;

import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.structural.flyweight.Flyweight;
import philaman.cput.designpattern.structural.flyweight.FlyweightFactory;

/**
 *
 * @author phila
 */
public class FlyweightTest {

    public FlyweightTest() {
    }

    @Test
    public void testFlyweight() {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
        Assert.assertEquals(flyweightAdder.doMaths(5, 10), "adding " + 5 + " and " + 10 + " : " + (5 + 10));

        Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
        Assert.assertEquals(flyweightMultiplier.doMaths(5, 10), "multiplying " + 5 + " and " + 10 + " : " + (5 * 10));
    }
}
