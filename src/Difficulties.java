import java.io.IOException;
import java.util.Scanner;

public class Difficulties {
	
	public static void selectDifficulty() throws InterruptedException, IOException{
		System.out.println("\n=============================");
		Thread.sleep(20);
	    System.out.println("|   	  DIFFICULTY        |");
	    Thread.sleep(20);
	    System.out.println("=============================");
	    Thread.sleep(20);
	    System.out.println("|                           |");
	    Thread.sleep(20);
	    System.out.println("|       [1] Cheater         |");
	    Thread.sleep(20);
	    System.out.println("|       [2] Easy            |");
	    Thread.sleep(20);
	    System.out.println("|       [3] Normal          |");
	    Thread.sleep(20);
	    System.out.println("|       [4] Back to menu    |");
	    Thread.sleep(20);
	    System.out.println("|                           |");
	    Thread.sleep(20);
	    System.out.println("=============================");
	    Thread.sleep(20);
		System.out.print("\n\t Current ["+PokerGame.difficulty+"]\n\n\tSelection > ");
		int tryCount = 0;
		Scanner input = new Scanner(System.in);
		String selectDiff = input.nextLine();
		while (!selectDiff.equals("1") && !selectDiff.equals("2") && !selectDiff.equals("3") && !selectDiff.equals("4")) {
			tryCount++;
			if (tryCount == 3){
				System.out.print("\tInvalid selection! Try again...");
				Thread.sleep(2000);
				System.out.println();
				selectDifficulty();
			}
			else {
				System.out.print("\tInvalid selection! Try again...");
				Thread.sleep(2000);
				System.out.print("\r\t                               \r\tSelection > ");
				selectDiff = input.nextLine();
			}
		}
		if (selectDiff.equals("1")){
			PokerGame.difficulty="1";
			cheaterMode();
		}
		else if (selectDiff.equals("2")){
			PokerGame.difficulty="2";
			easyMode();
		}
		else if (selectDiff.equals("3")){
			PokerGame.difficulty="3";
			normalMode();
		}
		else if (selectDiff.equals("4")){
			System.out.println();
			MainMenu.printMenu();
			MainMenu.menuSelection();
		}
	}
	
	static void cheaterMode() throws InterruptedException, IOException{
		System.out.print("\n\tcheater mode method");
		Thread.sleep(4000);
		System.out.println("\n");
		MainMenu.printMenu();
		MainMenu.menuSelection();
	}
	
	static void easyMode() throws InterruptedException, IOException{
		System.out.print("\n\teasy mode method");
		Thread.sleep(4000);
		System.out.println("\n");
		MainMenu.printMenu();
		MainMenu.menuSelection();
	}
	
	static void normalMode() throws InterruptedException, IOException{
		System.out.print("\n\tnormal mode method");
		Thread.sleep(4000);
		System.out.println("\n");
		MainMenu.printMenu();
		MainMenu.menuSelection();
	}
}
