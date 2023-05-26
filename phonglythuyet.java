package tuan5;

public class phonglythuyet extends phongHoc{
	private boolean maychieu;

	public phonglythuyet() {
		super();
	}

	public phonglythuyet(boolean maychieu, String maphong, int daynha, float dientich, int bongden) {
		super(maphong, bongden, dientich, bongden);
		this.maychieu = maychieu;
	}
	public boolean ismaychieu() {
		return maychieu;
	}
	public void setmaychieu() {
		this.maychieu = maychieu;
	}

	@Override
	public String toString() {
		return "phonglythuyet [maychieu= " + maychieu + "] [ma phong= " + getMaphong() +"[day nha= "+ getDaynha() +"] [dien tich= "+ getDientich() +"]";
	}
	
}
