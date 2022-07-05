/**
 * ArrayPractice by Team 10
 * Steve Sabaugh
 * collaborators: We worked indepently
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:

   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip

   The stubs will have comments describing what they should do

   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray
   - printArray
   - arraySum
   - firstOccurence
   - findMaxValue

   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds

   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

public class ArrayPractice
{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
  
     Returns:
     a new array of integers

     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */

public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];
    int idx = 0;
    
    for(int i = 0;i < data.length;i++){
      if (i == 0){
        data[i] += step;
      } 
      else {
        data[i] = data[i-1] + step;
      } 
    }

    return data;
  }


  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use
  
     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];

    for(int i = 0;i < data.length;i++){
      data[i] = r.nextInt(maxValue);
    }

    return data;
  }


  /**
     Parameters:
     data - an array of ints

     Returns:
     nothing

     prints out the array

     Note: data.length stores the length of the array

     Another Note: yes, we know William live coded this a few minutes ago.
  */
  public static void printArray( int[] data )
  {
   
    for(int i = 0;i < data.length;i++) {
      System.out.println(data[i]);
    }
  }



  /**
     Parameters:
     data - an array of integers
     value - the value to search for

     Returns:
     the index (location) of the first occurence of value

     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence( int[] data, int value )
  {

    
    for (int i = 0;i < data.length;i++){
      if(data[i] == value){
        return i;
      }
    }

    return data.length; 
  }


  /**
     Parameters: data - an array of ints

     Returns: an integer that is equal to the sum of all the elements in the array

     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)

  */
  public static int arraySum( int[] data )
  {
    int total = 0;
    for (int i = 0;i <  data.length;i++){
      total += data[i];
    }

    return total; 
  }


  /**
     Parameters:
     data - an array of integers

     Returns:
     true if the array is sorted, false otherwise

     That is, if each element is < the element to its right
     then the array is sorted.

     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,18,15 is not

  */
  public static boolean isSorted( int[] data )
  {
    for(int i = 1;i < data.length;i++){
      if (data[i] < data[i-1]) {
        return false;
      }
     
    }
    return true;

  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int m = Integer.MIN_VALUE;  

    for(int i = 0;i < data.length;i++){
      if (data[i] > m){
        m = data[i];
      }
    }

    return m;
  }


  /**
     Parameters:
     data - an array of integers

     Returns:
     the number of odd elements in the array

     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count = 0;

    for (int i = 0;i < data.length;i++){
      if (data[i] % 2 != 0){
      count++;
      }
    }
    

    return count;
  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter

     Postcondition:
     elements of the input array are in reverse order

     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip(int[] data)
  {
    int[] tempArray = new int [data.length];
    
    for (int i = data.length -1 , j = 0;i > -1 && j < data.length;i--, j++){
      tempArray[j] = data[i];
      
    }
    printArray(tempArray);
  }


  public static void main( String[] args )
  {

    int[] data = buildRandomArray(3, 20);
    int[] data2 = buildIncreasingArray(10,5,3);
    int searchVal = 12;
    int searchResult1 = firstOccurence(data2, searchVal);
    int searchResult2 = firstOccurence(data, searchVal);
    String found = " was found at index ";
    String notFound = " was not found. Elements searched: ";
    int oddCt = countOdds(data);
    int oddCt2 = countOdds(data2);
    
    System.out.println("Random Array");
    printArray(data);
     System.out.println("Increasing Array");
    printArray(data2);
    
    //search increasing array data2
    System.out.print(searchVal);
    System.out.print((searchResult1 != data2.length) ?
                      found : notFound);
    System.out.println(searchResult1 + " of Increasing array (data2).");
    
    //search random array data
    System.out.print(searchVal);
    System.out.print((searchResult2 != data.length) ?
                      found : notFound);
    System.out.println(searchResult2 + " of Random array (data).");
    
    //arraySum
    System.out.printf("The sum of all %d elements in the random array (data) is %d\n", data.length, arraySum(data));
    System.out.printf("The sum of all %d elements in the increasing array (data2) is %d\n", data2.length, arraySum(data2));
    
    //isSorted
    System.out.printf("data (Random) array is %s.\n", isSorted(data) ? "sorted": "not sorted" );
    System.out.printf("data2 (Increasing) array is %s.\n", isSorted(data2) ? "sorted": "not sorted" );
    
    //findMaxValue
    System.out.printf("The larget value in data (Random) array is %s.\n", findMaxValue(data));
    System.out.printf("The larget value in data2 (Increasing) array is %s.\n", findMaxValue(data2));

    //countOdds
    System.out.printf("There %s %d odd number%s in data (Random) array.\n", oddCt == 1 ? "is" : "are", oddCt, oddCt == 1 ? "" : "s");
    System.out.printf("There %s %d odd number%s in data2 (Increasing) array.\n", oddCt2 == 1 ? "is" : "are", oddCt2, oddCt2 == 1 ? "" : "s");
    
    //flip
    System.out.println("Printing data (Random) array reversed.");
    flip(data);
    System.out.println("Printing data2 (Increasing) array reversed.");
    flip(data2);
  }
}