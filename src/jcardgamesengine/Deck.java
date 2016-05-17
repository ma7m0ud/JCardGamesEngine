package jcardgamesengine;

import java.io.*;

class Deck extends CardPile {


    public Deck () {
	int s, r,num=0;
        for (s=0; s<Globals.numSuits; s++) {
	    for (r=0; r<Globals.numRanks; r++) {
                num++;
                Card c = new Card (s, r,num);
                addElement (c);
	    }
	}
    
    }
public static void main (String []args){
}
}
