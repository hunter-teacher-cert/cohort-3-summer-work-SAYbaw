/**
 * Recursion Practice with Strings by Team SweatEquity
 * Sarah McCoy
 * collaborators: Rachel Kaufman
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts

     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */
  public static String fenceR( int n )
  {
     if (n == 0) {
       return "No fence!";//this won't get returned if the method is called for any number greater than zero because the condition below gets met before this and the method ends. (unless we fun fence(0))
    } else if (n == 1) {
      return "|";
    } else {
      return "|--" + fenceR(n-1);
    }
  }


  public static void main( String[] args )
  {

    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    //System.out.println(fenceR(5));

    /* feel free to add extra tests... */

  }
}