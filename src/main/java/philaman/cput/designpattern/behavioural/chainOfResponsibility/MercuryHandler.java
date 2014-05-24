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
public class MercuryHandler extends PlanetHandler {

    @Override
    public String handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.MERCURY) {
            return "MercuryHandler handles " + request + " Mercury us hot.";
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
            return "MercuryHandler doesn't handle " + request;
        }
    }

}
