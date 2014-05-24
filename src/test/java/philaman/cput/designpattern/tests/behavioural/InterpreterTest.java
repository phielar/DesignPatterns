/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.interpreter.AndExpression;
import philaman.cput.designpattern.behavioural.interpreter.Expression;
import philaman.cput.designpattern.behavioural.interpreter.OrExpression;
import philaman.cput.designpattern.behavioural.interpreter.TerminalExpression;

/**
 *
 * @author phila
 */
public class InterpreterTest {

    public InterpreterTest() {
    }

    @Test
    public void patternTest() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        Expression isMale = new OrExpression(robert, john);
        Assert.assertTrue(isMale.interpret("John"));

        Expression julia = new TerminalExpression("Julia");
        Expression married = new TerminalExpression("is Married");
        Expression isMarriedWomen = new AndExpression(julia, married);
        Assert.assertTrue(isMarriedWomen.interpret("Julia is Married"));

       
    }
}
