/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.tests.behavioural;


import java.util.Iterator;
import org.junit.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.behavioural.iterator.Item;
import philaman.cput.designpattern.behavioural.iterator.Menu;

/**
 *
 * @author phila
 */
public class IteratorTest {

    public IteratorTest() {
    }

    @Test
    public void patternTest() {

        Item i1=new Item("spaghetti", 7.50f);
        Item i2=new Item("hambuger", 6.00f);
        Item i3=new Item("Chicken sandwich", 6.50f);
        
        Menu menu=new Menu();
        menu.addItem(i1);
        menu.addItem(i2);
        menu.addItem(i3);
        
        Iterator<Item> iterator=menu.iterator();
        Assert.assertEquals("spaghetti: R7.5",iterator.next().toString());
        iterator.hasNext();
        Assert.assertEquals("hambuger: R6.0",iterator.next().toString());
         
       
    }
    

}
