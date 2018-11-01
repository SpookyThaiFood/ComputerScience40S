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
public class Phantom extends Ghost {

    public Phantom(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Phantom clone() {
        return this;
    }

}
