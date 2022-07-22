import java.io.*;
import java.util.*;

public class RandomArrayList{
    
    /* Instance Variables to store the data */
    private ArrayList<Integer> data;  
    
    private Random r; 
    
    public RandomArrayList(){
    //new array list of integers called data
	  data = new ArrayList<Integer>(); 
    //creates (instantiates) a new random object called r
	  r = new Random(); 
    //loops through array list spots 0-14 
	  for (int i=0;i<15;i++){ 
      // add a random integer of a value between 0 and 19
	    data.add(r.nextInt(20)); 
	}
	
    }
  public String toString(){
	return ""+data;
    }
}