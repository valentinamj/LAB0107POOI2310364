package figurasgeometricas;

public class Punto {
	private double coordenadaX, coordenadaY;

	public Punto() {
		super();
	}

	public Punto(double coordenadaX, double coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public double getCoordenadaX() {
		return coordenadaX;
	}

	public double getCoordenadaY() {
		return coordenadaY;
	}

	public String toString() {
		return "Punto [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + "]";
	}
	
	public double calcularDistancia() {
		double distancia=Math.sqrt((0-coordenadaX)*(0-coordenadaX)+(0-coordenadaY)*(0-coordenadaY));
		return distancia;
		
	}
	
	public double calcularDistancia(Punto pOrigen) {
		double distancia=Math.sqrt((pOrigen.coordenadaX-coordenadaX)*(pOrigen.coordenadaX-coordenadaX)+(pOrigen.coordenadaY-coordenadaY)*(pOrigen.coordenadaY-coordenadaY));
		return distancia;
	}
	
    public int retornarCuadrante() {
        if (coordenadaX > 0.0 && coordenadaY > 0.0) {
            return 1;
        } else if (coordenadaX < 0.0 && coordenadaY > 0.0) {
            return 2;
        } else if (coordenadaX < 0.0 && coordenadaY < 0.0) {
            return 3;
        } else if (coordenadaX > 0.0 && coordenadaY < 0.0) {
            return 4;
        } else {
            // (x==0.0 || y==0.0)
            return 0;
        }
    }
	
	public Punto nearest(Punto[] otherPoints) {
		Punto nearestPoint = null;
        double minDistance = Double.MAX_VALUE;
        double currentDistance;

        for (int i=0; i<otherPoints.length; i++) {
            currentDistance = this.calcularDistancia(otherPoints[i]);
            if (currentDistance <= minDistance) {
                minDistance = currentDistance;
                nearestPoint = otherPoints[i];
            }
        }
        return nearestPoint;
    }
}
