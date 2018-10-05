package br.com.class019.day19;

public class ExemploStatic {
	public static void main(String[] args) {
		Teste t1 = new Teste();
		Teste t2 = new Teste();
		
		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t1.atributoStatic);
		System.out.println(Teste.atributoStatic);
		
		t1.atributo = 10;
		t2.atributo = 20;
		Teste.atributoStatic = 50;
		
		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t1.atributoStatic);
		System.out.println(Teste.atributoStatic);
		
		Teste.atributoStatic = 100;
		
		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t1.atributoStatic);
		System.out.println(Teste.atributoStatic);
		
        Teste.atributoStatic = 500;
		
		System.out.println(t1.atributo);
		System.out.println(t2.atributo);
		System.out.println(t1.atributoStatic);
		System.out.println(t1.atributoStatic);
		System.out.println(Teste.atributoStatic);
		
		
		
		t1.oi();
		t1.hello();

		t2.oi();
		t2.hello();
		
		Teste.hello();
	}
}
