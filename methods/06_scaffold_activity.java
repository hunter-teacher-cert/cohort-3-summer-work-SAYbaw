import java.io.*;
import java.util.*;

public class RandomArrayList{
    
    /* Instance Variables to store the data */
    private ArrayList<Integer> data;  
    
    private Random r; 

    /*
Goal: to create a default constructor that makes an ArrayList with size 15 filled with randomized integers between 0-19.

Steps:

    1. Create a default constructor that will make an array list of integers
    
    2. Initiate a new array list of integers called data with a size of 15.
	   
    3. Create a new random object called r
	  
    4. Loop through array, and add a random integer of a value between 0 and 19
	    
*/
    
  public String toString(){
	return ""+data;
    }
}