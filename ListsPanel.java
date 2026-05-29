package co.edu.uptc.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ListsPanel extends JPanel{
	private ContentMainPanel contentPanel;
	private JLabel titleLabel;
	
	public ListsPanel(ContentMainPanel contentPanel) {
		this.contentPanel=contentPanel;
		initComponents();
	}

	private void initComponents() {
		this.setLayout(new GridLayout(1,3,15,0));
		this.setOpaque(false);
		this.setMaximumSize(new Dimension(Integer.MAX_VALUE,250));
		this.add(createPanel("Miembros recientes"));
		this.add(createPanel("Rutinas recientes"));	
		this.add(createPanel("Rutinas recientes"));	
	}
	
    private JPanel createPanel(String title) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(37, 40, 54));
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(45, 48, 62), 1),
                new EmptyBorder(10, 10, 10, 10)
        ));

        titleLabel = new JLabel(title);
        titleLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(titleLabel, BorderLayout.NORTH);

        /*JLabel content = new JLabel("Contenido de " + title);
        content.setForeground(Color.GRAY);
        content.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(content, BorderLayout.CENTER);
        */

        return panel;
    }
}
