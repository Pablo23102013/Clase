package Burger;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;




public class Burger extends JFrame
{
	private JLabel LMenu;
	private JLabel LHamburguesa;
	private JLabel LPan;
	private JLabel LPatatas;
	private JLabel LBebida;
	private JLabel LOpciones;
	private JLabel LSalsas;
	private JLabel LPrecio;
	private JLabel LIVA;
	private JLabel LPVP;
	//Hamburgesa
	private JRadioButton RBPollo;
	private JRadioButton RBCerdo;
	private JRadioButton RBTernera;
	private JRadioButton RBVegana;
	//Pan
	private JRadioButton RBNormal;
	private JRadioButton RBIntegral;
	private JRadioButton RBCenteno;
	//Patatatas
	private JRadioButton RBFritas;
	private JRadioButton RBGajo;
	private JRadioButton RBCaseras;
	//Bebida
	private JRadioButton RBCola;
	private JRadioButton RBNaranja;
	private JRadioButton RBLimón;
	private JRadioButton RBAgua;
	private JRadioButton RBCerveza;
	//Opciones
	private JCheckBox CBHamburgesa;
	private JCheckBox CBExtraQueso;
	private JCheckBox CBExtraPatatas;
	//Salsas
	private JLabel JLKetchup;
	private JLabel JLMostaza;
	private JLabel JLBarbacoa;
	private JLabel JLThai; 
	private JSpinner JSKetchup;
	private JSpinner JSMostaza;
	private JSpinner JSBarbacoa;
	private JSpinner JSThai;
	//
	private JTextField TXPrecio;
	private JTextField TXIVA;
	private JTextField TXPVP;
	//
	private JRadioButton RBReparto;
	private JRadioButton RBRecoger;
	//
	private JPanel Panel;
	//
	private Font TituloPrincipal;
	private Font Titulo;
	//
	private ButtonGroup bgHamburgesa;
	private ButtonGroup bgPan;
	private ButtonGroup bgPatatas;
	private ButtonGroup bgBebida;
	private ButtonGroup bgRecogida;
	//
	private JButton Calcular;
	private double PrecioComplementos=0;
	
	
	public double getPrecioComplementos() {
		return PrecioComplementos;
	}

	public void setPrecioComplementos(double precioComplementos) {
		PrecioComplementos = precioComplementos;
	}

