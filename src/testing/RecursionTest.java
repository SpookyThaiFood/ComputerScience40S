/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import numbers.Calculator;

/**
 *
 * @author t.swaity
 */
public class RecursionTest {
    
    public RecursionTest() {
        
        System.out.println("Recursion test started...");
        
        int max = 70;
        int min = 0;
        
        // Factorials
        for (int i = 0; i < max; i++) {
            long ans = Calculator.factorial(i);
            System.out.println(ans);
        }
        
        max = 200;
        min = -max;
        // Powers
        for (int base = min; base <= max; base++) {
            for (int exp = min; exp <= max; exp++) {
                double ans = Calculator.power(base, exp);
                System.out.println(base + " base, exponent " + exp + " bitch " + ans);
            }
        }
        
        System.out.println("Recursion test complete!");
    }
    
}
