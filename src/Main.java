import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		///GESTION DE TRABAJADORES
		LocalDate hoy = LocalDate.now();
		String opciones []= {
			"Vacaiones",""	
		};
		String nombre = validar(" ingrese su nombre ");
	
		
		
	}
	
	//////FUNCIONES
	public static String validar(String mensaje) {
		String a = JOptionPane.showInputDialog(mensaje);
		while (a.isEmpty()) {
			a = JOptionPane.showInputDialog("Error: " + mensaje);
		}

		return a;
	}

}
