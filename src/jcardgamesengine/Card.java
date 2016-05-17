package jcardgamesengine;

import javax.swing.ImageIcon;

class Card {
    // The suits and ranks names are defined in Globals.java
    private int suit;
    private int rank;
    private int x;
    private int y;
    private ImageIcon img;
    private int number;

    // Constructor to set suit and rank.
    // Cannot reset once set.
    public Card (int s, int r,int num) {
        suit = s;
	rank = r;
        number=num;
    }

    // Accessor function to retrieve suit.
   public int getpos(){
   return number;
   }
    public int getSuit () {
	return suit;
    }

    // Accessor function to retrieve rank.
    public int getRank () {
	return rank;
    }
    public ImageIcon getimage(){
    
        if(suit==2){
        img=Globals.SpadesImages[rank];
        }
        if(suit==1){
        img=Globals.DiamondsImages[rank];
        }
        if(suit==0){
        img=Globals.ClubsImages[rank];
        }
        if(suit==3){
        img=Globals.HeartsImages[rank];
        }
        return img;
    }

    public int getX(){
    if(suit==0){
    
    }
    return x;
    }
    // Return the hearts ``value'':  13 for Queen of spades, 1 for a heart,
    // zero for everything else.
    public int heartsValue () {
        if (suit == Globals.Hearts) {
	    return 1;
	} else if (suit == Globals.Spades && rank == Globals.Queen) {
	    return 13;
	} else {
	    return 0;
	}
    }

    // Used for printing a card.
    public String toString () {
        return Globals.RankName [rank] + " of " + Globals.SuitName [suit];
    }

    // Two cards are equal if they have the same suit and rank.
    // Probably, we won't use this with a single deck, but you never know
    // what the future may hold ...
    public boolean equals (Object otherCard) {
	if (!(otherCard instanceof Card)) {
	    return false;
	} else {
	    Card c = (Card) otherCard;
	    return c.suit == this.suit && c.rank == this.rank;
	}
    }
}
