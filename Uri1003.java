import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int a, b, soma;

		a = input.nextInt();
		b = input.nextInt();
		soma = a + b;

		System.out.printf("SOMA = %d\n", soma);

		input.close();

	}

}
