package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar precio: ");
		float precio = sc.nextFloat();
		
		System.out.println("Ingresar cantidad: ");
		int cantidad = sc.nextInt();
		
		float total = precio * cantidad ;
		float dscnto = 0;
		
		if ( cantidad > 8) dscnto = (float) 0.1 * total ;
		float neto = total - dscnto;
		
		System.out.println("---RESULTADOS---");
		System.out.println("Total....: " + total);
		System.out.println("Descuento: " +dscnto);
		System.out.println("Neto.....: " + (total - dscnto));

	}

}
