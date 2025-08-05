package logic29;

import java.util.ArrayList;
import java.util.List;

public class Logic2 {
	private static final List<Logic> list = new ArrayList<>();

	static {
		list.add(new Logic("北海道", "札幌市", 83424.0));
		list.add(new Logic("青森県", "青森市", 9646.0));
		list.add(new Logic("岩手県", "盛岡市", 15275.0));
		list.add(new Logic("宮城県", "仙台市", 7282.0));
		list.add(new Logic("秋田県", "秋田市", 11638.0));
		list.add(new Logic("山形県", "山形市", 9323.0));
		list.add(new Logic("福島県", "福島市", 13784.0));
		list.add(new Logic("茨城県", "水戸市", 6097.0));
		list.add(new Logic("栃木県", "宇都宮市", 6408.0));
		list.add(new Logic("群馬県", "前橋市", 6362.0));
		list.add(new Logic("埼玉県", "さいたま市", 3798.0));
	}

	public static Logic getlogic(int index) {
		if (index >= 0 && index < list.size()) {
			return list.get(index);
		} else {
			return null;
		}
	}
}
