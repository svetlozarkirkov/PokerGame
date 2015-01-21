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
	
	public static void menuSelection() throws IOException, InterruptedException{
		int tryCount = 0;
		System.out.print("\n\tEnter selection > ");
		Scanner input = new Scanner(System.in);
		String selection = input.nextLine();
		while (!selection.equals("1") && !selection.equals("2") && !selection.equals("3")) {
			tryCount++;
			if (tryCount == 3){
				System.out.println("\tInvalid selection! Try again...");
				Thread.sleep(2000);
				printMenu();
				menuSelection();
			}
			else {
				System.out.print("\tInvalid selection! Try again...");
				Thread.sleep(2000);
				System.out.print("\r\t                               \r\tEnter selection > ");
				selection = input.nextLine();
			}
		}
		if (selection.equals("2")){
			Difficulties.selectDifficulty();
		}
		
	}
}
