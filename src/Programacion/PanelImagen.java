package Programacion;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class PanelImagen extends javax.swing.JPanel
{
	public PanelImagen()
	{
		this.setSize(400,280);
	}
	public void paint(Graphics g)
	{
		Dimension tamaño = getSize();
		ImageIcon imagen=new ImageIcon(getClass().getResource("/pabsal/Descargas/Troll+Face.jpg"));
		g.drawImage(imagen.getImage(),0,0,tamaño.width,tamaño.height,null);
		setOpaque(false);
		super.paintComponents(g);
	}
}
