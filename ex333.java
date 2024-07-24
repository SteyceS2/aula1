package ex1;

import java.util.ArrayList;
import java.util.List;

public class ex333 {

	 public static void main(String[] args) {
	     
	        List<Integer> lista = new ArrayList<>();

	        
	        for (int i = 1; i <= 10; i++) {
	            lista.add(i);
	        }

	       
	        System.out.println("Lista antes da remoção:");
	        System.out.println(lista);

	       
	        if (lista.size() > 4) {
	            lista.remove(3);
	        } else {
	            System.out.println("A lista não tem elemento na posição 4 para remover.");
	        }

	        
	        System.out.println("\nLista após a remoção:");
	        System.out.println(lista);
	    }
}