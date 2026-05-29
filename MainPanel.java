package co.edu.uptc.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private HeaderMainPanel headerPanel; 
	private ContentMainPanel contentPanel;
	private MainFrame frame;
	
	public MainPanel(MainFrame frame) {
		this.frame = frame;
		initComponents();
	}

	private void initComponents() {
		this.setLayout(new BorderLayout());
		this.setOpaque(false); // Para que se vea el fondo oscuro del MainFrame
		
		headerPanel = new HeaderMainPanel(this);	
		add(headerPanel, BorderLayout.NORTH);
		
		contentPanel = new ContentMainPanel(this);
		add(contentPanel, BorderLayout.CENTER);
		
		// ELIMINAMOS la instanciación del SidebarPanel de aquí
	}
}