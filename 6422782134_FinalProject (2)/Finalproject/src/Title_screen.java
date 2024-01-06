
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Title_screen {
	
	JFrame screen;
	Container c;
	JPanel panel;
	JPanel startPanel;
	JLabel label;
	Font font = new Font("Times New Roman", Font.PLAIN, 90);
	JButton Start;
	

	
	 Title_screen(String title) {
		super();
		screen = new JFrame();
		screen.setSize(1000, 800);
		screen.setVisible(true);
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setLayout(null);
		c = screen.getContentPane();

		panel = new JPanel();
		panel.setBounds(200,200,600,100);
		panel.setBackground(Color.blue);
		label = new JLabel("MakeUchoicE");
		label.setForeground(Color.black);
		label.setFont(font);
		panel.add(label);
		c.add(panel);
		
		startPanel = new JPanel();
		startPanel.setBounds(400,400,200,200);
		Start = new JButton("Start");
		Start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Games1();
				screen.setVisible(false);
			}
		});
		Start.setBackground(Color.blue);
		Start.setForeground(Color.black);
		startPanel.add(Start);
		c.add(startPanel);
		//Game2 c = new Game2();
		//add(c);
	}
	 
		
		



		public static void main(String[] args)	{
		new Title_screen(null);
	}
}
	
