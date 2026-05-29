package co.edu.uptc.view;

import java.awt.*;

import javax.swing.*;

public class CardsPanel extends JPanel{
	private ContentMainPanel contentPanel;
	
	public CardsPanel(ContentMainPanel contentPanel) {
		this.contentPanel=contentPanel;
		initComponents();
	}

	private void initComponents() {
		this.setLayout(new GridLayout(1,4,15,0));
		this.setOpaque(false);
		this.setMaximumSize(new Dimension(Integer.MAX_VALUE,120));
		add(new SummaryCard("Miembros activos","1120"));
		add(new SummaryCard("Último usuario", "Cesar"));
        add(new SummaryCard("Usuarios en el último mes", "723"));
	}
}
