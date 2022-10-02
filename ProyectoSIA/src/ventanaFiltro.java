import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaFiltro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaFiltro frame = new ventanaFiltro();
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
	public ventanaFiltro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ELIJA UN FILTRO");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(93, 51, 153, 21);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MUSICA", "DEPORTE", "CHARLA", "TEATRO"}));
		comboBox.setBounds(228, 51, 105, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton(" BUSCAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "SE MUESTRAN LOS EVENTOS DE ESE TIPO");
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnNewButton.setBounds(156, 166, 113, 33);
		contentPane.add(btnNewButton);
	}
}
