import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Object.Obj;

public class Gift extends JFrame{
	JButton but1;
	JPanel panel;
	
	
	public Gift(){
		setTitle("Here is Your prize :)");
		setSize(800,600);
		setVisible(true);
		add(new Obj());
		panel = new JPanel();
		panel.setBounds(400,400,200,200);
		but1 = new JButton("Feedback");
		but1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Final();
				setVisible(false);
			}
			
		});
		panel.add(but1);
		
	}
	public static void main(String[] args) { 
		new Gift();   
	 }
}



