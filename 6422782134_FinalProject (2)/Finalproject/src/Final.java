import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Final extends JFrame implements MouseListener,MouseMotionListener {
	int r = 60;
	int x = 0;
	int y = 0;
	JFrame screen;
	Container c;
	JPanel panel;
	JPanel startPanel;
	JLabel label;
	JButton but1;
	
	public Final() {
		setVisible(true);
		setSize(1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		setFocusable(true);
	}
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		if (e.getModifiersEx()==InputEvent.BUTTON1_DOWN_MASK) {
			g.setColor(Color.pink);
			g.drawOval(x,y,e.getY(),e.getY());
		}
		else {
			g.setColor(getBackground());
			g.fillOval(x-r, y-r, 2*r, 2*r);
		}
		x = e.getX();
		y = e.getY();
	}
	
	public void mouseMoved(MouseEvent e) {
		
		
	}
	public void mouseClicked(MouseEvent e) {
		
	}
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
	}
	public void mouseReleased(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {	
	}
	
}


