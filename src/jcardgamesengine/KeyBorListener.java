
package jcardgamesengine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBorListener implements KeyListener{
private boolean [] keys =new boolean [256];
    @Override
    public void keyTyped(KeyEvent e) {
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()]=true; 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()]=false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean isKeyPressed(int key){
    return keys[key];
    }
    public boolean isKeyReleased(int key){
    return !keys[key];
    }
}
