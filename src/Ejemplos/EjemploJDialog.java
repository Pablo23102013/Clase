package Ejemplos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class EjemploJDialog extends JFrame
{

	public EjemploJDialog ()
	{
		super("Ejemplo");
		
		setSize(300,200);

		setVisible(true);
		
		JDialog cuadro = new JDialog(this,true);
		cuadro.setTitle("Toca Huevos");
		cuadro.setSize(100,100);
		cuadro.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
				{
				public void run()
				{
					new EjemploJDialog();
				}
				 });

	}

}
