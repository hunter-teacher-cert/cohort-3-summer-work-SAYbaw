/**
 * Recursive String Reverser by Team Palindromotosis
 * First Last
 * collaborators: First Last, First Last
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  {
    String newString;
    String sMinusFirstChar;
    char charToAppend;
    
    if (s.length() < 1){
      return s;
    }
    sMinusFirstChar = s.substring(1);
    charToAppend = s.charAt(0);
    newString = reverseR(s.substring(1)) + s.charAt(0);
    
    //System.out.println(s); //print trace
    return newString;
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("racecar") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?
  }
}