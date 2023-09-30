package figurasgeometricas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1=new Punto(2,2);
		Punto punto2=new Punto(6,2);
		Punto punto3=new Punto(2,8);
		Punto punto4=new Punto(6,8);
		
		Rectangulo rec=new Rectangulo("rectangulo", punto1, punto2, punto3, punto4);
		System.out.println(rec.toString());
		
		Circulo circ=new Circulo();
		System.out.println(circ.toString());
		
		Triangulo tri=new Triangulo();
		System.out.println(tri.toString());
	}

}
