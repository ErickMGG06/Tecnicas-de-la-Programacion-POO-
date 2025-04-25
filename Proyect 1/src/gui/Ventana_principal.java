package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_principal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_principal frame = new Ventana_principal();
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
	public Ventana_principal() {
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		{
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				mnNewMenu = new JMenu("Herencia");
				menuBar.add(mnNewMenu);
				{
					mntmNewMenuItem = new JMenuItem("Circulo");
					mntmNewMenuItem.addActionListener(this);
					mnNewMenu.add(mntmNewMenuItem);
				}
				{
					mntmNewMenuItem_1 = new JMenuItem("Cilindro");
					mntmNewMenuItem_1.addActionListener(this);
					mnNewMenu.add(mntmNewMenuItem_1);
				}
				{
					mntmNewMenuItem_2 = new JMenuItem("Salir");
					mntmNewMenuItem_2.addActionListener(this);
					{
						mntmNewMenuItem_3 = new JMenuItem("Cono");
						mntmNewMenuItem_3.addActionListener(this);
						mnNewMenu.add(mntmNewMenuItem_3);
					}
					mnNewMenu.add(mntmNewMenuItem_2);
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_3) {
			do_mntmNewMenuItem_3_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem_2) {
			do_mntmNewMenuItem_2_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			do_mntmNewMenuItem_1_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			do_mntmNewMenuItem_actionPerformed(e);
		}
	}
	protected void do_mntmNewMenuItem_actionPerformed(ActionEvent e) {
		GuiCirculo ci = new GuiCirculo();
		ci.setVisible(true);
	}
	
	protected void do_mntmNewMenuItem_1_actionPerformed(ActionEvent e) {
		GuiCilindro cil= new GuiCilindro();
		cil.setVisible(true);
	}
	protected void do_mntmNewMenuItem_2_actionPerformed(ActionEvent e) {
		System.exit(0); //cierra el todo el sistema o ventana
	}
	protected void do_mntmNewMenuItem_3_actionPerformed(ActionEvent e) {
		GuiCono cn = new GuiCono();
		cn.setVisible(true);
	}
}
