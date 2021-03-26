package UriGitHub;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double raio, area, pi = 3.14159;

		raio = input.nextDouble();

		area = pi * (raio * raio);

		System.out.printf("A=%.4f\n", area);

		input.close();

	}

}
