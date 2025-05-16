package case3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;

public class Ventana3 extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
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
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Electrodomestico");
			lblNewLabel.setBounds(10, 29, 122, 14);
			contentPane.add(lblNewLabel);
		}
		{
			comboBox = new JComboBox();
			comboBox.addItemListener(this);
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Televisor", "Refrigerador"}));
			comboBox.setBounds(152, 27, 108, 18);
			contentPane.add(comboBox);
		}
		{
			btnNewButton = new JButton("ENCENDER");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(43, 77, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("APAGAR");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(266, 77, 89, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(21, 111, 280, 124);
			contentPane.add(scrollPane);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(23, 112, 278, 122);
			contentPane.add(txtS);
		}
		{
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\UPN\\Desktop\\Semana 8 NRC 11377\\Case3\\src\\case3\\Imagenes\\telelvisor.jpg"));
			lblNewLabel_1.setBounds(91, 245, 153, 109);
			contentPane.add(lblNewLabel_1);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Limpiar();
		int posi = comboBox.getSelectedIndex();
		switch (posi) {
		case 0:
			Televisor t = new Televisor();
			txtS.append(""+t.Encender());
			break;

		case 1:
			Refrigerador r= new Refrigerador();
			txtS.append(""+r.Encender());
			break;
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == comboBox) {
			do_comboBox_itemStateChanged(e);
		}
	}
	protected void do_comboBox_itemStateChanged(ItemEvent e) {
		int posi = comboBox.getSelectedIndex();
		switch (posi) {
		case 0:
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\UPN\\Desktop\\Semana 8 NRC 11377\\Case3\\src\\case3\\Imagenes\\telelvisor.jpg"));
			break;

		default:
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\UPN\\Desktop\\Semana 8 NRC 11377\\Case3\\src\\case3\\Imagenes\\refrigerador.jpg"));
			break;
		}
	}
	void Limpiar() {
		txtS.setText("");
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		Limpiar();
		int posi = comboBox.getSelectedIndex();
		switch (posi) {
		case 0:
			Televisor t = new Televisor();
			txtS.append(""+t.Apagar());
			break;

		case 1:
			Refrigerador r= new Refrigerador();
			txtS.append(""+r.Apagar());
			break;
		}
	}
}
