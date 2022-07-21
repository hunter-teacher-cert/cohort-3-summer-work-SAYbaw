import java.util.Scanner;

public class ScoreBoard {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);//MUST ANSWER Q: What does line 6 do and why is it important? Where else is a scanner referenced?
		//Declaration of constants 
    //STUDENT PROMPT- Why do we put final here? Why are variables in all caps?
		final int TOUCH_DOWN = 6;//DELIBERATE ERRORS: Write some of these incorrectly
		final int EXTRA_POINT = 1;  //make one the numbers a string, or invert the phrasing, use a space in a name, forget the semi-colon, use a double instead of int
		final int FIELD_GOAL = 3;
		final int TWO_PT_CON = 2;
		//declaration of variables
		int homeScr = 0;//REVISION - are there better ways to define these?
		int awayScr = 0;//have students determine easier to understand terms
		int userChoice = 0;//for example:  use something involving score
		int sideChoice = 0;//for example: use something involving team
		
		displayBoard(homeScr,awayScr);
		//We use as -1 as a "Sentinal" value
		while (userChoice != -1){//STUDENT PROMPT:  Why do we want to say not -1?
			do {//for user validation
				System.out.print("Enter 0 for Home team or 1 for Visiting team:");
				sideChoice = user.nextInt();
				
				} while(sideChoice < 0 || sideChoice > 1);//STUDENT PROMPT: Why do we have this here, what is it doing?  How is it different from the while loop?
			
			System.out.printf("Enter score [6, 1, 3, 2, 0] for %s or -1 to quit:"
					, (sideChoice == 0) ? "the Home team" : "the Visiting team");
		  //^ inline if else using the ternay operator ^
      //PROVIDE: the third way to write the if else
			userChoice = user.nextInt();
			//Decision Structure : Chain if else with nested if else
			if (userChoice == 6) {
				System.out.println(drawDigit(TOUCH_DOWN));
        
				if(sideChoice == 0) {
					homeScr += TOUCH_DOWN;
          
				} else if (sideChoice == 1){
					awayScr += TOUCH_DOWN;
				}
				displayBoard(homeScr, awayScr);
				System.out.println("Kick for the extra point or try for 2!");
        
			} else if (userChoice == 3){
				System.out.println(drawDigit(FIELD_GOAL));
        
				if(sideChoice == 0) {
					homeScr += FIELD_GOAL;
          
				} else if (sideChoice == 1){
					awayScr += FIELD_GOAL;
				}
				displayBoard(homeScr, awayScr);
        
			} else if (userChoice == 2) {
				System.out.println(drawDigit(TWO_PT_CON));
        
				if(sideChoice == 0) {
					homeScr += TWO_PT_CON;
          
				} else if (sideChoice == 1){
					awayScr += TWO_PT_CON;
				}	
				displayBoard(homeScr, awayScr);
        
			} else if (userChoice == 1) {
				System.out.println(drawDigit(EXTRA_POINT));
        
				if(sideChoice == 0) {
					homeScr += EXTRA_POINT;
          
				} else if (sideChoice == 1){
					awayScr += EXTRA_POINT;
				}
				displayBoard(homeScr, awayScr);
        
			} else if (userChoice == 0) {
				System.out.println(drawDigit(0));
				displayBoard(homeScr, awayScr);
        
			} else {
        			//to prevent printing on exit condition
				if (userChoice != -1) {
					System.out.println("NOT A VALID SCORE!");
				}
			}
		} 
		user.close();//Close scanner object. 
		//Good habit to always close i/o streams 
		//when done uing them.
		System.out.println("GOOD GAME!!!");
		System.exit(0);//graceful exit
	}
  //This method will be completed as part of the Skeleton except for the printf statement
	public static void displayBoard(int hScr, int vScr) {
		System.out.println("+------Java Field-----+");
		System.out.println("+---------------------+");
		System.out.println("| VISITORS |   HOME   |");
		System.out.println("+----------+----------+");
		System.out.printf("|%6d    |%6d    |\n",vScr, hScr);
		//set field widths to accomadate single 
		//and double digits and justification
		System.out.println("+----------+----------+");
	}
  //This method will be complete for the skeleton
	public static String drawDigit(int num) {
		if (num == 1) {
			return  "  OO   \n"
		        + " O O   \n"
				    + "   O   \n"
		        + "   O   \n"
				    + " OOOOO \n";
		} else if (num == 2) {
			return  " OOOOO \n"
		        + "     O \n"
				    + " OOOOO \n"
		        + " O     \n"
				    + " OOOOO \n";
		} else if (num == 3) {
			return " OOOOO \n"
		       + "     O \n"
				   + "  OOOO \n"
		       + "     O \n"
				   + " OOOOO \n";
		} else if (num == 6) {
			return " OOOO  \n"
		       + " O     \n"
				   + " OOOOO \n"
		       + " O   O \n"
				   + " OOOOO \n";
		} else if (num == 7) {
			return " OOOOO \n"
		       + "    O  \n"
				   + "   O   \n"
		       + "  O    \n"
				   + " O     \n";
		} else {
			return "  OOO  \n"
		       + " O   O \n"
				   + " O   O \n"
		       + " O   O \n"
				   + "  OOO  \n";
		}
	}	
}
