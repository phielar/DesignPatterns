/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.creational.builder;

/**
 *
 * @author phila
 */
public class Student {

    private String name;
    private String lastname;

    private Student() {
    }

    private Student(Builder build) {
        name = build.name;
        lastname = build.lastname;
    }

    public static class Builder {

        public String name;
        public String lastname;

        public Builder(String value) {
            this.name = value;
        }

        public Builder lastname(String value) {
            this.lastname = value;
            return this;
        }

        public Builder Build(Student p) {
            this.name = p.getName();
            this.lastname = p.getLastname();
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

}
