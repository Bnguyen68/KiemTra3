package advance.dev.model;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private String thangPhatHanh;

	public TapChi(String maTaiLieu, String tenNhaXuatBan, int soLuongPhatHanh, int soPhatHanh, String thangPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soLuongPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public String getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(String thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
}