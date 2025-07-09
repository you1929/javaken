package CurriculumC;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String animal;
	 public String getAnimal() {
	        return animal;
	    }
	// Q2：フィールドに動物の数の変数を定義してください。
	private int kazu ;
	 public int getKazu() {
	        return kazu;
	    }
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		this.animal = "犬";
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	 public Dog(int kazu) {
	        this.animal = "犬";
	        this.kazu = kazu;
	    }
}
