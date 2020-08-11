package ar.com.EduIt.Notepad.Ventana;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

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
	private JTextField txtTexto;
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
			txtTexto = new JTextField();
			txtTexto.setPreferredSize(new Dimension(400,30));
			jtaChat = new JTextArea();
			scrollPane = new JScrollPane(jtaChat);
			pnlNoth = new JPanel(new FlowLayout()); // Acomoda por defecto uno al lado del otro
			pnlNoth.add(lblEnviar);
			pnlNoth.add(txtTexto);
			pnlNoth.add(btnEnviar);
			
			
			// Component render
			
			contentPane.add(scrollPane, BorderLayout.CENTER);
			contentPane.add(pnlNoth, BorderLayout.SOUTH);
			
			
		}
}
