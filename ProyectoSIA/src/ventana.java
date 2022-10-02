import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setTitle("VENTA DE ENTRADAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(276, 10, 0, 0);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("DIGITAL TICKET");
		lblNewLabel.setBounds(191, 20, 148, 78);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(64, 0, 128));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" USUARIO :");
		lblNewLabel_1.setBounds(120, 139, 77, 22);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(215, 141, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("RUT : ");
		lblNewLabel_2.setBounds(116, 249, 102, 30);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		final ventana_menu w2 = new ventana_menu();
		
		
		JButton btnNewButton = new JButton("INGRESAR ");
		btnNewButton.setBounds(206, 322, 120, 30);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "BIENVENIDO A LA APLICACIÓN");
				w2.setVisible(true);
				dispose();
				
			}
		});
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 255, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
