package zikkou29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import logic29.Logic;
import logic29.Logic2;

public class Zikkou {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("都道府県の番号をカンマ区切りで入力してください（例: 5,4,8）：");
		String[] input = scanner.nextLine().split(",");

		System.out.println("昇順（asc）または降順（desc）を入力してください：");
		String sortOrder = scanner.nextLine().trim().toLowerCase();

		List<Logic> selected = new ArrayList<>();

		for (String numStr : input) {
			try {
				int index = Integer.parseInt(numStr.trim());
				Logic pref = Logic2.getlogic(index);
				if (pref != null) {
					selected.add(pref);
				} else {
					System.out.println("無効な番号: " + index);
				}
			} catch (NumberFormatException e) {
				System.out.println("数値として解釈できません: " + numStr);
			}
		}

		if (sortOrder.equals("asc")) {
			selected.sort(Comparator.comparingDouble(Logic::getArea));
		} else if (sortOrder.equals("desc")) {
			selected.sort(Comparator.comparingDouble(Logic::getArea).reversed());
		} else {
			System.out.println("昇順・降順が不正です。asc か desc を入力してください。");
			return;
		}

		for (Logic p : selected) {
			p.printInfo();
		}

		scanner.close();
	}
}
