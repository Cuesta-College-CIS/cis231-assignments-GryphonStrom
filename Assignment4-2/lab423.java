import java.util.Scanner;

public class lab423 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		double avg = 0.00;
		int cnt = 0;

		// int max = scanner.nextInt();
		// int min = scanner.nextInt();

		// if (max < min) {
		// cnt = min;
		// min = max;
		// max = cnt;
		// cnt = 0;
		// }
		// Instead of above code segment,
		int max = 0;
		int min = 0;
		int inpCheck;

		// while (scanner.hasNextInt() && inpCheck > -1) {
		while ((inpCheck = scanner.nextInt()) > -1) {
			if (cnt == 0)
				max = min = inpCheck;
			else if (inpCheck < min)
				min = inpCheck;
			else if (inpCheck > max)
				max = inpCheck;
			sum += inpCheck;
			cnt++;
		}

		// if (inpCheck > max && inpCheck > -1) {
		// sum = sum + max;
		// max = inpCheck;
		// cnt++;
		// } else if (inpCheck < min && inpCheck > -1) {
		// sum = sum + min;
		// min = inpCheck;
		// cnt++;
		// } else if (inpCheck > -1) {
		// sum = sum + inpCheck;
		// cnt++;
		// }

		// inpCheck = scanner.nextInt();
		// if (cnt != 0) {
		// avg = Math.abs((double) sum / (cnt));
		// }

		if (cnt <= 2) {
			sum = 0;
			avg = 0.0;
		} else {

			sum = sum - min - max;
			avg = sum / (double) (cnt - 2);
		}
		System.out.printf("%d %.2f\n", sum, avg);
		scanner.close();
	}
}