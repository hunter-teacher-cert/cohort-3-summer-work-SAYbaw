import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value)
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
//public Node getNode(int index)--would return the node itself, rather than the data...would return the getNext of the 
	
  public void add(String value){
//make head the next thing after value--this is cleaner
		Node newItem = new Node(value, head);
//make the new node the new head
		head = newItem;
	}
  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
		Node current = head;
		for (int i = 0; i < index; i++){
			//System.out.println(current);//print trace for debugging
			current = current.getNext();
			
			if (current == null){
				return "Out of bounds";
			}
		}
    return current.getData();
  }


  
 // Return a string representation of the 

  public String toString(){
		//Initially we were using head directly, and overwriting it with getNext...but since head is global, that caused problems in the other methods.  So always set a temp variable like "walker" or "current"
  	Node current = head;
		String s = "";
		while (current != null){

			s += current.getData() + "->";
			current = current.getNext();
		}
			return s;
  }

  /**
  returns the number of elements in the list
  */
	//WE COULD HAVE USED a global variable that increments each time you add (in either add function)...which would be useful
  public int size(){
    Node current = head;
		int counter = 0;
		while (current != null){
			current = current.getNext();
			counter ++;
		}
			return counter;
  }





  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){
		//Special case adding at index 0....we're going to assume we don't try to add out of bounds?	
		//Improvement idea--write a "get" helper method that returns a NODE, rather than the data at the node (getData)
		if (index == 0){
				add(value);
			
			}else{
			
				Node newItem = new Node(value);
				Node current = head;
		//this loop is problematic if adding at index 0
					for (int i = 0; i < index-1; i++){
			//System.out.println(current);//print trace for debugging
						current = current.getNext();
					}

   			newItem.setNext(current.getNext()); 
				current.setNext(newItem);
			}
  	}
  


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    return 0;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    return null;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
}		