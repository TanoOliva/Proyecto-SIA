import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;

public class VentanaMostrar extends JFrame {

	private JPanel contentPane;
	
	sistema op;

	private JTextArea txtArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMostrar frame = new VentanaMostrar();
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
	public VentanaMostrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 416, 243);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();	
		txtArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		scrollPane.setViewportView(txtArea);
	}

	public void setmostrar(HashMap<String, eventos> lista, sistema aux) {
		String cadena=aux.mostrarEventos(lista);
		txtArea.setText(cadena);
		
	}

	
}
