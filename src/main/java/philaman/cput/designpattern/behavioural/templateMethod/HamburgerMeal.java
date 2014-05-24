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
public class HamburgerMeal extends Meal {

    @Override
    public String prepareIngrediants() {
        return "Getting burgers, Buns and french fries, ";
    }

    @Override
    public String cleanUp() {
        return "Throwing away paper plates.";
    }

    @Override
    public String cook() {
        return "Cooking burgers on grill and fries in oven, ";
    }

}
