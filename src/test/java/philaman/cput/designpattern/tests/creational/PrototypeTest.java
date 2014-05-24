/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.tests.creational;

import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.designpattern.creational.prototype.Dog;
import philaman.cput.designpattern.creational.prototype.Person;

/**
 *
 * @author phila
 */
public class PrototypeTest {
   
    public PrototypeTest() {
    }
    
    @Test
    public void protoTypeTest(){
        Person p=Person.getPersonInstance("Fred");
        Person p1=(Person)p.doClone();
        Assert.assertEquals(p1.toString(), "This person is named Fred");
    
        Dog d=Dog.getDogSoundInstance("Wooof");
        Dog d1=(Dog)d.doClone();
        
        Assert.assertEquals(d1.toString(), "This dog says Wooof");
    }
    
    
}
