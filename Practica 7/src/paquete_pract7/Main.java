package paquete_pract7;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int op;
		boolean t = false;
		String s = new String();
		String s1 = new String();
		Accion p[] = new Accion[3];
		
		do {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n\n1.Pajaro 'Red'\n2.Pajaro 'Chuck'\n3.Pajaro 'Blue'"));
			
			switch(op) {
			case 1:
				s = "Red";
				s1 = "Rojo";
				p[0] = new Accion(s,s1);
				p[0].ataques();
				break;
			case 2:
				s = "Chuck";
				s1 = "Amarillo";
				p[1] = new Accion(s,s1);
				p[1].ataques();
				break;
			case 3:
				s = "Blue";
				s1 = "Azul";
				p[2] = new Accion(s,s1);
				p[2].ataques();
				break;
			default:
				JOptionPane.showMessageDialog(null,"****Opcion no valida, intentelo de nuevo****");
				break;
			}
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog("Repetir? \n\n1.Si\n2.No"));
				if(op>2||op<1) {
					JOptionPane.showMessageDialog(null,"****Ups!!****\n\nError, digite una opcion valida");
				}
			}while(op>2||op<1);
			
			if(op==2) {
				t = true;
				JOptionPane.showMessageDialog(null, "Hasta Pronto!!");
			}
		}while(t==false);
		
	}

}
