package advance.dev.dao;

import advance.dev.model.TaiLieu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager implements IManager {
	private List<TaiLieu> taiLieuList = new ArrayList<>();

	@Override
	public void add(TaiLieu tl) {
		taiLieuList.add(tl);
	}

	@Override
	public void print() {
		for (TaiLieu tl : taiLieuList) {
			System.out.println(tl);
		}
	}

	@Override
	public void sortByName(int order) {
		Collections.sort(taiLieuList, new Comparator<TaiLieu>() {
			@Override
			public int compare(TaiLieu o1, TaiLieu o2) {
				return order * o1.getTenNhaXuatBan().compareTo(o2.getTenNhaXuatBan());
			}
		});
	}
}