package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		int maxI = 9;
		int maxJ = 20;

		int keisan = String.format("%02d * %02d = %02d", maxJ, maxI, maxI * maxJ).length();

		for (int i = 1; i <= maxI; i++) {
			for (int j = 1; j <= maxJ; j++) {
				System.out.printf("%02d * %02d = %02d", j, i, i * j);

				if (j < maxJ) {
					System.out.print(" || ");
				}
			}
			System.out.println();
			if (i < 9) {
				for (int k = 0; k < 165; k++) {
					System.out.print("―");
				}
				System.out.println();
			}
		}
	}
}
