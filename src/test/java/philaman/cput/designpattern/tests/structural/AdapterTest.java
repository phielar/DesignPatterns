/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.structural;

import junit.framework.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.structural.adapter.TemperatureClassReporter;
import philaman.cput.designpattern.structural.adapter.TemperatureInfo;
import philaman.cput.designpattern.structural.adapter.TemperatureObjectReporter;

/**
 *
 * @author phila
 */
public class AdapterTest {

    public AdapterTest() {
    }

    @Test
    public void adapterTest() {
        TemperatureInfo temperatureInfo1 = new TemperatureClassReporter();
        temperatureInfo1.setTemperatureInC(0);
        Assert.assertEquals(temperatureInfo1.getTemperatureInF(), -17.77777777777778, 0.1);
        
        TemperatureInfo info=new TemperatureObjectReporter();        
        info.setTemperatureInF(-17);
        Assert.assertEquals(info.getTemperatureInC(), 1.3999999999999986, 0.1);
    }
}
