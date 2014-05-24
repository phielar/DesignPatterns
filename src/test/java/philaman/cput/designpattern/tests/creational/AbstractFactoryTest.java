/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.creational;

import junit.framework.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.creational.abstractfactory.Animal;
import philaman.cput.designpattern.creational.abstractfactory.AnimalAbstractFactory;
import philaman.cput.designpattern.creational.abstractfactory.SpeciesFactory;

/**
 *
 * @author phila
 */
public class AbstractFactoryTest {

    AnimalAbstractFactory abstractFactory = new AnimalAbstractFactory();

    public AbstractFactoryTest() {
    }

    @Test
    public void testAbstractionFactory() {
        SpeciesFactory sf = abstractFactory.getSpeciesFactory("reptile");
        Animal a1 = sf.getAnimal("tyronnosaurus");

        Assert.assertEquals("Roar", a1.makeSound());

        SpeciesFactory sf1 = abstractFactory.getSpeciesFactory("mammal");
        Animal a = sf1.getAnimal("dog");
        Assert.assertEquals("Woof", a.makeSound());
    }
}
