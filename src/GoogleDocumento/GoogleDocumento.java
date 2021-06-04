package GoogleDocumento;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;






public class GoogleDocumento extends JFrame
{
	private JMenuBar Barra;
	//Crear menus
	private JMenu menuArchivo,menuDiseño, menuHelp,Descargar;
	private JMenuItem Nuevo,PDF,TXT,Guardar,Cerrar,Abrir;
	private JMenuItem Copiar,Pegar,Cortar;
	private JToolBar Barramovibble;
	private JTextArea txtcuadro;
	private JPanel Panel;
	
	private JComboBox<String> Letras;
	private String[] fuente;
	private JLabel font;
	
	private  Color selectColor;
	
	private JButton Negrita;
	private JButton Surayado;
	private JButton Cursiva;
	private JFileChooser fc;
	
	public GoogleDocumento()
	{
		//Toolkit pantalla=Toolkit.getDefaultToolkit();
		//Dimension tamaño=pantalla.getScreenSize();
		//int alto=tamaño.height;
		//int ancho=tamaño.width;
		setSize(600,700);
		setTitle("Documentos Google PC");
		Panel=new JPanel();
		Panel.setBackground(Color.decode("#979a9a"));
		Panel.setLayout(null);
		setContentPane(Panel);
		//
		
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
		Copiar=new JMenuItem("Copiar");
		Pegar=new JMenuItem("Pegar");
		Cortar=new JMenuItem("Cortar");
		menuDiseño.add(Copiar);
		menuDiseño.add(Pegar);
		menuDiseño.add(Cortar);
		
		menuHelp=new JMenu("Help");
		Barra.add(menuHelp);
		
		Barramovibble=new JToolBar();
		Barramovibble.setBounds(10, 10, 500, 30);
		
		Negrita=new JButton("Neg");
		Barramovibble.add(Negrita);
		Surayado=new JButton("Sur");
		Barramovibble.add(Surayado);
		Cursiva=new JButton("Cur");
		Barramovibble.add(Cursiva);
		Negrita.addItemListener(null);
		Surayado.addItemListener(null);
		
		//Creando Fondo
		txtcuadro=new JTextArea();
		txtcuadro.setBounds(75,150, 1800, 850);
		txtcuadro.setBackground(Color.decode("#fdebd0"));
		Panel.add(txtcuadro);
//Estilo de Letras
		font=new JLabel("Funte");
		Barramovibble.add(font);
		
		//Letras.setBounds(100, 2, 100, 25);
		
		GraphicsEnvironment gp =GraphicsEnvironment.getLocalGraphicsEnvironment();
				fuente=gp.getAvailableFontFamilyNames();
				
				Letras=new JComboBox<>(fuente);
				Letras.setSelectedItem((Letras.getFont().getName()));
				Barramovibble.add(Letras);
				setLayout(new BorderLayout());
				
				
		
				Color jColor = selectColor;
				// open color dialog and select Color
				if ((jColor = JColorChooser.showDialog(this, "Select color", jColor)) != null) {
				selectColor = jColor;
				// set text color
				txtcuadro.setForeground(selectColor);
				}
				
				
				Panel.add(Barramovibble,BorderLayout.NORTH);

		
		
		
		
		
		
		
		
		
		
		
		Copiar.addActionListener(new ActionListener(){
	          public void actionPerformed (ActionEvent e){
	        	 txtcuadro.copy();
	          }
	      });
		Pegar.addActionListener(new ActionListener(){
	          public void actionPerformed (ActionEvent e){
	        	 txtcuadro.paste();
	          }
	      });
		Cortar.addActionListener(new ActionListener(){
	          public void actionPerformed (ActionEvent e){
	        	 txtcuadro.cut();
	          }
	      });
		
		Abrir.addActionListener(new ActionListener(){
	          public void actionPerformed (ActionEvent e){
	        	  fc = new JFileChooser();
	        	  fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        	  int resultado = fc.showOpenDialog(Panel);
	          }
	      });
		Guardar.addActionListener(new ActionListener(){
	          public void actionPerformed (ActionEvent e){
	        	  fc = new JFileChooser();
	        	  fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        	  int resultado = fc.showSaveDialog(Panel);
	        	  if (resultado == JFileChooser.APPROVE_OPTION) {
	                  
	                  File archivoElegido = fc.getSelectedFile();
	                  
	                  
	                 txtcuadro.setText(archivoElegido.getName());
	              }
	        	  //FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "bmp", "gif", "jpg", "png");
	              //fc.setFileFilter(filter);
	          }
	      });
		PDF.addActionListener(new ActionListener(){
	          public void actionPerformed (ActionEvent e){
	        	  fc = new JFileChooser();
	        	  fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        	  int resultado = fc.showSaveDialog(Panel);
	        	 // Documento=new File(resultado);
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
	                //frame.setResizable(false);
	                frame.setExtendedState(MAXIMIZED_BOTH);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });
	}
}
