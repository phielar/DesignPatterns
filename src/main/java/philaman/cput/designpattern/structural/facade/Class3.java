/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.structural.facade;

/**
 *
 * @author phila
 */
public class Class3 {
    
    public int doMoreStaff(Class1 class1, Class2 class2, int x)
    {
        return class1.doSomethingComplecated(x)*class2.doAnotherThink(class1, x);
    }
}
