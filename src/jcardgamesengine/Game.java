/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcardgamesengine;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author jhon
 */
public class Game {
private final screenFac screenfac;     
private final JFrame window =new JFrame();
private final GameThread gamethread;
private final KeyBorListener keyListener;
private final MousePad mouselistener;
public Game(int width,int hight,String name){
    window.setSize(width,hight);
    window.setResizable(false);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setFocusable(true);
    window.setLocationRelativeTo(null);
    window.setTitle(name);
    window.setVisible(true);
    screenfac=new screenFac(this);
    gamethread=new GameThread(this);
    window.add(gamethread);
    keyListener=new KeyBorListener();
    mouselistener=new MousePad();
    window.addKeyListener(keyListener);
    window.addMouseListener(mouselistener);
    new Thread(gamethread).start();
}
public KeyBorListener getKeyListener(){
return keyListener;
}
public MousePad getMouseListener(){
return mouselistener;
}
public screenFac getScreenFac(){
return screenfac;
}    
public JFrame getwindow(){
return window;
}    
    
}
