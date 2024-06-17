package advance.dev;

import advance.dev.dao.IManager;
import advance.dev.dao.Manager;
import advance.dev.model.Sach;
import advance.dev.model.TapChi;
import advance.dev.model.Bao;

public class MainApp {
	public static void main(String[] args) {
		IManager manager = new Manager();

		manager.add(new Sach("S001", "NXB Kim Dong", 100, "Tac gia A", 200));
		manager.add(new TapChi("T001", "NXB Tre", 200, 1, "Thang 1"));
		manager.add(new Bao("B001", "NXB Lao Dong", 300, "01-01-2023"));

		manager.print();
		manager.sortByName(1);
		manager.print();
		manager.sortByName(-1);
		manager.print();
	}
}
