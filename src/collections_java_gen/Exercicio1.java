package collections_java_gen;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 5 cores:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            String color = scan.nextLine();
            colors.add(color);
        }

        System.out.println("\nCores adicionadas:");
        for (String color : colors) {
            System.out.println(color);
        }

        Collections.sort(colors);

        System.out.println("\nCores em ordem crescente:");
        for (String color : colors) {
            System.out.println(color);
        }

        scan.close();
	}
}