/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcardgamesengine;

public class Player {
CardPile hand=new CardPile();
String pos="";
public Player(String pos ){
this.pos=pos;
}
public CardPile gethand(){
return hand;
}
 public void addCard (Card card) {
	 hand.addElement(card);
        
    }
}
