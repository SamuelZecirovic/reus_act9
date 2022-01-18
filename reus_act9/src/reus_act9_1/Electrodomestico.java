package reus_act9_1;


public class Electrodomestico {

	protected double preciob = 100; 
	protected Consumo consumo = Consumo.F;
	protected Colores color = Colores.blanco;
	protected double peso = 5;
	
	
	
	public double getPreciob() {
		return preciob;
	}

	public void setPreciob(double preciob) {
		this.preciob = preciob;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Electrodomestico() {
		super();
		this.preciob = preciob;
		this.consumo = consumo;
		this.color = color;
		this.peso = peso;
	}

	public Electrodomestico(double preciob, double peso) {
		super();
		this.preciob = preciob;
		this.consumo = consumo;
		this.color = color;
		this.peso = peso;
	}

	public Electrodomestico(double preciob, Consumo consumo, Colores color, double peso) {
		super();
		this.preciob = preciob;
		this.consumo = consumo;
		this.color = color;
		this.peso = peso;
	}

	
	public static double PrecioFinal(double peso, Consumo consumo) {
		
		double precio = 0;
		
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
		
		return precio;
		
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + preciob + ", consumo=" + consumo + ", color=" + color + ", peso=" + peso
				+ "]";
	}
	
	
	
	
}
