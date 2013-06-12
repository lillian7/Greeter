package com.greeter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/12/13
 * Time: 3:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class GreeterTest {

    @Test

    public void greet_to_world(){

        Greeter greeter = new Greeter();

        String greeting = greeter.greetToWorld();

         assertThat(greeting,is("Hello World."));
    }
    @Test

    public void greet_to_person(){


        Person person = new Person("lillian");
        Greeter greeter = new Greeter();

        String greeting = greeter.greetToPerson(person);

         assertThat(greeting,is("Hello lillian"));

    }

         @Test

    public void get_another_person_name(){
             Person person = new Person("lillian");


             String name = person.getName();



         }

}
