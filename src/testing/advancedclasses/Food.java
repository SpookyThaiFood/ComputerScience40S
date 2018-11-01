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
public abstract class Food {
    
    protected String group;

    public Food() {
        
    }
    
    @Override
    public String toString() {
        return "Fod " + super.toString();
    }
    
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
    
    @Override
    public Food clone() {
        return this;
    }
    
    public void spoil() {
        System.out.println("yuck");
    }
    
    public abstract void eat();
    
    public abstract void shouldCook();

}
