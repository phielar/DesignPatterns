/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.strategy.Context;
import philaman.cput.designpattern.behavioural.strategy.HikeSTrategy;
import philaman.cput.designpattern.behavioural.strategy.SkiStrategy;
import philaman.cput.designpattern.behavioural.strategy.Strategy;

/**
 *
 * @author phila
 */
public class StrategyTest {

    public StrategyTest() {
    }

    @Test
    public void patternTest() {

        int temperatureInf = 60;
        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(temperatureInf, skiStrategy);

        Assert.assertEquals(context.getResult(), false);

        Strategy hikeStrategy = new HikeSTrategy();
        context.setStrategy(hikeStrategy);

        Assert.assertEquals(context.getResult(), true);

    }
}
