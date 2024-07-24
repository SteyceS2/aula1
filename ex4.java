package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

       
        List<Integer> lista = new ArrayList<>();

        
        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        
        System.out.println("Lista antes da remoção:");
        System.out.println(lista);

        
        if (lista.size() > 4) {
            lista.remove(3);
            System.out.println("\nElemento na posição 4 removido com sucesso.");
        } else {
            System.out.println("\nA lista não tem elemento na posição 4 para remover.");
        }

       
        System.out.println("\nLista após a remoção:");
        System.out.println(lista);

        ler.close();
    }



	}


