/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.templateMethod.CheeseBurgerMeal;
import philaman.cput.designpattern.behavioural.templateMethod.HamburgerMeal;
import philaman.cput.designpattern.behavioural.templateMethod.Meal;

/**
 *
 * @author phila
 */
public class TemplateMethodTest {

    public TemplateMethodTest() {
    }

    @Test
    public void testTemplateMethodPattern() {
        Meal meal = new CheeseBurgerMeal();
        Assert.assertEquals(meal.doMeal(), "Getting ground beef and cheese, Cooking ground beef in pan, The Cheese Burgers are tasty, Doing the dishes.");
        Meal meal1 = new HamburgerMeal();
        Assert.assertEquals(meal1.doMeal(), "Getting burgers, Buns and french fries, Cooking burgers on grill and fries in oven, Mmm, that's good, Throwing away paper plates.");
    }
}
