package Ejercicio1;
import javax.swing.*;
import java.awt.*;
public class CrearVentana 
{

	public static void main(String[] args) 
	{
		miventana ventana = new miventana();
		
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setTitle("Ventana");
		ventana.setResizable(false);
		
	}

}
