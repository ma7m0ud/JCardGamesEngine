
package jcardgamesengine;

import java.awt.Graphics2D;

public abstract class screen {
    private final screenFac screenfac;
    public screen(screenFac screenfac){
    this.screenfac=screenfac;
    }
    public abstract void oncreat();
    public abstract void onUpadte();
    public abstract void onDraw(Graphics2D g2d);
    public screenFac getscrrenfac(){
    
    return screenfac;}
}
