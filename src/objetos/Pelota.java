package objetos;

public class Pelota {
	private float tamaño;
	private String color;
	
	public Pelota() {
	 super();
	}
	public Pelota(float tamaño, String color) 
	{
			super();
			this.tamaño= tamaño;
			this.color= color;
	}

	public float getTamaño() {
		return tamaño;
	}
	
}
