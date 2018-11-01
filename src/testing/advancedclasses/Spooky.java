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
public class Spooky extends Person {

    public Spooky(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }
    
    @Override
    public String toString() {
        return "Spooky " + super.toString();
    }
    
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Spooky clone() {
        return this;
    }

}
