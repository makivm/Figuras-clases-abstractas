package modelo;

public class Cuadrado extends Figuras{
	private int lado;

	public Cuadrado(int x, int y, int lado) {
		super(x, y);
		this.lado = lado;
	}
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double area() {
		return this.lado*this.lado;
	}

	@Override
	public boolean esIgual(Figuras a) {
		if (a instanceof Cuadrado) 
			return super.esIgual(a)&&this.lado==((Cuadrado)a).lado;
		return false;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
}
