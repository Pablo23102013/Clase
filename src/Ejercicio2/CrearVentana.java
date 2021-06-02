package Ejercicio2;
import javax.swing.*;
import java.awt.*;
public class CrearVentana 
{

	public static void main(String[] args) 
	{
		miventana ventana = new miventana();
		dialogo f = new dialogo();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setTitle("Ventana");
		ventana.setResizable(false);
		f.setVisible(true);
		f.setTitle("Ventana Secundaria");
		f.setResizable(false);
		
		
	}

}
