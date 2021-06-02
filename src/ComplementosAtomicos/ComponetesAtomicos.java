package ComplementosAtomicos;
import javax.swing.*;

import Ejercicio3.CreadoMarcoCentro.MarcoCentrado;

import java.awt.*;
public class ComponetesAtomicos 
{
	public static class Atomicos extends JFrame
	{
		public Atomicos()
		{
			Toolkit pantalla=Toolkit.getDefaultToolkit();
			Dimension tamañoPantalla=pantalla.getScreenSize();
			int alto = tamañoPantalla.height;
			int ancho = tamañoPantalla.width;
			
			setSize(350,450);
			setLocation(ancho/2 ,alto/4);
			
			
			setTitle("Componentes Atomicos");
			Image Icono=pantalla.getImage("/home/pabsal/Escritorio/andorra.png");
			setIconImage(Icono);
			
			
			JLabel nombre;
			nombre=new JLabel();
			nombre.setText("Nombre");
			
			JTextField txtNombre=new JTextField(25);
			
			JLabel Apellido1;
			Apellido1=new JLabel("Apellido");
			JTextField txtApellido=new JTextField(25);
			
			
			JButton Boton1;
			Boton1=new JButton("Continuar");
			
			JRadioButton Hombre;
			Hombre=new JRadioButton("Hombre");
			
			JRadioButton mujer;
			mujer=new JRadioButton("Mujer");
			JRadioButton Helicopero;
			Helicopero=new JRadioButton("Helicopetro Apache de Guerra");
			JRadioButton Otro;
			Otro=new JRadioButton("Otro");
			
			JToggleButton Activar;
			Activar=new JToggleButton("Activar");
			Container Contedendor = getContentPane();
			
			JComboBox edad;
			edad = new JComboBox();
			edad.addItem("18");
			edad.addItem("19");
			edad.addItem("20");
			edad.addItem("21");
			edad.addItem("22");
			edad.addItem("23");
			edad.addItem("24");
			edad.addItem("25");
			
			JSeparator separador;
			separador=new JSeparator();
			separador.setBounds(100, 92,400, 50);
			
			JSlider deslizar;
			deslizar=new JSlider(JSlider.HORIZONTAL,0,100,30);
			deslizar.setBounds(430, 140, 140, 30);
			deslizar.setValue(0);
			
			JSpinner Spinner;
			Spinner = new JSpinner();
			
			JProgressBar Progreso;
			Progreso=new JProgressBar();
			Progreso.setBounds(450, 180, 110, 20);
			
			JPanel panel=new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			
			
			panel.add(nombre);
			panel.add(txtNombre);
			panel.add(separador);
			panel.add(Apellido1);
			panel.add(txtApellido);
			panel.add(separador);
			panel.add(Hombre);
			panel.add(mujer);
			panel.add(Helicopero);
			panel.add(Otro);
			panel.add(separador);
			panel.add(edad);
			panel.add(separador);
			panel.add(Activar);
			panel.add(Boton1);
			panel.add(separador);
			panel.add(deslizar);
			panel.add(Spinner);
			panel.add(Progreso);
			
			Contedendor.add(panel);
			setVisible(true);
			
		}
	}
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
				{
				public void run()
				{
					new Atomicos();
				}
				});

	}

}
