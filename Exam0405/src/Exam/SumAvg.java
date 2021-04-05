package Exam;

public class SumAvg {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		double avg = sum / 100.0;

		System.out.println("1~100 ÇÕ°è: " + sum);
		System.out.println("Æò±Õ: " + String.format("%.2f", avg));
	}
}
