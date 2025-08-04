package logic29;

import java.util.ArrayList;
import java.util.List;

public class logic2 {
	private static final List<logic> list = new ArrayList<>();

	static {
		list.add(new logic("北海道", "札幌市", 83424.0));
		list.add(new logic("青森県", "青森市", 9646.0));
		list.add(new logic("岩手県", "盛岡市", 15275.0));
		list.add(new logic("宮城県", "仙台市", 7282.0));
		list.add(new logic("秋田県", "秋田市", 11638.0));
		list.add(new logic("山形県", "山形市", 9323.0));
		list.add(new logic("福島県", "福島市", 13784.0));
		list.add(new logic("茨城県", "水戸市", 6097.0));
		list.add(new logic("栃木県", "宇都宮市", 6408.0));
		list.add(new logic("群馬県", "前橋市", 6362.0));
		list.add(new logic("埼玉県", "さいたま市", 3798.0));
	}

	public static logic getlogic(int index) {
		if (index >= 0 && index < list.size()) {
			return list.get(index);
		} else {
			return null;
		}
	}
}
