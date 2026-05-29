package co.edu.uptc.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BarGraphicPanel extends JPanel{
	private ChartsPanel chartsPanel;
	
	public BarGraphicPanel(ChartsPanel chartsPanel) {
		this.chartsPanel=chartsPanel;
		initComponents();
	}

	private void initComponents() {
		this.setLayout(new BorderLayout());
		this.setBackground(new Color(37,40,54));
		this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(45,48,62)),new EmptyBorder(10,10,10,10)));
		
	}
}
