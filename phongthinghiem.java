package tuan5;

public class phongthinghiem extends phongHoc{
	private String nganh;
	private int fix;
	private boolean bonrua;

	public phongthinghiem() {
		super();
	}

	public phongthinghiem(String nganh, int fix, boolean bonrua, String maphong, int daynha, float dientich, int bongden) {
		super(maphong, bongden, dientich, bongden);
		this.nganh = nganh;
		this.fix = fix;
		this.bonrua = bonrua;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public int getFix() {
		return fix;
	}

	public void setFix(int fix) {
		this.fix = fix;
	}

	public boolean isBonrua() {
		return bonrua;
	}

	public void setBonrua(boolean bonrua) {
		this.bonrua = bonrua;
	}

	@Override
	public String toString() {
		return "phongthinghiem [nganh=" + nganh + "] [fix=" + fix + "] [bonrua=" + bonrua + "] [maphong=" + maphong + ", daynha=" + daynha + ", dientich=" + dientich + ", bongden=" + bongden +"]";
	}
	
}
