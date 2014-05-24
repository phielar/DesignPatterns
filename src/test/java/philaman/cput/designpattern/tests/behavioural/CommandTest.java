/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import org.junit.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.command.Command;
import philaman.cput.designpattern.behavioural.command.DinerCommand;
import philaman.cput.designpattern.behavioural.command.Dinner;
import philaman.cput.designpattern.behavioural.command.Lunch;
import philaman.cput.designpattern.behavioural.command.LunchCommand;
import philaman.cput.designpattern.behavioural.command.MealInvoker;

/**
 *
 * @author phila
 */
public class CommandTest {

    public CommandTest() {
    }

    @Test
    public void patternTest() {
        Lunch lunch = new Lunch();
        Command lunchCommand = new LunchCommand(lunch);

        Dinner dinner = new Dinner();
        Command dinnerCommand = new DinerCommand(dinner);

        MealInvoker mealInvoker = new MealInvoker(lunchCommand);
        Assert.assertEquals("Lunch is being made", mealInvoker.invoke());

        mealInvoker.setCommand(dinnerCommand);
        Assert.assertEquals("Dinner is being made", mealInvoker.invoke());
    }
}
