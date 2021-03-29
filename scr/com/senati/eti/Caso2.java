package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar número: ");
		int n = sc.nextInt();
		
		String estado = "Número es impar";
		
		if (n % 2 == 0)
			estado = "Número es par";
		
		System.out.println("---RESULTADOS---");
		System.out.println("Estado: " + estado);
				
	}

}
