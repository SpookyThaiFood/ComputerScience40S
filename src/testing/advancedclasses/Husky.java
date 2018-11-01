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
public class Husky extends ComputerScienceStudent {

    public Husky(int studentNumber, String name, int age, boolean isMale) {
        super(studentNumber, name, age, isMale);
    }
    
    @Override
    public String toString() {
        return "Husky " + super.toString();
    }
    
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Husky clone() {
        return this;
    }

}
