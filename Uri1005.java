package UriGitHub;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double a, b, media;

		a = input.nextDouble();
		b = input.nextDouble();
			
		media = (a * 3.5 + b * 7.5) / (3.5 + 7.5);

		System.out.printf("MEDIA = %.5f\n", media);

		input.close();

	}

}
