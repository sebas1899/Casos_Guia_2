package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar sueldo: ");
		float sueldo = sc.nextFloat();
		
        float impuesto = 0;
        
        if (sueldo <= 2800)
			impuesto = 0.02f * sueldo;
		else if (sueldo > 2800 && sueldo >= 3000)
			impuesto = 0.05f * sueldo;
		       
		System.out.println("Impuesto a pagar:  " + impuesto);	
		
	}

}
