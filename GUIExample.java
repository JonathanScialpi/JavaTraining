import javax.swing.*;
import java.awt.*;

public class GUIExample extends JFrame {

      /**
      * @param args
      */
      public static void main(String[] args) {
       Frame613 f = new Frame613();
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
       
      }
}
      class Frame613 extends JFrame
      {
    	  public Frame613(){
    		  setTitle("613 rocks!");
    		  setSize(300,200);
    		  setLocation(100,200);
    		  
    		  Panel613 panel = new Panel613();
    		  Container cp = getContentPane();
    		  cp.add(panel);
    	  }
    	  
      }
      
      class Panel613 extends JPanel
      {
    	  public void paintComponent (Graphics g){
    		  super.paintComponent(g);
    		  g.drawString("Hello World!", 75, 100);
    	  }
      }
