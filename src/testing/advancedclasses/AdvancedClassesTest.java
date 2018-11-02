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
        
        Student jeff = new Student(21, "Jeff Moore", 21, true);
        Student jenko = new Student(22, "Jenko Jones", 22, true);
        
        System.out.println(jeff.toString());
        System.out.println(jenko.toString());
        
        Student bob = jeff.clone();
        
        System.out.println(bob.toString());
        
        if (jeff.equals(bob)) System.out.println("Jeff = bob");
        if (!jeff.equals(jenko)) System.out.println("Jeff != jenko");
        
        

        System.out.println("Advanced classes unit complete");
        
        
//        Teacher wachs = new Teacher("Mr. Wachs");
//        wachs.addStudent(greg);
//        wachs.addStudent(jenko);
//        wachs.addStudent(jeff);
//        wachs.addStudent(bob);
//        wachs.addStudent(rodrick);
//        System.out.println(wachs.toString());
        System.out.println("end");
        
        checkStatus(person);
        System.out.println("\n");
        checkStatus(greg);
        System.out.println("\n");
        checkStatus(object1);
//        System.out.println("\n");
//        checkStatus(wachs);
        System.out.println("\n");
        
        char[] waord = { 'w', 'a', 'o', 'r', 'd' };
        
        String string = new String(waord);
        checkStatus(waord);
        
        System.out.println(Student.totalStudents);
        Person.endOfTheWorld();
        
        Phantom danny = new Phantom("Danny Phantom", 14, true);
        
        Poltergeist geist = new Poltergeist("Geist Fierry", 50, true);
        
        Haunted haunted = new Haunted();
        
        Husky havoc = new Husky(2550, "Havoc", 11, true);
        Wachs wachs = new Wachs("Wachs");
        
        System.out.println(geist.toString());
        
        Meeting meeting = new Meeting();
        
        meeting.attend(geist);
        meeting.attend(wachs);
        meeting.attend(danny);
        
        meeting.hold();
        
        Icecream youscream = new Icecream();
        
        danny.consume(youscream);
    }
    
    private void checkStatus(Object object) {
        
        if (object instanceof Student) System.out.println("Have a student");
        
        else if (object instanceof Teacher) System.out.println("Have a teacher");
        
        else if (object instanceof Person) System.out.println("Have a person");
        
        else if (object instanceof String) System.out.println("Have a string");
        
        else System.out.println("Fucking kiwis dude.. Like.. What the fuck?");
        
    }

}
