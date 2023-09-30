package figurasgeometricas;

public class Circulo {
	private double radio;
	private String color;
	private Punto puntoCentro;
	private double pi=Math.PI;
	
	public Circulo() {
		super();
	}	
	
	public Circulo(double radio, String color, Punto puntoCentro) {
		super();
		this.radio = radio;
		this.color = color;
		this.puntoCentro = puntoCentro;
	}

	public double getRadio() {
		return radio;
	}
	
	public double getArea() {
		return 0.0;
	}
	
	public boolean isRegular() {
		return true;
	}

	public Punto getPuntoCentro() {
		return puntoCentro;
	}

	public void setPuntoCentro(Punto puntoCentro) {
		this.puntoCentro = puntoCentro;
	}

	public String toString() {
		return "Circulo [radio=" + radio + ", color=" + color + ", puntoCentro=" + puntoCentro + ", getRadio()="
				+ getRadio() + ", getArea()=" + getArea() + ", isRegular()=" + isRegular() + "]";
	}
}
