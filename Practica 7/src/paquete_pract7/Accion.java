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
		JOptionPane.showMessageDialog(null,"El pájaro "+getNombre()+" ("
				+getColor()+") atacó y chocó contra el objetivo");
	}
	
	private void ataqueChuck() {
		JOptionPane.showMessageDialog(null,"El pájaro "+getNombre()+" ("
				+getColor()+") atacó y se hizo más veloz");
	}
	
	private void ataqueBlue() {
		JOptionPane.showMessageDialog(null,"El pájaro "+getNombre()+" ("
				+getColor()+") atacó y se dividió en tres");
	}
}
