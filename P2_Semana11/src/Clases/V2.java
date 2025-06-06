package Clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblRuc;
	private JTextField txtCodEmpresa;
	private JTextField txtNomEmpresa;
	private JTextField txtRUC;
	private JTextField txtCantPersonal;
	private JTextField txtCodDpto;
	private JLabel lblCantidadPersonal;
	private JLabel lblCodigo_1;
	private JLabel lblDptoContabilidad;
	private JTextField txtNomCliente;
	private JTextField txtDireccion;
	private JTextField txtCodCliente;
	private JLabel lblNombre_2;
	private JLabel lblCodigo_2;
	private JLabel lblRuc_2;
	private JLabel lblNewLabel_2;
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
					V2 frame = new V2();
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
	public V2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Empresa");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblCodigo = new JLabel("Codigo:");
			lblCodigo.setBounds(10, 51, 46, 14);
			contentPane.add(lblCodigo);
		}
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(222, 51, 56, 14);
			contentPane.add(lblNombre);
		}
		{
			lblRuc = new JLabel("RUC:");
			lblRuc.setBounds(10, 85, 46, 14);
			contentPane.add(lblRuc);
		}
		{
			txtCodEmpresa = new JTextField();
			txtCodEmpresa.setBounds(66, 48, 86, 20);
			contentPane.add(txtCodEmpresa);
			txtCodEmpresa.setColumns(10);
		}
		{
			txtNomEmpresa = new JTextField();
			txtNomEmpresa.setColumns(10);
			txtNomEmpresa.setBounds(300, 48, 86, 20);
			contentPane.add(txtNomEmpresa);
		}
		{
			txtRUC = new JTextField();
			txtRUC.setColumns(10);
			txtRUC.setBounds(66, 82, 86, 20);
			contentPane.add(txtRUC);
		}
		{
			txtCantPersonal = new JTextField();
			txtCantPersonal.setColumns(10);
			txtCantPersonal.setBounds(300, 174, 86, 20);
			contentPane.add(txtCantPersonal);
		}
		{
			txtCodDpto = new JTextField();
			txtCodDpto.setColumns(10);
			txtCodDpto.setBounds(66, 174, 86, 20);
			contentPane.add(txtCodDpto);
		}
		{
			lblCantidadPersonal = new JLabel("Cantidad personal:");
			lblCantidadPersonal.setBounds(182, 177, 117, 14);
			contentPane.add(lblCantidadPersonal);
		}
		{
			lblCodigo_1 = new JLabel("Codigo:");
			lblCodigo_1.setBounds(10, 177, 46, 14);
			contentPane.add(lblCodigo_1);
		}
		{
			lblDptoContabilidad = new JLabel("Dpto Contabilidad");
			lblDptoContabilidad.setBounds(10, 137, 117, 14);
			contentPane.add(lblDptoContabilidad);
		}
		{
			txtNomCliente = new JTextField();
			txtNomCliente.setColumns(10);
			txtNomCliente.setBounds(300, 261, 86, 20);
			contentPane.add(txtNomCliente);
		}
		{
			txtDireccion = new JTextField();
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(96, 295, 86, 20);
			contentPane.add(txtDireccion);
		}
		{
			txtCodCliente = new JTextField();
			txtCodCliente.setColumns(10);
			txtCodCliente.setBounds(96, 261, 86, 20);
			contentPane.add(txtCodCliente);
		}
		{
			lblNombre_2 = new JLabel("Nombre:");
			lblNombre_2.setBounds(222, 264, 56, 14);
			contentPane.add(lblNombre_2);
		}
		{
			lblCodigo_2 = new JLabel("Codigo:");
			lblCodigo_2.setBounds(10, 264, 46, 14);
			contentPane.add(lblCodigo_2);
		}
		{
			lblRuc_2 = new JLabel("Dirección:");
			lblRuc_2.setBounds(10, 298, 76, 14);
			contentPane.add(lblRuc_2);
		}
		{
			lblNewLabel_2 = new JLabel("Cliente");
			lblNewLabel_2.setBounds(10, 224, 46, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 339, 418, 179);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(270, 294, 89, 23);
			contentPane.add(btnNewButton);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Cliente c = new Cliente(CodCli(), NomCli(), DirCLi());
		Empresa e1;
		DptoConta d = new DptoConta(CodDpto(), CantPerso());
		try {
			e1 = new Empresa(CodEmpre(), NomEmpre(), RucEmpre(), d);
		}catch (Exception e2) {
			e1 = new Empresa();
		}
		Listado(e1);
		Listado(e1, c);
	}
	void Listado(Empresa e) {
		Imprimir("Empresa");
		Imprimir("Código: "+e.getCodEmpresa());
		Imprimir("Nombre: "+e.getNomEmpresa());
		Imprimir("RUC: "+e.getRucEmpresa());
		Imprimir("Dpto Contabilidad");
		Imprimir("Código: "+e.getDpto().getCodDpto());
		Imprimir("Cantidad de personal "+e.getDpto().getCantPersonalDpto());
		Imprimir();
	}
	void Listado(Empresa e, Cliente c) {
		Imprimir("Empresa");
		Imprimir("Código: "+e.getCodEmpresa());
		Imprimir("Nombre: "+e.getNomEmpresa());
		Imprimir("RUC: "+e.getRucEmpresa());
		Imprimir("Cliente");
		Imprimir("Código: "+c.getCodCliente());
		Imprimir("Nombre: "+c.getNomCliente());
		Imprimir("Dirección: "+c.getDirCliente());
		Imprimir();
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Imprimir() {
		txtS.append("-----------------------------------------\n");
	}
	int CodCli() {
		return Integer.parseInt(txtCodCliente.getText());
	}
	int CodEmpre() {
		return Integer.parseInt(txtCodEmpresa.getText());
	}
	int CodDpto () {
		return Integer.parseInt(txtCodDpto.getText());
	}
	String NomCli() {
		return txtNomCliente.getText();
	}
	String NomEmpre() {
		return txtNomEmpresa.getText();
	}
	String NomDpto() {
		return txtCantPersonal.getText();
	}
	String DirCLi() {
		return txtDireccion.getText();
	}
	int RucEmpre() {
		return Integer.parseInt(txtRUC.getText());
	}
	int CantPerso() {
		return Integer.parseInt(txtCantPersonal.getText());
	}
}
