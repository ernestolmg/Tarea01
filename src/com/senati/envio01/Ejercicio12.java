package com.senati.envio01;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer un n�mero entero o decimal y mostrar su doble, 
		// triple, cuadrado y cubo.
		
		float numero = 0f;
		float doble_numero = 0f;
		float triple_numero = 0f;
		float cuadrado_numero = 0f;
		float cubo_numero = 0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduce el lado a calcular -> ");
		numero = sc.nextFloat();
		
		
		doble_numero = 2 * numero;
		triple_numero = 3 * numero;
		cuadrado_numero = numero*numero;
		cubo_numero = numero*numero*numero;
		
		System.out.println("El doble del n�mero es : " + doble_numero);
		System.out.println("El triple del n�mero es : " + triple_numero);
		System.out.println("El cuadrado del n�mero es : " + cuadrado_numero);
		System.out.println("El cubo del n�mero es : " + cubo_numero);
	}

}
