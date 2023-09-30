package persona;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private float calificacion;

    public Estudiante() {
		super();
	}

	public float getNota() {
        return calificacion;
    }

    public String getCurso() {
        return curso;
    }
}

