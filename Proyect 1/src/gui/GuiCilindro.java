package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hijo.Cilindro;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiCilindro extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtRadio;
	private JTextField txtAltura;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtArea;
	private JTextField txtVolumen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiCilindro dialog = new GuiCilindro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiCilindro() {
		setModal(true);
		setTitle("Cilindro");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("Radio");
			lblNewLabel.setBounds(10, 17, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Altura");
			lblNewLabel_1.setBounds(10, 42, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtRadio = new JTextField();
			txtRadio.setBounds(83, 14, 86, 20);
			contentPanel.add(txtRadio);
			txtRadio.setColumns(10);
		}
		{
			txtAltura = new JTextField();
			txtAltura.setColumns(10);
			txtAltura.setBounds(83, 39, 86, 20);
			contentPanel.add(txtAltura);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(240, 11, 184, 116);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(21, 176, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Limpiar");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(154, 176, 89, 23);
			contentPanel.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Salir");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(287, 176, 89, 23);
			contentPanel.add(btnNewButton_2);
		}
		{
			lblNewLabel_2 = new JLabel("Área");
			lblNewLabel_2.setBounds(10, 73, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Volumen");
			lblNewLabel_3.setBounds(10, 98, 46, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txtArea = new JTextField();
			txtArea.setEditable(false);
			txtArea.setColumns(10);
			txtArea.setBounds(83, 70, 86, 20);
			contentPanel.add(txtArea);
		}
		{
			txtVolumen = new JTextField();
			txtVolumen.setEditable(false);
			txtVolumen.setColumns(10);
			txtVolumen.setBounds(83, 95, 86, 20);
			contentPanel.add(txtVolumen);
		}
	}
	public void actionPerformed(ActionEvent e) {
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
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		double radio = Double.parseDouble(txtRadio.getText());
		double altura = Double.parseDouble(txtAltura.getText());
		//El primer cilindor debajo de esta linea se esta llamando para asi usar la clase cilindro de los hijos.
		Cilindro cl= new Cilindro(radio, altura);
		txtArea.setText(""+cl.Area());
		txtVolumen.setText(""+cl.Volumen());
		txtS.append(cl.Mensaje());
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		txtRadio.setText("");
		txtArea.setText("");
		txtAltura.setText("");
		txtVolumen.setText("");
		txtS.setText("");
		txtRadio.grabFocus();
	}
	
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		dispose();
	}
}
