package Ejercicio3;
import javax.swing.*;
import java.awt.*;
public class CreadoMarcoCentro 
{
	
	
	
	public static class MarcoCentrado extends JFrame
	{
		public MarcoCentrado()
		{
			Toolkit pantalla=Toolkit.getDefaultToolkit();
			Dimension tamañoPantalla=pantalla.getScreenSize();
			int alto = tamañoPantalla.height;
			int ancho = tamañoPantalla.width;
			
			setSize(ancho/2, alto/2);
			setLocation(ancho/4 ,alto/4);
			
			
			setTitle("Centradito");
			Image Icono=pantalla.getImage("/home/pabsal/Documentos/Eclipse/Grafica/Grafico/icono.png");
			setIconImage(Icono);
		}
	}	
	 public static void main (String[]args)
		{
			MarcoCentrado a =new MarcoCentrado();
			
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setVisible(true);
		}
}
