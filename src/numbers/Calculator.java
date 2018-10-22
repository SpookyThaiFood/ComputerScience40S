/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

/**
 *
 * @author t.swaity
 */
public class Calculator {
    
    public static long factorial(long number) {
        // Base case
        if (number <= 1) {
            return 1;
        } else {
            return number * (factorial(number - 1));
        }
        
        // Recursive case
    }
    
    /**
     * 
     * @param base
     * @param exp
     * @return 
     */
    public static double power(int base, int exp) {
        if (base == 1) return 1;
        else if (exp == 1) return base;
        else if (exp < 0) return 1 / power(base, Math.abs(exp));
        else return base * power(base, exp - 1);
    }
    
}
