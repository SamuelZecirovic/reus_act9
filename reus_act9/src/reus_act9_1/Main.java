package reus_act9_1;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico e1 = new Electrodomestico();	
		Electrodomestico e2 = new Electrodomestico(200,400);	

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		//CrearElectrodomestico();
		CrearElectrodomestico.holiii();
		
	}
	/*
	public static void CrearElectrodomestico() {
		boolean salir = false;
		Colores color= null;
		Consumo consumo = null;
		double precio = Double.parseDouble(JOptionPane.showInputDialog("precio"));
		String tcolor, tconsumo;
		do {
			tconsumo = JOptionPane.showInputDialog("consumo (A,B,C,D,E,F)");
			
			tconsumo = tconsumo.toUpperCase();
			
			switch (tconsumo) {
				case "A":
					consumo = Consumo.A;
					salir = true;
					break;
				case "B":
					consumo = Consumo.B;
					salir = true;
					break;
				case "C":
					consumo = Consumo.C;
					salir = true;
					break;
				case "D":
					consumo = Consumo.D;
					salir = true;
					break;
				case "E":
					consumo = Consumo.E;
					salir = true;
					break;
				case "F":
					consumo = Consumo.F;
					salir = true;
					break;
				default:
					System.out.println("ponga una de las opciones po favo");
				break;
			
			}
		}while(salir == false);
	
		do {
			salir = false;
			tcolor = JOptionPane.showInputDialog("color (blanco,negro,rojo,azul,gris)");
			tcolor = tcolor.toLowerCase();
			
			switch (tcolor) {
				case "blanco":
					color = Colores.blanco;
					salir = true;
					break;
				case "negro":
					color = Colores.negro;
					salir = true;
					break;
				case "rojo":
					color = Colores.rojo;
					salir = true;
					break;
				case "azul":
					color = Colores.azul;
					salir = true;
					break;
				case "gris":
					color = Colores.gris;
					salir = true;
					break;
				default:
					System.out.println("ponga una de las opciones po favo");
				break;
			
			}
		}while(salir == false);
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("peso"));

		Electrodomestico e3 = new Electrodomestico(precio,consumo, color, peso);	
		System.out.println(e3.toString());
	}*/
}
