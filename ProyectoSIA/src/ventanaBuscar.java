import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class ventanaBuscar extends JFrame {

	private JPanel contentPane;
	private JTextField txtBnxm;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaBuscar frame = new ventanaBuscar();
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
	public ventanaBuscar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE DEL EVENTO : ");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		lblNewLabel.setBounds(46, 63, 185, 47);
		contentPane.add(lblNewLabel);
		
		txtBnxm = new JTextField();
		txtBnxm.setBounds(206, 78, 119, 19);
		contentPane.add(txtBnxm);
		txtBnxm.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("BUSCAR EVENTOS");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(165, 28, 102, 13);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("BUSCAR");

		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		btnNewButton.setBounds(148, 193, 119, 27);
		contentPane.add(btnNewButton);
	}

	public void buqueda(HashMap<String, eventos> lista, sistema aux) {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtBnxm.getText());
				String temporal=aux.buscarEventos(lista,txtBnxm.getText());
				JOptionPane.showMessageDialog(null,temporal);
			}
		});
	}
}
