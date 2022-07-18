import java.util.Scanner;

public class ScoreBoard {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		//Declaration of constants
		final int TOUCH_DOWN = 6;
		final int EXTRA_POINT = 1;
		final int FIELD_GOAL = 3;
		final int TWO_PT_CON = 2;
		//declaration of variables
		int homeScr = 0;
		int awayScr = 0;
		int userChoice = 0;
		int sideChoice = 0;
		
		displayBoard(homeScr,awayScr);
		//We use as -1 as a "Sentinal" value
		while (userChoice != -1){
			do {//for user validation
				System.out.print("Enter 0 for Home team or 1 for Visiting team:");
				sideChoice = user.nextInt();
				
				} while(sideChoice < 0 || sideChoice > 1);
			
			System.out.printf("Enter score [6, 1, 3, 2, 0] for %s or -1 to quit:"
					, (sideChoice == 0) ? "the Home team" : "the Visiting team");
		  //^ inline if else using the ternay operator ^
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
        
				if (userChoice != -1) {
					System.out.println("NOT A VALID SCORE!");
				}
			}
		} 
		user.close();
		System.out.println("GOOD GAME!!!");
		System.exit(0);
	}
  //This method will be completed as part of the Skeleton except for the printf statement
	public static void displayBoard(int hScr, int vScr) {
		System.out.println("+------Java Field-----+");
		System.out.println("+---------------------+");
		System.out.println("| VISITORS |   HOME   |");
		System.out.println("+----------+----------+");
		System.out.printf("|%6d    |%6d    |\n",vScr, hScr);
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
