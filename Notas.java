package Debora;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
	double NF;
	
	System.out.println("¿Cual es la nota de Practicas?(Pon Apto o No Apto)");
	String NP=read.next();
	System.out.println("¿Cual es la nota de Teorica?");
	double NT=read.nextDouble();
	System.out.println("¿Cual es la nota de Trabajos?");
	double NTR=read.nextDouble();
	
	if(NP.equals("No Apto"))
	{
		NF=4;
	}
	else
	{
		if(NT<4.5)
		{
			NF=NT;
		}
		else
		{
			NF=(NT+NTR)/2;
		}
		if(NF>=10)
		{
			System.out.println("Matricula de Honor");
		}
		System.out.println(NF);
	}
	}

}
