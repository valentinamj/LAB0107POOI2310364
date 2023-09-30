package persona;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int salario;
    
    public Empleado() {
		super();
	}

	public int getSalario() {
        return salario;
    }

    public int getSalarioAnual() {
        return salario * 12;
    
    }
    public int getSalarioAnual(int desempeño) {
        double aumentoPorcentaje;

        if (desempeño >= 7 && desempeño <= 10) {
            aumentoPorcentaje = 0.05;
        } else if (desempeño >= 5 && desempeño < 7) {
            aumentoPorcentaje = 0.02; 
        } else if (desempeño >= 3 && desempeño < 5) {
            aumentoPorcentaje = 0.01; 
        } else {
            System.out.println("El número no se encuentra en el rango"); 
            return getSalarioAnual(); 
        }

        int salarioAnualConAumento = (int) (salario * 12 * (1 + aumentoPorcentaje));
        return salarioAnualConAumento;
    }
}
