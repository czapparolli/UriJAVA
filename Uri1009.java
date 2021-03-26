import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String nomeFuncionario;
		double salarioFixo, salarioFinal, vendas;

		nomeFuncionario = input.nextLine();
		salarioFixo = input.nextDouble();
		vendas = input.nextDouble();

		vendas = vendas * 15.0 / 100.00;
		salarioFinal = salarioFixo + vendas;

		System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

		input.close();

	}

}
