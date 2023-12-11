import javax.swing.*;
import java.awt.*;

public class PracticeGUI
{
   public static void main(String [] args)
   {
      JFrame frame = new JFrame("Area and perimeter of rectangle");
      
      JLabel lengthLabel, widthLabel, areaLabel;
      JTextField inputLength, inputWidth, resultArea;
      
      lengthLabel = new JLabel("Enter length: ");
      lengthLabel.setBounds(30,30,100,50);
      
      inputLength = new JTextField();
      inputLength.setBounds(100, 30, 200, 50);
      
      widthLabel = new JLabel("Enter width: ");
      widthLabel.setBounds(30,100,100,50);
      
      inputWidth = new JTextField();
      inputWidth.setBounds(100, 100, 200, 50);
      
      areaLabel = new JLabel("Area: ");
      areaLabel.setBounds(65, 170, 100, 50);
      
      resultArea = new JTextField();
      resultArea.setEnabled(false);
      resultArea.setBounds(100, 170, 200, 50);
      
      frame.setSize(360,350);
      
      frame.add(lengthLabel);
      frame.add(inputLength);
      frame.add(widthLabel);
      frame.add(inputWidth);
      frame.add(areaLabel);
      frame.add(resultArea);
      
      try
      {
         double length = Double.parseDouble(inputLength.getText());
         double width = Double.parseDouble(inputWidth.getText());
         
         double area = length * width;
         
         resultArea.setText(String.valueOf(area));
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null, "Please enter a valid length and height!");
      }
      
      
      
      
      frame.setLayout(null);
      frame.setVisible(true);
   }
}
