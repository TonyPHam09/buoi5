package tuan5;

public class phongmaytinh extends phongHoc{
	private int maytinh;

	public phongmaytinh() {
		super();
	}

	public phongmaytinh(int maytinh, String maphong, int daynha, float dientich, int bongden) {
		super(maphong, maytinh, dientich, bongden);
		this.maytinh = maytinh;
	}

	public int getMaytinh() {
		return maytinh;
	}

	public void setMaytinh(int maytinh) {
		this.maytinh = maytinh;
	}

	@Override
	public String toString() {
		return "phongmaytinh [maytinh=" + maytinh + "] [ma phong= " + getMaphong() +"[day nha= "+ getDaynha() +"] [dien tich= "+ getDientich() +"]";
	}
	
}
