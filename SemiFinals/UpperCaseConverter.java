import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UpperCaseConverter extends JFrame implements KeyListener
{
   JTextField textArea, resultArea;
   String text = "";
   
   public static void main(String [] args)
   {
      new UpperCaseConverter();
   }
   
   UpperCaseConverter()
   {
      setTitle("Upper Case Converter");
      setSize(500, 500);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(2,1));
      
      textArea = new JTextField();
      resultArea = new JTextField();
      
      resultArea.setEditable(false);   
      
      add(textArea);
      add(resultArea);
      
      
      textArea.addKeyListener(new KeyListener()
      {
         public void keyPressed(KeyEvent e)
         {
            text = textArea.getText().toUpperCase();
         } 
         public void keyReleased(KeyEvent e)
         {
            resultArea.setText(text);
         }
         public void keyTyped(KeyEvent e){}
      });
      
      setVisible(true);
   }
  
   public void keyPressed(KeyEvent e){}
   public void keyReleased(KeyEvent e){}
   public void keyTyped(KeyEvent e){}
}