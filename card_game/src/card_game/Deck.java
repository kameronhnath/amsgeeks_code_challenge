package card_game;

import java.util.ArrayList;

public class Deck {
	
	//ArrayList used to represent the deck
	private ArrayList<Card> deck;

	//Standard constructor - adds all 52 standard cards
	public Deck () {
		deck = new ArrayList<Card>();
		for (int i = 1; i < 14; i++) {
			for (int j = 0; j < 4; j++) {
				deck.add(new Card(j,i));
			}
		}		
	}
	
	//Copy constructor
	public Deck (Deck other) {
		deck = new ArrayList<Card>(other.getDeck());
	}
	
	//Shuffles the deck using Math.random()
	public void shuffle() {
		ArrayList<Card> shuffledDeck = new ArrayList<Card>();
		while (deck.size() != 0) {
			shuffledDeck.add(deck.remove((int) (Math.random() * deck.size())));
		}
		deck = shuffledDeck;
	}
	
	//dealOne removes the first card in the deck and returns it to the user
	public Card dealOne() {
		return deck.remove(0);
	}
	
	//Adds a card to the deck
	public void addCard(Card c) {
		deck.add(c);
	}
	
	//Getters
	public ArrayList<Card> getDeck() { return deck; }
	public int deckSize() { return deck.size();	}
	
	//To string uses the ArrayList implementation of toString, and the Card implementation of toString
	public String toString() {
		return deck.toString();
	}
	
	//Equals method uses the ArrayList equals method
	public boolean equals(Object other) {
		if (other == null || this.getClass() != other.getClass()) {
			return false;
		}
		return (this.deck.equals(((Deck)other).getDeck()));
	}
	
}
