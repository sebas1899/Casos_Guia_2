package com.senati.eti;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Empleado: ");
		String empleado = sc.nextLine();
		
		System.out.print("Nivel [1-4] ...: ");
		int nivel = sc.nextInt();
		
		System.out.print("Sueldo: ");
		float sueldo = sc.nextFloat();
		
		float incremento = 0;
		
		switch (nivel) {
		    case 1:
			   incremento = 0.045f;
			   break;
		    case 2 :
				incremento= 0.06f;
			    break;
		    case 3 :
				incremento= 0.085f;
			    break;
		    case 4 :
				incremento= 0.011f;
			    break;   
			default:
				incremento = 0;
		
		}
		
		float nuevo_sueldo = (float)sueldo * (incremento + 1.00f); 
		
		System.out.println("---RESULTADOS---");
		System.out.println("El incremento es: " + (incremento*100)+"%");
        System.out.println("El nuevo sueldo es: "+ nuevo_sueldo);
	}

}
