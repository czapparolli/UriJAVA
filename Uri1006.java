package UriGitHub;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double a, b, c, media;

		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		media = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);

		System.out.printf("MEDIA = %.1f\n", media);

		input.close();

	}

}
