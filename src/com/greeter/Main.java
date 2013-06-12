package com.greeter;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/12/13
 * Time: 4:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        Person solomon = new Person("Solomon");
        Greeter greeter = new Greeter();

         String greeting = greeter.greetToPerson(solomon);
        System.out.println(greeting);
    }
}
