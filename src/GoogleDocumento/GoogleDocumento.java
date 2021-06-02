package GoogleDocumento;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;



public class GoogleDocumento extends JFrame
{
	private JMenuBar Barra;
	//Crear menus
	private JMenu menuArchivo,menuDiseño, menuHelp;
	private JMenu Descargar;
	private JMenuItem Nuevo,PDF,TXT,Guardar,Cerrar,Abrir;
	private JTextArea txtcuadro;
	private JPanel Panel;
	
	private JFileChooser fc;
	
	public GoogleDocumento()
	{
		Toolkit pantalla=Toolkit.getDefaultToolkit();
		Dimension tamaño=pantalla.getScreenSize();
		int alto=tamaño.height;
		int ancho=tamaño.width;
		setSize(ancho,alto);
		setTitle("Documentos Google PC");
		Panel=new JPanel();
		Panel.setLayout(null);
		setContentPane(Panel);
		
		
		
		Barra =new JMenuBar();
		setJMenuBar(Barra);
		
		menuArchivo=new JMenu("Archivo");
		Nuevo=new JMenuItem("Nuevo");
		PDF=new JMenuItem(".PDF");
		TXT=new JMenuItem(".TXT");
		Guardar=new JMenuItem("Guardar");
		Descargar=new JMenu("Descargar");
		Cerrar=new JMenuItem("Cerrar");
		Abrir=new JMenuItem("Abrir");
		Barra.add(menuArchivo);
		menuArchivo.add(Nuevo);
		menuArchivo.add(Guardar);
		menuArchivo.add(Descargar);
		menuArchivo.add(Cerrar);
		menuArchivo.add(Abrir);
		Descargar.add(PDF);
		Descargar.add(TXT);
		
		menuDiseño=new JMenu("Diseño");
		Barra.add(menuDiseño);
		
		menuHelp=new JMenu("Help");
		Barra.add(menuHelp);
		
		
		
		
		
		
		txtcuadro=new JTextArea();
		txtcuadro.setBounds(75,150, 1800, 850);
		txtcuadro.setBackground(Color.decode("#fdebd0"));
	
		
		Panel.add(txtcuadro);
		
		Abrir.addActionListener(new ActionListener(){
	          public void actionPerformed (ActionEvent e){
	        	  fc = new JFileChooser();
	        	  fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        	  int resultado = fc.showOpenDialog(Panel);
	          }
	      });
		PDF.addActionListener(new ActionListener(){
	          public void actionPerformed (ActionEvent e){
	        	  fc = new JFileChooser();
	        	  fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        	  int resultado = fc.showSaveDialog(Panel);
	          }
	      });
	}
	
	public static void main(String[]arg)
	{
		EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	            	GoogleDocumento frame  = new GoogleDocumento();
	                frame.setVisible(true);
	                frame.setResizable(false);
	                frame.setExtendedState(MAXIMIZED_BOTH);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });
	}
}
