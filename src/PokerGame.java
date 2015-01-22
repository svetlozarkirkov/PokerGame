import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class PokerGame {
	
	public static String difficulty = "3";
	
	public static void main(String[] args) throws InterruptedException, IOException {
		//MainMenu.printTitle();
		MainMenu.printMenu();
		MainMenu.menuSelection();
		System.out.print("\n\tNumber of players: ");
		Scanner input = new Scanner(System.in);
		int playersCount = input.nextInt();
		ArrayList<String> playerNames = new ArrayList<String>();
		for	(int i = 0; i < playersCount; i++){
			System.out.print("\n\tPlayer "+(i+1)+" name: ");
			String playerName = input.next();			
			playerNames.add(playerName);
		}
		System.out.println("\n");
		ArrayList<PlayCard> currentDeck = defaultDeck();
		ArrayList<ArrayList<PlayCard>> allPlayers = new ArrayList<ArrayList<PlayCard>>();
		ArrayList<Integer> ranks = new ArrayList<Integer>();
		for (int z = 0; z < playersCount; z++) {
			ArrayList<PlayCard> playerCards = new ArrayList<PlayCard>();
			int totalRank = 0;
			System.out.println(playerNames.get(z)+": ");
			for (int i = 0; i < 5; i++){
				Random random = new Random();
				int randomIndex = random.nextInt(currentDeck.size());
				PlayCard current = new PlayCard();
				current.setRank(currentDeck.get(randomIndex).getRank());
				totalRank+=currentDeck.get(randomIndex).getRank();
				current.setSymbol(currentDeck.get(randomIndex).getSymbol());
				current.setSuit(currentDeck.get(randomIndex).getSuit());
				playerCards.add(current);
				currentDeck.remove(randomIndex);
			}
			for (PlayCard crd:playerCards){
				System.out.print(crd.getSymbol()+""+crd.getSuit()+"  ");
				Thread.sleep(450);
			}
			System.out.println("\n\nTotal rank: "+totalRank);
			System.out.println("\n");
			allPlayers.add(playerCards);
		}
	}
	
	public static ArrayList<PlayCard> defaultDeck() {
		String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		char[] suits = {'\u2660','\u2665','\u2666','\u2663'};
		int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		ArrayList<PlayCard> deck = new ArrayList<PlayCard>();
		for (int i = 0; i < symbols.length;i++){
			for (int j = 0; j < suits.length; j++){
				PlayCard card = new PlayCard();
				card.setRank(ranks[i]);
				card.setSuit(suits[j]);
				card.setSymbol(symbols[i]);
				deck.add(card);
			}
		}
		for (int x = 0; x < 100; x++){
			Collections.shuffle(deck);
		}
		return deck;
	}
}