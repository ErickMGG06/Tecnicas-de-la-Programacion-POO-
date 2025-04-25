package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hijo.Cono;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiCono extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtAltura;
	private JTextField txtGeneratriz;
	private JTextField txtArea;
	private JTextField txtVolumen;
	private JButton btnNewButton;
	private JTextField txtRadio;
	private JTextArea txtS;
	private JButton btnLimpiar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiCono dialog = new GuiCono();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiCono() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblAltura = new JLabel("Radio");
			lblAltura.setBounds(10, 11, 46, 14);
			contentPanel.add(lblAltura);
		}
		{
			JLabel lblGeneratriz = new JLabel("Altura");
			lblGeneratriz.setBounds(10, 36, 104, 14);
			contentPanel.add(lblGeneratriz);
		}
		{
			JLabel lblrea = new JLabel("Área");
			lblrea.setBounds(10, 106, 46, 14);
			contentPanel.add(lblrea);
		}
		{
			txtAltura = new JTextField();
			txtAltura.setColumns(10);
			txtAltura.setBounds(85, 33, 86, 20);
			contentPanel.add(txtAltura);
		}
		{
			txtGeneratriz = new JTextField();
			txtGeneratriz.setColumns(10);
			txtGeneratriz.setBounds(85, 58, 86, 20);
			contentPanel.add(txtGeneratriz);
		}
		{
			txtArea = new JTextField();
			txtArea.setEditable(false);
			txtArea.setColumns(10);
			txtArea.setBounds(85, 100, 86, 20);
			contentPanel.add(txtArea);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(201, 11, 223, 113);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(48, 156, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.addActionListener(this);
			btnLimpiar.setBounds(160, 156, 89, 23);
			contentPanel.add(btnLimpiar);
		}
		{
			btnSalir = new JButton("Salir");
			btnSalir.addActionListener(this);
			btnSalir.setBounds(275, 156, 89, 23);
			contentPanel.add(btnSalir);
		}
		{
			JLabel lblVolumen = new JLabel("Volumen");
			lblVolumen.setBounds(10, 131, 46, 14);
			contentPanel.add(lblVolumen);
		}
		{
			txtVolumen = new JTextField();
			txtVolumen.setEditable(false);
			txtVolumen.setColumns(10);
			txtVolumen.setBounds(85, 125, 86, 20);
			contentPanel.add(txtVolumen);
		}
		{
			JLabel lblGeneratriz = new JLabel("Generatriz");
			lblGeneratriz.setBounds(10, 61, 104, 14);
			contentPanel.add(lblGeneratriz);
		}
		{
			txtRadio = new JTextField();
			txtRadio.setColumns(10);
			txtRadio.setBounds(85, 8, 86, 20);
			contentPanel.add(txtRadio);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiar) {
			do_btnLimpiar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		double altura = Double.parseDouble(txtAltura.getText());
		double radio  = Double.parseDouble(txtRadio.getText());
		double generatriz = Double.parseDouble(txtGeneratriz.getText());
		Cono cn = new Cono(radio, altura, generatriz);
	    txtArea.setText(""+cn.AreaTotal());
		txtVolumen.setText(""+cn.Volumen());
		txtS.append(cn.Mensaje());;
	}
	
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
		txtRadio.setText("");
		txtGeneratriz.setText("");
		txtArea.setText("");
		txtAltura.setText("");
		txtVolumen.setText("");
		txtS.setText("");
		txtRadio.grabFocus();
	}
	protected void do_btnSalir_actionPerformed(ActionEvent e) {
		dispose();
	}
}
