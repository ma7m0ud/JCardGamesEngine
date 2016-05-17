/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcardgamesengine;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
/**
 *
 * @author jhon
 */
public class Clousins {
   
    private int ran1=0,ran2=(int)(Math.random()*200),ran3=0,ran4=0,ran5=0,ran6=0,ran7=0;
  public static  ArrayList<Rectangle> colu=new ArrayList<Rectangle>();

  public Clousins(){

addelemnts();
}

public void addelemnts(){
colu.removeAll(colu);  

    colu.add(new Rectangle(100,0+ran1,34,70));

    
colu.add(new Rectangle(100,100+ran3,34,70));


colu.add(new Rectangle(100,200+ran4,34,70)); 

colu.add(new Rectangle(100,300+ran5,34,70));

colu.add(new Rectangle(100,400+ran6,34,70)); 

colu.add(new Rectangle(100,500+ran7,34,70));

}

public void update(double num){
ran1+=num;
if(ran1>600)ran1=0;
ran3+=num;
if(ran3+100>600)ran3=0;
ran4+=num;
if(ran4+200>600)ran4=0;
ran5+=num;
if(ran5+300>600)ran5=0;
ran6+=num;
if(ran6+400>600)ran6=0;
ran7+=num;
if(ran6+500>600)ran7=0;
addelemnts();
}
public boolean isFull(){
if(colu.size()==6)
    return true;
else return false;
}
public void draw(Graphics2D g2d){

    g2d.setColor(Color.red);
if(isFull()){
    for(Rectangle x:colu)
g2d.fill(x);

}}
}
