package figurasgeometricas;

public class Triangulo {
	private Punto vertice1, vertice2, vertice3;

	public Triangulo() {
		super();
	}

	public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
		super();
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}

	public double getPerimetro() {
		return 0;
	}
	
	public String getTipo() {
		return "";
	}
	
	public double getArea() {
		return 0;
	}
	
	public boolean isRegular() {
		return true;
	}
	public String toString() {
		return "Triangulo [vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", vertice3=" + vertice3
				+ ", getPerimetro()=" + getPerimetro() + ", getTipo()=" + getTipo() + ", getArea()=" + getArea()
				+ ", isRegular()=" + isRegular() + "]";
	}
	
	
}
