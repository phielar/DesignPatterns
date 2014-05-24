/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.structural.decorator;

/**
 *
 * @author phila
 */
public class GrowlDecorator extends AnimalDecorator{

    public GrowlDecorator(Animal a) {
        super(a);
    }

    
    @Override
    public String describe() {
       return animal.describe()+growl();       
    }

    private String growl() {
       return "Grrrrr.";
    }
    
}
