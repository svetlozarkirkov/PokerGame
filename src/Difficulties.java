import java.io.IOException;
import java.util.Scanner;

public class Difficulties {
	
	public static void selectDifficulty() throws InterruptedException, IOException{
		System.out.println("\n\tDifficulty select ( current ["+PokerGame.difficulty+"] ): ");
		System.out.print("\n\t[1] Cheater\t[2] Easy\t[3] Normal\t[4] Back to main menu");
		System.out.print("\n\n\tSelection > ");
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
		System.out.println();
		MainMenu.printMenu();
		MainMenu.menuSelection();
	}
	
	static void easyMode() throws InterruptedException, IOException{
		System.out.print("\n\teasy mode method");
		Thread.sleep(4000);
		System.out.println();
		MainMenu.printMenu();
		MainMenu.menuSelection();
	}
	
	static void normalMode() throws InterruptedException, IOException{
		System.out.print("\n\tnormal mode method");
		Thread.sleep(4000);
		System.out.println();
		MainMenu.printMenu();
		MainMenu.menuSelection();
	}
}
