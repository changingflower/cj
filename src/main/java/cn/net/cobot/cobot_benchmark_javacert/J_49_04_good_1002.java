package cn.net.cobot.cobot_benchmark_javacert;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JApplet;
import javax.swing.JButton;

public class J_49_04_good_1002 extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;

	public void init() {
		button = new JButton("Click Me");
		getContentPane().add(button, BorderLayout.CENTER);
		Reader reader = new Reader();
		button.addActionListener(reader);	//ok
		try {
			reader.readSomething();
		} catch (IOException e) {
			// Handle exception
		} finally {
			  button.removeActionListener(reader);  // Always executed
		}
	}
}

class Reader implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Toolkit.getDefaultToolkit().beep();
	}

	public void readSomething() throws IOException {
		// Read from file
	}
}