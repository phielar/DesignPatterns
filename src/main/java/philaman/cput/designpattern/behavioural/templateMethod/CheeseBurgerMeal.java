/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.behavioural.templateMethod;

/**
 *
 * @author phila
 */
public class CheeseBurgerMeal extends Meal {

    @Override
    public String prepareIngrediants() {
        return "Getting ground beef and cheese, ";
    }
    
    @Override
    public String cleanUp() {
        return "Doing the dishes.";
    }

    @Override
    public String eat() {
        return "The Cheese Burgers are tasty, "; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String cook() {
        return "Cooking ground beef in pan, ";
    }

}
