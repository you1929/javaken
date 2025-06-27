package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("商品名を「、」区切りで入力してください（例：テレビ、冷蔵庫、ディスプレイ）:");
		String input = scanner.nextLine();

		String[] products = input.split("、");

		Random rand = new Random();

		for (String product : products) {
			int stock = rand.nextInt(12);

			switch (product) {
			case "テレビ":
			case "ディスプレイ":
				int tvStock = product.equals("ディスプレイ") ? 11 - stock : stock;
				System.out.println(product + "の残り台数は" + tvStock + "台です");
				break;

			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(product + "の残り台数は" + stock + "台です");
				break;

			default:

				System.out.println("『" + product + "』は指定の商品ではありません");
				break;
			}
		}
		scanner.close();
	}
}
