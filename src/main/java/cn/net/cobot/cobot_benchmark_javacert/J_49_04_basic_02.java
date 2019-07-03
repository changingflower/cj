package cn.net.cobot.cobot_benchmark_javacert;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JApplet;
import javax.swing.JButton;

public class J_49_04_basic_02 extends JApplet {
	JButton button;

	public void init() {
		button = new JButton("Click Me");
		getContentPane().add(button, BorderLayout.CENTER);
		Reader11 reader = new Reader11();
		button.addActionListener(reader);	//not compliant
		try {
			reader.readSomething();
		} catch (IOException e) {
			// Handle exception
		}
	}
}

class Reader11 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Toolkit.getDefaultToolkit().beep();
	}

	public void readSomething() throws IOException {
		// Read from file
	}
}