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
public class Wachs extends ComputerScienceTeacher {

    public Wachs(String name) {
        super(name);
    }
    
    @Override
    public String toString() {
        return "Wachs " + super.toString();
    }
    
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Wachs clone() {
        return this;
    }

}
