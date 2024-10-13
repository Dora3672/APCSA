import java.util.*;
public class Hand {

   private ArrayList <Card> hand;
	
	/*Pre-condition: none
	 *Post-condition: ArrayList hand is set to an empty array
	*/
   public Hand () {
      ArrayList <Card> hand = new ArrayList <Card> ();
   }
	
	/*Pre-condition: an object of type Card is passed as a parameter to the non-default constructor
	 *Post-condition: Card is added to the ArrayList hand
	*/
   public Hand (Card c) {
      hand.add(c);
   }
	
	/*Pre-condition: none
	 *Post-condition: The number of cards in Hand is returned
	*/
   public int numberOfCards () {
      int numofcards = hand.size();
      return numofcards;
   }
	
	/*Pre-condition: the index of the card you want to get is >= 0
	 *and is < hand.size()
	 *Post-condition: the card specified by the index that meets the pre-condition
	 *is returned
	*/
   public Card getCard (int c) {
      Card a = null;
      if (c >= 0 && c < hand.size()) {
         a = hand.get(c);
      }
      return a;
   }
	
	/*Pre-condition: the index of the card you want to remove from the hand
	 *is >= 0 and is < hand.size()
	 *Post-condition: the card of the index that meets the pre-condition is
	 *removed from the hand
	*/
   public void removeCard (int c) {
      if (c >= 0 && c < hand.size()) {
         hand.remove(c);
      }
   }
	
	/*Pre-condition: the value passed into the method is >= 0 && <= 12
	 *Post-condition: true is returned if the hand contains one or more
	 *cards of the same value
	*/
   public boolean ifSameValue (int value) {
      boolean samev = false;
      if (value >= 0 && value <= 12) {
         for (int i = 0; i < hand.size(); i ++) {
            Card b = hand.get(i);
            if (b.getValue() == value) {
               samev = true;
            }
         }
      }
      return samev;
   }	
	
	/*Pre-condition: the suit value passed into the method is >= 0 && <= 3
	 *Post-condition: true is returned if the hand contains one or more
	 *cards of the same suit
	*/
   public boolean ifSameSuit (int suit) {
      boolean sames = false;
      if (suit >= 0 && suit <= 3) {
         for (int i = 0; i < hand.size(); i ++) {
            Card d = hand.get(i);
            if (d.getSuit() == suit) {
               sames = true;
            }
         }
      }
      return sames;
   }
	
	/*Pre-condition: none
	 *Post-condition: prints information about the Cards in the hand
	*/
   public String toString () {
      String result = "";
      for (int i = 0; i < hand.size(); i ++) {
         result += hand.get(i).toString();
         result += "\n";
      }
      return result;
   }
	
	/*Pre-condition: v >= 0 && v <= 12 and a >= 0 && a <= 3 
	 *Post-condition: A new card will be added to the ArrayList hand if the card is
	 *not already present in the hand, but if there is already a similar card in the
	 *hand, nothing will happen.
	*/
   public void addCard (int v, int s) {
      if (v >= 0 && v <= 12 && s >= 0 && s <= 3) {
         Card e = new Card(v,s);
         for (int i = 0; i < hand.size(); i ++) {
            if (e.compareTo(hand.get(i)) == 0) {
               hand.add(e);
            }
         }
      }
   }	
			   
} // class