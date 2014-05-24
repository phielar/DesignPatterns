/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.designpattern.creational.factory;

/**
 *
 * @author phila
 */
public class GolfFactory {
    private static GolfFactory golfFactory=null;
    public Golf getGolf(String type){
        if("GTI".equals(type))
            return new Golf5();
        else
            return new Golf4();
    }
    public static GolfFactory getGolfFactoryInstance(){
        if(golfFactory==null)
            golfFactory=new GolfFactory();
        
        return golfFactory;
    }
}
