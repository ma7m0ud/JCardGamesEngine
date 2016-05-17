/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcardgamesengine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author jhon
 */
public class GameThread extends JPanel implements Runnable{
    private final Game game; 
    public GameThread(Game game){
  
        this.game=game;
    setFocusable(true);
    
    }

    public void run(){
while(true){
     try {
  
         if(game.getScreenFac().getCurntScreen()!=null)
    game.getScreenFac().getCurntScreen().onUpadte();
      Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
    public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
   if(game.getScreenFac().getCurntScreen()!=null)
       game.getScreenFac().getCurntScreen().onDraw(g2d);
   repaint();         
    }
}
