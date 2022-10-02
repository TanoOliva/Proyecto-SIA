import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Canvas;
import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class ventana_menu extends JFrame {

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		
		HashMap<String,eventos> list = new HashMap<String,eventos>();
		CSV archivo=new CSV();
		archivo.leerArchivo("C:\\Users\\antop\\OneDrive\\Escritorio\\Eventos.csv",list);
		
	
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_menu frame = new ventana_menu();
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
	public ventana_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 549);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU ");
		menuBar.add(mnNewMenu);
		
		
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Lista eventos");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanalist vl = new ventanalist();
				vl.setVisible(true);
				dispose();
				
				
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Buscar eventos");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaBuscar vl = new ventanaBuscar();
				vl.setVisible(true);
				dispose();
				
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Filtrar eventos");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaFiltro vl = new ventanaFiltro();
				vl.setVisible(true);
				dispose();
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Revisar compra");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Comprar entrada(s)");
		mnNewMenu.add(mntmNewMenuItem_4);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\antop\\OneDrive\\Documentos\\GitHub\\Proyecto-SIA\\ProyectoSIA\\src\\INICIO2.jpg"));
		lblNewLabel.setBounds(-175, -23, 1078, 471);
		getContentPane().add(lblNewLabel);
	}
	
	
	
	
	
}
