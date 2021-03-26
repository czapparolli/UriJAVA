package UriGitHub;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int a, b, prod;

		a = input.nextInt();
		b = input.nextInt();
		prod = a * b;

		System.out.printf("PROD = %d\n", prod);

		input.close();

	}

}
