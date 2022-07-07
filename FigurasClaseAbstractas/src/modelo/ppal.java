package modelo;

public class ppal {

	public static void main(String[] args) {
		
		//Figuras f=new Figuras(3,2); //no deja crear una clase figura por ser abstracta antes de instanciarla con otra subclase
		
		Figuras f=new Cuadrado(2,3,5);
		Figuras a=new Cuadrado(2,3,5);
		Cuadrado c=new Cuadrado(5);
		Figuras t=new Triangulo(2,3,5);
		
		System.out.println("Figura 1: "+f);
		System.out.println("Figura 2: "+c);
		System.out.println("Figura 3: "+t);
		
		System.out.println("¿Son c y f iguales?: "+c.esIgual(f));
		System.out.println("¿Son f y a iguales?: "+f.esIgual(a));
		
		System.out.println("¿Son f y a iguales?: "+t.esIgual(f));
		
	}

}
