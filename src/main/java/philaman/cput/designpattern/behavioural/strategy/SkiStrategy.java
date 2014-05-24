/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.behavioural.strategy;

/**
 *
 * @author phila
 */
public class SkiStrategy implements Strategy{

    @Override
    public boolean checkTemperature(int temperature) {
      if(temperature <=32)
          return true;
      else 
          return false;
    }
    
}
