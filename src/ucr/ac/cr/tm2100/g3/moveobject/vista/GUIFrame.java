
import java.awt.event.KeyListener;
import javax.swing.JButton;
import panelcanva.PanelCanva;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab2-05
 */
public class GUIFrame 
{
    
//me fata mucho
    private JButton btnMove;
    private JButton btnDown;
    private PanelCanva panelCanva;
    
    public GUIFrame(int widtn, int height)
    {
        
        this.setSize(width, height);
        this.setVisible(true):
        
    }
    
    public GUIFrame()
    {
        
        this.btnMove = new JButton("Move object");
        this.btnDown = new JButton("Down");
        this,panelCanva = new PanelCanva();
        
        //Agregar los botones al panel de CanvaButton
        this.canvaButton.setLayout (new GridLayout())
        
        this.add(this.canva.BorderLayout.CENTER);
        this.add(this.btnMove.BorderLayout.SOUTH);
        this.setSize(width:400, height:400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
 
    
    public void listenButton (ActionListener listen)
    {
        this.btnMove.addActionListener(l: listen);
    }
    
    public void listenKey(KeyListener listen){
        this.addKeyListener(l:listen);
    }
    
    public PanelCanva getPanelCanva() 
    {
        
        return this.panelCanva;
        
    }
    
}