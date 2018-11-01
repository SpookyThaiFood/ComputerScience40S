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
public class Meeting {

    private Person[] members;
    private int count;
    private final int MAX_MEMBERS;
    
    public Meeting() {
        count = 0;
        MAX_MEMBERS = 100;
        members = new Person[MAX_MEMBERS];
    }
    
    @Override
    public String toString() {
        return "Meeting " + super.toString();
    }
    
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Meeting clone() {
        return this;
    }
    
    public void attend(Person person) {
        members[count] = person;
        count++;
        
        if (count > MAX_MEMBERS) {
            count = 0;
        }
    }
    
    public void hold() {
        
        System.out.println("Let's begin... Fkn kiwis! Am I right? There are " + Student.totalStudents + " students");
        
        // Enhanced for loop
        for (Person member : members) {
            if (member != null) {
                member.talk();
                if (member instanceof Wachs) {
                    System.out.println("SHUT UP PEASANTS!!");
                }
            }
        }
    }

}
