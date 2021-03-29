package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Caso7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresar sueldo: ");
		float sueldo = sc.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo <= 1500)
			impuesto = 0.03f * sueldo;
		else if (sueldo > 1500 && sueldo <= 3000)
			impuesto = 0.008f * sueldo;
		else if (sueldo > 3000)
			impuesto = 0.12f * sueldo;
		
		System.out.println("---RESULTADOS---");
		System.out.println("Sueldo bruto....: " + sueldo);
		System.out.println("Impuesto a pagar: " + impuesto);
			
	}

}
