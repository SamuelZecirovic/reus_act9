package reus_act9_1;

public class Television extends Electrodomestico{

	private Integer resolucion;
	private boolean TDT;
	
	public Integer getResolucion() {
		return resolucion;
	}

	public void setResolucion(Integer resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isTDT() {
		return TDT;
	}

	public void setTDT(boolean tDT) {
		TDT = tDT;
	}

	public Television() {
		super();
		this.resolucion = 20;
		TDT = false;
	}

	public Television(double precio, double peso) {
		super(precio, peso);
		// TODO Auto-generated constructor stub
	}
	
	public Television(double precio, Consumo consumo, Colores color, double peso, Integer resolucion, boolean TDT) {
		super(precio, consumo, color, peso);
		// TODO Auto-generated constructor stub
	}
	
	public double precioFinal(boolean TDT, int resolucion, double peso, Consumo consumo) {
		double precio = super.PrecioFinal(peso, consumo);
		if(resolucion > 40) {
			precio = precio + precio*0.30;
		}
		if(TDT == true) {
			precio += 50;
		}
		return precio;
		
	}
	
	
	
	
}
