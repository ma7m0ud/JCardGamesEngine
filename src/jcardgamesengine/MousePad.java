
package jcardgamesengine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MousePad implements MouseListener{
 
    private int MouseX,MouseY;
    private boolean Clicked;
    @Override
    public void mouseClicked(MouseEvent e) {
        MouseX=e.getX();
        MouseY=e.getY();
        Clicked=true;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
       mouseClicked(e);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Clicked=false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean isMouseClicked(){
    return Clicked;
    }
    public int getx(){
    return MouseX;
    }
    public int gety(){
    return MouseY;
    }
}
