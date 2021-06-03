package Feedback;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LaminaBaseDatos extends JPanel implements ActionListener {

	JLabel nombreTextoMuestra;
	JLabel tipoTextoMuestra;
	JLabel nombreComentario;
	JTextField nombreInput;		
	JComboBox ComboBoxInput;	
	JButton botonEnviar;
	JButton botonCancelar;
	JLabel error;
	String texto;

	LaminaBaseDatos () {
		nombreTextoMuestra = new JLabel("¿Quieres guardar los "+(DatosPartida.jugadores.size()+1)+" jugadores en la base de datos?");
		  for(int i=0;i<DatosPartida.jugadores.size();i++){
		        texto = texto + (DatosPartida.jugadores.get(i).GetTipo() + "  ||  ");		             
		         }
		tipoTextoMuestra = new JLabel(texto);
		botonEnviar = new JButton("Guardar");
		botonCancelar = new JButton ("Cancelar");
		
		botonEnviar.addActionListener(this);
		botonCancelar.addActionListener(this);
		
		add(nombreTextoMuestra);
		add(tipoTextoMuestra);
		add(botonEnviar);
		add(botonCancelar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == botonEnviar) {
			Connection connexion = ConexionBD.makeConnection();
			 for(int i=0;i<DatosPartida.jugadores.size();i++){
			ConexionBD.insertWithStatement(connexion, DatosPartida.jugadores.get(i).GetNombre(), DatosPartida.jugadores.get(i).GetTipo());
			}
		}

		else if(e.getSource() == botonCancelar) 
		{ 
			MarcoFeedback marco = (MarcoFeedback) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.add(new LaminaFeedback());
			marco.setVisible(true);
		}
	}

}
