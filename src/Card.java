public class Card {
	public char suit;
	public char kind;
	Card(char _suit, char _kind)
	{
		System.out.println("Card Constructor");
		suit = _suit;
		kind = _kind;
		System.out.println("suit = " + suit);
		System.out.println("kind = " + kind);
	}
	
}
