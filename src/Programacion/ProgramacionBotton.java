package Programacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class ProgramacionBotton extends JFrame
{
	private JPanel Panel;
	private JButton Si;
	private JButton Sifake;
	private JButton No;
	private JLabel Titulo;
	public ProgramacionBotton()
	{
		setSize(400, 300);
		setTitle("Aprobaras");
		PanelImagen p =new PanelImagen();
		p.setBorder(new EmptyBorder(5,5,5,5));
		p.setLayout(new BorderLayout(0, 0));
		setContentPane(p);
		
		Titulo=new JLabel("Aprobaras Programacion?");
		Titulo.setBounds(50, 50, 250, 50);
		p.add(Titulo);
		
		
		Si=new JButton("Si");
		Si.setBounds(100, 100, 60, 50);
		p.add(Si);
		
		
		Si.addMouseListener((MouseListener) new MouseListener(){
	          

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				
				Si.setBounds(200, 200, 60, 50);
				
				
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

	      });
		Sifake=new JButton();
		Sifake.setBounds(100, 100, 60, 50);
		
		p.add(Sifake);
		
		Sifake.addMouseListener((MouseListener) new MouseListener(){
	          

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				JOptionPane.showMessageDialog(Panel, "Casi,pero no");
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				
				Si.setBounds(100,100, 60, 50);
				
				
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

	      });
		p.addMouseListener((MouseListener) new MouseListener(){
	          

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				
				Si.setBounds(100,100, 60, 50);
				
				
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

	      });
		
		No=new JButton("No");
		No.setBounds(200, 100, 60, 50);
		p.add(No);
		No.addMouseListener((MouseListener) new MouseListener(){
	          

			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(Panel, "Muy bien,has aceptado que vas ha suspender");
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			
	      });
	}
	
	
	public static void main(String[]arg)
	{
		EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	               ProgramacionBotton frame = new ProgramacionBotton();
	                frame.setVisible(true);
	                frame.setResizable(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });
	}
}
