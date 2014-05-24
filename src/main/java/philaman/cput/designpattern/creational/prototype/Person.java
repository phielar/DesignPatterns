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
public class Person implements Prototype {

    public static Person person = null;
    private String name = null;

    private Person(String name) {
        this.name = name;
    }

    public static Person getPersonInstance(String name) {
        if (person == null) {
            person = new Person(name);
        }
        return person;
    }

    @Override
    public Prototype doClone() {
        return new Person(name);
    }

    @Override
    public String toString() {
        return "This person is named " + name; //To change body of generated methods, choose Tools | Templates.
    }

}
