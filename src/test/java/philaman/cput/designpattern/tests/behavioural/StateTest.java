/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import junit.framework.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.state.HappyState;
import philaman.cput.designpattern.behavioural.state.Person;
import philaman.cput.designpattern.behavioural.state.SadState;

/**
 *
 * @author phila
 */
public class StateTest {

    public StateTest() {
    }

    @Test
    public void patternTest() {

        Person person = new Person(new HappyState());
        Assert.assertEquals("Hello, friend!", person.sayHello());
        Assert.assertEquals("Bye, friend!", person.sayGoodbye());

        person.setEmotionalState(new SadState());
        Assert.assertEquals("Hello, Sniff, sniff", person.sayHello());
        Assert.assertEquals("Bye, Sniff, sniff", person.sayGoodbye());

    }
}
