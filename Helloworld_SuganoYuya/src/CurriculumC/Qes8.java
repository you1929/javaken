package CurriculumC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;;

public class Qes8 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void q1(String text, int version) {
		String mozi = "Hell JavaSE";
		int number = 11;
		System.out.println(mozi + number);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void q2(int a, int b) {
		System.out.println(a * b);
		int number2 = 5;
		int sum = number2 + number2;
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void q3(int[] array) {
		System.out.println();
		for (int number3 : array) {
			System.out.println(number3);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void q2(double a, double b) {
		System.out.println(a + b);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static List<Integer> q5(int count) {
		List<Integer> numbers = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < count; i++) {
			int num = rand.nextInt(100) + 1;
			numbers.add(num);
			System.out.println(num);
		}
		return numbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double q6(List<Integer> numbers) {
		if (numbers == null || numbers.isEmpty()) {
			System.out.println();
			return 0;
		}
		double sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		double avg = sum / numbers.size();
		System.out.println(avg);
		return avg;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean q7(double average) {
		boolean risut = average >= 50;
		System.out.println(risut);
		return risut;
	}

	// 作成したメソッドをここで呼び出してください
	public static void main(String[] args) {
		q1("JavaSE", 11);
		q2(4, 5);
		int[] data = { 1, 2, 3, 4, 5 };
		q3(data);
		q2(3.5, 4.5);
		List<Integer> randomNumbers = q5(10);
		double avg = q6(randomNumbers);
		q7(avg);
	}
}