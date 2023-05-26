package tuan5;

public class phongHoc {
	public String maphong;
	public int daynha;
	public float dientich;
	public int bongden;
	public phongHoc() {
		super();
	}
	public phongHoc(String maphong, int daynha, float dientich, int bongden) {
		super();
		this.maphong = maphong;
		this.daynha = daynha;
		this.dientich = dientich;
		this.bongden = bongden;
	}
	public String getMaphong() {
		return maphong;
	}
	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}
	public int getDaynha() {
		return daynha;
	}
	public void setDaynha(int daynha) {
		this.daynha = daynha;
	}
	public float getDientich() {
		return dientich;
	}
	public void setDientich(float dientich) {
		this.dientich = dientich;
	}
	public int getBongden() {
		return bongden;
	}
	public void setBongden(int bongden) {
		this.bongden = bongden;
	}
	@Override
	public String toString() {
		return "phongHoc [maphong=" + maphong + ", daynha=" + daynha + ", dientich=" + dientich + ", bongden=" + bongden
				+ "]";
	}
	
}
