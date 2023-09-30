package figurasgeometricas;

public class Rectangulo extends Cuadrilatero{
	private float largo=1f, ancho=1f;

	public Rectangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
		super(nombre, vertice1, vertice2, vertice3, vertice4);
		// TODO Auto-generated constructor stub
		if(!isRegular()) throw new RuntimeException("Los vértices son incompatibles con el rectángulo");
	}

	public float getLargo() {
		return largo;
	}

	public float getAncho() {
		return ancho;
	}

	public double getArea() {
	    Punto[] vertices234 = new Punto[] {getVertice2(), getVertice3(),
	    		getVertice4()};
	    Punto auxVertex = getVertice1().nearest(vertices234);
	    Punto[] otherVertices = null;
		if (auxVertex.equals(getVertice2())) {
		otherVertices = new Punto[] {getVertice3(), getVertice4()};
		} else if (auxVertex.equals(getVertice3())) {
		otherVertices = new Punto[] {getVertice2(), getVertice4()};
		} else if (auxVertex.equals(getVertice4())) {
		otherVertices = new Punto[] {getVertice2(), getVertice3()};
		}
		double base = getVertice1().calcularDistancia(auxVertex);
		double altura = auxVertex.calcularDistancia(auxVertex.nearest(otherVertices));
		return base * altura;
		}
	
	public String toString() {
		return "Rectangulo [largo=" + largo + ", ancho=" + ancho + ", getArea()=" + getArea() + ", toString()="
				+ super.toString() + "]";
	}
}
