package Object;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Obj extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(180, 75, 150, 150);
		g.setColor(Color.pink);
		g.fillOval(380, 75, 150, 150);
		g.setColor(Color.GRAY);
	}
	public static void main(String[] args) { 
		
		   
		 }
}
