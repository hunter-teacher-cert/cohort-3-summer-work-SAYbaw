import java.io.*;
import java.util.*;

public class SortSearchReferenceDriver {
    public static void main(String[] args) {


	int size = 100001;

	SortSearch ss = new SortSearch(size);

	
	
	// printing is really slow so we don't want
	// to print when testing time.
	// System.out.println(ss);
		
	long start,elapsed;

  //sorting list
	start = System.currentTimeMillis();
	ss.sort();
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time of sort: " + elapsed + " milliseconds");

  //linear search list
	start = System.currentTimeMillis();
	ss.linearSearch(ss.get(100000));
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + ", Time of linear search: " + elapsed + " milliseconds");

  //binary search list
	start = System.currentTimeMillis();
	int binaryTest = ss.binarySearch(ss.get(100000));
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + ", Time of binary search: " + elapsed + " milliseconds");
			   

	      

    }
}