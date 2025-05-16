package Caso4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ventana4 extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JButton btnNadar;
	private JTextArea txtS;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana4 frame = new Ventana4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("ANIMAL:");
			lblNewLabel.setBounds(41, 41, 64, 14);
			contentPane.add(lblNewLabel);
		}
		{
			comboBox = new JComboBox();
			comboBox.addItemListener(this);
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pato", "Cisne"}));
			comboBox.setBounds(161, 37, 97, 22);
			contentPane.add(comboBox);
		}
		{
			btnNewButton = new JButton("VOLAR");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(51, 108, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNadar = new JButton("NADAR");
			btnNadar.addActionListener(this);
			btnNadar.setBounds(206, 108, 89, 23);
			contentPane.add(btnNadar);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(41, 155, 266, 95);
			contentPane.add(txtS);
		}
		{
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\UPN\\Desktop\\Semana 8 NRC 11377\\Case4\\src\\Caso4\\img\\pato.jpg"));
			lblNewLabel_1.setBounds(135, 261, 72, 86);
			contentPane.add(lblNewLabel_1);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNadar) {
			do_btnNadar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Limpiar();
		int posi = comboBox.getSelectedIndex();
		switch (posi) {
		case 0:
			Pato p = new Pato();
			txtS.append(""+p.Volar());
			break;

		default:
			Cisne c = new Cisne();
			txtS.append(""+c.Volar());
			break;
		}
	}
	void Limpiar() {
		txtS.setText("");
	}
	protected void do_btnNadar_actionPerformed(ActionEvent e) {
		Limpiar();
		int posi = comboBox.getSelectedIndex();
		switch (posi) {
		case 0:
			Pato p = new Pato();
			txtS.append(""+p.Nadar());
			break;

		default:
			Cisne c = new Cisne();
			txtS.append(""+c.Nadar());
			break;
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == comboBox) {
			do_comboBox_itemStateChanged(e);
		}
	}
	protected void do_comboBox_itemStateChanged(ItemEvent e) {
		int posi=comboBox.getSelectedIndex();
		switch (posi) {
		case 0: 
			Limpiar();
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\UPN\\Desktop\\Semana 8 NRC 11377\\Case4\\src\\Caso4\\img\\pato.jpg"));
			break;

		case 1:
			Limpiar();
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\UPN\\Desktop\\Semana 8 NRC 11377\\Case4\\src\\Caso4\\img\\cisne.jpg"));
			break;
		}
	}
}
