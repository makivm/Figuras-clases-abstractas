package modelo;

public class Triangulo extends Figuras {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(int x, int y, int lado1, int lado2, int lado3) {
		super(x, y);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public Triangulo(int lado1, int lado2, int lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double area() {
		double semiPer=(this.lado1+this.lado2+this.lado3)/22;
		return Math.sqrt((semiPer*(semiPer-this.lado1))*(semiPer-this.lado2)*(semiPer-this.lado3));
		
	}
	
	public boolean esIgual(Figuras a) {
		if(a instanceof Triangulo){
			Triangulo g=(Triangulo)a;
			return super.esIgual(a)&&this.lado1==g.lado1&&this.lado2==g.lado2&&this.lado3==g.lado3;
		}
		return false;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", getX()=" + getX()
				+ ", getY()=" + getY() + "]";
	}
	
	
}
