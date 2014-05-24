/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.structural;

import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.structural.proxy.FastThing;
import philaman.cput.designpattern.structural.proxy.Proxy;

/**
 *
 * @author phila
 */
public class ProxyTest {

    public ProxyTest() {
    }

    @Test
    public void proxyPatternTest() {

        Proxy proxy = new Proxy();
        FastThing fastThing = new FastThing();
        Assert.assertEquals(fastThing.sayHello(), "FastThing says howdy at "+new Date());
        Assert.assertEquals(proxy.sayHello(), "SlowThing says howdy at "+new Date());
    }

}
