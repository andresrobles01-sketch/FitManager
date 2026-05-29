package co.edu.uptc.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ButtonsPanel extends JPanel{
	
	private ControlsPanel controlsPanel;
	private WindowView window;
	private JButton btnDelete;
	private JButton btnModify;
	private JButton btnAdd;
	
	public ButtonsPanel(ControlsPanel controlsPanel) {
		this.controlsPanel = controlsPanel;
		window = new WindowView(); 
		initComponents();
	}

	private void initComponents() {
		this.setLayout(new FlowLayout(FlowLayout.RIGHT,10,0));
		this.setOpaque(false);
		
		btnDelete = createBtn("Eliminar", new Color(180, 50, 50));
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog("Ingrese el documento de identidad(id) del usuario que desea eliminar");
			}
			
		});
		add(btnDelete);
		
		btnModify = createBtn("Modificar", new Color(45, 48, 62));
		btnModify.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				window.askString("Ingrese el documento de identidad para modificar");
			}
		});
		add(btnModify);
		
		btnAdd = createBtn("+ Agregar miembro", new Color(107, 89, 204));
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = window.askString("Ingrese el documento de identidad");
				String name = window.askString("Ingrese el nombre");
				String lastName = window.askString("Ingrese el apellido");
				String age = window.askString("Ingrese la edad");
				String weight = window.askString("Ingrese el peso");
				String height = window.askString("Ingrese la altura (cm)");
				String email =window.askString("Ingrese el correo electrónico");
				String[] gender= {"M","F"};
				Object selectedGender =JOptionPane.showInputDialog(null, "Sexo", "Registro de usuario", JOptionPane.INFORMATION_MESSAGE, null, gender, "Seleccione una opción");
				String genderSelected = selectedGender.toString();			}
			
		});
		add(btnAdd);


	}
	private JButton createBtn(String text, Color back) {
		JButton btn = new JButton(text);
		btn.setBackground(back);
		btn.setForeground(Color.WHITE);
		btn.setFocusPainted(false);
		btn.setFont(new Font("Arial", Font.BOLD, 13));
		btn.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(back.brighter(), 1),
				new EmptyBorder(8, 15, 8, 15)
				));
		return btn;
	}
}
