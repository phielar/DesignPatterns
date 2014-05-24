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
public class TemperatureObjectReporter implements TemperatureInfo {

    CelciusReporter celciusReporter;

    public TemperatureObjectReporter() {
        celciusReporter = CelciusReporter.getCelciusReporterInstance();
    }

    @Override
    public double getTemperatureInF() {
        return celciusReporter.getTemperatureInc();
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusReporter.setTemperatureInC(cToF(temperatureInF));
    }

    @Override
    public double getTemperatureInC() {
        return celciusReporter.getTemperatureInc();
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        celciusReporter.setTemperatureInC(fToC(temperatureInC));
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }

}
