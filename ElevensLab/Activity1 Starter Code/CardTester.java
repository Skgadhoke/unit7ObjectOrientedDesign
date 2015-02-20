/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("King", "red", 13);
		Card c2 = new Card("King", "red", 13);
		Card c3 = new Card("King", "blck", 13);
		Card c4 = new Card("Queen", "red", 12);
		
		String str = c1.suit();
		String str2 = c1.rank();
		int val=c1.pointValue();
		
		
		boolean matches = c1.matches(c2);
		System.out.println("matches: "+ matches);
		
		matches = c2.matches(c4);
		System.out.println("matches: "+ matches);
		
		
	}
}
