/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
        //         - provide asymptotic analysis of the developed solution
        
        // Using a for-loop, traverse through the array to find the integer to be found.
        for (int i = 0; i < n; i++) 
        {
            // If statement to check current array index to integer.
            if ( arr[i] == x)
            {
                return i;
            }
        }
        return -1; // If no index is found with the integer, return -1.
    }
     
    
    // Big O -- Upper Bound
    // 1 +  n + n + n + 1 + 1 
    // 3 + 3n = f(n)
    // O (n)
    
    // Upper Bound -> 5 + 5n
    
    // Big Omega -- Lower Bound
    // Big Omega -- 1 + n
    
    // Big Theta -- Close Bound
    // Big Theta -- 3n
    
}
