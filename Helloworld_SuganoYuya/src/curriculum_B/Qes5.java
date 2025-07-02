package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 20; j++) {
				System.out.printf("%03d * %03d = %03d", i, j, i * j);

				if (j < 21) {
					System.out.print(" || ");
				}
			}
			System.out.println();

			if (i < 9) {
				for (int bou = 0; bou < 200; bou++) {
					System.out.print("―");
				}
				System.out.println();
			}
		}
	}
}