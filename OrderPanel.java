package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class OrderPanel extends JPanel{
	private ControlsPanel controlsPanel;
	private JLabel lblOrder;
	private JTable tabla;
	private DefaultTableModel modeloTabla;
    private TableRowSorter<DefaultTableModel> clasificador;

	
	public OrderPanel(ControlsPanel controlsPanel) {
		this.controlsPanel=controlsPanel;
		initComponents();
	}

	private void initComponents() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));
		this.setOpaque(false);
		lblOrder = new JLabel("Ordenar por:");
		lblOrder.setForeground(Color.LIGHT_GRAY);
		
		String[] orderOptions = {"ID", "Nombre", "Edad", "Sexo", "Peso"};
		JComboBox<String> comboOrder = new JComboBox<>(orderOptions);
		comboOrder.setBackground(new Color(37,40,54));
		comboOrder.setForeground(Color.WHITE);
		
		add(lblOrder);
		add(comboOrder);
		// --- LA TABLA DE MIEMBROS ---
        String[] columnas = {"ID", "NOMBRE COMPLETO", "EDAD", "SEXO", "PESO"};
        modeloTabla = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };

        modeloTabla.addRow(new Object[]{"1122513725", "Cesar Sierra", 19, "M", "62.5 kg"});
        modeloTabla.addRow(new Object[]{"#002", "Pedro Gómez", 30, "M", "80.0 kg"});
        modeloTabla.addRow(new Object[]{"#003", "Daniel Martínez", 28, "M", "75.3 kg"});

        tabla = new JTable(modeloTabla);
        tabla.setBackground(new Color(37, 40, 54));
        tabla.setForeground(Color.WHITE);
        tabla.setRowHeight(45);
        tabla.setGridColor(new Color(45, 48, 62));
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        tabla.getTableHeader().setBackground(new Color(30, 33, 45));
        tabla.getTableHeader().setForeground(Color.LIGHT_GRAY);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));

        // Vincular el ordenador automático al ComboBox
        clasificador = new TableRowSorter<>(modeloTabla);
        tabla.setRowSorter(clasificador);

        comboOrder.addActionListener(e -> {
            int columnaSeleccionada = comboOrder.getSelectedIndex();
            clasificador.toggleSortOrder(columnaSeleccionada);
        });
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(45, 48, 62)));
        scrollPane.getViewport().setBackground(new Color(37, 40, 54));

        add(scrollPane, BorderLayout.CENTER);	
	}
	
}
