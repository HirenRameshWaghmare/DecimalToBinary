package com.nisren;

public class Main {
    /**
     * Q. Write a program to convert a number from Decimal to Binary using Recursion
     * 1. Divide by 2
     * 2. Take the Quotient  for next iteration
     * 3. Use Reminder for the Binary Digit
     * 4. Repeat code until quotient is 0.
     */
    public static void main(String[] args) {

        Main recursion = new Main();
        int result = recursion.decimalToBinary((int)13.5);
        System.out.println(result);
    }
    public int decimalToBinary(int h){
        //2.Base Case
        if (h==0){
            return 0;
        }
        //1.Recursive case
        return h%2 + 10*decimalToBinary(h/2);
    }
}
