/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.structural;

import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.structural.decorator.Animal;
import philaman.cput.designpattern.structural.decorator.GrowlDecorator;
import philaman.cput.designpattern.structural.decorator.LegDecorator;
import philaman.cput.designpattern.structural.decorator.LivingAnimal;
import philaman.cput.designpattern.structural.decorator.WingDecorator;

/**
 *
 * @author phila
 */
public class DecoratorTest {

    public DecoratorTest() {
    }

    @Test
    public void testDecoratorPattern() {

        Animal animal = new LivingAnimal();
        Assert.assertEquals(animal.describe(), "I am an animal ");

        animal = new LegDecorator(animal);
        Assert.assertEquals(animal.describe(), "I am an animal , I have legs and I can dance.");

        animal = new WingDecorator(animal);
        Assert.assertEquals(animal.describe(), "I am an animal , I have legs and I can dance.I have wings and I can fly.");

        animal = new GrowlDecorator(animal);
        Assert.assertEquals(animal.describe(), "I am an animal , I have legs and I can dance.I have wings and I can fly.Grrrrr.");
    }

}
