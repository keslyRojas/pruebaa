/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panelcanva;

/**
 *
 * @author lab2-05
 */
public class PanelCanva extends JPanel {
    
    private int y;
    private int x;
    
    public PanelCanva (){
            this.x = 20;
            this.y = 20;
    }
    @Override
     protected void
             paintComponent(Graphics g)
             {
                 super.painComponent(g);
                 g.setColor(Color.PIMK);
                 g.fillOval(x, y, 25, 25);
                 g.fillRect(50,100,50.30);
             }
            protected void paintComponent(Graphics g){
                
                super.painComponent (g);
                g.setColor (c: Color.ORANGE);
                g.fillRect (x, y, width:25, height:25 );
            }
            
            public void moveRight()
            {
                this.x=x+10;
                this.repaint ();
            }
            
             public void moveLeft()
             {
                this.x=x-10;
                this.repaint ();
            }
             
              public void moveUp()
              {
                this.y=y-10;
                this.repaint ();
            }
              
               public void moveDown(){
                this.y=y-10;
                
                this.repaint ();
            }
}

