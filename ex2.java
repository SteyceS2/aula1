package ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class ex2 {

	public static void main(String[] args) {
		String[]diciplinas = {"Matematica", "filosofia", "historia", "fisica"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList (diciplinas));
		novaLista.add("GEOGRAFIA");
		novaLista.add("LINGUA INGLESA");
		
		for (String i: novaLista) {
			System.out.println("Diciplina: " + i);
		}
	
	}
	
     
}