	public Burger()
	{
		/*
		Toolkit pantalla=Toolkit.getDefaultToolkit();
		Image Icono=pantalla.getImage("/home/pabsal/Documentos/Eclipse/Grafica/Grafico/src/Burger/LogoQueen.jpg");
		setIconImage(Icono);
		*/
		setSize(400, 600);
		setTitle("Burger Queen");
		Panel=new JPanel();
		Panel.setBackground(Color.decode("#C3FFF4"));
		Panel.setLayout(null);
		setContentPane(Panel);
		
		TituloPrincipal=new Font("TituloPrincipal",Font.ITALIC,30);
		Titulo=new Font("Garamond",Font.BOLD,12);
		
		LMenu=new JLabel("Menú Básico (8€)");
		LMenu.setFont(TituloPrincipal);
		LMenu.setBounds(25, 10, 300, 50);
		Panel.add(LMenu);
		
		LHamburguesa=new JLabel("Hamburguesa");
		LHamburguesa.setFont(Titulo);
		LHamburguesa.setBounds(25, 60, 100, 25);
		Panel.add(LHamburguesa);
		
		RBPollo=new JRadioButton("Pollo");
		RBPollo.setBounds(30,90,100,20);
		RBPollo.setBackground(Color.decode("#f1948a"));
		Panel.add(RBPollo);
		
		RBCerdo=new JRadioButton("Cerdo");
		RBCerdo.setBounds(30,110,100,20);
		RBCerdo.setBackground(Color.decode("#f1948a"));
		Panel.add(RBCerdo);
		
		RBTernera=new JRadioButton("Ternera(+2€)");
		RBTernera.setBounds(30,130,100,20);
		RBTernera.setBackground(Color.decode("#f1948a"));
		if(RBTernera.isSelected())
		{
			PrecioComplementos=PrecioComplementos+2;
		}
		Panel.add(RBTernera);
		
		RBVegana=new JRadioButton("Vegana(+1€)");
		RBVegana.setBounds(30,150,100,20);
		RBVegana.setBackground(Color.decode("#f1948a"));
		if(RBVegana.isSelected())
		{
			PrecioComplementos=PrecioComplementos+1;
		}
		Panel.add(RBVegana);
		
		LPan=new JLabel("Pan");
		LPan.setFont(Titulo);
		LPan.setBounds(175, 60, 100, 25);
		Panel.add(LPan);
		
		RBNormal=new JRadioButton("Normal");
		RBNormal.setBounds(150,90,80,20);
		RBNormal.setBackground(Color.decode("#f1948a"));
		Panel.add(RBNormal);
		
		RBIntegral=new JRadioButton("Integral");
		RBIntegral.setBounds(150,110,80,20);
		RBIntegral.setBackground(Color.decode("#f1948a"));
		Panel.add(RBIntegral);
		
		RBCenteno=new JRadioButton("Centeno");
		RBCenteno.setBounds(150,130,80,20);
		RBCenteno.setBackground(Color.decode("#f1948a"));
		Panel.add(RBCenteno);
		

		
		LPatatas=new JLabel("Patatas");
		LPatatas.setFont(Titulo);
		LPatatas.setBounds(275, 60, 105, 25);
		Panel.add(LPatatas);
		
		RBFritas=new JRadioButton("Fritas");
		RBFritas.setBounds(265,90,105,20);
		RBFritas.setBackground(Color.decode("#f1948a"));
		Panel.add(RBFritas);
		
		RBGajo=new JRadioButton("Gajo");
		RBGajo.setBounds(265,110,105,20);
		RBGajo.setBackground(Color.decode("#f1948a"));
		Panel.add(RBGajo);
		
		RBCaseras=new JRadioButton("Caseras(+1€)");
		RBCaseras.setBounds(265,130,105,20);
		RBCaseras.setBackground(Color.decode("#f1948a"));
		if(RBCaseras.isSelected())
		{
			PrecioComplementos=PrecioComplementos+1;
		}
		Panel.add(RBCaseras);
		
		LBebida=new JLabel("Bebida");
		LBebida.setFont(Titulo);
		LBebida.setBounds(30,175, 100, 25);
		Panel.add(LBebida);
		
		RBCola=new JRadioButton("Cola");
		RBCola.setBounds(20,200,60,20);
		RBCola.setBackground(Color.decode("#f1948a"));
		Panel.add(RBCola);
		
		RBNaranja=new JRadioButton("Naranja");
		RBNaranja.setBounds(80,200,75,20);
		RBNaranja.setBackground(Color.decode("#f1948a"));
		Panel.add(RBNaranja);
		
		RBLimón=new JRadioButton("Limón");
		RBLimón.setBounds(155,200,75,20);
		RBLimón.setBackground(Color.decode("#f1948a"));
		Panel.add(RBLimón);
		
		RBAgua=new JRadioButton("Agua");
		RBAgua.setBounds(230,200,75,20);
		RBAgua.setBackground(Color.decode("#f1948a"));
		Panel.add(RBAgua);
		
		RBCerveza=new JRadioButton("Cerveza");
		RBCerveza.setBounds(300,200,75,20);
		RBCerveza.setBackground(Color.decode("#f1948a"));
		
		Panel.add(RBCerveza);
		
		 bgHamburgesa = new ButtonGroup();
		 bgHamburgesa.add(RBPollo);
		 bgHamburgesa.add(RBCerdo);
		 bgHamburgesa.add(RBTernera);
		 bgHamburgesa.add(RBVegana);
		 
		 bgPan = new ButtonGroup();
		 bgPan.add(RBNormal);
		 bgPan.add(RBIntegral);
		 bgPan.add(RBCenteno);
	
		 
		 bgPatatas = new ButtonGroup();
		 bgPatatas.add(RBFritas);
		 bgPatatas.add(RBGajo);
		 bgPatatas.add(RBCaseras);
		 
		 bgBebida= new ButtonGroup();
		 bgBebida.add(RBCola);
		 bgBebida.add(RBNaranja);
		 bgBebida.add(RBLimón);
		 bgBebida.add(RBAgua);
		 bgBebida.add(RBCerveza);
		 
	
		 
		LOpciones=new JLabel("Opciones extras/adiciones");
		LOpciones.setFont(Titulo);
		LOpciones.setBounds(20,230, 200, 25);
		Panel.add(LOpciones);
		
		CBHamburgesa=new JCheckBox("Hamburgesa doble (+2€)");
		CBHamburgesa.setBounds(10, 260, 175, 20);
		CBHamburgesa.setBackground(Color.decode("#f1948a"));
		if(CBHamburgesa.isSelected())
		{
			PrecioComplementos=PrecioComplementos+2;
		}
		Panel.add(CBHamburgesa);
		
		CBExtraQueso=new JCheckBox("Extra de Queso (+0,50€)");
		CBExtraQueso.setBounds(10, 280, 175, 20);
		CBExtraQueso.setBackground(Color.decode("#f1948a"));
		if(CBExtraQueso.isSelected())
		{
			PrecioComplementos=PrecioComplementos+0.5;
		}
		Panel.add(CBExtraQueso);
		
		CBExtraPatatas=new JCheckBox("Extra de Patatas (+1€)");
		CBExtraPatatas.setBounds(10, 300, 175, 20);
		CBExtraPatatas.setBackground(Color.decode("#f1948a"));
		if(CBExtraPatatas.isSelected())
		{
			PrecioComplementos=PrecioComplementos+1;
		}
		Panel.add(CBExtraPatatas);
		
		LSalsas=new JLabel("Salsas (+0,50€) cada una");
		LSalsas.setFont(Titulo);
		LSalsas.setBounds(200, 260, 175, 20);
		Panel.add(LSalsas);
		
	
		
		JLKetchup=new JLabel("Ketchup");
		JLKetchup.setBounds(190, 280, 50, 20);
		Panel.add(JLKetchup);
		
		JSKetchup=new JSpinner( new SpinnerNumberModel(0, 0, 15, 1));
		JSKetchup.setBounds(240,280 , 40, 20);
		Panel.add(JSKetchup);
		
		JLMostaza=new JLabel("Mostaza");
		JLMostaza.setBounds(290, 280, 50, 20);
		Panel.add(JLMostaza);
		
		JSMostaza=new JSpinner( new SpinnerNumberModel(0, 0, 15, 1));
		JSMostaza.setBounds(340,280 , 40, 20);
		Panel.add(JSMostaza);
		
		JLBarbacoa=new JLabel("Barbacoa");
		JLBarbacoa.setBounds(190, 300, 55, 20);
		Panel.add(JLBarbacoa);
		
		JSBarbacoa=new JSpinner( new SpinnerNumberModel(0, 0, 15, 1));
		JSBarbacoa.setBounds(250,300 , 40, 20);
		Panel.add(JSBarbacoa);
		
		JLThai=new JLabel("Thai");
		JLThai.setBounds(290, 300, 50, 20);
		Panel.add(JLThai);
		
		JSThai=new JSpinner( new SpinnerNumberModel(0, 0, 15, 1));
		JSThai.setBounds(340,300 , 40, 20);
		Panel.add(JSThai);
		
		RBReparto=new JRadioButton("Reparto a domicilio");
		RBReparto.setBounds(25, 350, 150, 20);
		RBReparto.setBackground(Color.decode("#f9e79f"));
		Panel.add(RBReparto);
		
		RBRecoger=new JRadioButton("Recogida en local (-20% dto.)");
		RBRecoger.setBounds(180, 350, 200, 20);
		RBRecoger.setBackground(Color.decode("#f9e79f"));
		Panel.add(RBRecoger);
		
		 bgRecogida= new ButtonGroup();
		 bgRecogida.add(RBRecoger);
		 bgRecogida.add(RBReparto);
		
		Calcular=new JButton("CALCULAR");
		Calcular.setBounds(100, 400, 200, 25);
		Panel.add(Calcular);
		
		LPrecio=new JLabel("PRECIO");
		LPrecio.setBounds(50, 475, 100, 20);
		Panel.add(LPrecio);
		
		TXPrecio=new JTextField();
		TXPrecio.setBounds(50, 500, 80, 20);
		TXPrecio.setHorizontalAlignment(JTextField.CENTER);
		TXPrecio.setEditable(false);
		Panel.add(TXPrecio);
		
		LIVA=new JLabel("IVA(21%)");
		LIVA.setBounds(150, 475, 100, 20);
		Panel.add(LIVA);
		
		TXIVA=new JTextField();
		TXIVA.setBounds(150, 500, 80, 20);
		TXIVA.setHorizontalAlignment(JTextField.CENTER);
		TXIVA.setEditable(false);
		Panel.add(TXIVA);
		
		LPVP=new JLabel("P.V.P");
		LPVP.setBounds(250, 475, 100, 20);
		Panel.add(LPVP);
		
		TXPVP=new JTextField();
		TXPVP.setBounds(250, 500, 80, 20);
		TXPVP.setHorizontalAlignment(JTextField.CENTER);
		TXPVP.setEditable(false);
		Panel.add(TXPVP);
		
		Calcular.addActionListener(new ActionListener()
	 	{
	        public void actionPerformed (ActionEvent e){
	            double Preciobase=8;
	            double IVA=0.21;
	            double local=0.20;
	            double PrecioIva;
	            double Precio;
	            double PrecioTotal;
	            double PrecioRecogido;
	          
	            double totalKetchup=(int) JSKetchup.getValue();
	            double totalMayonesa=(int) JSMostaza.getValue();
	            double totalBarbacoa=(int) JSBarbacoa.getValue();
	            double totalThai=(int) JSThai.getValue();
	            
	            double totalsalsa=totalKetchup+totalMayonesa+totalThai+totalBarbacoa;
	            
	            PrecioComplementos=totalsalsa*0.50;
	            
	            if(CBHamburgesa.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+2;
	            }
	            if(CBExtraQueso.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+0.50;
	            }
	            if(CBExtraPatatas.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+1;
	            }
	            if(RBTernera.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+2;
	            }
	            if(RBVegana.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+1;
	            }
	            if(RBCaseras.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+1;
	            }
	            
	           	if(RBRecoger.isSelected())
	           		
	            {
	            Precio=Preciobase+PrecioComplementos;
	            PrecioRecogido=Precio*local;
	            Precio=Precio-PrecioRecogido;
	            PrecioIva=Precio*IVA;
	            PrecioTotal=Precio+PrecioIva;
	            
	            Math.round(((int)(Precio*100))/100);
	            
	            Math.floor((PrecioTotal*100)/100);
	
				
	            String resultadoPrecio = String.valueOf(Precio);
	            String resultadoIVA = String.valueOf(PrecioIva);
	            String resultadoTotal = String.valueOf(PrecioTotal);
	          
	                	TXIVA.setText(resultadoIVA);
	                    TXPrecio.setText(resultadoPrecio);
	                    TXPVP.setText(resultadoTotal);
	            }
	           
	            }
	    });
		
		Calcular.addActionListener(new ActionListener()
	 	{
	        public void actionPerformed (ActionEvent e){
	            double Preciobase=8;
	            double IVA=0.21;
	            double PrecioIva;
	            double Precio;
	            double PrecioTotal;
	          
	            double totalKetchup=(int) JSKetchup.getValue();
	            double totalMayonesa=(int) JSMostaza.getValue();
	            double totalBarbacoa=(int) JSBarbacoa.getValue();
	            double totalThai=(int) JSThai.getValue();
	            
	            double totalsalsa=totalKetchup+totalMayonesa+totalThai+totalBarbacoa;
	            
	            PrecioComplementos=totalsalsa*0.50;
	            
	            if(CBHamburgesa.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+2;
	            }
	            if(CBExtraQueso.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+0.50;
	            }
	            if(CBExtraPatatas.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+1;
	            }
	            if(RBTernera.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+2;
	            }
	            if(RBVegana.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+1;
	            }
	            if(RBCaseras.isSelected())
	            {
	            	PrecioComplementos=PrecioComplementos+1;
	            }
	            
	           	if(RBReparto.isSelected())
	           		
	            {
	            Precio=Preciobase+PrecioComplementos;
	            PrecioIva=Precio*IVA;
	            PrecioTotal=Precio+PrecioIva;
	            
	            Math.round(((int)(Precio*100))/100);
	            
	            Math.floor((PrecioTotal*100)/100);
	
				
	            String resultadoPrecio = String.valueOf(Precio);
	            String resultadoIVA = String.valueOf(PrecioIva);
	            String resultadoTotal = String.valueOf(PrecioTotal);
	          
	                	TXIVA.setText(resultadoIVA);
	                    TXPrecio.setText(resultadoPrecio);
	                    TXPVP.setText(resultadoTotal);
	            }
	           
	            }
	    });
		
		RBCerveza.addActionListener(new ActionListener()
	 	{
	        public void actionPerformed (ActionEvent e){
	           
	        	JOptionPane.showMessageDialog(Panel, "Tienes que tener +18 años");
	           
	            }
	    });
		
	}

	public static void main(String[]arg)
	{
		EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	               Burger frame = new Burger();
	                frame.setVisible(true);
	                frame.setResizable(false);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });
	}
	
}

