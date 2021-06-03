
package Feedback;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

public class InsertarInfo extends JPanel implements ActionListener {
	
	JLabel titulo;
	// Declaramos todas las variables 
	JLabel nombreTextoMuestra;
	JLabel tipoTextoMuestra;
	JLabel nombreComentario;
	JTextField nombreInput;		
	JComboBox ComboBoxInput;	
	JButton botonEnviar;
	String tipoString;
	String nombreString;
	JLabel error;
	
	InsertarInfo(){  //  Constructor donde se muestran todas las opciones editables 
		nombreTextoMuestra = new JLabel("Nombre del jugador:");
		nombreInput = new JTextField(40);		
		ComboBoxInput = new JComboBox();
		ComboBoxInput.addItem("Planeta uno");
		ComboBoxInput.addItem("Planeta dos");
		ComboBoxInput.addItem("Planeta tres");
		ComboBoxInput.addItem("Planeta cuatro");
				
			
		botonEnviar = new JButton("Enviar");
		botonEnviar.addActionListener(this);
		
		add(nombreTextoMuestra);
		add(nombreInput);
		add(ComboBoxInput);				
		add(botonEnviar);
	}
	@Override
	public void actionPerformed(ActionEvent e) { // Cuando le das al boton enviar, si no se cumplen las condiciones saldra datos incorrectos. Si se cumple todo saldra datos correctos
		// TODO Auto-generated method stub
		
		if(e.getSource() == botonEnviar) {
			if(DatosPartida.contadorJugadores < DatosPartida.numeroJugadores) {
				DatosPartida.jugadores.add(new Jugador(nombreString, tipoString));
				DatosPartida.contadorJugadores++;
				MarcoFeedback marco = (MarcoFeedback) SwingUtilities.getWindowAncestor(this);
				marco.remove(this);
				marco.add(new InsertarInfo());
				marco.setVisible(true);
			} else {
				DatosPartida.contadorJugadores = 1;
				MarcoFeedback marco = (MarcoFeedback) SwingUtilities.getWindowAncestor(this);
				marco.remove(this);
				marco.add(new LaminaBaseDatos());
				marco.setVisible(true);
			}
		}
	}

}
