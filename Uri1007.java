package UriGitHub;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int a, b, c, d, diferenca;

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();

		diferenca = (a * b - c * d);

		System.out.printf("DIFERENCA = %d\n", diferenca);

		input.close();

	}

}
