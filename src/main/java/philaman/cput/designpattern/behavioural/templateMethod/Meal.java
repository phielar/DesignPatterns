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
public abstract class Meal {

    public final String doMeal() {
        return prepareIngrediants() + cook() + eat() + cleanUp();
    }

    public abstract String prepareIngrediants();

    public String eat() {
        return "Mmm, that's good, ";
    }

    public abstract String cleanUp();

    public abstract String cook();

}
