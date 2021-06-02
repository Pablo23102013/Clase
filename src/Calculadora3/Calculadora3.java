package Calculadora3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Calculadora3 extends JFrame
{
	private JTextField Rtxt1;
	private JTextField Rtxt2;
	private JTextField Itxt1;
	private JTextField Itxt2;
	private JTextField TResutado;
	private JButton suma;
	private JButton resta;
	private JButton multiplicacion;
	private JButton division;
	private JPanel Panel;
	private JLabel REtiqueta1;
	private JLabel REtiqueta2;
	private JLabel IEtiqueta1;
	private JLabel IEtiqueta2;
	private JButton Calcular;
	protected numeros num;
	public Calculadora3()
	{
		
		setSize(500,275);
		setTitle("Mini calculadora FULL");
		
		boolean seguir=true;
		
		Panel=new JPanel();
		Panel.setLayout(null);
		
		setContentPane(Panel);
		do
		{
		REtiqueta1=new JLabel("Valor1 REAL");
		REtiqueta1.setBounds(25, 25, 75, 25);
		REtiqueta1.setBackground(Color.decode("#aed6f1"));
		REtiqueta1.setOpaque(true);
		Panel.add(REtiqueta1);
		
		Rtxt1=new JTextField();
		Rtxt1.setBounds(150, 25, 75, 25);
		Rtxt1.setHorizontalAlignment(JTextField.CENTER);
		Rtxt1.setBackground(Color.decode("#aed6f1"));
		Panel.add(Rtxt1);
		
		REtiqueta2=new JLabel("Valor2 REAL");
		REtiqueta2.setBounds(275, 25, 75, 25);
		REtiqueta2.setBackground(Color.decode("#aed6f1"));
		REtiqueta2.setOpaque(true);
		Panel.add(REtiqueta2);
		
		Rtxt2=new JTextField();
		Rtxt2.setBounds(400, 25, 75, 25);
		Rtxt2.setHorizontalAlignment(JTextField.CENTER);
		Rtxt2.setBackground(Color.decode("#aed6f1"));
		Panel.add(Rtxt2);
		
		IEtiqueta1=new JLabel("Valor1 Imaginario");
		IEtiqueta1.setBounds(25, 75, 125, 25);
		Panel.add(IEtiqueta1);
		
		Itxt1=new JTextField();
		Itxt1.setBounds(150, 75, 75, 25);
		Itxt1.setHorizontalAlignment(JTextField.CENTER);
		Panel.add(Itxt1);
		
		IEtiqueta2=new JLabel("Valor2 Imaginario");
		IEtiqueta2.setBounds(275, 75, 125, 25);
		Panel.add(IEtiqueta2);
		
		Itxt2=new JTextField();
		Itxt2.setBounds(400, 75, 75, 25);
		Itxt2.setHorizontalAlignment(JTextField.CENTER);
		Panel.add(Itxt2);
		
		suma=new JButton("+");
		suma.setBounds(50, 125, 75, 25);
		Panel.add(suma);
		
		resta=new JButton("-");
		resta.setBounds(150, 125, 75, 25);
		Panel.add(resta);
		
		multiplicacion=new JButton("*");
		multiplicacion.setBounds(250, 125, 75, 25);
		Panel.add(multiplicacion);
		
		division=new JButton("/");
		division.setBounds(350, 125, 75, 25);
		Panel.add(division);
		
		TResutado=new JTextField();
		TResutado.setBounds(25, 200, 450, 25);
		TResutado.setEditable(false);
		TResutado.setHorizontalAlignment(JTextField.CENTER);
		Panel.add(TResutado);
		
		Calcular =new JButton("Calcular");
		Calcular.setBounds(175, 160, 100, 25);
		Calcular.setHorizontalAlignment(JTextField.CENTER);
		Panel.add(Calcular);
		
		suma.addActionListener(new ActionListener()
	 	{
	        public void actionPerformed (ActionEvent e){
	            int Rvalor1=Integer.valueOf(Rtxt1.getText());
	            int Rvalor2=Integer.valueOf(Rtxt2.getText());
	            int Ivalor1=Integer.valueOf(Itxt1.getText());
	            int Ivalor2=Integer.valueOf(Itxt2.getText());
	           
	          
	           	numeros num1=new numeros(Rvalor1, Rvalor2);
	           	numeros num2=new numeros(Ivalor1,Ivalor2);
	           	num1.suma(num2);
				
	            String txtresultado = String.valueOf(num1.suma1);
	            Calcular.addActionListener(new ActionListener(){
	                public void actionPerformed (ActionEvent e)
	                {
	                	
	                    TResutado.setText(txtresultado);
	                }
	            });
	           
	            }
	    });
	 	
	 	resta.addActionListener(new ActionListener()
	 	{
	        public void actionPerformed (ActionEvent e){
	            int Rvalor1=Integer.valueOf(Rtxt1.getText());
	            int Rvalor2=Integer.valueOf(Rtxt2.getText());
	            int Ivalor1=Integer.valueOf(Itxt1.getText());
	            int Ivalor2=Integer.valueOf(Itxt2.getText());
	           
	          
	           	numeros num1=new numeros(Rvalor1, Rvalor2);
	           	numeros num2=new numeros(Ivalor1,Ivalor2);
	           	num1.resta(num2);
				
	            String txtresultado = String.valueOf(num1.resta1);
	            Calcular.addActionListener(new ActionListener(){
	                public void actionPerformed (ActionEvent e)
	                {
	                	
	                    TResutado.setText(txtresultado);
	                }
	            });
	           
	            }
	    });
	 	multiplicacion.addActionListener(new ActionListener()
	 	{
	        public void actionPerformed (ActionEvent e){
	            int Rvalor1=Integer.valueOf(Rtxt1.getText());
	            int Rvalor2=Integer.valueOf(Rtxt2.getText());
	            int Ivalor1=Integer.valueOf(Itxt1.getText());
	            int Ivalor2=Integer.valueOf(Itxt2.getText());
	           
	          
	           	numeros num1=new numeros(Rvalor1, Rvalor2);
	           	numeros num2=new numeros(Ivalor1,Ivalor2);
	           	num1.multiplicar(num2);
				
	            String txtresultado = String.valueOf(num1.multiplicacion1);
	            Calcular.addActionListener(new ActionListener(){
	                public void actionPerformed (ActionEvent e)
	                {
	                	
	                    TResutado.setText(txtresultado);
	                }
	            });
	           
	            }
	    });
	 	division.addActionListener(new ActionListener()
	 	{
	        public void actionPerformed (ActionEvent e){
	            int Rvalor1=Integer.valueOf(Rtxt1.getText());
	            int Rvalor2=Integer.valueOf(Rtxt2.getText());
	            int Ivalor1=Integer.valueOf(Itxt1.getText());
	            int Ivalor2=Integer.valueOf(Itxt2.getText());
	           
	          
	           	numeros num1=new numeros(Rvalor1, Rvalor2);
	           	numeros num2=new numeros(Ivalor1,Ivalor2);
	           	num1.dividir(num2);
				
	            String txtresultado = String.valueOf(num1.division1);
	            Calcular.addActionListener(new ActionListener(){
	                public void actionPerformed (ActionEvent e)
	                {
	                	
	                    TResutado.setText(txtresultado);
	                }
	            });
	           
	            }
	    });
		}
		while(!seguir==true);
	}
	
	
public static void main(String[]arg)
{
	EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                Calculadora3 frame = new Calculadora3();
                frame.setVisible(true);
                frame.setResizable(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });
}
}

