/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Lions", "Hippo"};
		int[] values = {2,1, 6};
		
		Deck d = new Deck(ranks,suits,values);
		
		boolean empty=d.isEmpty();
		int s = d.size();
		Card deal=d.deal();
		
		System.out.println(d.toString());
		
		
		
	}
}
