package jcardgamesengine;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.util.*;

// Represents a pile of cards.  Its size may change, so we use
// java.util.Vector as the base class.
class CardPile extends Vector {

    // Simple constructor.  Just call parent.
    public CardPile (){
	super ();
    }

    // Constructor to set up default size.  Since there are 52 cards, we
    // know no cardPile will be bigger than 52.  In fact, tricks will be at
    // most four cards.  
    public CardPile (int initialCapacity) {
	super (initialCapacity);
    }

    // Take another CardPile and merge it into me.
    public void append (CardPile cp) {
	Enumeration cpEnum = cp.elements();
	while (cpEnum.hasMoreElements()) {
	    Card c = (Card) cpEnum.nextElement();
	    addElement (c);
	}
    }
    public void sort(){
   int numb=elementCount;
            int index;
        for(int i=numb;i>=0;i--){
        for(int j=0;j<numb-1;j++){
        index=j+1;
            Card c,m; 
            if(((c= (Card) elementData[j]).getpos())>((m= (Card) elementData[index]).getpos())){
          
            
            Object sma=elementData[j];
            elementData[j]=elementData[index];
            elementData[index]=sma;
        }}
        }    
           
        
    }
    // A CardPile can be shuffled.  The algorithm is pretty simple:
    public void shuffle () {
	int re = (int) (Math.random()*20);
       if(re==0){re = (int) (Math.random()*10);}else{
        do{
        Object curObject = elementData [0];
	// Need a random number generator to shuffle.
	Random r = new Random(37);
	int i;
	// For each card, pick another card randomly in the rest of the
	// (unshuffled) deck and swap it with the current card.  Note that
	// there are many incorrect shuffling algorithms out there; this
	// one works properly.
	for (i=0; i< elementCount; i++) {
	    final int randomPosition = Math.abs(r.nextInt()) % elementCount;
	    final Object tempObject = elementData [i];
	    elementData [i] = elementData [randomPosition];
	    elementData [randomPosition] = tempObject;
	}
       re--;
       }while(re!=0);}
    }

    // Simple print routine.
    public void print () {
       
	Enumeration myEnum = elements();
	while (myEnum.hasMoreElements()) {
	    Card c = (Card) myEnum.nextElement();
            System.out.println ("    " + c+"   "+c.getpos());
	   
	    }
	
    }
    public void draw(Graphics2D g,int x,int y,int z,ImageObserver q){
    
        Image ii;
        Enumeration myEnum = elements();
	while (myEnum.hasMoreElements()) {
	    Card c = (Card) myEnum.nextElement();
    ii=c.getimage().getImage();
    g.drawImage(ii, x, y, q);
        x+=z;
        if(x>920){x=0;y+=100;}
        }}
}
