/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import org.junit.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.chainOfResponsibility.EarthHandler;
import philaman.cput.designpattern.behavioural.chainOfResponsibility.MercuryHandler;
import philaman.cput.designpattern.behavioural.chainOfResponsibility.PlanetEnum;
import philaman.cput.designpattern.behavioural.chainOfResponsibility.PlanetHandler;
import philaman.cput.designpattern.behavioural.chainOfResponsibility.Venushandler;

/**
 *
 * @author phila
 */
public class ChainOfResponsibilityTest {

    public ChainOfResponsibilityTest() {
    }

    @Test
    public void patternTest() {

        PlanetHandler chain = setUpChain();
        Assert.assertEquals("MercuryHandler doesn't handle VENUS", chain.handleRequest(PlanetEnum.VENUS));
        Assert.assertEquals("MercuryHandler handles MERCURY Mercury us hot.", chain.handleRequest(PlanetEnum.MERCURY));
        Assert.assertEquals("MercuryHandler doesn't handle EARTH", chain.handleRequest(PlanetEnum.EARTH));
        Assert.assertEquals("MercuryHandler doesn't handle JUPITER", chain.handleRequest(PlanetEnum.JUPITER));

    }

    public static PlanetHandler setUpChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new Venushandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);
        return mercuryHandler;
    }

}
