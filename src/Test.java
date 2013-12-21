/*
 * Copyright (c) 2013. MIDN Luke Searle, RAN
 *
 * University of New South Wales @ the Australian Defence Force Academy
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by SEARLE on 16/12/13.
 */
public class Test {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Push counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new PushCounterPanel());
		frame.pack();
		frame.setVisible(true);
	}

	private static class PushCounterPanel extends JPanel {
		private int count = 0;
		private JButton incr;
		private JButton reset;
		private JLabel label;
		private ButtonListener listener = new ButtonListener();

		private PushCounterPanel() {
			incr = new JButton("Push me");
			reset = new JButton("Reset");
			incr.addActionListener(listener);
			reset.addActionListener(listener);
			label = new JLabel("Pushes: " + count);
			add(incr);
			add(reset);
			add(label);
			setPreferredSize(new Dimension(300, 40));
			setBackground(Color.cyan);
		}

		private class ButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == incr) label.setText("Pushes: " + ++count);
				else if (e.getSource() == reset) {
					count = 0;
					label.setText("Pushes: " + count);
				}
			}
		}
	}
}

