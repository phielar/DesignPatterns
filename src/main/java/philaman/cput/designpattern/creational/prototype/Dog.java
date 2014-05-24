/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.creational.prototype;

/**
 *
 * @author phila
 */
public class Dog implements Prototype {

    public static Dog dog = null;
    String sound;

    private Dog(String sound) {
        this.sound = sound;
    }

    public static Dog getDogSoundInstance(String sound) {
        if (dog == null) {
            dog = new Dog(sound);
        }
        return dog;
    }

    @Override
    public Prototype doClone() {
        return new Dog(sound);
    }

    @Override
    public String toString() {
        return "This dog says " + sound; //To change body of generated methods, choose Tools | Templates.
    }

}
