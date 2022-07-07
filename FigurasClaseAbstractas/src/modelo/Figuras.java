package modelo;

public abstract class Figuras {
	private int x;
	private int y;
	
	public Figuras(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Figuras() {
		super();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Figuras [x=" + x + ", y=" + y + "]";
	}
	
	public abstract double area();
	
	public boolean esIgual(Figuras a) {
		return (this.x==a.x && this.y==a.y);
	}
	
}
