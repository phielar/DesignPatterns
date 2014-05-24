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
public class Facade {
    
    public int cubeI(int x){
        Class1 class1=new Class1();
        return class1.doSomethingComplecated(x);
    }
    
    public int cubeITme2(int x){
        Class2 class2=new Class2();
        Class1 class1=new Class1();
        return class2.doAnotherThink(class1, x);
    }

    public int xToSixthTimes2(int x){
        Class1 class1=new Class1();
        Class2 class2=new Class2();
        Class3 class3=new Class3();
        return class3.doMoreStaff(class1, class2, x);
    }
}