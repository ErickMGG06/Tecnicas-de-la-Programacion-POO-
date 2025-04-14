package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglo.ArregloEstudiante;
import Clase.Estudiante;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNota;
	private JLabel lblNota_1;
	private JLabel lblNombre;
	private JLabel lblNota_2;
	private JTextField txtCod;
	private JTextField txtN1;
	private JTextField txtN3;
	private JTextField txtNom;
	private JTextField txtN2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Código");
			lblNewLabel.setBounds(22, 32, 45, 13);
			contentPane.add(lblNewLabel);
		}
		{
			lblNota = new JLabel("Nota1");
			lblNota.setBounds(22, 56, 45, 13);
			contentPane.add(lblNota);
		}
		{
			lblNota_1 = new JLabel("Nota 3");
			lblNota_1.setBounds(22, 80, 45, 13);
			contentPane.add(lblNota_1);
		}
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(244, 31, 45, 13);
			contentPane.add(lblNombre);
		}
		{
			lblNota_2 = new JLabel("Nota 2");
			lblNota_2.setBounds(244, 55, 45, 13);
			contentPane.add(lblNota_2);
		}
		{
			txtCod = new JTextField();
			txtCod.setColumns(10);
			txtCod.setBounds(89, 28, 125, 19);
			contentPane.add(txtCod);
		}
		{
			txtN1 = new JTextField();
			txtN1.setColumns(10);
			txtN1.setBounds(89, 52, 125, 19);
			contentPane.add(txtN1);
		}
		{
			txtN3 = new JTextField();
			txtN3.setColumns(10);
			txtN3.setBounds(89, 76, 125, 19);
			contentPane.add(txtN3);
		}
		{
			txtNom = new JTextField();
			txtNom.setColumns(10);
			txtNom.setBounds(331, 28, 125, 19);
			contentPane.add(txtNom);
		}
		{
			txtN2 = new JTextField();
			txtN2.setColumns(10);
			txtN2.setBounds(331, 56, 125, 19);
			contentPane.add(txtN2);
		}
		{
			btnNewButton = new JButton("Reportar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(22, 121, 85, 21);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Adicionar");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(117, 120, 85, 21);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Buscar");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(212, 120, 85, 21);
			contentPane.add(btnNewButton_2);
		}
		{
			btnNewButton_3 = new JButton("Eliminar");
			btnNewButton_3.addActionListener(this);
			btnNewButton_3.setBounds(307, 120, 85, 21);
			contentPane.add(btnNewButton_3);
		}
		{
			btnNewButton_4 = new JButton("Modificar");
			btnNewButton_4.addActionListener(this);
			btnNewButton_4.setBounds(402, 120, 85, 21);
			contentPane.add(btnNewButton_4);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(35, 177, 452, 131);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_4) {
			do_btnNewButton_4_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_3) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	ArregloEstudiante ae = new ArregloEstudiante();
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Listado();
		Imprimir("La cantidad de estudiantes es: "+ae.Tamaño() );
		Imprimir("El promedio general es: "+ae.PromedioGeneral());
		}
		void Imprimir(String s) {
			txtS.append(s+"\n");
		}
		void Listado() {
			Imprimir("Código\tNombre\tNota 1\tNota 2\tNota 3\tPromedio");
			for (int i = 0; i <ae.Tamaño() ; i++) {
				Imprimir(""+ae.Obtener(i).getCod()+"\t"+ae.Obtener(i).getNom()+"\t"
						+ae.Obtener(i).getN1()+"\t"+ae.Obtener(i).getN2()
						+"\t"+ae.Obtener(i).getN3()
						+"\t"+ae.Obtener(i).Promedio());
			}
	}
		
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		Estudiante es=ae.Buscar(LeerCodigo());
		//si no encuentra el valor de es=null
		if(es==null) {
			Estudiante e1=new Estudiante(LeerCodigo(),LeerNombre(),LeerN1(),LeerN2(),LeerN3());
			ae.Adicionar(e1);
		}
		else JOptionPane.showMessageDialog(this,"El código ya existe");
		}
		int LeerCodigo() {
			return Integer.parseInt(txtCod.getText());
		}
		String LeerNombre() {
			return txtNom.getText();
		}
		double LeerN1() {
			return Double.parseDouble(txtN1.getText());
		}
		double LeerN2() {
			return Double.parseDouble(txtN2.getText());
		}
		double LeerN3() {
			return Double.parseDouble(txtN3.getText());
		}
		protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
			txtS.setText("");
			Estudiante es=ae.Buscar(LeerCodigo());
			if(es!=null) {
				Imprimir("Código\tNombre\tNota 1\tNota 2\tNota 3\tPromedio");
				Imprimir(""+es.getCod()+"\t"+es.getNom()+"\t"+es.getN1()
				+"\t"+es.getN2()+"\t"+es.getN3()+"\t"+es.Promedio());
			}
			else JOptionPane.showMessageDialog(this,"No existe código");
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		Estudiante es=ae.Buscar(LeerCodigo());
		if(es!=null) ae.Eliminar(es);
		else JOptionPane.showMessageDialog(this,"No existe código");
	}
	protected void do_btnNewButton_4_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Estudiante es=ae.Buscar(LeerCodigo());
		if(es!=null) {
			es.setNom(LeerNombre());
			es.setN1(LeerN1());
			es.setN2(LeerN2());
			es.setN3(LeerN3());
			Listado();
		}
		else JOptionPane.showMessageDialog(this, "El código no existe");
	}
}
