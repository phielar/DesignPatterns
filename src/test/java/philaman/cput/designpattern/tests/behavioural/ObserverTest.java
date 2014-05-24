/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.observer.WeatherCustomer1;
import philaman.cput.designpattern.behavioural.observer.WeatherCustomer2;
import philaman.cput.designpattern.behavioural.observer.WeatherStation;

/**
 *
 * @author phila
 */
public class ObserverTest {

    public ObserverTest() {
    }

    @Test
    public void patternTest() {

        WeatherStation weatherStation = new WeatherStation(33);

        WeatherCustomer1 wc1 = new WeatherCustomer1();
        WeatherCustomer2 wc2 = new WeatherCustomer2();

        weatherStation.addObserver(wc1);
        weatherStation.addObserver(wc2);

        weatherStation.setTemperature(34);
        weatherStation.doNotify();

        Assert.assertEquals("Weather customer1 just found out the temperature is: 34", wc1.doUpdate(34));

        weatherStation.removeObserver(wc1);

        Assert.assertEquals("Weather customer2 just found out the temperature is: 29", wc2.doUpdate(29));

    }
}
