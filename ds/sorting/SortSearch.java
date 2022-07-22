//Seth Adams, Steve Sabagh, Parmanand Mohanlall, Saranii Muller


import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
✔️  1. Analyze the two constructors - try to figure out how they work.
✔️ 2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
✔️ 1. Read the description of findSmallestIndex and complete the method.
✔️2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
✔️  1. Complete the sort method - read comments for description
✔️  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)//can't binary search on a non sorted list
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){//default constructor that will make array list of integers
	data = new ArrayList<Integer>(); //new array list of integers called data
	r = new Random(); //creates (instantiates) a new random object called r
	for (int i=0;i<15;i++){ //loops through array list spots 0-14 
	    data.add(r.nextInt(20)); // add a random integer of a value between 0 and 19
	}//default constructor makes an ArrayList with size 15 filled with randomized Ints between 0-19 
	
    }
    
    public SortSearch(int size){//makes array list of integers of a size in the parameter when called
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }//override constructor makes an ArrayList with parameter size filled with randomized Ints between 0-19 

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    

    /*
      return the index of the smallest data item from index start to the end of the ArrayList. If there are multiple of the smallest value, return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8

      if start was 2 (start at index 2, value 10) then it would return 3 which is the index of the value 6 which is the index with the smallest value from start to end

      On the other hand, if start was 0, then the method would return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
  public int findSmallestIndex(int start){//created method called findSmallestIndex w/parameter of start
  	int smallIndex = start; //smallIndex is start
  	for(int i=start; i <data.size(); i++){//loop starting at start parameter, increments up until start is less then the size of array
      if(data.get(i) < data.get(smallIndex)){//if the data at the index we are checking is less than the data at our current smallest index then we replace the smallIndex with that index
        smallIndex = i;
      }
    }
	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from 0 to the end of the ArrayList.
         For each index, find the smallest from that Location to the end of the array and swap it with that index.
    */
    public void sort(){
      //some if loop and then if true we would shift start up one -- replace value from lowest index with current test index (will need temp placeholder variable??)

      int smallIndex = 0;
      int tempInt = 0;
      for(int i = 0/*this is the start*/;i < data.size();i++){ //this is like the j loop and start always moves up with the loop - no need to do a search loop because we already have a search method from find smallest 
        smallIndex = findSmallestIndex(i); //find smallest index starting at 0 ( from find smallest method)
        tempInt = data.get(smallIndex); //temporary variable to hold the smallest int index while looping through
        data.set(smallIndex, data.get(i)); //set index to looped data from start point
        data.set(i, tempInt); //that data now becomes the temp

        //rinse and repeat!
      }
    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){
	    for(int i = 0; i < data.size();i++){
        if (data.get(i) == value){
          return i;
        }
      }
	
	    return data.size();
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle
      int high = data.size() - 1;
      int low = 0;
      int middle = 0;
      //int position = data.size(); //or -1
      //boolean foundFlag = false;

      while (low <= high){
        middle = (low + high) / 2;
        if (data.get(middle) == value){
          return middle;
        } 
        // is value in the lower half?
        else if (data.get(middle) > value)
          high = middle - 1;
       // value must be in the upper half 
        else 
          low = middle + 1;
        
          
        
      }
      
	return data.size();//or -1
      //return position
	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
        if(highIndex >= lowIndex){
          int middle = (highIndex + lowIndex) / 2;

          if (data.get(middle) == value){
            return middle;
          }
          if (data.get(middle) > value){
            return binarySearchRecursive(value, lowIndex, middle - 1);
          }
          return binarySearchRecursive(value, middle + 1, highIndex);
        }
	// refer to class discussion
	
	return -1;
	    
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    
}
