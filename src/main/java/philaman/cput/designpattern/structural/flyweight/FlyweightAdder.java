/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.structural.flyweight;

/**
 *
 * @author phila
 */
public class FlyweightAdder implements Flyweight{

    String operations;

    public FlyweightAdder() {
        operations="adding ";
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.getStackTrace();
        }
    }
    
    @Override
    public String doMaths(int a, int b) {
        return operations+a+" and "+b+" : "+(a+b);
    }
    
}
