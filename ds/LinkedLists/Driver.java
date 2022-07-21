import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
		l.add("Steve");
		l.add("Yanique");
		l.add("Sarah");
		l.add("Someone Else");
 
 	System.out.println(l);
 
	System.out.println("The thing at index 3 is " + l.get(3));
 	System.out.println("The length of this list is " + l.size() + " nodes");
	System.out.println("Adding at index 1");
	l.add(1, "YO");
	System.out.println(l);
	System.out.println("Adding at index 2");
	l.add(2, "DUDE");
	System.out.println(l);
	System.out.println("Adding at index 5--end of 	list?");
	l.add(6, "HELLO");
	System.out.println(l);
		System.out.println("Adding at index 0--front of list?");
	l.add(0, "HEY");
	System.out.println(l);
  }

}

