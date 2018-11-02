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
public class Banana extends Food {

    public Banana() {
        super("Contains very dangerous elements");
    }

    @Override
    public void eat() {
        System.out.println("Just do it!!!");
    }

    @Override
    public boolean shouldCook() {
        return false;
    }

}
