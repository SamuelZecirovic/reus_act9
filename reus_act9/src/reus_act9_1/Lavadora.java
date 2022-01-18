package reus_act9_1;


public class Lavadora extends Electrodomestico {
	private double carga;
	
	public Lavadora () {
		super();
		this.carga = 5;
	}
	
	public Lavadora (double precio, double peso) {
		super(precio,peso);
		this.carga = 5;
	}
	
	public Lavadora (double carga, double precio, double peso, Consumo consumo, Colores color) {
		super(precio,consumo,color,peso);
		this.carga = carga;
	}
	
	public double getCarga() {
		return this.carga;
	}
	
	public double precioFinal(double carga, double peso, Consumo consumo) {
		double precio = super.PrecioFinal(peso, consumo);
		if(carga > 30)
			precio += 30;
		
		return precio;
		
	}
}
