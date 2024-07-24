package ex1;

import java.util.ArrayList;

public class ex3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		
		System.out.println(numeros.get(0));
		System.out.println(numeros.get(1));
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1));
		
		numeros.set(0, null);
		System.out.println(numeros.get(0));
		System.out.println(numeros.size());
	}

}
