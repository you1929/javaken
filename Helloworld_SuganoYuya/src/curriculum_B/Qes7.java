package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final String[] subjects = { "英語", "数学", "理科", "社会" };

		int studentCount;

		while (true) {
			System.out.print("生徒の人数を入力してください（2以上）: ");
			studentCount = scanner.nextInt();
			if (studentCount >= 2) {
				break;
			} else {
				System.out.println("2以上の人数を入力してください。");
			}
		}

		double[][] scores = new double[studentCount][subjects.length];

		for (int i = 0; i < studentCount; i++) {
			System.out.println((i + 1) + "人目の点数を入力してください。");
			for (int j = 0; j < subjects.length; j++) {
				while (true) {
					System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください : ");
					double score = scanner.nextDouble();
					if (score >= 0 && score <= 100) {
						scores[i][j] = score;
						break;
					} else {
						System.out.println("0〜100の範囲で入力してください。");
					}
				}
			}
		}

		for (int i = 0; i < studentCount; i++) {
			double sum = 0;
			for (int j = 0; j < subjects.length; j++) {
				sum += scores[i][j];
			}
			double average = sum / subjects.length;
			System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, average);
		}
		for (int j = 0; j < subjects.length; j++) {
			double sum = 0;
			for (int i = 0; i < studentCount; i++) {
				sum += scores[i][j];
			}
			double average = sum / studentCount;
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], average);
		}
		double totalSum = 0;
		for (int i = 0; i < studentCount; i++) {
			for (int j = 0; j < subjects.length; j++) {
				totalSum += scores[i][j];
			}
		}
		double totalAverage = totalSum / (studentCount * subjects.length);
		System.out.printf("全体の平均点は%.2f点です。\n", totalAverage);
		scanner.close();
	}
}
