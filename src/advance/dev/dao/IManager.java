package advance.dev.dao;

import advance.dev.model.TaiLieu;

public interface IManager {
	void add(TaiLieu tl);

	void print();

	void sortByName(int order);
}