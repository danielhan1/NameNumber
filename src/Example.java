import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

import java.util.Scanner;
public class Example 
{
		public static void main(String[] args)
		{
			
			
			JFrame myFrame = new JFrame("NameNumberFrame");
			myFrame.setBounds(300, 200, 500, 250);
			myFrame.setLayout(null);
			
			//Scanner in = new Scanner(System.in);
			
			JLabel lbl1 = new JLabel("Please enter your name");
			
			lbl1.setBounds(15, 30, 200, 30);
			myFrame.add(lbl1);
			
			
			JTextField tf1 = new JTextField();
			//String name = in.nextLine();
			tf1.setBounds(15, 55, 200, 30);
			//Scanner textScan1 = new Scanner(tf1.getText());
			//String name = tf1.getText();
			myFrame.add(tf1);
			
			
			JLabel lbl2 = new JLabel("Please enter your phone number");
			
			lbl2.setBounds(15, 90, 200, 30);
			myFrame.add(lbl2);
			
			JTextField tf2 = new JTextField();
			//int number = in.nextInt();
			tf2.setBounds(15, 115, 200, 30);
			//Scanner textScan2 = new Scanner(tf2.getText());
			//String number = tf2.getText();
			myFrame.add(tf2);
			
			
			
			JButton button = new JButton("Command");
			button.setSize(new Dimension(100,30));
			button.setLocation(new Point(250, 55));
			

			JLabel lbl3 = new JLabel("Your name is: ");
			lbl3.setBounds(250, 100, 200, 30);
			myFrame.add(lbl3);
			JLabel lbl4 = new JLabel("Your number is: ");
			lbl4.setBounds(250, 150, 200, 30);
			myFrame.add(lbl4);
			
			
			button.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							
							String name = tf1.getText();

							String number = tf2.getText();
							
							lbl3.setText("Your name is: " + name);
							lbl4.setText("Your number is: " + number);
						
						}
					}
			);
			
			myFrame.add(button);
			
			myFrame.setVisible(true);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
