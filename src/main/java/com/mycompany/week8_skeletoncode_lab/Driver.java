/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author chriscanenguez
 */
public class Driver {
    // Driver class to test search methods.
    public static void main(String[] args){
        // Create BinarySearch object to use method.
        BinarySearch b1 = new BinarySearch();
        
        // Sorted array
        int[] sortedArray = new int[] {2, 6, 15, 21, 24, 25, 31, 36, 47, 49, 52, 60, 63};
        
        int test1Index = b1.runBinarySearchIteratively(sortedArray, 15, 0, 12);
        int realIndex1 = 2;
        
        int test2Index = b1.runBinarySearchIteratively(sortedArray, 36, 0, 12);
        int realIndex2 = 7;
        System.out.println("Testing Binary Search: ");
        System.out.println("Index found during the Binary Search test 1: " + test1Index);
        System.out.println("What the index should be for Binary Search test 1: " + realIndex1);
        
        System.out.println();
        
        System.out.println("Index found during the Binary Search test 2: " + test2Index);
        System.out.println("What the index should be for Binary Search test 2: " + realIndex2);
        
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("Testing Bubble Sort: ");
        // Create BubbleSort object to use method.
        BubbleSort b2 = new BubbleSort();
        
        // Non-sorted array.
        int[] array = new int[] {17, 3, 1, 9, 24, 4, 12};
        
        // Print array before sort
        System.out.println("Array before bubble sort: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Empty line.
        System.out.println(); // Empty line.
        
        // array after sort
        b2.bubbleSort(array, 7);
        
        System.out.println("Array after bubble sort: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("Testing Sum of Primes: ");
        Problem01 p1 = new Problem01();
        
        long expectedSum = 17 ;
        long actualSum = p1.getSumOfPrimes(7);
        
        System.out.println("Expected sum of prime numbers up to 7: " + expectedSum);
        System.out.println("Actual sum: " + actualSum);
        
        
        
    }
    
}
