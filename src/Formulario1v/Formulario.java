package Formulario1v;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class Formulario extends JFrame
{

	public Formulario()
	{
		Toolkit pantalla=Toolkit.getDefaultToolkit();
		Dimension tamañoPantalla=pantalla.getScreenSize();
		int alto = tamañoPantalla.height;
		int ancho = tamañoPantalla.width;
		
		
	//Creamos el tamaño
		setBounds(400, 200, 655, 520);
		
		//Ponemos Titulo a la ventana
		setTitle("Formulario");
		
		//Añadimos Icono

		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//Creamos un panel
		JPanel Panel=new JPanel();
		Panel.setLayout(null);
		setContentPane(Panel);
		//Creamos la etiqueta para nombre
		JLabel Nombre =new JLabel("Pon el nombre");
		Nombre.setBounds(369, 15, 229, 25);
		Panel.add(Nombre);
		 JTextField txnombre = new JTextField();
	     txnombre.setBounds(371, 35, 193, 26);
	    Panel.add(txnombre);
	    
	    JLabel Sexo = new JLabel("Seleciona el Sexo");
	    Sexo.setBounds(100,15,150,15);
	    Panel.add(Sexo);
	    
	    JComboBox<String>selecionSexo=new JComboBox<>();
	    selecionSexo.setBounds(100,35,100,30);
	    Panel.add(selecionSexo);
	    selecionSexo.addItem("------");
	    selecionSexo.addItem("Hombre");
	    selecionSexo.addItem("Mujer");
	    selecionSexo.addItem("Otro");
	    selecionSexo.addItem("Por favor");
		
	    
	    JLabel Provincias = new JLabel("Seleciona la provincia");
	    Provincias.setBounds(43, 200, 130, 23);
	    Panel.add(Provincias);
	    JRadioButton Valencia= new JRadioButton("Valencia");
        Valencia.setBounds(43, 220, 109, 23);
        Panel.add(Valencia);
 
        JRadioButton Castellon= new JRadioButton("Castellon");
        Castellon.setBounds(43, 240, 109, 23);
        Panel.add(Castellon);        
       
        JRadioButton Alicante= new JRadioButton("Alicante");
        Alicante.setBounds(43, 260, 109, 23);
        Panel.add(Alicante);  
        
 
        //Agrupamos los botnones de radio
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(Valencia);
        bgroup.add(Castellon);
        bgroup.add(Alicante);
        
        JButton Pulsar = new JButton("Pulsame");
        Pulsar.setBounds(50, 300, 100, 30);
        Panel.add(Pulsar);
        
        Pulsar.addActionListener(new ActionListener() 
        {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				JOptionPane.showMessageDialog(Panel, "Has Pulsado,Eliminar Tu Usuario");
			}
		});
	}

	public static void main(String[] args)
	{
		 SwingUtilities.invokeLater(new Runnable()
		{
		public void run()
		{
			 Formulario frame = new Formulario();
             frame.setVisible(true);
		 }
		});

	}

}
