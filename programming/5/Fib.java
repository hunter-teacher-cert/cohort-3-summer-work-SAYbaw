/**
 * nth Fibonacci number generator by Team SumEmIfYaGotEm
 * First Last
 * collaborators: Rachel Kaufman, Tanya Wardally
 */

public class Fib
{

  public static int fib(int n) {
		//public static long fib(long n) the long type allows for larger numbers
    if (n == 0 || n == 1) {
      return n;
    } else {
      return fib(n-1) + fib(n-2);
    }
  }


  public static void main( String[] args ) {

    System.out.println( fib(0) ); // -> 0
    System.out.println( fib(1) ); // -> 1
    System.out.println( fib(2) ); // -> 1
    System.out.println( fib(3) ); // -> 2
    System.out.println( fib(4) ); // -> 3
    System.out.println( fib(5) ); // -> 5

      //now go big:
    System.out.println( fib(10) ); // -> 55
    System.out.println( fib(20) ); // -> 6765
    System.out.println( fib(40) ); // -> 102334155

  }//end main()

}//end class Fib