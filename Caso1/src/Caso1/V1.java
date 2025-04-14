package Caso1;

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
	private JLabel lblNewLabel_1;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Base");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Altura");
			lblNewLabel_1.setBounds(10, 36, 46, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtBase = new JTextField();
			txtBase.setBounds(115, 8, 86, 20);
			contentPane.add(txtBase);
			txtBase.setColumns(10);
		}
		{
			txtAltura = new JTextField();
			txtAltura.setBounds(115, 33, 86, 20);
			contentPane.add(txtAltura);
			txtAltura.setColumns(10);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(263, 7, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Borrar");
			btnNewButton_1.setBounds(263, 32, 89, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 96, 362, 154);
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
		double base = Double.parseDouble(txtBase.getText());
		double altura = Double.parseDouble(txtAltura.getText());
		Triangulo t = new Triangulo(base, altura);
		Listado(t);
		//Aumentar en tres unidades la altura y diminuir en 2 unidades las base
		//volver a imprimir los cambios
		t.setAlgura(t.getAlgura()+3);
		t.setBase(t.getBase()-2);
		Listado(t);
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Imprimir() {
		txtS.append("--------------------------------------------\n");
	}
	void Listado(Triangulo t) {
		Imprimir("base: "+t.getBase());
		Imprimir("Altura: "+ t.getAlgura());
		Imprimir("Área: "+t.Área());
	}
}
