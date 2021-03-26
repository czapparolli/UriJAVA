package UriGitHub;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double raio, volume, pi = 3.14159;

		raio = input.nextDouble();

		raio = Math.pow(raio, 3);
		volume = (4 / 3.0) * pi * raio;

		System.out.printf("VOLUME = %.3f\n", volume);

		input.close();

	}

}
