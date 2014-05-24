/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.structural.composite;

/**
 *
 * @author phila
 */
public class Leaf implements Component{

    String name;

    public Leaf(String name) {
        this.name = name;
    }
    
    @Override
    public String sayHello() {
        return name+ " leaf says hello";
    }

    @Override
    public String sayGoodbye() {
        return name +" leaf says goodbye";
    }
    
    
}
