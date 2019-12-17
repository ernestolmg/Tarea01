package com.senati.envio01;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calcular el nuevo salario neto de un obrero si obtuvo 
		// un incremento del 25% sobre su salario anterior 
		// y debe pagar al seguro social 5% de su nuevo sueldo. 
		
		float sueldo_inicial = 0f;
		float incremento = 0.25f;
		float seguro_social = 0.05f;
		float nuevo_sueldo = 0f;
		float nuevo_salario = 0f;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduce el sueldo que ganas -> ");
		sueldo_inicial = sc.nextFloat();
		
		nuevo_sueldo = sueldo_inicial + sueldo_inicial * incremento;
		nuevo_salario = nuevo_sueldo - nuevo_sueldo * seguro_social;
		
		System.out.println("Nuevo Salario : " + nuevo_salario);
	}

}
