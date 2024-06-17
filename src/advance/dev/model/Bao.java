package advance.dev.model;

public class Bao extends TaiLieu {
	private String ngayPhatHanh;

	public Bao(String maTaiLieu, String tenNhaXuatBan, int soLuongPhatHanh, String ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soLuongPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
}