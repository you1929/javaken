package logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class logic {
	private String greeting;
	private String sushiComment;
	private String sushiInfo;
	private String currentDateTime;

	public logic() {
		this.greeting = "こんにちは！ここは日本です！";
		this.sushiComment = "この寿司はうまい";
		this.sushiInfo = "寿司は和食です";

		// 現在日時の取得とフォーマット
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.currentDateTime = "今の現在日時は" + now.format(formatter) + "です";
	}

	public void printMessages() {
		System.out.println(this.greeting);
		System.out.println(this.sushiComment);
		System.out.println(this.sushiInfo);
		System.out.println(this.currentDateTime);
	}
}