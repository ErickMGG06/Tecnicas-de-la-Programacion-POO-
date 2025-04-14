package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clase.Empleado;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtCod;
	private JTextField txtNom;
	private JTextField txtSue;
	private JTextField txtHE;
	private JComboBox <String> cboAreaLa;
	private JComboBox <String> cboAfilia;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Código");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Nombre");
			lblNewLabel_1.setBounds(10, 36, 46, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Ärea laboral");
			lblNewLabel_2.setBounds(10, 61, 71, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Sueldo");
			lblNewLabel_3.setBounds(10, 86, 46, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Horas Extras");
			lblNewLabel_4.setBounds(10, 111, 100, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("Afiliación");
			lblNewLabel_5.setBounds(10, 136, 71, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			txtCod = new JTextField();
			txtCod.setBounds(120, 8, 100, 20);
			contentPane.add(txtCod);
			txtCod.setColumns(10);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(120, 33, 100, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			txtSue = new JTextField();
			txtSue.setColumns(10);
			txtSue.setBounds(120, 83, 100, 20);
			contentPane.add(txtSue);
		}
		{
			txtHE = new JTextField();
			txtHE.setColumns(10);
			txtHE.setBounds(120, 108, 100, 20);
			contentPane.add(txtHE);
		}
		{
			cboAreaLa = new JComboBox<>();
			cboAreaLa.setModel(new DefaultComboBoxModel<>(new String[] {"Administración", "Sistemas", "Marketing"}));
			cboAreaLa.setBounds(120, 57, 100, 22);
			contentPane.add(cboAreaLa);
		}
		{
			cboAfilia = new JComboBox<>();
			cboAfilia.setModel(new DefaultComboBoxModel<>(new String[] {"AFP ", "SNP"}));
			cboAfilia.setBounds(120, 132, 100, 22);
			contentPane.add(cboAfilia);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 194, 414, 313);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(271, 7, 89, 23);
			contentPane.add(btnNewButton);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		String cod=txtCod.getText();
		String nom=txtNom.getText();
		String arela=cboAreaLa.getSelectedItem().toString(); //texto
		Double sue=Double.parseDouble(txtSue.getText());
		int he = Integer.parseInt(txtHE.getText());
		int afilia=cboAfilia.getSelectedIndex();
		Empleado e1 =new Empleado(cod, nom, arela, sue, he, afilia);
		Listado(e1);
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Listado(Empleado e) {
		Imprimir("El código es: "+e.getCod());
		Imprimir("El nombre es: "+e.getNom());
	}
}
