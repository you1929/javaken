package CurriculumC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qes28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, String> scientificNames = new HashMap<>();
		scientificNames.put("ライオン", "パンテラ レオ");
		scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
		scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
		scientificNames.put("チンパンジー", "パン・トゥログロディテス");
		scientificNames.put("シマウマ", "チャップマンシマウマ");
		scientificNames.put("インコ", "不明");

		System.out.println("コンソールに文字を入力してください");

		String input = scanner.nextLine();

		String[] animals = input.split(",");

		for (String animalData : animals) {
			String[] parts = animalData.split(":");
			if (parts.length != 3)
				continue;

			String name = parts[0];
			String length = parts[1];
			String speed = parts[2];

			String scientificName = scientificNames.getOrDefault(name, "不明");

			System.out.println();
			System.out.println("動物名：" + name);
			System.out.println("体長：" + length + "m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + scientificName);
		}

		scanner.close();
	}
}