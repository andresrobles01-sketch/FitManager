package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import co.edu.uptc.presenter.Presenter;

public class MainFrame extends JFrame {
	
	private Presenter presenter;
	private JPanel dynamicPanel;
	private SidebarPanel sidebarPanel;
	
	public MainFrame(Presenter presenter) {
		this.presenter = presenter;
		setTitle("FitManager");
		setSize(1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		getContentPane().setBackground(new Color(26,29,39));
		
		sidebarPanel = new SidebarPanel(this); 
		add(sidebarPanel, BorderLayout.WEST);

		// 2. Panel dinámico al centro
		dynamicPanel = new JPanel(new BorderLayout());
		dynamicPanel.setOpaque(false);
		
		// 3. Cargamos la vista de inicio por defecto
		MainPanel inicio = new MainPanel(this);
		dynamicPanel.add(inicio, BorderLayout.CENTER);
		
		add(dynamicPanel, BorderLayout.CENTER);
	}
	
	public void showPanel(JPanel newView) {
		dynamicPanel.removeAll();
		dynamicPanel.add(newView, BorderLayout.CENTER);
		dynamicPanel.revalidate();
		dynamicPanel.repaint();
	}
}