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
public class Icecream extends Food {

    public Icecream() {
        super("Desert");
    }

    @Override
    public void eat() {
        System.out.println("With chopsticks");
    }

    @Override
    public boolean shouldCook() {
        return true;
    }

}
