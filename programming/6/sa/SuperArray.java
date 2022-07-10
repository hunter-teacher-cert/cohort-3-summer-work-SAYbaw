/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators: First Last, First Last
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    data = new int [size];

    //init instance vars
    numberElements = 0;

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        data = new int[10]

    //init instance vars
        numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */

    // add item
    /* YOUR SIMPLE+SMART CODE HERE */


    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    for(int i = 0;i < data.length){
      if (data[i] != 0){
        return false;
      }
    }
    return true;
    
  }


  public int get(int index)
  {
    //return item at index
    return data[index];
  }


  public String toString()
  {
    //return stringified version of this Object
    arrayString = "";
    for (int i = 0;i < data.length;i++){
      data[i] += arrayString + " ";
    }
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    int [] tempArray = new int [data.length];//should this be numberElements

    for (int i = 0, j = 0;i < data.length;i++){// < numberElements?
      if (i != index){
        tempArray[j] = data[i];
        j++;
      }
    }
    tempArray[numberElements - 1] = 0;
    data = tempArray;

    // subtract fom numElements;
    numberElements--;
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    if (numberElements < data.length - 1){
        // shift elements toward the end of the array
    
      int [] tempArray = new int [data.length];

      for (int i = 0;i < index;i++){
        tempArray [i] = data[i];
      }
      // insert new element
      tempArray[index] = value;

      for (int i = index + 1;i < data.length;i++){
        tempArray[i] = data[i - 1];
      }
      data = tempArray;
    }

  

    
    

    // increment numElements
    numberElements++;
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end grow()

}//end class