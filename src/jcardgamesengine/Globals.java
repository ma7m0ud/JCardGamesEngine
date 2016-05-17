
package jcardgamesengine;

// Contains various constants used in this package.

import javax.swing.ImageIcon;


// Evan Added: RankSymbol

class Globals {

    // The maximum player score permitted.  
    // You can set it to a lower value for a shorter game.
    final static int MaxPoints = 100;

    
    // Do we print debugging information?  Change the value if you like.
    // final static boolean DEBUG = true;
    
    final static boolean DEBUG = false;

    // Do we use the GUI?  Change the value if you like.
    // set to false if you want just console and file output
    // set to true for turn-by-turn GUI-based play.  Output is still
    //		echoed to console and file.
    //(required output for this assignment may take tons of mouse
    //		clicks if this is set to true!!!)
    final static boolean useGUI = false;
    //final static boolean useGUI = false;

    // The individual suits are represented as integers
    final static int Spades = 2, Diamonds = 1, Clubs = 0, Hearts = 3;
    final static String SuitName[] = {"Clubs", "Diamonds", "Spades",
	"Hearts"};
    final static ImageIcon Twoi, Threei, Fouri, Fivei, Sixi , 
	Seveni, Eighti , Ninei , Teni , Jacki , Queeni, 
	Kingi , Acei,Twoi1, Threei1, Fouri1, Fivei1, Sixi1 , 
	Seveni1, Eighti1 , Ninei1, Teni1 , Jacki1 , Queeni1, 
	Kingi1 , Acei1,Twoi2, Threei2, Fouri2, Fivei2, Sixi2 , 
	Seveni2, Eighti2 , Ninei2 , Teni2, Jacki2 , Queeni2, 
	Kingi2 , Acei2,Twoi3, Threei3, Fouri3, Fivei3, Sixi3 , 
	Seveni3, Eighti3 , Ninei3 , Teni3 , Jacki3 , Queeni3, 
	Kingi3 , Acei3;
    final static String ImageName []={"ClubsImages","DiamondsImages","SpadesImages","HeartsImages"};
    final static ImageIcon SpadesImages[]={Twoi=new ImageIcon("cards\\2s.gif"), Threei=new ImageIcon("cards\\3s.gif"), Fouri=new ImageIcon("cards\\4s.gif"), Fivei=new ImageIcon("cards\\5s.gif"),
	Sixi=new ImageIcon("cards\\6s.gif"), Seveni=new ImageIcon("cards\\7s.gif"), Eighti=new ImageIcon("cards\\8s.gif"), Ninei=new ImageIcon("cards\\9s.gif"), Teni=new ImageIcon("cards\\10s.gif"), Jacki=new ImageIcon("cards\\js.gif"), Queeni=new ImageIcon("cards\\qs.gif"), Kingi=new ImageIcon("cards\\ks.gif"),
	Acei=new ImageIcon("cards\\as.gif")};
    final static ImageIcon DiamondsImages[]={Twoi1=new ImageIcon("cards\\2d.gif"), Threei1=new ImageIcon("cards\\3d.gif"), Fouri1=new ImageIcon("cards\\4d.gif"), Fivei1=new ImageIcon("cards\\5d.gif"),
	Sixi1=new ImageIcon("cards\\6d.gif"), Seveni1=new ImageIcon("cards\\7d.gif"), Eighti1=new ImageIcon("cards\\8d.gif"), Ninei1=new ImageIcon("cards\\9d.gif"), Teni1=new ImageIcon("cards\\10d.gif"), Jacki1=new ImageIcon("cards\\jd.gif"), Queeni1=new ImageIcon("cards\\qd.gif"), Kingi1=new ImageIcon("cards\\kd.gif"),
	Acei1=new ImageIcon("cards\\ad.gif")};
    final static ImageIcon ClubsImages[]={Twoi2=new ImageIcon("cards\\2c.gif"), Threei2=new ImageIcon("cards\\3c.gif"), Fouri2=new ImageIcon("cards\\4c.gif"), Fivei2=new ImageIcon("cards\\5c.gif"),
	Sixi2=new ImageIcon("cards\\6c.gif"), Seveni2=new ImageIcon("cards\\7c.gif"), Eighti2=new ImageIcon("cards\\8c.gif"), Ninei2=new ImageIcon("cards\\9c.gif"), Teni2=new ImageIcon("cards\\10c.gif"), Jacki2=new ImageIcon("cards\\jc.gif"), Queeni2=new ImageIcon("cards\\qc.gif"), Kingi2=new ImageIcon("cards\\kc.gif"),
	Acei2=new ImageIcon("cards\\ac.gif")};
    final static ImageIcon HeartsImages[]={Twoi3=new ImageIcon("cards\\2h.gif"), Threei3=new ImageIcon("cards\\3h.gif"), Fouri3=new ImageIcon("cards\\4h.gif"), Fivei3=new ImageIcon("cards\\5h.gif"),
	Sixi3=new ImageIcon("cards\\6h.gif"), Seveni3=new ImageIcon("cards\\7h.gif"), Eighti3=new ImageIcon("cards\\8h.gif"), Ninei3=new ImageIcon("cards\\9h.gif"), Teni3=new ImageIcon("cards\\10h.gif"), Jacki3=new ImageIcon("cards\\jh.gif"), Queeni3=new ImageIcon("cards\\qh.gif"), Kingi3=new ImageIcon("cards\\kh.gif"),
	Acei3=new ImageIcon("cards\\ah.gif")};
    final static int numSuits = SuitName.length;

    
    // The ranks are also represented as integers
    final static int Two = 0, Three = 1, Four = 2, Five = 3, Six = 4, 
	Seven = 5, Eight = 6, Nine = 7, Ten = 8, Jack = 9, Queen = 10, 
	King = 11, Ace = 12;
    final static String RankName[] = {"Two", "Three", "Four", "Five",
	"Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King",
	"Ace"};
	final static String RankSymbol[] = { "2", "3", "4", "5", "6", "7",
					"8", "9", "10", "J", "Q", "K", "A" };
    final static int numRanks = RankName.length;
    final static int numCards = 52;
    final static int numImages=ImageName.length;

    // A simple test driver to see if the constants are set up properly.
    // Don't bother to run this unless you really want to.
    public static void main (String args[]) {
	int i;
	for (i=0; i<numRanks; i++) {
	    System.out.print (RankName[i] + " ");
	}
	System.out.print ("\n");
	System.out.println ("And here are the suits:");
	for (i=0; i<numSuits; i++) {
	    System.out.print (SuitName[i] + " ");
	}
	System.out.print ("\n");
    }
}

