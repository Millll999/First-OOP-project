
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.text.DecimalFormat;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import javax.swing.Timer;

	public class Game2 {
		
		JFrame window;
		JLabel counterLabel;
		Font font1 = new Font("Arial", Font.PLAIN, 10);	
		Timer timer;	
		int second, minute;
		String ddSecond, ddMinute;	
		DecimalFormat dFormat = new DecimalFormat("00");
		JLabel text;
		JButton but1 ;
		JButton but2 ;
		JPanel pan;
			
		public Game2() {
		
			window = new JFrame();
			window.setSize(1000,800);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setLayout(null);
			window.setTitle("Timer");
			counterLabel = new JLabel("");
			counterLabel.setBounds(50, 50, 50, 50);
			counterLabel.setHorizontalAlignment(JLabel.CENTER);
			counterLabel.setFont(font1);
			
			pan = new JPanel();
			pan.setBounds(200,200,600,100);
			pan.setBackground(Color.blue);
			text = new JLabel("What about this question.What do you want to answer. True or False");
			text.setForeground(Color.black);
			text.setBackground(Color.blue);
			pan.add(text);
			
			but1 = new JButton("True");
			but1.setBounds(200,600,100,50);
			but1.setBackground(Color.blue);
			but1.setForeground(Color.black);
			but1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Math();
					window.setVisible(false);
				}
				
			});
			
			but2 = new JButton("False");
			but2.setBounds(700,600,100,50);
			but2.setBackground(Color.blue);
			but2.setForeground(Color.black);
			but2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					window.setVisible(false);
					new False();
				}
				
			});
			
			
			
			
			window.add(counterLabel);
			window.add(pan);
			window.add(but1);
			window.add(but2);
			window.setVisible(true);
			
	
			counterLabel.setText("0:15");
			second =15;
			minute =0;
			countdownTimer();
			timer.start();						
		}
	    
	
		private void setTitle(String string) {
			// TODO Auto-generated method stub
			
		}


		public void countdownTimer() {
			
			timer = new Timer(1000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					second--;
					ddSecond = dFormat.format(second);
					ddMinute = dFormat.format(minute);	
					counterLabel.setText(ddMinute + ":" + ddSecond);
					
					if(second==-1) {
						second = 59;
						minute--;
						ddSecond = dFormat.format(second);
						ddMinute = dFormat.format(minute);	
						counterLabel.setText(ddMinute + ":" + ddSecond);
					}
					if(minute==0 && second==0) {
						timer.stop();
						window.setVisible(false);
					}
				}
			});		
		}		
	}


