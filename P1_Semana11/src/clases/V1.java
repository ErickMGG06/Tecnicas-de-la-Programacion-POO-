package clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblCodigo;
	private JTextField txtNomUniversidad;
	private JTextField txtCodUniversidad;
	private JLabel lblNombre;
	private JTextField txtCodFacultad;
	private JLabel lblCodigo_1;
	private JLabel lblFacultad;
	private JLabel lblNombre_1;
	private JTextField txtNomFacultad;
	private JTextField txtCodEstudiante;
	private JLabel lblCodigo_2;
	private JLabel lblEstudiante;
	private JLabel lblNombre_2;
	private JTextField txtNomEstudiante;
	private JButton btnNewButton;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

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
		setBounds(100, 100, 453, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Universidad");
			lblNewLabel.setBounds(10, 11, 84, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblCodigo = new JLabel("Codigo:");
			lblCodigo.setBounds(10, 35, 46, 14);
			contentPane.add(lblCodigo);
		}
		{
			txtNomUniversidad = new JTextField();
			txtNomUniversidad.setBounds(271, 32, 86, 20);
			contentPane.add(txtNomUniversidad);
			txtNomUniversidad.setColumns(10);
		}
		{
			txtCodUniversidad = new JTextField();
			txtCodUniversidad.setColumns(10);
			txtCodUniversidad.setBounds(85, 32, 86, 20);
			contentPane.add(txtCodUniversidad);
		}
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(201, 35, 46, 14);
			contentPane.add(lblNombre);
		}
		{
			txtCodFacultad = new JTextField();
			txtCodFacultad.setColumns(10);
			txtCodFacultad.setBounds(85, 100, 86, 20);
			contentPane.add(txtCodFacultad);
		}
		{
			lblCodigo_1 = new JLabel("Codigo:");
			lblCodigo_1.setBounds(10, 103, 46, 14);
			contentPane.add(lblCodigo_1);
		}
		{
			lblFacultad = new JLabel("Facultad");
			lblFacultad.setBounds(10, 79, 84, 14);
			contentPane.add(lblFacultad);
		}
		{
			lblNombre_1 = new JLabel("Nombre:");
			lblNombre_1.setBounds(201, 103, 46, 14);
			contentPane.add(lblNombre_1);
		}
		{
			txtNomFacultad = new JTextField();
			txtNomFacultad.setColumns(10);
			txtNomFacultad.setBounds(271, 100, 86, 20);
			contentPane.add(txtNomFacultad);
		}
		{
			txtCodEstudiante = new JTextField();
			txtCodEstudiante.setColumns(10);
			txtCodEstudiante.setBounds(85, 175, 86, 20);
			contentPane.add(txtCodEstudiante);
		}
		{
			lblCodigo_2 = new JLabel("Codigo:");
			lblCodigo_2.setBounds(10, 178, 46, 14);
			contentPane.add(lblCodigo_2);
		}
		{
			lblEstudiante = new JLabel("Estudiante");
			lblEstudiante.setBounds(10, 154, 84, 14);
			contentPane.add(lblEstudiante);
		}
		{
			lblNombre_2 = new JLabel("Nombre:");
			lblNombre_2.setBounds(201, 178, 46, 14);
			contentPane.add(lblNombre_2);
		}
		{
			txtNomEstudiante = new JTextField();
			txtNomEstudiante.setColumns(10);
			txtNomEstudiante.setBounds(271, 175, 86, 20);
			contentPane.add(txtNomEstudiante);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(82, 216, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnBorrar = new JButton("Borrar");
			btnBorrar.setBounds(251, 216, 89, 23);
			contentPane.add(btnBorrar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(42, 255, 340, 103);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Estudiante e1 = new Estudiante(CodEstu(), NomEstu());
		Facultad f= new Facultad(CodFacu(), NomFacu());
		Universidad u;
		try {
			u = new Universidad(Coduni(), NomUni(), f);
		}catch (Exception e2) {
			u =new Universidad();
			
		}
		Listado(u);
		Listado(u, e1);
		
	}
	void Listado(Universidad u) {
		Imprimir("Universidad");
		Imprimir("Código. "+u.getCodUniversidad());
		Imprimir("nombre. "+u.getNomUniversidad());
		Imprimir("Facultad");
		Imprimir("Código: "+u.getFacu().getCodFacultad());
		Imprimir("Nombre: "+u.getFacu().getNomFacultad());
		Imprimir();
		
	}
	void Listado(Universidad u,Estudiante e) {
		Imprimir("Universidad");
		Imprimir("Código. "+u.getCodUniversidad());
		Imprimir("nombre. "+u.getNomUniversidad());
		Imprimir("Estudiante");
		Imprimir("Código: "+e.getCodEstudiante());
		Imprimir("Nombre: "+e.getNomEstudiante());
		Imprimir();
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Imprimir() {
		txtS.append("-----------------------------------------\n");
	}
	int Coduni() {
		return Integer.parseInt(txtCodUniversidad.getText());
	}
	String NomUni() {
		return txtNomUniversidad.getText();
	}
	int CodFacu() {
		return Integer.parseInt(txtCodFacultad.getText());
	}
	String NomFacu() {
		return txtNomFacultad.getText();
	}
	int CodEstu() {
		return Integer.parseInt(txtCodEstudiante.getText());
	}
	String NomEstu() {
		return txtNomEstudiante.getText();
	}
}
