package card_game;

public class Card {
	
	private final int suit; //0, 1, 2, 3 represents  Clubs, Hearts, Diamonds and Spades respectively
	private final int rank; //1 as Ace, 2-10 as their rank equivalents with 11,12,13 as Jack, Queen, and King respectively
	
	//Arrays for converting cards to Strings
	private final static String[] suitNames = {"Clubs","Hearts","Diamonds","Spades"};
	private final static String[] rankNames = {"UNUSED","Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	
	//Standard constructor
	public Card(int suit, int rank) {
		if (suit > -1 && suit < 4) {
			this.suit = suit;
		}
		else {
			throw new IllegalArgumentException("Invalid suit");
		}
		if (rank > 0 && rank < 14) {
			this.rank = rank;
		}
		else {
			throw new IllegalArgumentException("Invalid rank");
		}
	}
	
	//Copy constructor
	public Card(Card other) {
		this.suit = other.getSuit();
		this.rank = other.getRank();
	}
	
	//Empty constructor sets suit to clubs and rank to Ace
	public Card() {
		suit = 0;
		rank = 1;
	}
	
	//Getters
	public int getRank() { return rank; }
	public int getSuit() { return suit; }
	
	//To string method outputs card in form "Rank of Suit"
	public String toString() {
		return "" + rankNames[rank] + " of " + suitNames[suit];
	}
	
	//Equals override
	public boolean equals(Object other) {
		if (other == null || this.getClass() != other.getClass()) {
			return false;
		}
		Card o = (Card) other;
		return (this.suit == o.suit && this.rank == o.rank);
	}
}
