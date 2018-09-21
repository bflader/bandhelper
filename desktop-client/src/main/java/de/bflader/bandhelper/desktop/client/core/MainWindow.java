package de.bflader.bandhelper.desktop.client.core;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainWindow {

	private static final int MINIMUM_WIDTH = 800;
	private static final int MINIMUM_HEIGHT = 600;
	private static final String TITLE = "Band :: Helper";

	JFrame frame = new JFrame();

	public MainWindow() {
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Test setup
		frame.setTitle(TITLE);
		frame.setMinimumSize(new Dimension(MINIMUM_WIDTH, MINIMUM_HEIGHT));
		frame.setLocationRelativeTo(null);
	}

	public void show() {
		frame.setVisible(true);
	}
}
