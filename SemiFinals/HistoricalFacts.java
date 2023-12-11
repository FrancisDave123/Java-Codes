import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HistoricalFacts extends JFrame implements ActionListener
{  
   JLabel fact1, fact2, fact3, fact4, fact5;
   
   JButton button;
   
   int buttonClicks = 0;

   public static void main(String [] args)
   {
      new HistoricalFacts();
   }
   
   HistoricalFacts()
   {
      setTitle("Historical Facts");
      setVisible(true);
      setLocationRelativeTo(null);
      setSize(500, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fact1 = new JLabel("A Filipino Dwarf Became a Famous Figure in 19th-Century Britain");
      fact2 = new JLabel("A Belgian King Almost Bought the Philippines From Spain");
      fact3 = new JLabel("In 1942, Almost 16 Million Silver Coins Were Dumped Near Corregidor. Some of It Remains Unretrieved");
      fact4 = new JLabel("President Elpidio Quirino Helped Save the Lives of Almost 6,000 “White Russians");
      fact5 = new JLabel("The First American Hero of World War II Was Killed in Combat in the Philippines");
      add(fact1); add(fact2);
      add(fact3); add(fact4); add(fact5);
      setLayout(new GridLayout(5,1));
      
      button = new JButton("Okay");
      add(button);
      button.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            buttonClicks++;
            
            if(buttonClicks == 1)
               fact1.setText("");
            else if(buttonClicks == 2)
               fact2.setText("");
            else if(buttonClicks == 3)
               fact3.setText("");
            else if(buttonClicks == 4)
               fact4.setText("");
            else if(buttonClicks == 5)
               fact5.setText("");
         }
      });
   }
   
   public void actionPerformed(ActionEvent e)
   {
   }
}