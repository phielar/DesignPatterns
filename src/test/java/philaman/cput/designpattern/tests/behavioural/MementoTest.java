/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.memento.DietInfo;
import philaman.cput.designpattern.behavioural.memento.DietInfoCaretaker;

/**
 *
 * @author phila
 */
public class MementoTest {

    public MementoTest() {
    }

    @Test
    public void patternTest() {
        DietInfoCaretaker deitInfoCaretaker = new DietInfoCaretaker();
        DietInfo dietInfo = new DietInfo("Fred", 1, 100);

        dietInfo.setDayNumberAndWeight(2, 99);
        deitInfoCaretaker.saveState(dietInfo);
        dietInfo.setDayNumberAndWeight(3, 98);
        dietInfo.setDayNumberAndWeight(4, 97);
        Assert.assertEquals("Name: Fred, day number:4, weight:97", dietInfo.toString());

        deitInfoCaretaker.restoreState(dietInfo);
        Assert.assertEquals("Name: Fred, day number:2, weight:99", dietInfo.toString());

    }
}
