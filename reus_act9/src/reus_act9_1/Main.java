package reus_act9_1;


import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double preciosE = 0, preciosL = 0, preciosT = 0; 
		
		Electrodomestico electrodomesticos[] = new Electrodomestico [10];
		electrodomesticos[0] = new Electrodomestico();
		electrodomesticos[1] = new Electrodomestico(20,Consumo.A,Colores.azul,20);
		electrodomesticos[2] = new Lavadora(10, 50, 10, Consumo.C, Colores.azul);
		electrodomesticos[3] = new Television(200, Consumo.C, Colores.azul, 20, 2000, true);
		electrodomesticos[4] = new Lavadora(10, 50, 10, Consumo.C, Colores.azul);
		electrodomesticos[5] = new Electrodomestico();
		electrodomesticos[6] = new Electrodomestico(20,Consumo.A,Colores.azul,20);
		electrodomesticos[7] = new Lavadora(10, 50, 10, Consumo.C, Colores.azul);
		electrodomesticos[8] = new Television(200, Consumo.C, Colores.azul, 20, 2000, true);
		electrodomesticos[9] = new Lavadora(10, 50, 10, Consumo.C, Colores.azul);
		
	
		
		for(int i = 0; i < 10; i++) {
			electrodomesticos[i].setPreciob(electrodomesticos[i].PrecioFinal(electrodomesticos[i].getPeso(), electrodomesticos[i].getConsumo()));
			
			if(electrodomesticos[i] instanceof Television)
				preciosT += electrodomesticos[i].getPreciob();
			else
				preciosL += electrodomesticos[i].getPreciob();
			
			preciosE += electrodomesticos[i].getPreciob();
				
			
		}
		
		System.out.println("El precio total de todos los electrodomesticos es " + preciosE + ", el precio de todas las lavadoras es " + preciosL + ", el precio total de todas las TVs es " + preciosT);
	}
}
