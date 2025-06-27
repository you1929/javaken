package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String username;

		while (true) {
			
			System.out.print("ユーザー名を入力してください:");
			username = scanner.nextLine();

			if (username == null || username.trim().isEmpty()) {
				System.out.println("名前を入力してください");
			} else if (username.length() > 10) {
				System.out.println("名前を10文字以内にしてください");
			} else if (!username.matches("^[a-zA-Z0-9]+$")) {
				System.out.println("半角英数字のみで名前を入力してください");
			} else {
				System.out.println("ユーザー名「" + username + "」を登録しました");
				break;
			}
		}
		String[] hand = new String[3];
		hand [0] = "グー";
		hand [1] = "チョキ";
		hand [2] = "パー";
		Random random = new Random();
		int enemy;
		String playerHand;
		int count = 0;
		while (true) {
			enemy = random.nextInt(3);
			System.out.println("なにを出しますか？");
			playerHand = scanner.nextLine();
			int playerHandint = Integer.parseInt(playerHand);
			if (enemy == 0 && playerHandint == 1) {
				System.out.println(username + "の手は" + hand[1]);
				System.out.println("相手の手は「グー」です");
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				count++;
			} else if (enemy == 1 && playerHandint == 2) {
				System.out.println(username + "の手は" + hand[2]);
				System.out.println("相手の手は「チョキ」です");
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺勝ちますよ");
				count++;
			} else if (enemy == 2 && playerHandint == 0) {
				System.out.println(username + "の手は" + hand[0]);
				System.out.println("相手の手は「パー」です");
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				count++;
			} else if (enemy == playerHandint) {
				System.out.println("DRAWあいこもう一度しましょう！");
				count++;
			} else {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				count++;
				System.out.println("勝つまでにかかった合計回数は" + count + "回です");
				break;
			}
		}
	}
}

