package com.senati.envio01;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// En un taller se hace un 30% de descuento a los clientes 
		// cuya compra supere los $3000, y 20% si es menor. 
		// ¿Cuál será la cantidad que pagará una persona cualquiera 
		// por su compra?
		
		float compra = 0f;
		float nuevo_costo = 0f;
		float descuento1 = 0.70f;
		float descuento2 = 0.80f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduce el monto de la compra -> ");
		compra = sc.nextFloat();
		
		if (compra > 3000) { 
			
			nuevo_costo = compra * descuento1;
			
		}else {
			
			nuevo_costo = compra * descuento2;
		
		}
		System.out.println("El monto a pagar ahora será : " + nuevo_costo);
		
	}

}
