package UriGitHub;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int numFuncionario, horasTrabalhadas;
		double valorHora, salario;

		numFuncionario = input.nextInt();
		horasTrabalhadas = input.nextInt();
		valorHora = input.nextDouble();

		salario = valorHora * horasTrabalhadas;

		System.out.printf("NUMBER = %d\n", numFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", salario);

		input.close();

	}

}
