package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	 JFrame frame = new JFrame();
	JButton button = new JButton();
	  public void showJFrame() {
		  frame.setVisible(true); 
		  frame.add(button);
		  frame.pack();
		  button.addActionListener(this);
		  
          System.out.println("Button clicked");
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Woohoo!");
		int rand = new Random().nextInt(5);
		  if (rand == 0) {
			  System.out.print("You will always be happy!");
		  }
		  if (rand == 1) {
			  System.out.print("Something big is happening soon");		  
		  }
		  if (rand == 3) {
			  System.out.print("You will meet many new people");
		  }
		  if (rand == 4) {
			  System.out.print("You will ace your next test");
		  }
		  
		
	}
}
