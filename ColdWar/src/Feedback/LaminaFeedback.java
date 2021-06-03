
package Feedback;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LaminaFeedback extends JPanel implements ActionListener {
	//Declaramos variables
	JLabel titulo;
	JButton Jugar;
	JButton Reglas;
	JButton Autora;
	JButton Opciones;
	JButton Salir;
	
	LaminaFeedback(){ // Situamos los dos botones en el panel
		
		setLayout(new FlowLayout());
				
		titulo = new JLabel("Menu ColdWar");
		Jugar = new JButton("Jugar");
		Reglas = new JButton("Reglas");
		Autora = new JButton("Autora");
		Opciones = new JButton("Opciones");
		Salir = new JButton("Salir");
		
		
		Jugar.addActionListener(this);
		Reglas.addActionListener(this);
		Autora.addActionListener(this);
		Opciones.addActionListener(this);
		Salir.addActionListener(this);
	
		add(titulo);
		add(Jugar);
		add(Reglas);
		add(Autora);
		add(Opciones);
		add(Salir);

	}

	@Override
	public void actionPerformed(ActionEvent e) { //  Si se pulsa el boton de insertar feedback te lleva a otra lamina
		// TODO Auto-generated method stub
		if(e.getSource() == Jugar) {
			
			MarcoFeedback marco = (MarcoFeedback) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.add(new LaminaNumeroJugadores());
			marco.setVisible(true);
		} else if(e.getSource() == Reglas) {
			
			MarcoFeedback marco = (MarcoFeedback) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.add(new InsertarInfo());
			marco.setVisible(true);
		} else if(e.getSource() == Autora) {
			
			MarcoFeedback marco = (MarcoFeedback) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.add(new InsertarInfo());
			marco.setVisible(true);
		} else if(e.getSource() == Opciones) {
			
			MarcoFeedback marco = (MarcoFeedback) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.add(new InsertarInfo());
			marco.setVisible(true);
		} else if(e.getSource() == Salir) {			
			CerrarPrograma();
		}
		
	}
	public void CerrarPrograma(){
		MarcoFeedback marco = (MarcoFeedback) SwingUtilities.getWindowAncestor(this);
		marco.dispose();
	}


}
