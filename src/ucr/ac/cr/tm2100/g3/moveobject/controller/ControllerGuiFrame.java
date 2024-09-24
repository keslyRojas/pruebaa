/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.moveobject.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import panelcanva.PanelCanva;
import ucr.ac.cr.tm2100.g3.moveobject.vista.PanelCanva;
/**
 *
 * @author lab2-05
 */

//necesita ir dentro del paquete de controladores

public class ControllerGuiFrame implements ActionListener, KeyListener {

    private GUIFrame guiFrame;
    private PanelCanva´panelCanva panelCanva;
    
    public ControllerGuiFrame() 
    {
        
        this.guiFrame= new GUIFrame();
        this.panelCanva = this.guiFrame.getPanelCanva();
        this.guiFrame.listenButton(listen: this);
        this.guiFrame.listenKey(listen: this);
     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
         switch (e.getActionCommand()){
            case "Move object":
                this.panelCanva.moveRigth();
                //System.out.println("Move object");
                break;
         }
         this.guiFrame.requestFocusInWindow();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
         
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                this.panelCanva.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                this.panelCanva.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                this.panelCanva.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                this.panelCanva.moveRight();
                break;
        }
        this.guiFrame.requestFocusInWindow();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class GUIFrame {

        public GUIFrame() {
        }
    }
    
}