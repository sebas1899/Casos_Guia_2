package com.senati.eti;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
    
		System.out.print("Ingresar nombre del alumno: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingresar nota1: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Ingresar nota2: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Ingresar el número de asistencias [1-12]: ");
		float asistencia = sc.nextFloat();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f ;
		float pa = asistencia / 12 * 100;
		
		String estado = "Desaprobado";
		
		if (promedio >=13 && pa >= 70)
			estado = "Aprobado";
		
		System.out.println("---RESULTADOS---");
		System.out.println("Alumno....: " + nombre.toUpperCase());
		System.out.println("Promedio..: " + df.format(promedio));
		System.out.println("Asistencia: " + df.format(pa) + "%");
		System.out.println("Estado....: " + estado);
			
	}

}
