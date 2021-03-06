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
public class WingDecorator extends AnimalDecorator{

    public WingDecorator(Animal animal) {
        super(animal);
    }

    
    @Override
    public String describe() {
        return animal.describe()+"I have wings and "+growl();
    }

    private String growl() {
      return "I can fly.";
    }
    
}
