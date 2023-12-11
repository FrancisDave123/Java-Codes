import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CaseConverter extends JFrame implements KeyListener
{
   JTextField textArea, resultArea;
   String text;
   String output = "";
   
   public static void main(String [] args)
   {
      new CaseConverter();
   }
   
   CaseConverter()
   {
      setTitle("Case Converter");
      setSize(500, 500);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(2,1));
      
      textArea = new JTextField();
      resultArea = new JTextField();
      
      textArea.setBackground(Color.cyan);
      textArea.setFont(new Font("Serif", Font.BOLD, 30));
      textArea.setForeground(Color.red);
      
      resultArea.setEditable(false);   
      
      resultArea.setBackground(Color.yellow);
      resultArea.setFont(new Font("Serif", Font.BOLD, 30));
      
      add(textArea);
      add(resultArea);
      
      
      textArea.addKeyListener(new KeyAdapter()
      {
         public void keyPressed(KeyEvent e)
         {
            text = textArea.getText();
            if(e.getKeyCode() == KeyEvent.VK_ENTER)
            {
               for(int a = 0; a < text.length(); a++)
               {
                  char t = text.charAt(a);
                  
                  if(Character.isLowerCase(t))
                     output += Character.toUpperCase(t);
                  else if(Character.isUpperCase(t))
                     output += Character.toLowerCase(t);
                  else
                     output += output;  
               }
               resultArea.setText(output);
            }
         }
      });
      
      setVisible(true);
   }
  
   public void keyPressed(KeyEvent e){}
   public void keyReleased(KeyEvent e){}
   public void keyTyped(KeyEvent e){}
}