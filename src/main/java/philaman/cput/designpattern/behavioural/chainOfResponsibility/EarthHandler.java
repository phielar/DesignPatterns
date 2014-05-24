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
public class EarthHandler extends PlanetHandler {

    @Override
    public String handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.EARTH) {
            return "EarthHandler handles " + request + " Earth is comfortable.";
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
            return "EarthHandler doesn't handle " + request;
        }
    }
}
