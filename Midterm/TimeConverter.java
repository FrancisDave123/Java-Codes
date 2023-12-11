import javax.swing.*;
import java.awt.*;

public class TimeConverter
{
   public TimeConverter()
   {
      JFrame frame = new JFrame("TIME CONVERTER");
      
      frame.setSize(500, 600);
      
      frame.setLocationRelativeTo(null);
      
      //Labels
      
      JLabel secondsLabel, year, weeks, days, hours, mins;
      
      secondsLabel = new JLabel("Enter Seconds: ");
      secondsLabel.setHorizontalAlignment(JTextField.RIGHT);
      
      year = new JLabel("Years: ");
      year.setHorizontalAlignment(JTextField.RIGHT);

      weeks = new JLabel("Weeks: ");
      weeks.setHorizontalAlignment(JTextField.RIGHT);

      days = new JLabel("Days: ");
      days.setHorizontalAlignment(JTextField.RIGHT);

      hours = new JLabel("Hours: ");
      hours.setHorizontalAlignment(JTextField.RIGHT);

      mins = new JLabel("Minutes: ");
      mins.setHorizontalAlignment(JTextField.RIGHT);

      
      //TextField
      
      JTextField seconds, yrs, wks, dys, hrs, mns;
      
      seconds = new JTextField();
      yrs = new JTextField();
      yrs.setEnabled(false);
      wks = new JTextField();
      wks.setEnabled(false);
      dys = new JTextField();
      dys.setEnabled(false);
      hrs = new JTextField();
      hrs.setEnabled(false);
      mns = new JTextField();
      mns.setEnabled(false);
      
      //Buttons
      
      JButton compute, exit;
      compute = new JButton("Compute");
      exit = new JButton("Exit");

            
      frame.add(secondsLabel);
      frame.add(seconds);
      
      frame.add(year); 
      frame.add(yrs);
      
      frame.add(weeks);
      frame.add(wks);
      
      frame.add(days);
      frame.add(dys);
      
      frame.add(hours);
      frame.add(hrs);
      
      frame.add(mins);
      frame.add(mns);
      
      frame.add(compute);
      frame.add(exit);
      
      
      //frame.add(secondsInput);
      
      frame.setLayout(new GridLayout(7,2));
      
      frame.setVisible(true);
   }
}