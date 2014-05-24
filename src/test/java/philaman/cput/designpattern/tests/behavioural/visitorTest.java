/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.visitor.NumberElement;
import philaman.cput.designpattern.behavioural.visitor.NumberVisitor;
import philaman.cput.designpattern.behavioural.visitor.SumVisitor;
import philaman.cput.designpattern.behavioural.visitor.ThreeElement;
import philaman.cput.designpattern.behavioural.visitor.TotalVisitor;
import philaman.cput.designpattern.behavioural.visitor.TwoElement;

/**
 *
 * @author phila
 */
public class visitorTest {

    public visitorTest() {
    }

    @Test
    public void patternTest() {
        TwoElement twoElement = new TwoElement(5, 2);
        TwoElement twoElement1 = new TwoElement(4, 2);
        ThreeElement threeElement = new ThreeElement(2, 3, 5);

        NumberVisitor sumVisitor=new SumVisitor();
        Assert.assertEquals(7, sumVisitor.visit(twoElement));
        
        List<NumberElement> numberElements=new ArrayList<>();
        numberElements.add(twoElement);
        numberElements.add(twoElement1);
        numberElements.add(threeElement);
        
        TotalVisitor totalNumberVisitor=new TotalVisitor();
        totalNumberVisitor.visit(numberElements);
        Assert.assertEquals(16, totalNumberVisitor.getTotalSum());
        
        
    }
    
    }