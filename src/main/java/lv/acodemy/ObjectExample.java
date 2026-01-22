package lv.acodemy;

import lv.acodemy.objects.Car;

public class ObjectExample {
    public static void main (String[] args) {

        //Encapsulation  - данные защищены от доступа из вне, доступ к данным только через методы (getters, Setters)
        //Inheritance  -  один клас может наследовать методы и свойства другого
        //Polymorphism - один метода может работать по разному
        //Abstraction - срытие

        Car audi = new Car();
        audi.start();
        System.out.println(audi);






    }
}
