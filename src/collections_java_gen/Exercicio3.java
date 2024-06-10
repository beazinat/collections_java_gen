package collections_java_gen;

import java.util.*;

public class Exercicio3 {

	public static void main(String[] args) {
		        Set<Integer> numbers = new HashSet<>();
		        
		        Scanner scan = new Scanner(System.in);

		        System.out.println("Digite 10 valores inteiros diferentes: ");

		        while (numbers.size() < 10) {
		            System.out.print("Valor " + (numbers.size() + 1) + ": ");
		            int valor = scan.nextInt();

		            if (!numbers.contains(valor)) {
		                numbers.add(valor);
		            } else {
		                System.out.println("Valor já adicionado. Por favor, insira um valor diferente.");
		            }
		        }

		        System.out.println("\nDados do Set:");
		        Iterator<Integer> iterator = numbers.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }

		        scan.close();
	}
}