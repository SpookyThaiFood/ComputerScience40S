/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.advancedclasses;

/**
 *
 * @author t.swaity
 */
public class AdvancedClassesTest {

    public AdvancedClassesTest() {
        System.out.println("Advanced classes unti started...");

        Person person = new Person();
        Person secondPerson = new Person();

        person.talk();
//        secondPerson.name = "Bitch, bitchington";
        secondPerson.talk();

        Student greg = new Student(34);
        Student rodrick = new Student(35);

        greg.talk();

        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object1;

        System.out.println(object1.toString());
        System.out.println(object2.toString());
        System.out.println(object3.toString());

        if (object1.equals(object2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("Advanced classes unit complete");
    }

}
