
public class PlayCard {
	private int rank;
	private String symbol;
	private char suit;
	
	public PlayCard(){
		
	}
	
	public int getRank(){
		return rank;
	}
	public String getSymbol(){
		return symbol;
	}
	public char getSuit(){
		return suit;
	}
	public void setRank(int rank){
		this.rank = rank;
	}
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	public void setSuit(char suit){
		this.suit = suit;
	}
}
