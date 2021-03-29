package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar primer número :");
		int n1 = sc.nextInt();
		
		System.out.print("Ingresar segundo número:");
		int n2 = sc.nextInt();
		
		System.out.print("Ingresar tercer número.:");
		int n3 = sc.nextInt();
		
		System.out.print("Ingresar cuarto número.:");
		int n4 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1==n2 && n1==n3 && n1==n4)
		 mensaje ="Los cuatro nÚmeros son iguales";
		
		//Se le agrego esto si dos numeros eran iguales
	    else if (n1==n2|| n2==n3 || n3==n4) 
	      mensaje="Hay  números que son iguales";
		
		
		else if (n1 < n2 && n1 < n3 && n1 < n4)
		 mensaje = "El primer número"+ n1 + "es el menor de todos";
		
		else if (n2 < n1 && n2 < n3 && n2 < n4)
			 mensaje = "El segundo número"+ n2 + "es el menor de todos";
		
		else if (n3 < n1 && n3 < n2 && n3 < n4)
			 mensaje = "El tercer número"+ n3 + "es el menor de todos";
		else
			 mensaje = "El cuarto número"+n4 + "es el menor de todos ";
		
		
		System.out.println("---RESULTADOS---");
		System.out.println("Mensaje : " +mensaje);		
		
	}

}
