package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		byte byteg;
		
		short shortg;
		
		int intg;
		
		long longg;
		
		float floatg;
		
		double doubleg;
		
		char charg;
		
		String stringg;
		
		boolean booleang;
		
		byteg = 0;
		
		shortg = 0;
		
		intg = 0;
		
		longg = 0L;
		
		floatg = 0.0f;
		
		doubleg = 0.0d;
		
		charg = '\u0000';
		
		stringg = null;
		
		booleang = false;
		
		
		byteg = 10;
		
		shortg = 100;
		
		intg = 1000;
		
		longg = 10000;
		
		floatg = 9.5f;
		
		doubleg = 10.5;
		
		charg = 'a';
		
		stringg = "ハロー";
		
		booleang = true;
		
		System.out.println(byteg + shortg + intg + longg + floatg + doubleg);
		System.out.println(byteg + byteg);
		System.out.println(charg + stringg + booleang);
		System.out.println(byteg * shortg * intg * longg);
		System.out.println(doubleg / shortg);
		System.out.println(byteg - shortg);
		
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA" + (num + num1));
		
		String name = "山田太郎";
		int age = 18;
		float hight = 170.5f;
		float body = 62.2f;
		String eat = "寿司";
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + hight + "cmです」");
		System.out.println("「体重は" + body + "kgです」");
		System.out.println("「好きな食べ物は" + eat + "です」");
		
		double hightm = hight/100;
		double bmi = body/(hightm * hightm);
		System.out.println("「BMIは" + String.format("%.2f",bmi) + "です」");
				
		
		name = "鈴木一郎";
		age = 24;
		hight = 168.5f;
		body = 64.2f;
		eat = "オムライス";
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + hight + "cmです」");
		System.out.println("「体重は" + body + "kgです」");
		System.out.println("「好きな食べ物は" + eat + "です」");
		 hightm = hight/100;
		 bmi = body/(hightm * hightm);
		System.out.println("「BMIは" + String.format("%.2f",bmi) + "です」");
		
		
		age += age;
		hight += hight;
		body += body;
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + hight + "cmです」");
		System.out.println("「体重は" + body + "kgです」");
		System.out.println("「好きな食べ物は" + eat + "です」");
		 hightm = hight/100;
		 bmi = body/(hightm * hightm);
		System.out.println("「BMIは" + String.format("%.2f",bmi) + "です」");
		
		age = 24;
		boolean age2;
		age2 = age >= 25;
		System.out.println(age2);
		
		String agestr = String.valueOf(age);
		String hightstr = String.valueOf(hight);
		String bodystr = String.valueOf(body);
		System.out.println(agestr + hightstr + bodystr);
		
		int ageint = Integer.parseInt(agestr);
		double hightdou = Double.parseDouble(hightstr);
		System.out.println(agestr + hightstr);
		
		boolean agehight;
		agehight = age >= 25 || hightdou >= 160;
		System.out.println(agehight);
		
		
	}

}
