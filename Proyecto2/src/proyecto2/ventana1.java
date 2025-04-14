package proyecto2;

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

public class ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
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
	public ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese número");
		lblNewLabel.setBounds(10, 11, 154, 14);
		contentPane.add(lblNewLabel);
		
		txtN = new JTextField();
		txtN.setBounds(189, 8, 86, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		btnNewButton = new JButton("Celsius a Fahrenheit");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(186, 39, 183, 23);
		contentPane.add(btnNewButton);
		
		JButton btnKilmetrosAMillas = new JButton("Kilómetros a millas");
		btnKilmetrosAMillas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKilmetrosAMillas.setBounds(186, 67, 183, 23);
		contentPane.add(btnKilmetrosAMillas);
		
		JButton btnSegundosAMinutos = new JButton("Segundos a minutos y segundos.");
		btnSegundosAMinutos.setBounds(186, 95, 183, 23);
		contentPane.add(btnSegundosAMinutos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 128, 372, 122);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(txtN.getText());
		Conversor c = new Conversor(num);

	}
}
