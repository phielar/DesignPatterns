/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.behavioural.observer;

/**
 *
 * @author phila
 */
public class WeatherCustomer2 implements WeatherObserver{

    @Override
    public String doUpdate(int temperature) {
       return "Weather customer2 just found out the temperature is: "+temperature;
    }
    
}
