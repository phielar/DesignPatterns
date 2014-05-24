/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.behavioural.command;

/**
 *
 * @author phila
 */
public class DinerCommand implements Command{

    Dinner dinner;

    public DinerCommand(Dinner dinner) {
        this.dinner = dinner;
    }    
    
    @Override
    public String execute() {
       return dinner.makeDiner();
    }
    
}
