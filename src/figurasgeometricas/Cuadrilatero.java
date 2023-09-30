package figurasgeometricas;

public class Cuadrilatero extends Figura{
	private Punto vertice1, vertice2, vertice3, vertice4;
	
	public Cuadrilatero(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
		super(nombre);
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
		this.vertice4 = vertice4;
	}
	
	public boolean isRegular() {
		return comprobarRectangulo(vertice4, vertice3, vertice2, vertice1);
	}
	
	private boolean comprobarRectangulo(Punto p1, Punto p2, Punto p3, Punto p4){
        Punto auxVertex = p1.nearest(new Punto[]{p2,p3,p4});
        if (auxVertex.equals(p2)){
            return p1.calcularDistancia(p3) == p2.calcularDistancia(p4)
                && p1.calcularDistancia(p4) == p2.calcularDistancia(p3)
                && scalarProduct(p1,auxVertex,p1.nearest(new Punto[]{p3,p4}));
        } else if (auxVertex.equals(p3)){
            return p1.calcularDistancia(p2) == p3.calcularDistancia(p4)
                && p1.calcularDistancia(p4) == p3.calcularDistancia(p2)
                && scalarProduct(p1,auxVertex,p1.nearest(new Punto[]{p2,p4}));
        } else if (auxVertex.equals(p4)){
            return p1.calcularDistancia(p2) == p4.calcularDistancia(p3)
                && p1.calcularDistancia(p3) == p4.calcularDistancia(p2)
                && scalarProduct(p1,auxVertex,p1.nearest(new Punto[]{p2,p3})); 
        } else {
            return false;
        }
    }

    private boolean scalarProduct(Punto p1, Punto p2, Punto p3){
        return (p3.getCoordenadaY()-p1.getCoordenadaY())*(p2.getCoordenadaY()-p1.getCoordenadaY())
	    + (p3.getCoordenadaX()-p1.getCoordenadaX())*(p2.getCoordenadaX()-p1.getCoordenadaX()) == 0;
    }
	    
	public String toString() {
		return "Cuadrilatero [vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", vertice3=" + vertice3
				+ ", vertice4=" + vertice4 + ", getNombre()=" + getNombre() + "]";
	}

	public Punto getVertice1() {
		return vertice1;
	}

	public Punto getVertice2() {
		return vertice2;
	}

	public Punto getVertice3() {
		return vertice3;
	}

	public Punto getVertice4() {
		return vertice4;
	}
	
	

}
