package com.cursoceat.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		Scanner entrada = new Scanner(System.in);
		SintonizadorFM sintonizarFm=new SintonizadorFM();
		do {
			System.out.println(" *** RADIO FM ***");
			System.out.println(" 1. Subir");
			System.out.println(" 2. Bajar");
			System.out.println(" 3. Indicar un favorito");
			System.out.println(" 4. Apagar la Radio");
			System.out.print  (" Indique su opcion->");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1-> {
					sintonizarFm.up();
					sintonizarFm.display();
			}
			case 2->{
				sintonizarFm.down();
				sintonizarFm.display();
			}
			case 3->{
				System.out.print("Indica la Frecuencia Favorita");
				sintonizarFm.setFrecuencia(entrada.nextDouble());
				sintonizarFm.display();
			}
			case 4-> System.out.println("---Apagando---");
			default->
				System.out.println("Opción no Válida");
			}
			
		}while(opcion!=4);
		
	}

}
