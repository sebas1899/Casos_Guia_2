package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresar primer número: ");
		float n1 =sc.nextFloat();
		
		System.out.print("Ingresar segundo número: ");
		float n2 =sc.nextFloat();
		
		System.out.print("Ingresar Operación [1-6] :...: ");
		int op = sc.nextInt();
		
		String operacion = "";
		String res = "";
		
		switch (op) {
		   case 1 :
		      operacion = "Suma";
		      res="La suma es: "+(n1 + n2);
		      break;
		      
		   case 2 :
			  operacion = "Resta";
			  res ="La resta es: "+(n1-n2);
			  break;
		   case 3 :
			   operacion = "Producto";
			   res="El producto es: "+(n1*n2);
			   break;
		   case 4 :
			   operacion = "División";
			   if (n2==0)
				   res="No es posible dividir entre cero";
			   else
				   res="La división es: "+ df.format(n1/n2);
			   break;
		   case 5 :
			   operacion = "Resto";
			   if (n2==0)
				   res="No es posible hallar el resto entero";
			   else
				   res="El resto entero es: "+ df.format(n1%n2);
			  break;
		   case 6 :
			   operacion ="Promedio";
			   res = "El promedio es: "+((n1+n2)/2);
			   break;
			   
		   default:
		       operacion = "Incorrecto, solo elija una operación del 1-6";
			   
	
		}
        System.out.println("---RESULTADOS---");
        System.out.println("Número 1: " + n1);
        System.out.println("Número 2: " + n2);
		System.out.println("La operación elegida es: "+operacion);
		System.out.println("" + res);
	}

}
