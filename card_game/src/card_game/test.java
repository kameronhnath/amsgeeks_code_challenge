package card_game;

//This class will create a new deck, shuffle it, and deal one card, printing the result
public class test {

	public static void main (String args[]) {
		Deck d = new Deck();
		d.shuffle();
		System.out.println(d.dealOne());
	}
	
}
