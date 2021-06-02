package Calculadora2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;



public class Calculadora extends JFrame
{
private JTextField txt1;
private JTextField txt2;
private JTextField TResutado;
private JRadioButton JRBsumatorio;
private JRadioButton JRBproducto;
private JRadioButton JRBexponecial;
private JButton Calcular;
private JPanel Panel;
private JLabel Etiqueta1;
private JLabel Etiqueta2;


	public Calculadora()
	{
	setSize(325,170);
	setTitle("Mini calculadora II");
	
	
	Panel=new JPanel();
	Panel.setLayout(null);
	
	setContentPane(Panel);
	
	Etiqueta1=new JLabel("Valor 1");
	Etiqueta1.setBounds(20, 15, 75, 25);
	Panel.add(Etiqueta1);
	
	txt1=new JTextField();
	txt1.setBounds(20, 40, 75, 25);
	txt1.setHorizontalAlignment(JTextField.CENTER);
	Panel.add(txt1);
	
	Etiqueta2=new JLabel("Valor 2");
	Etiqueta2.setBounds(20, 65, 75, 25);
	Panel.add(Etiqueta2);
	
	txt2=new JTextField();
	txt2.setBounds(20, 90, 75, 25);
	txt2.setHorizontalAlignment(JTextField.CENTER);
	Panel.add(txt2);
	
	 JRBsumatorio= new JRadioButton("Sumatorio");
	 JRBsumatorio.setBounds(110, 30, 100, 25);
     Panel.add(JRBsumatorio);

     JRBproducto = new JRadioButton("Producto");
     JRBproducto.setBounds(110, 60, 100, 25);
     Panel.add(JRBproducto);

     JRBexponecial = new JRadioButton("Exponencial");
     JRBexponecial.setBounds(110, 90, 100, 25);
     Panel.add(JRBexponecial);

     //Agrupamos los botnones de radio
     ButtonGroup bgroup = new ButtonGroup();
     bgroup.add(JRBsumatorio);
     bgroup.add(JRBproducto);
     bgroup.add(JRBexponecial);

     
     Calcular = new JButton("¡¡Calcula!!");
     Calcular.setBounds(210, 30, 100, 25);
     Calcular.setHorizontalAlignment(JButton.CENTER);
     Panel.add(Calcular);
	
    TResutado=new JTextField();
 	TResutado.setBounds(225, 70, 80, 40);
 	TResutado.setEditable(false);
 	TResutado.setHorizontalAlignment(JTextField.CENTER);
 	Panel.add(TResutado);
 	boolean seguir=false;
 	do
 	{
        
 	JRBsumatorio.addActionListener(new ActionListener()
 	{
        public void actionPerformed (ActionEvent e){
            int valor1=Integer.valueOf(txt1.getText());
            int valor2=Integer.valueOf(txt2.getText());
           
            int resultado=0;
           int n=valor2;
            
            for(int i=1;i<=n;i++)
            {
            resultado=n*(n+valor1)/2; 	
			
            String txtresultado = String.valueOf(resultado);
            Calcular.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e){
                	if(valor2<valor1)
                    {
                		TResutado.setText(" ");
                		JOptionPane.showMessageDialog(Panel, "No se puede");
                    	 
                    	 
                    }
                	else
                	{
                    TResutado.setText(txtresultado); 
                	}
                }
            });
           
            }
        }
    });
 	//Falta Modificar
 	JRBproducto.addActionListener(new ActionListener()
 	{
        public void actionPerformed (ActionEvent e){
            int valor1=Integer.valueOf(txt1.getText());
            int valor2=Integer.valueOf(txt2.getText());
           
            int resultado=0;
           int n=valor2;
           for(int i=1;i<=n;i++)
           {
           resultado=valor1*valor2;
             	
			
            String txtresultado = String.valueOf(resultado);
            Calcular.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e){
                	
                    
                	
                    TResutado.setText(txtresultado); 
                	}
                
            });
           
            }
        }
    });
 	JRBexponecial.addActionListener(new ActionListener()
 	{
        public void actionPerformed (ActionEvent e){
            int valor1=Integer.valueOf(txt1.getText());
            int valor2=Integer.valueOf(txt2.getText());
           
            int resultado=0;
           int n=valor2;
           for(int i=1;i<=n;i++)
           {
           resultado=valor1*valor2;
             	
			
            String txtresultado = String.valueOf(resultado);
            Calcular.addActionListener(new ActionListener(){
                public void actionPerformed (ActionEvent e){
                	
                    
                	
                    TResutado.setText(txtresultado); 
                	}
                
            });
           
            }
        }
    });
	}
 	while(!seguir==false);
 	
	}
	public static void main(String[]arg)
	{
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculadora frame = new Calculadora();
                    frame.setVisible(true);
                    frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
	}
}
