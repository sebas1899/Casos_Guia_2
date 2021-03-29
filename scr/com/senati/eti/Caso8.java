package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar nota: ");
		float n = sc.nextFloat();
		
		
		String resultado="";
		
		if (0 <= n && n<=7)
		  resultado = ("Sin palabras");	
		
		else if (8 <= n && n<=10)
		 resultado = ("Malo");	
		
		else if (11 <= n && n<=14)
	     resultado = ("Regular");
		
		else if (15 <= n && n<=17)
		 resultado = ("Notable");
		
		else if (18 <= n && n<=20)
		 resultado = ("Excelente");	
		
		else
		 resultado ="Solo ingresar numeros del 0 al 20";
		
		System.out.println("Estado obtenido: "+resultado);
		
	}

}
