/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.behavioural.chainOfResponsibility;

/**
 *
 * @author phila
 */
public class Venushandler extends PlanetHandler {

    @Override
    public String handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.VENUS) {
            return "VenusHandler handles " + request + " Venus is poisonous.";
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
            return "venusHandler doesn't handle " + request;
        }
    }

}
