package Punto7;
import java.io.*;

public class Cuatro {
	private static int metodo() throws IOException{
		int valor=0;
		try{
			valor = valor + 1;
			valor = Integer.parseInt("W");
			valor = valor + 1;
			System.out.println("Valor al final del try: " + valor);
			throw new IOException();
		}catch(NumberFormatException e){
			valor= valor + Integer.parseInt("42");
			System.out.println("Valor al final del catch: "+ valor);
		}finally{
			valor =valor + 1;
			System.out.println("Valor al final del finally: "+ valor);
		}
		valor = valor + 1;
		System.out.println("Valor antes del return: "+ valor);
		return valor;
	}

	public static void main (String [] args){
		try{
			System.out.println(metodo());
		}catch (Exception e){
			System.err.println("Excepcion en metodo()");
			e.printStackTrace();
		}
	}
}

