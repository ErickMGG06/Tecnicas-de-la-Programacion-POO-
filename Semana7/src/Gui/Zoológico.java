package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Abuelo.Mamifero;
import Hijos.Guepardo;
import Hijos.Leon;
import Hijos.Tigre;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zoológico extends JFrame implements ItemListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox cboMami;
	private JLabel lblHabitat;
	private JLabel lblAltura;
	private JLabel lblLargo;
	private JLabel lblPeso;
	private JLabel lblNombreCientifico;
	private JLabel lblNewLabel_1;
	private JTextField txthabitat;
	private JTextField txtaltura;
	private JTextField txtLargo;
	private JTextField txtPeso;
	private JTextField txtNomCien;
	private JLabel lblTamaoGarras;
	private JLabel lblVelocidad;
	private JLabel lblColor;
	private JLabel lblTamaoColmillos;
	private JLabel lblEspecieTigre;
	private JTextField txtTamañoGarras;
	private JTextField txtVelo;
	private JTextField txtColor;
	private JTextField txtTamañoColmillos;
	private JTextField txtEspecieTIgre;
	private JLabel lblNmeroManada;
	private JLabel lblPotenciaRugido;
	private JLabel lblNmcamada;
	private JLabel lblEspecieLobo;
	private JTextField txtNumManada;
	private JTextField txtPotenciaRugido;
	private JTextField txtNumcamada;
	private JTextField txtEspecieLobo;
	private JLabel lblMordida;
	private JTextField txtMordidaFuerza;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JButton btnProcesar;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zoológico frame = new Zoológico();
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
	public Zoológico() {
		setTitle("Zoológico de mamíferos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Mamífero:");
			lblNewLabel.setBounds(10, 22, 76, 14);
			contentPane.add(lblNewLabel);
		}
		{
			cboMami = new JComboBox();
			cboMami.addItemListener(this);
			cboMami.setModel(new DefaultComboBoxModel(new String[] {"Tigre", "León", "Guepardo", "Lobo", "Perro"}));
			cboMami.setBounds(96, 18, 109, 22);
			contentPane.add(cboMami);
		}
		{
			lblHabitat = new JLabel("Habitat:");
			lblHabitat.setBounds(10, 62, 76, 14);
			contentPane.add(lblHabitat);
		}
		{
			lblAltura = new JLabel("Altura:");
			lblAltura.setBounds(111, 62, 76, 14);
			contentPane.add(lblAltura);
		}
		{
			lblLargo = new JLabel("Largo:");
			lblLargo.setBounds(211, 62, 76, 14);
			contentPane.add(lblLargo);
		}
		{
			lblPeso = new JLabel("Peso:");
			lblPeso.setBounds(311, 62, 76, 14);
			contentPane.add(lblPeso);
		}
		{
			lblNombreCientifico = new JLabel("Nombre Cientifico:");
			lblNombreCientifico.setBounds(411, 62, 132, 14);
			contentPane.add(lblNombreCientifico);
		}
		{
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Zoológico.class.getResource("/animal/TIGRE1 (3).jpg")));
			lblNewLabel_1.setBounds(613, 120, 279, 225);
			contentPane.add(lblNewLabel_1);
		}
		{
			txthabitat = new JTextField();
			txthabitat.setBounds(10, 89, 86, 20);
			contentPane.add(txthabitat);
			txthabitat.setColumns(10);
		}
		{
			txtaltura = new JTextField();
			txtaltura.setColumns(10);
			txtaltura.setBounds(111, 89, 86, 20);
			contentPane.add(txtaltura);
		}
		{
			txtLargo = new JTextField();
			txtLargo.setColumns(10);
			txtLargo.setBounds(211, 89, 86, 20);
			contentPane.add(txtLargo);
		}
		{
			txtPeso = new JTextField();
			txtPeso.setColumns(10);
			txtPeso.setBounds(311, 87, 86, 20);
			contentPane.add(txtPeso);
		}
		{
			txtNomCien = new JTextField();
			txtNomCien.setColumns(10);
			txtNomCien.setBounds(411, 87, 86, 20);
			contentPane.add(txtNomCien);
		}
		{
			lblTamaoGarras = new JLabel("Tamaño Garras:");
			lblTamaoGarras.setBounds(10, 120, 132, 14);
			contentPane.add(lblTamaoGarras);
		}
		{
			lblVelocidad = new JLabel("Velocidad:");
			lblVelocidad.setBounds(111, 120, 132, 14);
			contentPane.add(lblVelocidad);
		}
		{
			lblColor = new JLabel("Color:");
			lblColor.setBounds(211, 120, 76, 14);
			contentPane.add(lblColor);
		}
		{
			lblTamaoColmillos = new JLabel("Tamaño colmillos:");
			lblTamaoColmillos.setBounds(311, 120, 133, 14);
			contentPane.add(lblTamaoColmillos);
		}
		{
			lblEspecieTigre = new JLabel("Especie Tigre");
			lblEspecieTigre.setBounds(411, 120, 133, 14);
			contentPane.add(lblEspecieTigre);
		}
		{
			txtTamañoGarras = new JTextField();
			txtTamañoGarras.setColumns(10);
			txtTamañoGarras.setBounds(10, 149, 86, 20);
			contentPane.add(txtTamañoGarras);
		}
		{
			txtVelo = new JTextField();
			txtVelo.setColumns(10);
			txtVelo.setBounds(111, 149, 86, 20);
			contentPane.add(txtVelo);
		}
		{
			txtColor = new JTextField();
			txtColor.setEditable(false);
			txtColor.setColumns(10);
			txtColor.setBounds(211, 149, 86, 20);
			contentPane.add(txtColor);
		}
		{
			txtTamañoColmillos = new JTextField();
			txtTamañoColmillos.setEditable(false);
			txtTamañoColmillos.setColumns(10);
			txtTamañoColmillos.setBounds(311, 149, 86, 20);
			contentPane.add(txtTamañoColmillos);
		}
		{
			txtEspecieTIgre = new JTextField();
			txtEspecieTIgre.setColumns(10);
			txtEspecieTIgre.setBounds(411, 149, 86, 20);
			contentPane.add(txtEspecieTIgre);
		}
		{
			lblNmeroManada = new JLabel("Número manada:");
			lblNmeroManada.setBounds(9, 203, 133, 14);
			contentPane.add(lblNmeroManada);
		}
		{
			lblPotenciaRugido = new JLabel("Potencia rugido:");
			lblPotenciaRugido.setBounds(110, 203, 133, 14);
			contentPane.add(lblPotenciaRugido);
		}
		{
			lblNmcamada = new JLabel("Núm.camada:");
			lblNmcamada.setBounds(211, 203, 133, 14);
			contentPane.add(lblNmcamada);
		}
		{
			lblEspecieLobo = new JLabel("Especie Lobo:");
			lblEspecieLobo.setBounds(311, 203, 133, 14);
			contentPane.add(lblEspecieLobo);
		}
		{
			txtNumManada = new JTextField();
			txtNumManada.setEditable(false);
			txtNumManada.setColumns(10);
			txtNumManada.setBounds(10, 228, 86, 20);
			contentPane.add(txtNumManada);
		}
		{
			txtPotenciaRugido = new JTextField();
			txtPotenciaRugido.setEditable(false);
			txtPotenciaRugido.setColumns(10);
			txtPotenciaRugido.setBounds(111, 228, 86, 20);
			contentPane.add(txtPotenciaRugido);
		}
		{
			txtNumcamada = new JTextField();
			txtNumcamada.setEditable(false);
			txtNumcamada.setColumns(10);
			txtNumcamada.setBounds(211, 228, 86, 20);
			contentPane.add(txtNumcamada);
		}
		{
			txtEspecieLobo = new JTextField();
			txtEspecieLobo.setEditable(false);
			txtEspecieLobo.setColumns(10);
			txtEspecieLobo.setBounds(311, 228, 86, 20);
			contentPane.add(txtEspecieLobo);
		}
		{
			lblMordida = new JLabel("Mordida fuerza:");
			lblMordida.setBounds(411, 203, 133, 14);
			contentPane.add(lblMordida);
		}
		{
			txtMordidaFuerza = new JTextField();
			txtMordidaFuerza.setEditable(false);
			txtMordidaFuerza.setColumns(10);
			txtMordidaFuerza.setBounds(411, 228, 86, 20);
			contentPane.add(txtMordidaFuerza);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 292, 503, 171);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Desactivar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(10, 259, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnProcesar = new JButton("Procesar");
			btnProcesar.addActionListener(this);
			btnProcesar.setBounds(116, 259, 89, 23);
			contentPane.add(btnProcesar);
		}
		{
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.addActionListener(this);
			btnLimpiar.setBounds(221, 258, 89, 23);
			contentPane.add(btnLimpiar);
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboMami) {
			do_comboBox_itemStateChanged(e);
		}
	}
	protected void do_comboBox_itemStateChanged(ItemEvent e) {
		int posi=cboMami.getSelectedIndex();
		switch (posi) {
		case 0://tigre
			lblNewLabel_1.setIcon(new ImageIcon(Zoológico.class.getResource("/animal/TIGRE1 (3).jpg")));
			txtEspecieTIgre.setEditable(true);
			txtTamañoGarras.setEditable(true);
			txtVelo.setEditable(true);
			break;
		case 1: //león
			lblNewLabel_1.setIcon(new ImageIcon(Zoológico.class.getResource("/animal/Leon.jpg")));
			txtTamañoGarras.setEditable(true);
			txtVelo.setEditable(true);
			txtNumManada.setEditable(true);
			txtPotenciaRugido.setEditable(true);
			break;
		case 2://Geopardo
			lblNewLabel_1.setIcon(new ImageIcon(Zoológico.class.getResource("/animal/gue.jpg")));
			txtTamañoGarras.setEditable(true);
			txtVelo.setEditable(true);
		case 3: 
			lblNewLabel_1.setIcon(new ImageIcon(Zoológico.class.getResource("/animal/Lobo.jpg")));
			break;
		default:
			lblNewLabel_1.setIcon(new ImageIcon(Zoológico.class.getResource("/animal/Perro.jpg")));
			break;
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpiar) {
			do_btnProcesar_1_actionPerformed(e);
		}
		if (e.getSource() == btnProcesar) {
			do_btnProcesar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtNumcamada.setEditable(false);
		txtColor.setEditable(false);
		txtEspecieLobo.setEditable(false);
		txtEspecieTIgre.setEditable(false);
		txtTamañoGarras.setEditable(false);
		txtNumManada.setEditable(false);
		txtMordidaFuerza.setEditable(false);
		txtPotenciaRugido.setEditable(false);
		txtVelo.setEditable(false);
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Listado(Mamifero m) {
		Imprimir(""+"Habitat: "+m.getHabitat()+"\nAltura: "+m.getAltura()+"\nPeso: "+m.getPeso()+"\nLargo: "+m.getLargo()+"\nNombre Cientifico: "+m.getNomCien()+"\n"+m.Comer()+"\n"+m.Correr()+"\n"+m.Comunicarse()+"\n"+m.Domri());
		
	}
	protected void do_btnProcesar_actionPerformed(ActionEvent e) {
		int posi=cboMami.getSelectedIndex();
		String habitat= txthabitat.getText();
		double altura = Double.parseDouble(txtaltura.getText());
		double largo = Double.parseDouble(txtLargo.getText());
		double peso = Double.parseDouble(txtPeso.getText());
		String nom=txtNomCien.getText();
		Mamifero animal = null;
		switch (posi) {
		case 0: //tigre
			double garras = Double.parseDouble(txtTamañoGarras.getText());
			int velocidad = Integer.parseInt(txtVelo.getText());
			String especieTigre = txtEspecieTIgre.getText();
			animal = new Tigre(habitat, nom, altura, largo, peso, garras, velocidad, especieTigre);
			Listado(animal);
			break;
		case 1://Leon
			int numManada = Integer.parseInt(txtNumManada.getText());
			double potenciaRugido = Double.parseDouble(txtPotenciaRugido.getText());
			double garrasL = Double.parseDouble(txtTamañoGarras.getText());
			int velocidadL = Integer.parseInt(txtVelo.getText());
			animal = new Leon(habitat, nom, altura, largo, peso, garrasL, velocidadL, numManada, potenciaRugido);
			Listado(animal);
			break;
		case 2: //geopardo
			double garraG =  Double.parseDouble(txtTamañoGarras.getText());
			int velocidadG = Integer.parseInt(txtVelo.getText());
			animal = new Guepardo(habitat, nom, altura, largo, peso, garraG, velocidadG);
			Listado(animal);
			break;
		default:
			break;
		}
	}
	protected void do_btnProcesar_1_actionPerformed(ActionEvent e) {
		txtS.setText("");
		txtaltura.setText("");
		txtColor.setText("");
		txtEspecieLobo.setText("");
		txtEspecieTIgre.setText("");
		txthabitat.setText("");
		txtLargo.setText("");
		txtMordidaFuerza.setText("");
		txtNomCien.setText("");
		txtNumcamada.setText("");
		txtNumManada.setText("");
		txtPeso.setText("");
		txtPotenciaRugido.setText("");
		txtTamañoColmillos.setText("");
		txtTamañoGarras.setText("");
		txtVelo.setText("");
		txtS.setText("");
	}
}
