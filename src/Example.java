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
			Scanner textSca1 = new Scanner(lbl1.getText());
			String name = lbl1.getText();
			lbl1.setBounds(15, 30, 200, 30);
			myFrame.add(lbl1);
			
			
			JTextField tf1 = new JTextField();
			//String name = in.nextLine();
			tf1.setBounds(15, 55, 200, 30);
			myFrame.add(tf1);
			
			JLabel lbl2 = new JLabel("Please enter your phone number");
			Scanner textScan2 = new Scanner(lbl2.getText());
			String number = lbl2.getText();
			lbl2.setBounds(15, 90, 200, 30);
			myFrame.add(lbl2);
			
			JTextField tf2 = new JTextField();
			//int number = in.nextInt();
			tf2.setBounds(15, 115, 200, 30);
			myFrame.add(tf2);
			
			
			
			
			JButton button = new JButton("Command");
			button.setSize(new Dimension(100,30));
			button.setLocation(new Point(250, 55));
			button.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							JLabel lbl3 = new JLabel("Your name is " + name + " and your number is " + number);
							lbl3.setBounds(100, 190, 200, 30);
							myFrame.add(lbl3);
							button.setLocation((int) (Math.random()*500+100), (int)(Math.random()*200+100));
						}
					}
			);
			
			myFrame.add(button);
			
			myFrame.setVisible(true);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
