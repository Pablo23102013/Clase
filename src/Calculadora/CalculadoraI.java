package Calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;



public class CalculadoraI extends JFrame
{
private JTextField txt1;
private JTextField txt2;
private JTextField TResutado;
private JButton suma;
private JButton resta;
private JButton multiplicacion;
private JButton division;
private JPanel Panel;
private JLabel Etiqueta1;
private JLabel Etiqueta2;


	public CalculadoraI()
	{
	setSize(300,250);
	setTitle("Mini calculadora I");
	
	
	Panel=new JPanel();
	Panel.setLayout(null);
	
	setContentPane(Panel);
	
	Etiqueta1=new JLabel("Valor 1");
	Etiqueta1.setBounds(50, 25, 75, 25);
	Panel.add(Etiqueta1);
	
	txt1=new JTextField();
	txt1.setBounds(50, 50, 75, 25);
	txt1.setHorizontalAlignment(JTextField.CENTER);
	Panel.add(txt1);
	
	Etiqueta2=new JLabel("Valor 2");
	Etiqueta2.setBounds(150, 25, 75, 25);
	Panel.add(Etiqueta2);
	
	txt2=new JTextField();
	txt2.setBounds(150, 50, 75, 25);
	txt2.setHorizontalAlignment(JTextField.CENTER);
	Panel.add(txt2);
	
	suma=new JButton("+");
	suma.setBounds(40, 90, 50, 25);
	Panel.add(suma);
	
	resta=new JButton("-");
	resta.setBounds(100, 90, 50, 25);
	Panel.add(resta);
	
	multiplicacion=new JButton("*");
	multiplicacion.setBounds(160, 90, 50, 25);
	Panel.add(multiplicacion);
	
	division=new JButton("/");
	division.setBounds(220, 90, 50, 25);
	Panel.add(division);
	
	TResutado=new JTextField();
	TResutado.setBounds(25, 140, 250, 25);
	TResutado.setEditable(false);
	TResutado.setHorizontalAlignment(JTextField.CENTER);
	Panel.add(TResutado);
	
	  suma.addActionListener(new ActionListener(){
          public void actionPerformed (ActionEvent e){
              int valor1=Integer.valueOf(txt1.getText());
              int valor2=Integer.valueOf(txt2.getText());
              int resultado=valor1+valor2;
              String txtresultado = String.valueOf(resultado);
              TResutado.setText(txtresultado);
              System.out.println("");
              
          }
      });
	  resta.addActionListener(new ActionListener(){
          public void actionPerformed (ActionEvent e){
              int valor1=Integer.valueOf(txt1.getText());
              int valor2=Integer.valueOf(txt2.getText());
              int resultado=valor1-valor2;
              String txtresultado = String.valueOf(resultado);
              TResutado.setText(txtresultado);
              
          }
      });
	  multiplicacion.addActionListener(new ActionListener(){
          public void actionPerformed (ActionEvent e){
              int valor1=Integer.valueOf(txt1.getText());
              int valor2=Integer.valueOf(txt2.getText());
              int resultado=valor1*valor2;
              String txtresultado = String.valueOf(resultado);
              TResutado.setText(txtresultado);
              
          }
      });
	  division.addActionListener(new ActionListener(){
          public void actionPerformed (ActionEvent e){
              int valor1=Integer.valueOf(txt1.getText());
              int valor2=Integer.valueOf(txt2.getText());
              int resultado=valor1/valor2;
              String txtresultado = String.valueOf(resultado);
              TResutado.setText(txtresultado);
              
          }
      });
	}
	public static void main(String[]arg)
	{
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CalculadoraI frame = new CalculadoraI();
                    frame.setVisible(true);
                    frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
	}
}
