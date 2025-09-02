package Qes23;

public class kadai23 {
	    private String name;
	    private double length;
	    private int speed;

	    // Setter（thisを使用）
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    // Getter
	    public String getName() {
	        return name;
	    }

	    public double getLength() {
	        return length;
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    // メインメソッド
	    public static void main(String[] args) {
	        kadai23 lion = new kadai23(); // インスタンス作成

	        // Setterを使って値を設定
	        lion.setName("ライオン");
	        lion.setLength(2.1);
	        lion.setSpeed(80);

	        // Getterを使って出力
	        System.out.println("動物名：" + lion.getName());
	        System.out.println("体長：" + lion.getLength() + "m");
	        System.out.println("速度：" + lion.getSpeed() + "km/h");
	    }
	}
