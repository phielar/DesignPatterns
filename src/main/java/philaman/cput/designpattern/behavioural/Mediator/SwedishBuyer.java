/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.behavioural.Mediator;

/**
 *
 * @author phila
 */
public class SwedishBuyer extends Buyer{

    public SwedishBuyer(Mediator mediator) {
        super(mediator, "Krone");
        this.mediator.registerSwedishBuyer(this);
    }
    
}