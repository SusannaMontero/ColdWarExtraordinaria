package Feedback;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LaminaNumeroJugadores extends JPanel implements ActionListener {
	
	JLabel NumeroJugadores;
	JComboBox ComboBoxInput;
	JButton botonAceptar;
	String ComboBoxInputToString;
	int textoStringToInt;

	LaminaNumeroJugadores() {
	setLayout(new FlowLayout());
		
		NumeroJugadores = new JLabel("Numero de Jugadores:");
		//ComboBox con 8 jugadores maximos
		ComboBoxInput = new JComboBox();
		ComboBoxInput.addItem("2");
		ComboBoxInput.addItem("3");
		ComboBoxInput.addItem("4");
		
		
		botonAceptar = new JButton("Continuar");
		
		//Ponemos a la escucha el boton
		botonAceptar.addActionListener(this);
		
		add(NumeroJugadores);
		add(ComboBoxInput);
		add(botonAceptar);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ComboBoxInputToString = (String)ComboBoxInput.getSelectedItem();
		textoStringToInt = Integer.parseInt(ComboBoxInputToString);
		DatosPartida.numeroJugadores = textoStringToInt;
		
		MarcoFeedback marco = (MarcoFeedback) SwingUtilities.getWindowAncestor(this);
		marco.remove(this);
		marco.add(new InsertarInfo());
		marco.setVisible(true);
	}

}
