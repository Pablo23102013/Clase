package Login;
import javax.swing.*;
import java.awt.*;
public class Login 
{
	public static class PruebaJpanel extends JFrame
	{
		public PruebaJpanel()
		{
		setTitle("Hola Bro!!!");
		setSize(500,600);
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Image Imagen=pantalla.getImage("/home/pabsal/Escritorio/Logos/174834-social-media-logos/psd");
		setIconImage(Imagen);
		
		Container contentpane =getContentPane();
		JPanel panel = new JPanel();
		
		contentpane.add(panel);
		
		panel.setBackground(Color.green);
		
		panel.add(new JButton("Click aqui"));
		setVisible(true);
		
		}
	}
	public static void main(String[]args)
	{
		
		String user = JOptionPane.showInputDialog(null,"Usuario");
		String Contraseña = JOptionPane.showInputDialog(null,"Contraseña");
		
		if (user.equals("Admin") && Contraseña.equals("123456"))
		{
			JOptionPane.showMessageDialog(null, "Has entrado Campeon");
			SwingUtilities.invokeLater(new Runnable()
					 {
					public void run()
					{
						new PruebaJpanel();
					}
					 });
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Hoy,no bro");
		}
		
	}
}
