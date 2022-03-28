package paquete_pract7;

import javax.swing.JOptionPane;

public class Accion extends Bird {
	
	public Accion(String nombre, String color) {
		super(nombre,color);
	}
	
	public void ataques() {
		if(getNombre().equals("Red")) {
			ataqueRed();
		}
		else if(getNombre().equals("Chuck")) {
			ataqueChuck();
		}
		else {
			ataqueBlue();
		}
	}
	
	private void ataqueRed() {
		JOptionPane.showMessageDialog(null,"El p�jaro "+getNombre()+" ("
				+getColor()+") atac� y choc� contra el objetivo");
	}
	
	private void ataqueChuck() {
		JOptionPane.showMessageDialog(null,"El p�jaro "+getNombre()+" ("
				+getColor()+") atac� y se hizo m�s veloz");
	}
	
	private void ataqueBlue() {
		JOptionPane.showMessageDialog(null,"El p�jaro "+getNombre()+" ("
				+getColor()+") atac� y se dividi� en tres");
	}
}
