package figurasgeometricas;

public class Figura {
	private String nombre;

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected double getArea() {
		return 0;
	}
	
	protected boolean isRegular() {
		return true;
	}
}
