package UriGitHub;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int codigoPeca, quantidadePecas1, quantidadePecas2;
		double valorUnitario1, valorUnitario2, total;

		codigoPeca = input.nextInt();
		quantidadePecas1 = input.nextInt();
		valorUnitario1 = input.nextDouble();
		
		codigoPeca = input.nextInt();
		quantidadePecas2 = input.nextInt();
		valorUnitario2 = input.nextDouble();
		
		total = (quantidadePecas1 * valorUnitario1) + (quantidadePecas2 * valorUnitario2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

		input.close();

	}

}
