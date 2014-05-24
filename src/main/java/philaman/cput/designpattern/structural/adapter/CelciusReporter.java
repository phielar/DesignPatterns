/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.structural.adapter;

/**
 *
 * @author phila
 */
//Adapter Class
public class CelciusReporter {

    public double temperatureInC;
    public static CelciusReporter celciusReporter = null;

    public CelciusReporter() {
    }

    public static CelciusReporter getCelciusReporterInstance() {
        if (celciusReporter == null) {
            celciusReporter = new CelciusReporter();
        }
        return celciusReporter;
    }

    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
    
    public double getTemperatureInc() {
        return temperatureInC;
    }

}
