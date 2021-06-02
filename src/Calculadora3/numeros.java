package Calculadora3;

public class numeros 
{
private double real;
private double imaginario;

double suma;
double suma1;
double resta;
double resta1;
double multiplicacion;
double multiplicacion1;
double division;
double division1;


public numeros(double real,double imaginario)
{
	this.real=real;
	this.imaginario=imaginario;
	
}
public void imprimirnumeros()
{
	System.out.println(this.real+" + "+this.imaginario+"i");
}

public void suma(numeros aux)
{
	suma=this.real+aux.real;
	suma1=(imaginario+aux.imaginario);
}
public void resta(numeros aux)
{
	resta=(this.real-aux.real);
	resta1=(this.imaginario-aux.imaginario);
}
public void multiplicar(numeros aux)
{
	multiplicacion=(this.real*aux.real-this.imaginario*aux.imaginario);
	multiplicacion1=(this.real*aux.imaginario+this.real*aux.real);
}
public void dividir(numeros aux)
{
	division=((this.real*aux.real-this.imaginario*aux.imaginario)/aux.real*aux.real+aux.imaginario*aux.imaginario);
	division1=((this.imaginario*aux.real-this.real*this.imaginario)/aux.real*aux.real+aux.imaginario*aux.imaginario);
}
public void imprimir()
{
	System.out.println("La suma es: "+suma+" + "+suma1+"i");
	System.out.println("La resta es: "+resta+" + "+resta1+"i");
	System.out.println("La multiplicacion es: "+multiplicacion+" + "+multiplicacion1+"i");
	System.out.println("La division es: "+division+" + "+division1+"i");
}
}

