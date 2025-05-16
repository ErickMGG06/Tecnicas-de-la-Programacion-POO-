package Caso1_FiguraGeometrica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class VENTANA1 extends JFrame implements ItemListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox cboFig;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtRadio;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VENTANA1 frame = new VENTANA1();
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
	public VENTANA1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Figura:");
			lblNewLabel.setBounds(10, 28, 66, 14);
			contentPane.add(lblNewLabel);
		}
		{
			cboFig = new JComboBox();
			cboFig.addItemListener(this);
			cboFig.setModel(new DefaultComboBoxModel(new String[] {"Circulo", "Rectangulo"}));
			cboFig.setBounds(86, 24, 107, 22);
			contentPane.add(cboFig);
		}
		{
			lblNewLabel_2 = new JLabel("Radio");
			lblNewLabel_2.setBounds(30, 68, 46, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Base");
			lblNewLabel_3.setBounds(144, 68, 46, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Altura");
			lblNewLabel_4.setBounds(262, 68, 46, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			txtRadio = new JTextField();
			txtRadio.setBounds(10, 93, 86, 20);
			contentPane.add(txtRadio);
			txtRadio.setColumns(10);
		}
		{
			txtBase = new JTextField();
			txtBase.setEditable(false);
			txtBase.setColumns(10);
			txtBase.setBounds(120, 93, 86, 20);
			contentPane.add(txtBase);
		}
		{
			txtAltura = new JTextField();
			txtAltura.setEditable(false);
			txtAltura.setColumns(10);
			txtAltura.setBounds(241, 93, 86, 20);
			contentPane.add(txtAltura);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 159, 340, 144);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(VENTANA1.class.getResource("/Caso1_FiguraGeometrica/Imagenes/Circulo2.jpg")));
			lblNewLabel_1.setBounds(393, 165, 168, 138);
			contentPane.add(lblNewLabel_1);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(43, 125, 89, 23);
			contentPane.add(btnNewButton);
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboFig) {
			do_comboBox_itemStateChanged(e);
		}
	}
	protected void do_comboBox_itemStateChanged(ItemEvent e) {
		Desactivar();
		Limpiar();
		int posi=cboFig.getSelectedIndex();
		switch (posi) {
		case 0: //Circulo
			lblNewLabel_1.setIcon(new ImageIcon(VENTANA1.class.getResource("/Caso1_FiguraGeometrica/Imagenes/Circulo2.jpg")));
			txtRadio.setEditable(true);
			break;

		case 1://Rectangulo
			lblNewLabel_1.setIcon(new ImageIcon(VENTANA1.class.getResource("/Caso1_FiguraGeometrica/Imagenes/Rectangulo1.jpg")));
			txtBase.setEditable(true);
			txtAltura.setEditable(true);
			break;
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		int posi=cboFig.getSelectedIndex();
		Figura fig = null;
		switch (posi) {
		case 0:
			double radio=Double.parseDouble(txtRadio.getText());
			fig = new Circulo(radio);
			Listado(fig);
			break;
		default:
			double base=Double.parseDouble(txtBase.getText());
			double altura=Double.parseDouble(txtAltura.getText());
			fig = new Rectangulo(base, altura);
			Listado(fig);
			break;
		}
	}
	void Listado(Figura f) {
		Imprimir(""+f.CalcularArea());
	}
	void Imprimir (String s) {
		txtS.append(s+"\n");
	}
	void Desactivar() {
		txtRadio.setEditable(false);
		txtAltura.setEditable(false);
		txtBase.setEditable(false);
	}
	void Limpiar() {
		txtAltura.setText("");
		txtBase.setText("");
		txtRadio.setText("");
		txtS.setText("");
	}
}
