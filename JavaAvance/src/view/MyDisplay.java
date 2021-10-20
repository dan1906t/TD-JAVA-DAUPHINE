package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel{
	
	protected void paintComponent(Graphics g)
	{
		Color c = Color.red;
		Color c2 = Color.GREEN;
		Color c3 = Color.blue;
		super.paintComponent(g);
		g.setColor(c);
		g.drawLine(20, 100, 350, 100);
		g.setColor(c2);
		g.drawOval(50, 40, 150, 150);  
		g.setColor(c3);
		g.drawRect(50, 40, 150, 150);  
		
	}
	
	
	public static void main(String []args){
		
		JFrame frame = new JFrame("Java Avanc´e - Graphic Display");
		
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
		
		}

}
