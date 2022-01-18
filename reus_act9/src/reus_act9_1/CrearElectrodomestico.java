package reus_act9_1;

import javax.swing.JOptionPane;


	public class CrearElectrodomestico {
		public static void Crear() {
			boolean salir = false;
			Colores color= null;
			Consumo consumo = null;
			double precio = 0;
			String tcolor, tconsumo;
			
			do {
				tconsumo = JOptionPane.showInputDialog("consumo (A,B,C,D,E,F)");
				
				tconsumo = tconsumo.toUpperCase();
				
				switch (tconsumo) {
					case "A":
						consumo = Consumo.A;
						break;
					case "B":
						consumo = Consumo.B;
						break;
					case "C":
						consumo = Consumo.C;
						break;
					case "D":
						consumo = Consumo.D;
						break;
					case "E":
						consumo = Consumo.E;
						break;
					case "F":
						consumo = Consumo.F;
						break;
					default:
						System.out.println("ponga una de las opciones por favor");
						salir = false;
					break;
				
				}
			}while(salir == true);
		
			do {
				salir = false;
				tcolor = JOptionPane.showInputDialog("color (blanco,negro,rojo,azul,gris)");
				tcolor = tcolor.toLowerCase();
				
				switch (tcolor) {
					case "blanco":
						color = Colores.blanco;
						break;
					case "negro":
						color = Colores.negro;
						break;
					case "rojo":
						color = Colores.rojo;
						break;
					case "azul":
						color = Colores.azul;
						break;
					case "gris":
						color = Colores.gris;
						break;
					default:
						System.out.println("ponga una de las opciones por favor");
						salir = false;
					break;
				
				}
			}while(salir == true);
			
			double peso = Double.parseDouble(JOptionPane.showInputDialog("peso"));
		
			if (consumo == Consumo.F ) {
				precio = 10;
			}else if (consumo == Consumo.E){
				precio = 30;
			}else if (consumo == Consumo.D){
				precio = 50;
			}else if (consumo == Consumo.C){
				precio = 60;
			}else if (consumo == Consumo.B){
				precio = 80;
			}else if (consumo == Consumo.A){
				precio = 100;
			}
			
			if (peso < 20 ) {
				precio = precio + 10;
			}else if (peso < 50 ){
				precio = precio + 50;
			}else if (peso < 80){
				precio = precio + 80;
			}else if (peso > 80){
				precio = precio + 100;
			}
			
			
			Electrodomestico e3 = new Electrodomestico(precio,consumo, color, peso);	
			System.out.println(e3.toString());
			
		}
}
