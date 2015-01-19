import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class MainMenu {
	public static void printTitle() throws InterruptedException{
		String title = "\n\tPoker (by Sve)\n\t--------------\n";
		for (int i = 0; i < title.length();i++){
			System.out.print(title.charAt(i));
			Thread.sleep(70);
		}
	}
	
	public static void printMenu(){
		String newGame = "[1] New Game";
		String difficulty = "[2] Difficulty";
		String exit = "[3] Exit Game";
		System.out.println("\t"+newGame);
		System.out.println("\t"+difficulty);
		System.out.println("\t"+exit);
	}
	
	public static void menuSelection() throws IOException{
		System.out.print("\n\tEnter choice: ");
		int selection = 0;
		Scanner input = new Scanner(System.in);
		try{  
		      selection=input.nextInt();
		   }  
		finally {
			if (selection != 1 && selection != 2 && selection != 3){
				System.out.println("\tInvalid selection! Try again...");
				menuSelection();
			}
			else if (selection == 3 || selection == 2 || selection == 1){
				//return;
				System.exit(0);
			}
		}
		
	}
}
