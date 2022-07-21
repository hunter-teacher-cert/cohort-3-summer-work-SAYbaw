//Seth Adams, Steve Sabagh, Parmanand Mohanlall, Saranii Muller

import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	SortSearch ssd = new SortSearch();//test defualt constructor
	System.out.println(ssd);//test defualt constructor
	SortSearch ss = new SortSearch(20);//test overloaded constructor
	System.out.println(ss);//test overloaded constructor
	
		
	// Uncomment these to test part 2

	 int i;
	 i = ss.findSmallestIndex(0);
	 System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	 i = ss.findSmallestIndex(9);
	 System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3

	System.out.println(ss);
	ss.sort();
	System.out.println(ss);

      
      //System.out.println(ss.size());
      System.out.println(ss.binarySearchRecursive(5, 0, 19));
      System.out.println(ss.binarySearchRecursive(10, 0, 19));
      System.out.println(ss.binarySearchRecursive(15, 0, 19));
      System.out.println(ss.binarySearchRecursive(18, 0, 19));
	


	      

    }
}