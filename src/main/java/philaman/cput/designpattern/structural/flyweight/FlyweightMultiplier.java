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
public class FlyweightMultiplier implements Flyweight {

    String operation;

    public FlyweightMultiplier() {
        operation = "multiplying ";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    @Override
    public String doMaths(int a, int b) {
        return operation + a + " and " + b + " : " + (a * b);
    }
}
