package reus_act9_1;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico e1 = new Electrodomestico();	
		Electrodomestico e2 = new Electrodomestico(200,400);	

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		CrearElectrodomestico.Crear();
		
	}
}
