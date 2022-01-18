package reus_act9_1;

import javax.swing.JOptionPane;


	public class CrearElectrodomestico {
		public static void Crear() {
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
		
			Electrodomestico e3 = new Electrodomestico(precio,consumo, color, peso);	
			System.out.println(e3.toString());
			
		}
}
