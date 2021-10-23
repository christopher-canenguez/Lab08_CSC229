/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static boolean isPrime(int numToBeChecked)
    {
        // If n is 1, will return false because 1 isnt a prime number
        if (numToBeChecked == 1)
        {
            return false;
        }
        
        // Check if n is a prime number, 
        for (int i = 2; i*i <= numToBeChecked; i++)
        {
            if (numToBeChecked % i == 0)
                return false;
        }
        return true;
    }
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    
    // Initialize variable.
    int sum = 0;
    
    for (int i = 1; i <= n; i++)
    {
        // Check if num is prime.
        boolean isPrime = isPrime(i);
        
        if (isPrime)
        {
            sum = sum + i;
        }
    }
    return sum;
    }
    
    
}
// Time complexity of method: O(n radical n)
// 