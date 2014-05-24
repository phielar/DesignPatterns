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
public class Context {
    
    int temperatureInf;
    Strategy strategy;

    public Context(int temperatureInf, Strategy strategy) {
        this.temperatureInf = temperatureInf;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setTemperatureInf(int temperatureInf) {
        this.temperatureInf = temperatureInf;
    }
    
    public boolean getResult(){
        return strategy.checkTemperature(temperatureInf);
    }
    
}
