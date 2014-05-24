/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.creational.abstractfactory;

/**
 *
 * @author phila
 */
public class AnimalAbstractFactory {
    
    public SpeciesFactory getSpeciesFactory(String type){
        if("mammal".equals(type))
            return new MamalFactory();
        else
            return new ReptileFactory();
    }
}
