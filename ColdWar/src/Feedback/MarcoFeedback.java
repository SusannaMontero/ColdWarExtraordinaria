
package Feedback;
import javax.swing.JFrame;

public class MarcoFeedback extends JFrame {
		MarcoFeedback(){ // Aqui determinamos las caracteristicas que tendra el panel
			setBounds(400, 10, 800, 700);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			add(new LaminaFeedback());
			setVisible(true);
		}	
}
