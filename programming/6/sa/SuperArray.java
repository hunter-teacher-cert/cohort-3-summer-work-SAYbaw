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
        data = new int[10];

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
    if (data.length <= numberElements){
      grow();

      // add item
      data[data.length - 1] = value;


      // increment numberElements
      numberElements++;
    } else {
      // add item
      data[numberElements] = value;
      // increment numberElements
    numberElements++;
    }
    

    


    

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    return numberElements == 0;
    /**for(int i = 0;i < data.length;i++){
      if (data[i] != 0){
        return false;
      }
    }
    return true;
    if (numberElements == 0){
      return true;
    else {
      return false;
    }**/
    
  }


  public int get(int index)
  {
    //return item at index
    return data[index];
  }


  public String toString()
  {
    //return stringified version of this Object
    String arrayString = "";
    for (int i = 0;i < data.length;i++){
      arrayString = arrayString + Integer.toString(data[i]) + " ";
    }
    return arrayString;
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
    /*if (numberElements < data.length){
      tempArray[numberElements - 1] = 0;
    } else{
      tempArray[data.length - 1] = 0;
    }
    */
    data = tempArray;
    
    // subtract fom numElements;
    numberElements--;
    //in place traversal version
    /**for (int i = index; i < numberElements-1; i++){
        data[i] = data[i+1];
      }
    data[numberElements-1] = 0;
    
    // subtract fom numElements;
    numberElements --;**/
  
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    /**
    if (numberElements < data.length){
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
      // increment numElements
      numberElements++;
    } else {//this assumes you grew the array already with add(int)
      
     
      data[index] = value;
      numberElements++;
    }**/
    /* 3 7 10 4 0 0 0
      NumberElements = 4
      Goal: Add to index 1 value 5
      3 7 10 4 0 0 0

      Index 4 = Index 3
      3 7 10 4 4 0 0

      Index 3 = Index 2
      3 7 10 10 4 0 0

      Index 2 = Index 1
      3 7 7 10 4 0 0

      Index 1 = value
      3 5 7 10 4 0 0
    */
    
    // see if there's enough room
    if (data.length <= numberElements){
      grow();
    }

    // shift elements toward the end of the array
    for (int i = numberElements; i > index; i--){
      data[i] = data[i-1];
    }

    // insert new element
    data[index] = value;

    // increment numElements
    numberElements++;
  }


  


  private void grow()
  {
    // create a new array with extra space
    int [] newArray =  new int[numberElements + 1];
    // Q: How did you decide how much to increase capacity by?
    

    // copy over all the elements from the old array to the new one
    for(int i = 0;i < data.length;i++){
      newArray[i] = data[i];
    }

    // point data to the new array
    data = newArray;
    // Q: How does this look when illustrated using encapsulation diagram?
    
  }//end grow()

}//end class