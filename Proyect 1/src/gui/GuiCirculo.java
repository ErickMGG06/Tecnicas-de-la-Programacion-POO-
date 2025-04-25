package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import padre.Circulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiCirculo extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblArea;
	private JLabel lblVolumen;
	private JTextField txtRadio;
	private JTextField txtArea;
	private JTextField txtLongitud;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JButton btnLimpiar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiCirculo dialog = new GuiCirculo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GuiCirculo() {
		setModal(true);
		setTitle("Circulo");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Radio");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			lblArea = new JLabel("Área");
			lblArea.setBounds(10, 36, 46, 14);
			contentPanel.add(lblArea);
		}
		{
			lblVolumen = new JLabel("Longitud");
			lblVolumen.setBounds(10, 61, 46, 14);
			contentPanel.add(lblVolumen);
		}
		{
			txtRadio = new JTextField();
			txtRadio.setColumns(10);
			txtRadio.setBounds(75, 8, 86, 20);
			contentPanel.add(txtRadio);
		}
		{
			txtArea = new JTextField();
			txtArea.setEditable(false);
			txtArea.setColumns(10);
			txtArea.setBounds(75, 33, 86, 20);
			contentPanel.add(txtArea);
		}
		{
			txtLongitud = new JTextField();
			txtLongitud.setEditable(false);
			txtLongitud.setColumns(10);
			txtLongitud.setBounds(75, 58, 86, 20);
			contentPanel.add(txtLongitud);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(213, 11, 196, 112);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(72, 147, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.addActionListener(this);
			btnLimpiar.setBounds(182, 147, 89, 23);
			contentPanel.add(btnLimpiar);
		}
		{
			btnSalir = new JButton("Salir");
			btnSalir.addActionListener(this);
			btnSalir.setBounds(291, 147, 89, 23);
			contentPanel.add(btnSalir);
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
		double radio = Double.parseDouble(txtRadio.getText());
		Circulo ci=new Circulo(radio);
		txtArea.setText(""+ci.Area());
		txtLongitud.setText(""+ci.Longitud());
		txtS.append(ci.Mensaje());
	}
	
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
		txtRadio.setText("");
		txtArea.setText("");
		txtLongitud.setText("");
		txtS.setText("");
		txtRadio.grabFocus(); //ubica el cursor
	}
	protected void do_btnSalir_actionPerformed(ActionEvent e) {
		dispose(); //solo cierra la ventana activa
	}
}
