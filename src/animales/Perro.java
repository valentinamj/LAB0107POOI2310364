package animales;

public class Perro {

    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Perro (){
        
    }

    public String getTipoRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
	}
    
    public void setEdad(int edad) {
	this.edad = edad;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
	this.raza = raza;
    }

}
