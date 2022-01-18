package reus_act9_1;


public class Electrodomestico {

	private double preciob = 100; 
	private Consumo consumo = Consumo.F;
	private Colores color = Colores.blanco;
	private double peso = 5;
	
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

	
	@Override
	public String toString() {
		return "Electrodomestico [preciob=" + preciob + ", consumo=" + consumo + ", color=" + color + ", peso=" + peso
				+ "]";
	}
	
	
	
	
}
