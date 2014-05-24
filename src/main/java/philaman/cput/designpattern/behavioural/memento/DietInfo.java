/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.designpattern.behavioural.memento;

/**
 *
 * @author phila
 */
public class DietInfo {

    String personName;
    int dayNumber;
    int weight;

    public DietInfo(String personName, int dayNumber, int weight) {
        this.personName = personName;
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + personName + ", day number:" + dayNumber + ", weight:" + weight;
    }

    public void setDayNumberAndWeight(int dayNumber, int weight) {
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    public Memento save() {
        return new Memento(personName, dayNumber, weight);
    }

    public void restore(Object objMemento) {
        Memento memento = (Memento) objMemento;
        personName = memento.mementoPersonName;
        dayNumber = memento.mementoDayNumber;
        weight = memento.mementoWeight;
    }

    private class Memento {

        public String mementoPersonName;
        public int mementoDayNumber;
        public int mementoWeight;

        public Memento(String mementoPersonName, int mementoDayNumber, int mementoWeight) {
            this.mementoPersonName = mementoPersonName;
            this.mementoDayNumber = mementoDayNumber;
            this.mementoWeight = mementoWeight;
        }

    }

}
