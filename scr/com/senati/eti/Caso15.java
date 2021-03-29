package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("#.00");

	    System.out.print("Nombre del cliente: ");
	    String nombre = sc.nextLine();

	    System.out.print("Ingresar el producto [TB /LT /MN /IM] : ");
	    String producto = sc.nextLine();

	    System.out.print("Ingresar la cantidad: ");
	    float cantidad = sc.nextFloat();


	    System.out.print("Ingresar forma de pago [C1/C2] :");
	    String forma = sc.next();





	    float valor = 0;
	    String nomb_prod = "";


	    if (producto.equals("TB")) {
	    	nomb_prod = "TABLET";
	    	valor = 350;}

	    else if (producto.equals("LT")) {
	    	nomb_prod = "LAPTOP";
	    	valor = 2300;}

	    else if (producto.equals("MN")) {
	    	nomb_prod = "MONITOR";
	    	valor = 850;}

	    else if (producto.equals("IM")) {
	    	nomb_prod = "IMPRESORA";
	    	valor = 680;}

	    String x  = "" , z= "" ;
	    float y = 0;
	    float t = 0;
	    float importe = valor * cantidad ;




	    if (forma.equals("C1")) {
	    	z="Contado";
	    	x="EL Descuento es";
	    	y =importe * 0.05f;
	    	t=importe-y;}

	    else if (forma.equals("C2")) {
	    	z="Credito";
	    	x = "El incremento es";
	    	y=(importe * 1.12f)-importe;
	    	t=importe+y;}



	    System.out.println("---RESULTADOS---");
	    System.out.println("Cliente............: "+nombre.toUpperCase());
	    System.out.println("Producto...........: "+nomb_prod);
	    System.out.println("Precio.............: "+valor);
	    System.out.println("Cantidad...........: "+cantidad);
	    System.out.println("Importe............: "+importe);
	    System.out.println("Forma de pago......: "+z);
	    System.out.println(""+x+"........:"+df.format(y));
	    System.out.println("El total a pagar es: "+t); 
	}

}
