/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.structural;

import junit.framework.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.structural.composite.Composite;
import philaman.cput.designpattern.structural.composite.Leaf;

/**
 *
 * @author phila
 */
public class StucturalTest {

    public StucturalTest() {
    }

    @Test
    public void mainDriverTest() {

        Leaf leaf = new Leaf("Phila");
        Leaf leaf1 = new Leaf("Lima");
        Leaf leaf2 = new Leaf("Sim");
        Leaf leaf3 = new Leaf("Sibu");

        Composite composite = new Composite();
        composite.add(leaf);
        composite.add(leaf1);

        Assert.assertNotNull(composite);

        Composite composite1 = new Composite();
        composite1.add(composite);
        composite1.add(leaf3);
        composite1.add(leaf2);
        Assert.assertSame(composite, composite1.getComponent(0));
        Assert.assertEquals("Sim leaf says hello", composite1.getComponent(2).sayHello());
        Assert.assertEquals("Sim leaf says goodbye", composite1.getComponent(2).sayGoodbye());
        //Remove a composite
        composite1.remove(composite);
        Assert.assertEquals(composite1.getComponent(0), leaf3);

    }

}
