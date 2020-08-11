package ar.com.EduIt.ChatWindow.Ventana;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument.Content;



public class Window extends JFrame {
	
	private Container contentPane;
	private JButton btnEnviar;
	private JTextField txtText;
	private JLabel lblEnviar;
	private JTextArea jtaChat;
	private JScrollPane scrollPane;
	private JPanel pnlNoth;
	

		public Window()
		{
			// Window setting
			setSize(1250,660);
			addWindowListener(new ChatWindowListener());
			contentPane = getContentPane(); // Container
			contentPane.setLayout(new BorderLayout());
			
			
			
			// Components settings
			btnEnviar = new JButton("ENVIAR");
			lblEnviar = new JLabel("Mensaje: ");
			txtText = new JTextField();
			txtText.setPreferredSize(new Dimension(400,30));
			jtaChat = new JTextArea();
			jtaChat.setEnabled(false);
			scrollPane = new JScrollPane(jtaChat);
			pnlNoth = new JPanel(new FlowLayout()); // Set for default the position of the components next to each other.
			pnlNoth.add(lblEnviar);
			pnlNoth.add(txtText);
			pnlNoth.add(btnEnviar);
			
			
			// Component render
			
			contentPane.add(scrollPane, BorderLayout.CENTER);
			contentPane.add(pnlNoth, BorderLayout.SOUTH);
			
			// Functionality
			// BtnEnviarActionListener actionListener = new BtnEnviarActionListener();
			// btnEnviar.addActionListener(actionListener);
			// txtText.addActionListener(actionListener);
			
			
			// Anonymous Inner class. I´m doing this just because the simplicity of this program.
			ActionListener actionListener = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = txtText.getText(); // Obtain data
					jtaChat.append("Mensaje de usuario: " + text + "\n"); // Write the text
					txtText.setText(""); // Clean the panel
					
				}
			};
			
			btnEnviar.addActionListener(actionListener);
			txtText.addActionListener(actionListener);
			
				
			
		}
		
		
		/* Another example:
		 * // Inner class. I´m doing this just because the simplicity of this program.
		private class BtnEnviarActionListener implements ActionListener {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = txtText.getText(); // Obtain data
				jtaChat.append("Mensaje de usuario: " + text + "\n"); // Write the text
				txtText.setText(""); // Clean the panel
				
			}
			
		}
		*/


}
