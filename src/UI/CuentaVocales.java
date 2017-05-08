package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;

public class CuentaVocales {
	private JLabel texto;   
	private JFrame frame;
	private JTextField text;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuentaVocales window = new CuentaVocales();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CuentaVocales() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("New label");
		label.setBounds(164, 137, 131, 54);
		frame.getContentPane().add(label);
		
		JButton btnGo = new JButton("GO");
		btnGo.setBounds(255, 69, 89, 23);
		frame.getContentPane().add(btnGo);
		/*Evento Boton*/
		btnGo.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String Cadena = text.getText();
				Cadena = Cadena.toLowerCase(); // Pasar a minuscula la cadena
				  int ContadorVocales = 0;
				
				   for(int i=0; i<Cadena.length(); i++)
			        {
			            if(Cadena.charAt(i) == 'a' || Cadena.charAt(i) == 'e' || Cadena.charAt(i) == 'i' || Cadena.charAt(i) == 'o' || Cadena.charAt(i) == 'u')
			                ContadorVocales++;
			            
			        }
				   label.setText(""+ContadorVocales);	   
				}
			
			}
		
		);
		
		text = new JTextField();
		text.setBounds(98, 70, 86, 20);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
	}
}

